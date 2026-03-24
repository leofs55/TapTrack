package lest.dev.UserService.adapter.input.dto.response.util;

import java.math.BigDecimal;

public record UserSpendingLimitsResponse(BigDecimal daily, BigDecimal monthly) {}
