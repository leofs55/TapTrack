package lest.dev.UserService.adapter.input.dto.request.util;

import java.time.LocalDateTime;

public class UserTermsAcceptedRequest {
    private String version;
    private LocalDateTime acceptedAt;
    private String ipAddress;

    public UserTermsAcceptedRequest() {}

    public UserTermsAcceptedRequest(String version, LocalDateTime acceptedAt, String ipAddress) {
        this.version = version;
        this.acceptedAt = acceptedAt;
        this.ipAddress = ipAddress;
    }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }
    public LocalDateTime getAcceptedAt() { return acceptedAt; }
    public void setAcceptedAt(LocalDateTime acceptedAt) { this.acceptedAt = acceptedAt; }
    public String getIpAddress() { return ipAddress; }
    public void setIpAddress(String ipAddress) { this.ipAddress = ipAddress; }
}
