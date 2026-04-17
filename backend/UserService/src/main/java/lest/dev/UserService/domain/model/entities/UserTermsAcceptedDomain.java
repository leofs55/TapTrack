package lest.dev.UserService.domain.model.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class UserTermsAcceptedDomain {

    private UUID userId;
    private String version;
    private LocalDateTime acceptedAt;
    private String ipAddress;

    public UserTermsAcceptedDomain() {}

    public UserTermsAcceptedDomain(String version, LocalDateTime acceptedAt, String ipAddress) {
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
