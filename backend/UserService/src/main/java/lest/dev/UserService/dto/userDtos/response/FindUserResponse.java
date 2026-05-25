package lest.dev.UserService.dto.userDtos.response;

import java.util.UUID;

public record FindUserResponse(
        UUID userId,
        String name,
        String email,
        String phone
) {}

