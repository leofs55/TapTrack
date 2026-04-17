package lest.dev.UserService.adapter.output.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_user_mfa_status")
public class UserMfaStatusModel {

    private UUID userId;
    private boolean enabled;
    private String method; // totp | sms

}
