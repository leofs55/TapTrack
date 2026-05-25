package lest.dev.UserService.dto.UserMfaStatusDtos.response;

import java.util.UUID;

public record DeleteUserMfaStatusResponse(
        UUID userId,
        boolean success
) {}

