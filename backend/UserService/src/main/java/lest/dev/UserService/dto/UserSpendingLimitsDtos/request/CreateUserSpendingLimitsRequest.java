package lest.dev.UserService.dto.UserSpendingLimitsDtos.request;

import java.math.BigDecimal;
import java.util.UUID;

public record CreateUserSpendingLimitsRequest(
        UUID userId,
        BigDecimal daily,
        BigDecimal monthly
) {}

