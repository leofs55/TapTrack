package lest.dev.UserService.dto.userFinancialProfileDtos.response;

import java.math.BigDecimal;
import java.util.UUID;

public record FindUserFinancialProfileResponse(
        UUID userId,
        String baseCurrency,
        BigDecimal monthlyIncome,
        String riskScore,
        BigDecimal spendingDaily,
        BigDecimal spendingMonthly,
        String investmentProfile
) {}

