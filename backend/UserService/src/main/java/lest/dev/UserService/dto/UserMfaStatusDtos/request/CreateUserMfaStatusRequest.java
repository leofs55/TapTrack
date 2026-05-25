package lest.dev.UserService.dto.UserMfaStatusDtos.request;

import java.util.UUID;

public record CreateUserMfaStatusRequest(
        UUID userId,
        boolean enabled,
        String method
) {}

