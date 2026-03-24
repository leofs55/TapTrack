package lest.dev.UserService.adapter.input.dto.request;

import lest.dev.UserService.adapter.input.dto.request.util.UserAccessControlRequest;
import lest.dev.UserService.adapter.input.dto.request.util.UserComplianceRequest;
import lest.dev.UserService.adapter.input.dto.request.util.UserFinancialProfileRequest;

import java.time.LocalDate;
import java.util.UUID;

public record UpdateUserRequest(UUID userId, String name, String taxId, LocalDate birthDate, String email, String phone, UserComplianceRequest compliance, UserFinancialProfileRequest financialProfile, UserAccessControlRequest accessControl) {}
