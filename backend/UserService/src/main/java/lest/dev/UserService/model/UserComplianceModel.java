package lest.dev.UserService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
public class UserComplianceModel {

    private UUID userId; // Chave estrangeira para User
    private String kycStatus; // pending | verified | rejected
    private boolean isPep; // Pessoa Exposta Politicamente
    private String regulatoryRegion;
    private UserTermsAcceptedModel termsAccepted;
    private boolean dataRetentionConsent;
    private LocalDateTime lastRiskAssessment;

}
