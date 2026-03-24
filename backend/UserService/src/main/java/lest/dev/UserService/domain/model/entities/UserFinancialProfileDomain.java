package lest.dev.UserService.domain.model.entities;

import java.math.BigDecimal;
import java.util.UUID;

public class UserFinancialProfileDomain {
    private UUID userId;
    private String baseCurrency;
    private BigDecimal monthlyIncome;
    private String riskScore; // low | medium | high
    private UserSpendingLimitsDomain spendingLimits;
    private String investmentProfile; // conservative | moderate | aggressive

    public UserFinancialProfileDomain() {}

    public UserFinancialProfileDomain(UUID userId, String baseCurrency, BigDecimal monthlyIncome, String riskScore, UserSpendingLimitsDomain spendingLimits, String investmentProfile) {
        this.userId = userId;
        this.baseCurrency = baseCurrency;
        this.monthlyIncome = monthlyIncome;
        this.riskScore = riskScore;
        this.spendingLimits = spendingLimits;
        this.investmentProfile = investmentProfile;
    }

    public UUID getUserId() { return userId; }
    public void setUserId(UUID userId) { this.userId = userId; }
    public String getBaseCurrency() { return baseCurrency; }
    public void setBaseCurrency(String baseCurrency) { this.baseCurrency = baseCurrency; }
    public BigDecimal getMonthlyIncome() { return monthlyIncome; }
    public void setMonthlyIncome(BigDecimal monthlyIncome) { this.monthlyIncome = monthlyIncome; }
    public String getRiskScore() { return riskScore; }
    public void setRiskScore(String riskScore) { this.riskScore = riskScore; }
    public UserSpendingLimitsDomain getSpendingLimits() { return spendingLimits; }
    public void setSpendingLimits(UserSpendingLimitsDomain spendingLimits) { this.spendingLimits = spendingLimits; }
    public String getInvestmentProfile() { return investmentProfile; }
    public void setInvestmentProfile(String investmentProfile) { this.investmentProfile = investmentProfile; }
}
