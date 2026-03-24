package lest.dev.UserService.adapter.input.dto.request.util;

import java.math.BigDecimal;

public record UserSpendingLimitsRequest(BigDecimal daily, BigDecimal monthly) {}
