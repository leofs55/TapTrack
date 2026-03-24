package lest.dev.UserService.adapter.input.dto.request;

import java.util.UUID;

public record FindUserRequest(UUID userId, String email, String taxId) {}
