package lest.dev.UserService.dto.userComplianceDtos.response;

import java.util.UUID;

public record CreateUserComplianceResponse(
        UUID userId,
        String kycStatus,
        String regulatoryRegion
) {}

