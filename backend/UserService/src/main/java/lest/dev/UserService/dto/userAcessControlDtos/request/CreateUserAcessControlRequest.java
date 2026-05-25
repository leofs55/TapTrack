package lest.dev.UserService.dto.userAcessControlDtos.request;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record CreateUserAcessControlRequest(
        UUID userId,
        String role,
        List<String> scopes,
        boolean mfaEnabled,
        String accountStatus,
        LocalDateTime lastLoginAttempt
) {}

