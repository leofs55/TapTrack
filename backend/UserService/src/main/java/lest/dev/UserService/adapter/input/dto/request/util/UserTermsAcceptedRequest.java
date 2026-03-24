package lest.dev.UserService.adapter.input.dto.request.util;

import java.time.LocalDateTime;

public record UserTermsAcceptedRequest(String version, LocalDateTime acceptedAt, String ipAddress) {}
