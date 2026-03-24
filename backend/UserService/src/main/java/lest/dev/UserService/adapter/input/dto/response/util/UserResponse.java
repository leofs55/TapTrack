package lest.dev.UserService.adapter.input.dto.response.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public record UserResponse(UUID userId, String name, String taxId, LocalDate birthDate, String email, String phone, LocalDateTime createdAt, LocalDateTime updatedAt, UserComplianceResponse compliance, UserFinancialProfileResponse financialProfile, UserAccessControlResponse accessControl) {}
