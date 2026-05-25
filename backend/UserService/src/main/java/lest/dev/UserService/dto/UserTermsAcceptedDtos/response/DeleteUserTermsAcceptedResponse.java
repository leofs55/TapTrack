package lest.dev.UserService.dto.UserTermsAcceptedDtos.response;

import java.util.UUID;

public record DeleteUserTermsAcceptedResponse(
        UUID userId,
        boolean success
) {}

