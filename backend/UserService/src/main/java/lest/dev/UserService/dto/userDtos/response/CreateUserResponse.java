package lest.dev.UserService.dto.userDtos.response;

import java.time.LocalDateTime;
import java.util.UUID;

public record CreateUserResponse(
        UUID userId,
        String name,
        String email,
        LocalDateTime createdAt
) {}

