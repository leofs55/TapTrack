package lest.dev.UserService.domain.model.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class UserComplianceDomain {
    private UUID userId; // Chave estrangeira para User
    private String kycStatus; // pending | verified | rejected
    private boolean isPep; // Pessoa Exposta Politicamente
    private String regulatoryRegion;
    private UserTermsAcceptedDomain termsAccepted;
    private boolean dataRetentionConsent;
    private LocalDateTime lastRiskAssessment;

    public UserComplianceDomain() {}

    public UserComplianceDomain(UUID userId, String kycStatus, boolean isPep, String regulatoryRegion, UserTermsAcceptedDomain termsAccepted, boolean dataRetentionConsent, LocalDateTime lastRiskAssessment) {
        this.userId = userId;
        this.kycStatus = kycStatus;
        this.isPep = isPep;
        this.regulatoryRegion = regulatoryRegion;
        this.termsAccepted = termsAccepted;
        this.dataRetentionConsent = dataRetentionConsent;
        this.lastRiskAssessment = lastRiskAssessment;
    }

    public UUID getUserId() { return userId; }
    public void setUserId(UUID userId) { this.userId = userId; }
    public String getKycStatus() { return kycStatus; }
    public void setKycStatus(String kycStatus) { this.kycStatus = kycStatus; }
    public boolean isPep() { return isPep; }
    public void setPep(boolean pep) { isPep = pep; }
    public String getRegulatoryRegion() { return regulatoryRegion; }
    public void setRegulatoryRegion(String regulatoryRegion) { this.regulatoryRegion = regulatoryRegion; }
    public UserTermsAcceptedDomain getTermsAccepted() { return termsAccepted; }
    public void setTermsAccepted(UserTermsAcceptedDomain termsAccepted) { this.termsAccepted = termsAccepted; }
    public boolean isDataRetentionConsent() { return dataRetentionConsent; }
    public void setDataRetentionConsent(boolean dataRetentionConsent) { this.dataRetentionConsent = dataRetentionConsent; }
    public LocalDateTime getLastRiskAssessment() { return lastRiskAssessment; }
    public void setLastRiskAssessment(LocalDateTime lastRiskAssessment) { this.lastRiskAssessment = lastRiskAssessment; }


}