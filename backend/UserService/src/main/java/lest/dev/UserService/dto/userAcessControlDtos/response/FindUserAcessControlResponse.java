package lest.dev.UserService.dto.userAcessControlDtos.response;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record FindUserAcessControlResponse(
        UUID userId,
        String role,
        List<String> scopes,
        String accountStatus,
        LocalDateTime lastLoginAttempt
) {}

