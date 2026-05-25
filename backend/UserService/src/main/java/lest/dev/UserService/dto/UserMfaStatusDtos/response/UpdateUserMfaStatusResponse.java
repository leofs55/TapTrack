package lest.dev.UserService.dto.UserMfaStatusDtos.response;

import java.util.UUID;

public record UpdateUserMfaStatusResponse(
        UUID userId,
        boolean enabled
) {}

