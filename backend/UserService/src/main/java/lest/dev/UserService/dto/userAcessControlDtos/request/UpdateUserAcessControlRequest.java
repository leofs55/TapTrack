package lest.dev.UserService.dto.userAcessControlDtos.request;

import java.util.List;
import java.util.UUID;

public record UpdateUserAcessControlRequest(
        UUID userId,
        String role,
        List<String> scopes,
        String accountStatus
) {}

