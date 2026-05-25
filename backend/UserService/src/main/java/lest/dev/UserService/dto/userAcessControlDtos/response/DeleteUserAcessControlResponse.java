package lest.dev.UserService.dto.userAcessControlDtos.response;

import java.util.UUID;

public record DeleteUserAcessControlResponse(
        UUID userId,
        boolean success
) {}

