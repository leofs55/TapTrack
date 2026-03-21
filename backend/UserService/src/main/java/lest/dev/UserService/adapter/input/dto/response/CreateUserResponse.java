package lest.dev.UserService.adapter.input.dto.response;

import lest.dev.UserService.adapter.input.dto.response.util.UserAccessControlResponse;
import lest.dev.UserService.adapter.input.dto.response.util.UserComplianceResponse;
import lest.dev.UserService.adapter.input.dto.response.util.UserFinancialProfileResponse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class CreateUserResponse {
    private UUID userId;
    private String name;
    private String taxId;
    private LocalDate birthDate;
    private String email;
    private String phone;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private UserComplianceResponse compliance;
    private UserFinancialProfileResponse financialProfile;
    private UserAccessControlResponse accessControl;

    public CreateUserResponse() {}

    public CreateUserResponse(UUID userId, String name, String taxId, LocalDate birthDate, String email, String phone, LocalDateTime createdAt, LocalDateTime updatedAt, UserComplianceResponse compliance, UserFinancialProfileResponse financialProfile, UserAccessControlResponse accessControl) {
        this.userId = userId;
        this.name = name;
        this.taxId = taxId;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.compliance = compliance;
        this.financialProfile = financialProfile;
        this.accessControl = accessControl;
    }

    public UUID getUserId() { return userId; }
    public void setUserId(UUID userId) { this.userId = userId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTaxId() { return taxId; }
    public void setTaxId(String taxId) { this.taxId = taxId; }
    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
    public UserComplianceResponse getCompliance() { return compliance; }
    public void setCompliance(UserComplianceResponse compliance) { this.compliance = compliance; }
    public UserFinancialProfileResponse getFinancialProfile() { return financialProfile; }
    public void setFinancialProfile(UserFinancialProfileResponse financialProfile) { this.financialProfile = financialProfile; }
    public UserAccessControlResponse getAccessControl() { return accessControl; }
    public void setAccessControl(UserAccessControlResponse accessControl) { this.accessControl = accessControl; }
}
