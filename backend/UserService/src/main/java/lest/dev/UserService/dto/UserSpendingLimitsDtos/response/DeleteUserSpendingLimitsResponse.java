package lest.dev.UserService.dto.UserSpendingLimitsDtos.response;

import java.util.UUID;

public record DeleteUserSpendingLimitsResponse(
        UUID userId,
        boolean success
) {}

