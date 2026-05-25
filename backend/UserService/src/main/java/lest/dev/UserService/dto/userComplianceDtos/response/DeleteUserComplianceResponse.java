package lest.dev.UserService.dto.userComplianceDtos.response;

import java.util.UUID;

public record DeleteUserComplianceResponse(
        UUID userId,
        boolean success
) {}

