package lest.dev.UserService.adapter.input.dto.request.util;

import java.math.BigDecimal;

public record UserFinancialProfileRequest(String baseCurrency, BigDecimal monthlyIncome, String riskScore, UserSpendingLimitsRequest spendingLimits, String investmentProfile) {}
