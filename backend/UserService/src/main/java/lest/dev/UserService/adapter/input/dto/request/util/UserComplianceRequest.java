package lest.dev.UserService.adapter.input.dto.request.util;

import java.time.LocalDateTime;

public record UserComplianceRequest(String kycStatus, boolean isPep, String regulatoryRegion, UserTermsAcceptedRequest termsAccepted, boolean dataRetentionConsent, LocalDateTime lastRiskAssessment) {}
