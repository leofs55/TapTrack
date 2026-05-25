package lest.dev.UserService.dto.UserSpendingLimitsDtos.request;

import java.math.BigDecimal;
import java.util.UUID;

public record UpdateUserSpendingLimitsRequest(
        UUID userId,
        BigDecimal daily,
        BigDecimal monthly
) {}

