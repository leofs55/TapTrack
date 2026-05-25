package lest.dev.UserService.dto.userDtos.response;

import java.time.LocalDateTime;
import java.util.UUID;

public record DeleteUserResponse(
        UUID userId,
        boolean success,
        LocalDateTime deletedAt
) {}

