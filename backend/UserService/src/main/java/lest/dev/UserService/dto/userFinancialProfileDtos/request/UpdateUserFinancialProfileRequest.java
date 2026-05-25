package lest.dev.UserService.dto.userFinancialProfileDtos.request;

import java.math.BigDecimal;
import java.util.UUID;

public record UpdateUserFinancialProfileRequest(
        UUID userId,
        String baseCurrency,
        BigDecimal monthlyIncome,
        String riskScore,
        BigDecimal spendingDaily,
        BigDecimal spendingMonthly,
        String investmentProfile
) {}

