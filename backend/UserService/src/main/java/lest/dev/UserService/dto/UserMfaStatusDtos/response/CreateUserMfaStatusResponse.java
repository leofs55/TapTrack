package lest.dev.UserService.dto.UserMfaStatusDtos.response;

import java.util.UUID;

public record CreateUserMfaStatusResponse(
        UUID userId,
        boolean enabled
) {}

