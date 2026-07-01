-- 1. Tabela Raiz (Root Aggregate)
CREATE TABLE users (
    user_id UUID PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    tax_id VARCHAR(20) UNIQUE NOT NULL, -- CPF/CNPJ
    birth_date DATE,
    email VARCHAR(255) UNIQUE NOT NULL,
    phone VARCHAR(20),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- ==========================================
-- SUBDOMÍNIO: CONTROLE DE ACESSO
-- ==========================================

CREATE TABLE user_mfa_status (
    user_id UUID PRIMARY KEY,
    enabled BOOLEAN NOT NULL DEFAULT FALSE,
    method VARCHAR(50), -- ex: 'totp', 'sms'
    CONSTRAINT fk_mfa_user FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);

CREATE TABLE user_access_control (
    user_id UUID PRIMARY KEY,
    role VARCHAR(50) NOT NULL,
    account_status VARCHAR(50) NOT NULL, -- 'active', 'blocked', 'suspended'
    last_login_attempt TIMESTAMP,
    CONSTRAINT fk_access_user FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);

-- Tabela para lidar com a List<String> scopes do Java
CREATE TABLE user_access_scopes (
    user_id UUID NOT NULL,
    scope VARCHAR(100) NOT NULL,
    PRIMARY KEY (user_id, scope),
    CONSTRAINT fk_scope_access FOREIGN KEY (user_id) REFERENCES user_access_control(user_id) ON DELETE CASCADE
);

-- ==========================================
-- SUBDOMÍNIO: COMPLIANCE E KYC
-- ==========================================

CREATE TABLE user_terms_accepted (
    user_id UUID PRIMARY KEY,
    version VARCHAR(50) NOT NULL,
    accepted_at TIMESTAMP NOT NULL,
    ip_address VARCHAR(45) NOT NULL,
    CONSTRAINT fk_terms_user FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);

CREATE TABLE user_compliance (
    user_id UUID PRIMARY KEY,
    kyc_status VARCHAR(50) NOT NULL, -- 'pending', 'verified', 'rejected'
    is_pep BOOLEAN NOT NULL DEFAULT FALSE,
    regulatory_region VARCHAR(100),
    data_retention_consent BOOLEAN NOT NULL DEFAULT FALSE,
    last_risk_assessment TIMESTAMP,
    CONSTRAINT fk_compliance_user FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);

-- ==========================================
-- SUBDOMÍNIO: PERFIL FINANCEIRO
-- ==========================================

CREATE TABLE user_spending_limits (
    user_id UUID PRIMARY KEY,
    daily NUMERIC(15, 2),
    monthly NUMERIC(15, 2),
    CONSTRAINT fk_limits_user FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);

CREATE TABLE user_financial_profile (
    user_id UUID PRIMARY KEY,
    base_currency VARCHAR(3) NOT NULL, -- ex: 'BRL', 'USD'
    monthly_income NUMERIC(15, 2),
    risk_score VARCHAR(50), -- 'low', 'medium', 'high'
    investment_profile VARCHAR(50), -- 'conservative', 'moderate', 'aggressive'
    CONSTRAINT fk_financial_user FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);