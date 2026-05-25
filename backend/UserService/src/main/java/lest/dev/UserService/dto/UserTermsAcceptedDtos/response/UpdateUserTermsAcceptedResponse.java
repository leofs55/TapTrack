package lest.dev.UserService.dto.UserTermsAcceptedDtos.response;

import java.time.LocalDateTime;
import java.util.UUID;

public record UpdateUserTermsAcceptedResponse(
        UUID userId,
        String version,
        LocalDateTime acceptedAt
) {}

