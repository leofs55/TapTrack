package lest.dev.UserService.adapter.input.dto.request.util;

import java.math.BigDecimal;

public class UserFinancialProfileRequest {
    private String baseCurrency;
    private BigDecimal monthlyIncome;
    private String riskScore;
    private UserSpendingLimitsRequest spendingLimits;
    private String investmentProfile;

    public UserFinancialProfileRequest() {}

    public UserFinancialProfileRequest(String baseCurrency, BigDecimal monthlyIncome, String riskScore, UserSpendingLimitsRequest spendingLimits, String investmentProfile) {
        this.baseCurrency = baseCurrency;
        this.monthlyIncome = monthlyIncome;
        this.riskScore = riskScore;
        this.spendingLimits = spendingLimits;
        this.investmentProfile = investmentProfile;
    }

    public String getBaseCurrency() { return baseCurrency; }
    public void setBaseCurrency(String baseCurrency) { this.baseCurrency = baseCurrency; }
    public BigDecimal getMonthlyIncome() { return monthlyIncome; }
    public void setMonthlyIncome(BigDecimal monthlyIncome) { this.monthlyIncome = monthlyIncome; }
    public String getRiskScore() { return riskScore; }
    public void setRiskScore(String riskScore) { this.riskScore = riskScore; }
    public UserSpendingLimitsRequest getSpendingLimits() { return spendingLimits; }
    public void setSpendingLimits(UserSpendingLimitsRequest spendingLimits) { this.spendingLimits = spendingLimits; }
    public String getInvestmentProfile() { return investmentProfile; }
    public void setInvestmentProfile(String investmentProfile) { this.investmentProfile = investmentProfile; }
}
