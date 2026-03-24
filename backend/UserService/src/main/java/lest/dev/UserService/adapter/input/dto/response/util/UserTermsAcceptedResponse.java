package lest.dev.UserService.adapter.input.dto.response.util;

import java.time.LocalDateTime;

public record UserTermsAcceptedResponse(String version, LocalDateTime acceptedAt, String ipAddress) {}
