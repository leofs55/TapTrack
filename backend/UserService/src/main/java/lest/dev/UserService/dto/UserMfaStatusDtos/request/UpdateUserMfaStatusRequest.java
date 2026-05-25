package lest.dev.UserService.dto.UserMfaStatusDtos.request;

import java.util.UUID;

public record UpdateUserMfaStatusRequest(
        UUID userId,
        boolean enabled,
        String method
) {}

