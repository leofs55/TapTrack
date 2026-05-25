package lest.dev.UserService.dto.userAcessControlDtos.response;

import java.util.UUID;

public record CreateUserAcessControlResponse(
        UUID userId,
        String role,
        String accountStatus
) {}

