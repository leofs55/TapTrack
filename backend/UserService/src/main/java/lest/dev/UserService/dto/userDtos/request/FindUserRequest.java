package lest.dev.UserService.dto.userDtos.request;

import java.util.UUID;

public record FindUserRequest(
        UUID userId,
        String email,
        String taxId
) {}

