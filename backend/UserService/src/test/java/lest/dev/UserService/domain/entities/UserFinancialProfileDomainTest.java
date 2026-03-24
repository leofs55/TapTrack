package lest.dev.UserService.domain.entities;

import lest.dev.UserService.domain.model.entities.UserFinancialProfileDomain;
import lest.dev.UserService.domain.model.entities.UserSpendingLimitsDomain;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserFinancialProfileDomainTest {

    @Test
    void shouldCreateUserFinancialProfileDomainWithConstructor() {
        UUID userId = UUID.randomUUID();
        UserSpendingLimitsDomain limits = new UserSpendingLimitsDomain(
                new BigDecimal("500.00"), new BigDecimal("10000.00")
        );

        UserFinancialProfileDomain profile = new UserFinancialProfileDomain(
                userId, "BRL", new BigDecimal("5000.00"), "low", limits, "conservative"
        );

        assertEquals(userId, profile.getUserId());
        assertEquals("BRL", profile.getBaseCurrency());
        assertEquals(new BigDecimal("5000.00"), profile.getMonthlyIncome());
        assertEquals("low", profile.getRiskScore());
        assertEquals(limits, profile.getSpendingLimits());
        assertEquals("conservative", profile.getInvestmentProfile());
    }

    @Test
    void shouldCreateAndModifyUserFinancialProfileDomainWithSetters() {
        UserFinancialProfileDomain profile = new UserFinancialProfileDomain();
        UUID userId = UUID.randomUUID();

        profile.setUserId(userId);
        profile.setBaseCurrency("USD");
        profile.setMonthlyIncome(new BigDecimal("10000.00"));
        profile.setRiskScore("high");
        profile.setInvestmentProfile("aggressive");

        assertEquals(userId, profile.getUserId());
        assertEquals("USD", profile.getBaseCurrency());
        assertEquals(new BigDecimal("10000.00"), profile.getMonthlyIncome());
        assertEquals("high", profile.getRiskScore());
        assertEquals("aggressive", profile.getInvestmentProfile());
    }

    @Test
    void shouldCreateAndModifySpendingLimits() {
        UserSpendingLimitsDomain limits = new UserSpendingLimitsDomain();

        limits.setDaily(new BigDecimal("100.00"));
        limits.setMonthly(new BigDecimal("3000.00"));

        assertEquals(new BigDecimal("100.00"), limits.getDaily());
        assertEquals(new BigDecimal("3000.00"), limits.getMonthly());
    }
}
