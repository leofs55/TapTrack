package lest.dev.UserService.adapter.input.dto.response.util;

import java.time.LocalDateTime;
import java.util.List;

public record UserAccessControlResponse(String role, List<String> scopes, UserMfaStatusResponse mfaStatus, String accountStatus, LocalDateTime lastLoginAttempt) {}
