package lest.dev.UserService.dto.userComplianceDtos.request;

import java.time.LocalDateTime;
import java.util.UUID;

public record CreateUserComplianceRequest(
        UUID userId,
        String kycStatus,
        boolean isPep,
        String regulatoryRegion,
        String termsVersion,
        boolean dataRetentionConsent,
        LocalDateTime lastRiskAssessment
) {}

