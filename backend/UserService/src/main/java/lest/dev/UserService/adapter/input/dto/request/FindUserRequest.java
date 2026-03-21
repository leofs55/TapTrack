package lest.dev.UserService.adapter.input.dto.request;

import java.util.UUID;

public class FindUserRequest {
    private UUID userId;
    private String email;
    private String taxId;

    public FindUserRequest() {}

    public FindUserRequest(UUID userId, String email, String taxId) {
        this.userId = userId;
        this.email = email;
        this.taxId = taxId;
    }

    public UUID getUserId() { return userId; }
    public void setUserId(UUID userId) { this.userId = userId; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTaxId() { return taxId; }
    public void setTaxId(String taxId) { this.taxId = taxId; }
}
