package lest.dev.UserService.dto.userFinancialProfileDtos.response;

import java.util.UUID;

public record UpdateUserFinancialProfileResponse(
        UUID userId,
        String baseCurrency,
        String riskScore
) {}

