package lest.dev.UserService.adapter.output.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class UserModel {
    private UUID userId;
    private String name;
    private String taxId; // CPF/CNPJ
    private LocalDate birthDate;
    private String email;
    private String phone;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Relacionamentos com outras entidades de domínio
    private UserComplianceModel compliance;
    private UserFinancialProfileModel financialProfile;
    private UserAcessControlModel accessControl;

    public UserModel() {}

    public UserModel(UUID userId, String name, String taxId, LocalDate birthDate, String email, String phone, LocalDateTime createdAt, LocalDateTime updatedAt, UserComplianceModel compliance, UserFinancialProfileModel financialProfile, UserAcessControlModel accessControl) {
        this.userId = userId;
        this.name = name;
        this.taxId = taxId;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.compliance = compliance;
        this.financialProfile = financialProfile;
        this.accessControl = accessControl;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserComplianceModel getCompliance() {
        return compliance;
    }

    public void setCompliance(UserComplianceModel compliance) {
        this.compliance = compliance;
    }

    public UserFinancialProfileModel getFinancialProfile() {
        return financialProfile;
    }

    public void setFinancialProfile(UserFinancialProfileModel financialProfile) {
        this.financialProfile = financialProfile;
    }

    public UserAcessControlModel getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(UserAcessControlModel accessControl) {
        this.accessControl = accessControl;
    }
}