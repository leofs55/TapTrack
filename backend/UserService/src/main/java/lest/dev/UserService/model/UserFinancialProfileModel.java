package lest.dev.UserService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
public class UserFinancialProfileModel {

    private UUID userId;
    private String baseCurrency;
    private BigDecimal monthlyIncome;
    private String riskScore; // low | medium | high
    private UserSpendingLimitsModel spendingLimits;
    private String investmentProfile; // conservative | moderate | aggressive

}
