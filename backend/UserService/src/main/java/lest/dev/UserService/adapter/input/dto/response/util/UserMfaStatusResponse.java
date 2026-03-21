package lest.dev.UserService.adapter.input.dto.response.util;

public class UserMfaStatusResponse {
    private boolean enabled;
    private String method;

    public UserMfaStatusResponse() {}

    public UserMfaStatusResponse(boolean enabled, String method) {
        this.enabled = enabled;
        this.method = method;
    }

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getMethod() { return method; }
    public void setMethod(String method) { this.method = method; }
}
