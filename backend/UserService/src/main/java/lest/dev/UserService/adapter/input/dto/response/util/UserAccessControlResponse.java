package lest.dev.UserService.adapter.input.dto.response.util;

import java.time.LocalDateTime;
import java.util.List;

public class UserAccessControlResponse {
    private String role;
    private List<String> scopes;
    private UserMfaStatusResponse mfaStatus;
    private String accountStatus;
    private LocalDateTime lastLoginAttempt;

    public UserAccessControlResponse() {}

    public UserAccessControlResponse(String role, List<String> scopes, UserMfaStatusResponse mfaStatus, String accountStatus, LocalDateTime lastLoginAttempt) {
        this.role = role;
        this.scopes = scopes;
        this.mfaStatus = mfaStatus;
        this.accountStatus = accountStatus;
        this.lastLoginAttempt = lastLoginAttempt;
    }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public List<String> getScopes() { return scopes; }
    public void setScopes(List<String> scopes) { this.scopes = scopes; }
    public UserMfaStatusResponse getMfaStatus() { return mfaStatus; }
    public void setMfaStatus(UserMfaStatusResponse mfaStatus) { this.mfaStatus = mfaStatus; }
    public String getAccountStatus() { return accountStatus; }
    public void setAccountStatus(String accountStatus) { this.accountStatus = accountStatus; }
    public LocalDateTime getLastLoginAttempt() { return lastLoginAttempt; }
    public void setLastLoginAttempt(LocalDateTime lastLoginAttempt) { this.lastLoginAttempt = lastLoginAttempt; }
}
