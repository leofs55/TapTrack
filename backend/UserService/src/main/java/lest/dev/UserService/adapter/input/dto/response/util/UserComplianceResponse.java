package lest.dev.UserService.adapter.input.dto.response.util;

import java.time.LocalDateTime;

public record UserComplianceResponse(String kycStatus, boolean isPep, String regulatoryRegion, UserTermsAcceptedResponse termsAccepted, boolean dataRetentionConsent, LocalDateTime lastRiskAssessment) {}
