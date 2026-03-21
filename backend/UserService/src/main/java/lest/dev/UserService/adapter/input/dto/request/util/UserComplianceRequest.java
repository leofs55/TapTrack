package lest.dev.UserService.adapter.input.dto.request.util;

import java.time.LocalDateTime;

public class UserComplianceRequest {
    private String kycStatus;
    private boolean isPep;
    private String regulatoryRegion;
    private UserTermsAcceptedRequest termsAccepted;
    private boolean dataRetentionConsent;
    private LocalDateTime lastRiskAssessment;

    public UserComplianceRequest() {}

    public UserComplianceRequest(String kycStatus, boolean isPep, String regulatoryRegion, UserTermsAcceptedRequest termsAccepted, boolean dataRetentionConsent, LocalDateTime lastRiskAssessment) {
        this.kycStatus = kycStatus;
        this.isPep = isPep;
        this.regulatoryRegion = regulatoryRegion;
        this.termsAccepted = termsAccepted;
        this.dataRetentionConsent = dataRetentionConsent;
        this.lastRiskAssessment = lastRiskAssessment;
    }

    public String getKycStatus() { return kycStatus; }
    public void setKycStatus(String kycStatus) { this.kycStatus = kycStatus; }
    public boolean isPep() { return isPep; }
    public void setPep(boolean pep) { isPep = pep; }
    public String getRegulatoryRegion() { return regulatoryRegion; }
    public void setRegulatoryRegion(String regulatoryRegion) { this.regulatoryRegion = regulatoryRegion; }
    public UserTermsAcceptedRequest getTermsAccepted() { return termsAccepted; }
    public void setTermsAccepted(UserTermsAcceptedRequest termsAccepted) { this.termsAccepted = termsAccepted; }
    public boolean isDataRetentionConsent() { return dataRetentionConsent; }
    public void setDataRetentionConsent(boolean dataRetentionConsent) { this.dataRetentionConsent = dataRetentionConsent; }
    public LocalDateTime getLastRiskAssessment() { return lastRiskAssessment; }
    public void setLastRiskAssessment(LocalDateTime lastRiskAssessment) { this.lastRiskAssessment = lastRiskAssessment; }
}
