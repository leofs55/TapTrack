package lest.dev.UserService.adapter.output.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class UserComplianceModel {
    private UUID userId; // Chave estrangeira para User
    private String kycStatus; // pending | verified | rejected
    private boolean isPep; // Pessoa Exposta Politicamente
    private String regulatoryRegion;
    private UserTermsAcceptedModel termsAccepted;
    private boolean dataRetentionConsent;
    private LocalDateTime lastRiskAssessment;

    public UserComplianceModel() {}

    public UserComplianceModel(UUID userId, String kycStatus, boolean isPep, String regulatoryRegion, UserTermsAcceptedModel termsAccepted, boolean dataRetentionConsent, LocalDateTime lastRiskAssessment) {
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
    public UserTermsAcceptedModel getTermsAccepted() { return termsAccepted; }
    public void setTermsAccepted(UserTermsAcceptedModel termsAccepted) { this.termsAccepted = termsAccepted; }
    public boolean isDataRetentionConsent() { return dataRetentionConsent; }
    public void setDataRetentionConsent(boolean dataRetentionConsent) { this.dataRetentionConsent = dataRetentionConsent; }
    public LocalDateTime getLastRiskAssessment() { return lastRiskAssessment; }
    public void setLastRiskAssessment(LocalDateTime lastRiskAssessment) { this.lastRiskAssessment = lastRiskAssessment; }


}