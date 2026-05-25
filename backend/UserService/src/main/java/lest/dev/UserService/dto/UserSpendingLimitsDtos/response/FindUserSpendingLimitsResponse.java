package lest.dev.UserService.dto.UserSpendingLimitsDtos.response;

import java.math.BigDecimal;
import java.util.UUID;

public record FindUserSpendingLimitsResponse(
        UUID userId,
        BigDecimal daily,
        BigDecimal monthly
) {}

