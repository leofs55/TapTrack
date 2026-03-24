package lest.dev.UserService.adapter.input.dto.request.util;

public record UserMfaStatusRequest(boolean enabled, String method) {}
