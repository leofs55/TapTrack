package lest.dev.UserService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
public class UserMfaStatusModel {

    private UUID userId;
    private boolean enabled;
    private String method; // totp | sms

}
