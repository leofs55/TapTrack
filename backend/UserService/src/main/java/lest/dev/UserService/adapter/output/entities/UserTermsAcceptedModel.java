package lest.dev.UserService.adapter.output.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_user_terms_accepted")
public class UserTermsAcceptedModel {

    private UUID userId;
    private String version;
    private LocalDateTime acceptedAt;
    private String ipAddress;

}
