package lest.dev.UserService.dto.userComplianceDtos.response;

import java.time.LocalDateTime;
import java.util.UUID;

public record FindUserComplianceResponse(
        UUID userId,
        String kycStatus,
        boolean isPep,
        String regulatoryRegion,
        LocalDateTime lastRiskAssessment
) {}

