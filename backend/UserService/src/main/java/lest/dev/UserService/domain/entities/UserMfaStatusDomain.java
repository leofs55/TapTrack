package lest.dev.UserService.domain.entities;

public class UserMfaStatusDomain {
    private boolean enabled;
    private String method; // totp | sms

    public UserMfaStatusDomain() {}

    public UserMfaStatusDomain(boolean enabled, String method) {
        this.enabled = enabled;
        this.method = method;
    }

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getMethod() { return method; }
    public void setMethod(String method) { this.method = method; }
}
