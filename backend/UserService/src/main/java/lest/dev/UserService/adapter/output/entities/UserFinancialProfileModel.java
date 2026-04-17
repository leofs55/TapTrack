package lest.dev.UserService.adapter.output.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserFinancialProfileModel {

    private UUID userId;
    private String baseCurrency;
    private BigDecimal monthlyIncome;
    private String riskScore; // low | medium | high
    private UserSpendingLimitsModel spendingLimits;
    private String investmentProfile; // conservative | moderate | aggressive

}
