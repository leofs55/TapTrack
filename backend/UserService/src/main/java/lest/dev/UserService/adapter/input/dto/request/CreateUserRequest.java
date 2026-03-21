package lest.dev.UserService.adapter.input.dto.request;

import lest.dev.UserService.adapter.input.dto.request.util.UserAccessControlRequest;
import lest.dev.UserService.adapter.input.dto.request.util.UserComplianceRequest;
import lest.dev.UserService.adapter.input.dto.request.util.UserFinancialProfileRequest;

import java.time.LocalDate;

public class CreateUserRequest {
    private String name;
    private String taxId;
    private LocalDate birthDate;
    private String email;
    private String phone;
    private UserComplianceRequest compliance;
    private UserFinancialProfileRequest financialProfile;
    private UserAccessControlRequest accessControl;

    public CreateUserRequest() {}

    public CreateUserRequest(String name, String taxId, LocalDate birthDate, String email, String phone, UserComplianceRequest compliance, UserFinancialProfileRequest financialProfile, UserAccessControlRequest accessControl) {
        this.name = name;
        this.taxId = taxId;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.compliance = compliance;
        this.financialProfile = financialProfile;
        this.accessControl = accessControl;
    }

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
    public UserComplianceRequest getCompliance() { return compliance; }
    public void setCompliance(UserComplianceRequest compliance) { this.compliance = compliance; }
    public UserFinancialProfileRequest getFinancialProfile() { return financialProfile; }
    public void setFinancialProfile(UserFinancialProfileRequest financialProfile) { this.financialProfile = financialProfile; }
    public UserAccessControlRequest getAccessControl() { return accessControl; }
    public void setAccessControl(UserAccessControlRequest accessControl) { this.accessControl = accessControl; }
}
