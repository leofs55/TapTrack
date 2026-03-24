package lest.dev.UserService.adapter.input.dto.request.util;

import java.time.LocalDateTime;
import java.util.List;

public record UserAccessControlRequest(String role, List<String> scopes, UserMfaStatusRequest mfaStatus, String accountStatus, LocalDateTime lastLoginAttempt) {}
