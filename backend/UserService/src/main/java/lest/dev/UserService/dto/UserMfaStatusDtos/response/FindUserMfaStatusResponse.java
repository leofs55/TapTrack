package lest.dev.UserService.dto.UserMfaStatusDtos.response;

import java.util.UUID;

public record FindUserMfaStatusResponse(
        UUID userId,
        boolean enabled,
        String method
) {}

