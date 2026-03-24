package lest.dev.UserService.domain.model.entities;

import java.math.BigDecimal;

public class UserSpendingLimitsDomain {
    private BigDecimal daily;
    private BigDecimal monthly;

    public UserSpendingLimitsDomain() {}

    public UserSpendingLimitsDomain(BigDecimal daily, BigDecimal monthly) {
        this.daily = daily;
        this.monthly = monthly;
    }

    public BigDecimal getDaily() { return daily; }
    public void setDaily(BigDecimal daily) { this.daily = daily; }
    public BigDecimal getMonthly() { return monthly; }
    public void setMonthly(BigDecimal monthly) { this.monthly = monthly; }
}
