package lest.dev.UserService.adapter.input.dto.response.util;

import java.math.BigDecimal;

public class UserFinancialProfileResponse {
    private String baseCurrency;
    private BigDecimal monthlyIncome;
    private String riskScore;
    private UserSpendingLimitsResponse spendingLimits;
    private String investmentProfile;

    public UserFinancialProfileResponse() {}

    public UserFinancialProfileResponse(String baseCurrency, BigDecimal monthlyIncome, String riskScore, UserSpendingLimitsResponse spendingLimits, String investmentProfile) {
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
    public UserSpendingLimitsResponse getSpendingLimits() { return spendingLimits; }
    public void setSpendingLimits(UserSpendingLimitsResponse spendingLimits) { this.spendingLimits = spendingLimits; }
    public String getInvestmentProfile() { return investmentProfile; }
    public void setInvestmentProfile(String investmentProfile) { this.investmentProfile = investmentProfile; }
}
