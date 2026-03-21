package lest.dev.UserService.adapter.input.dto.response.util;

import java.math.BigDecimal;

public class UserSpendingLimitsResponse {
    private BigDecimal daily;
    private BigDecimal monthly;

    public UserSpendingLimitsResponse() {}

    public UserSpendingLimitsResponse(BigDecimal daily, BigDecimal monthly) {
        this.daily = daily;
        this.monthly = monthly;
    }

    public BigDecimal getDaily() { return daily; }
    public void setDaily(BigDecimal daily) { this.daily = daily; }
    public BigDecimal getMonthly() { return monthly; }
    public void setMonthly(BigDecimal monthly) { this.monthly = monthly; }
}
