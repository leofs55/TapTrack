package lest.dev.UserService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
public class UserAcessControlModel {

    private UUID userId;
    private String role; // ex: "admin", "premium_user"
    private List<String> scopes;
    private UserMfaStatusModel mfaStatus;
    private String accountStatus; // active | blocked | suspended
    private LocalDateTime lastLoginAttempt;

}
