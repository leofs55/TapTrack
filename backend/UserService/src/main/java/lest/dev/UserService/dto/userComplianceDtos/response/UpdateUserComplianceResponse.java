package lest.dev.UserService.dto.userComplianceDtos.response;

import java.util.UUID;

public record UpdateUserComplianceResponse(
        UUID userId,
        String kycStatus
) {}

