package lest.dev.UserService.dto.userFinancialProfileDtos.response;

import java.util.UUID;

public record DeleteUserFinancialProfileResponse(
        UUID userId,
        boolean success
) {}

