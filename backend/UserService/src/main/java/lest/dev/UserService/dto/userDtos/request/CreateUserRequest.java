package lest.dev.UserService.dto.userDtos.request;

import java.time.LocalDate;
import java.util.UUID;

public record CreateUserRequest(
        String name,
        String taxId,
        LocalDate birthDate,
        String email,
        String phone
) {}

