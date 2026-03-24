package lest.dev.UserService.adapter.input.dto.response.util;

import java.math.BigDecimal;

public record UserFinancialProfileResponse(String baseCurrency, BigDecimal monthlyIncome, String riskScore, UserSpendingLimitsResponse spendingLimits, String investmentProfile) {}
