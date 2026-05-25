package lest.dev.UserService.dto.userDtos.response;

import java.time.LocalDateTime;
import java.util.UUID;

public record UpdateUserResponse(
        UUID userId,
        String name,
        String email,
        LocalDateTime updatedAt
) {}

