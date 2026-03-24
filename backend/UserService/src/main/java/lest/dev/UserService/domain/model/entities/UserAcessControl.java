package lest.dev.UserService.domain.model.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class UserAcessControl {
    private UUID userId;
    private String role; // ex: "admin", "premium_user"
    private List<String> scopes;
    private UserMfaStatusDomain mfaStatus;
    private String accountStatus; // active | blocked | suspended
    private LocalDateTime lastLoginAttempt;

    public UserAcessControl() {}

    public UserAcessControl(UUID userId, String role, List<String> scopes, UserMfaStatusDomain mfaStatus, String accountStatus, LocalDateTime lastLoginAttempt) {
        this.userId = userId;
        this.role = role;
        this.scopes = scopes;
        this.mfaStatus = mfaStatus;
        this.accountStatus = accountStatus;
        this.lastLoginAttempt = lastLoginAttempt;
    }

    public UUID getUserId() { return userId; }
    public void setUserId(UUID userId) { this.userId = userId; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public List<String> getScopes() { return scopes; }
    public void setScopes(List<String> scopes) { this.scopes = scopes; }
    public UserMfaStatusDomain getMfaStatus() { return mfaStatus; }
    public void setMfaStatus(UserMfaStatusDomain mfaStatus) { this.mfaStatus = mfaStatus; }
    public String getAccountStatus() { return accountStatus; }
    public void setAccountStatus(String accountStatus) { this.accountStatus = accountStatus; }
    public LocalDateTime getLastLoginAttempt() { return lastLoginAttempt; }
    public void setLastLoginAttempt(LocalDateTime lastLoginAttempt) { this.lastLoginAttempt = lastLoginAttempt; }

}
