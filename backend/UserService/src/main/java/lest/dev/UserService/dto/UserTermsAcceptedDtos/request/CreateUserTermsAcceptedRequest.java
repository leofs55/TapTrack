package lest.dev.UserService.dto.UserTermsAcceptedDtos.request;

import java.time.LocalDateTime;
import java.util.UUID;

public record CreateUserTermsAcceptedRequest(
        UUID userId,
        String version,
        LocalDateTime acceptedAt,
        String ipAddress
) {}

