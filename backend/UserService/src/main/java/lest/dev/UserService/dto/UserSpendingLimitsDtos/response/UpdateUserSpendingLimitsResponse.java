package lest.dev.UserService.dto.UserSpendingLimitsDtos.response;

import java.math.BigDecimal;
import java.util.UUID;

public record UpdateUserSpendingLimitsResponse(
        UUID userId,
        BigDecimal daily,
        BigDecimal monthly
) {}

