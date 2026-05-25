package lest.dev.UserService.dto.userComplianceDtos.request;

import java.time.LocalDateTime;
import java.util.UUID;

public record UpdateUserComplianceRequest(
        UUID userId,
        String kycStatus,
        boolean isPep,
        String regulatoryRegion,
        boolean dataRetentionConsent,
        LocalDateTime lastRiskAssessment
) {}

