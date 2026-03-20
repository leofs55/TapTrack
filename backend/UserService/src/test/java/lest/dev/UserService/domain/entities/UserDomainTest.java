package lest.dev.UserService.domain.entities;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserDomainTest {

    @Test
    void shouldCreateUserDomainWithCompleteConstructor() {
        UUID userId = UUID.randomUUID();
        LocalDate birthDate = LocalDate.of(1990, 1, 1);
        LocalDateTime now = LocalDateTime.now();

        UserComplianceDomain compliance = new UserComplianceDomain();
        UserFinancialProfileDomain financialProfile = new UserFinancialProfileDomain();
        UserAcessControl accessControl = new UserAcessControl();

        UserDomain user = new UserDomain(
                userId, "John Doe", "12345678909", birthDate,
                "john.doe@example.com", "+5511999999999", now, now,
                compliance, financialProfile, accessControl
        );

        assertEquals(userId, user.getUserId());
        assertEquals("John Doe", user.getName());
        assertEquals("12345678909", user.getTaxId());
        assertEquals(birthDate, user.getBirthDate());
        assertEquals("john.doe@example.com", user.getEmail());
        assertEquals("+5511999999999", user.getPhone());
        assertEquals(now, user.getCreatedAt());
        assertEquals(now, user.getUpdatedAt());
        assertEquals(compliance, user.getCompliance());
        assertEquals(financialProfile, user.getFinancialProfile());
        assertEquals(accessControl, user.getAccessControl());
    }

    @Test
    void shouldCreateAndModifyUserDomainWithSetters() {
        UserDomain user = new UserDomain();
        UUID userId = UUID.randomUUID();
        LocalDate birthDate = LocalDate.of(1995, 5, 15);
        LocalDateTime now = LocalDateTime.now();

        user.setUserId(userId);
        user.setName("Jane Doe");
        user.setTaxId("98765432100");
        user.setBirthDate(birthDate);
        user.setEmail("jane.doe@example.com");
        user.setPhone("+5511888888888");
        user.setCreatedAt(now);
        user.setUpdatedAt(now);

        UserComplianceDomain compliance = new UserComplianceDomain();
        UserFinancialProfileDomain financialProfile = new UserFinancialProfileDomain();
        UserAcessControl accessControl = new UserAcessControl();

        user.setCompliance(compliance);
        user.setFinancialProfile(financialProfile);
        user.setAccessControl(accessControl);

        assertEquals(userId, user.getUserId());
        assertEquals("Jane Doe", user.getName());
        assertEquals("98765432100", user.getTaxId());
        assertEquals(birthDate, user.getBirthDate());
        assertEquals("jane.doe@example.com", user.getEmail());
        assertEquals("+5511888888888", user.getPhone());
        assertEquals(now, user.getCreatedAt());
        assertEquals(now, user.getUpdatedAt());
        assertEquals(compliance, user.getCompliance());
        assertEquals(financialProfile, user.getFinancialProfile());
        assertEquals(accessControl, user.getAccessControl());
    }
}
