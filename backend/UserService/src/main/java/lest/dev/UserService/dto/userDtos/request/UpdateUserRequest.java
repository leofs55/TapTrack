package lest.dev.UserService.dto.userDtos.request;

import java.time.LocalDate;
import java.util.UUID;

public record UpdateUserRequest(
        UUID userId,
        String name,
        LocalDate birthDate,
        String email,
        String phone
) {}

