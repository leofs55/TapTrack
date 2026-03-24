package lest.dev.UserService.adapter.input.dto.response;

import lest.dev.UserService.adapter.input.dto.response.util.UserAccessControlResponse;
import lest.dev.UserService.adapter.input.dto.response.util.UserComplianceResponse;
import lest.dev.UserService.adapter.input.dto.response.util.UserFinancialProfileResponse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public record UpdateUserResponse(UUID userId, String name, String taxId, LocalDate birthDate, String email, String phone, LocalDateTime createdAt, LocalDateTime updatedAt, UserComplianceResponse compliance, UserFinancialProfileResponse financialProfile, UserAccessControlResponse accessControl) {}
