package lest.dev.UserService.domain.entities;

import lest.dev.UserService.domain.model.entities.UserComplianceDomain;
import lest.dev.UserService.domain.model.entities.UserTermsAcceptedDomain;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserComplianceDomainTest {

    @Test
    void shouldCreateUserComplianceDomainWithConstructor() {
        UUID userId = UUID.randomUUID();
        LocalDateTime now = LocalDateTime.now();
        UserTermsAcceptedDomain terms = new UserTermsAcceptedDomain("1.2", now, "192.168.0.1");

        UserComplianceDomain compliance = new UserComplianceDomain(
                userId, "verified", false, "BR", terms, true, now
        );

        assertEquals(userId, compliance.getUserId());
        assertEquals("verified", compliance.getKycStatus());
        assertFalse(compliance.isPep());
        assertEquals("BR", compliance.getRegulatoryRegion());
        assertEquals(terms, compliance.getTermsAccepted());
        assertTrue(compliance.isDataRetentionConsent());
        assertEquals(now, compliance.getLastRiskAssessment());
    }

    @Test
    void shouldCreateAndModifyUserComplianceDomainWithSetters() {
        UserComplianceDomain compliance = new UserComplianceDomain();
        UUID userId = UUID.randomUUID();
        LocalDateTime now = LocalDateTime.now();

        compliance.setUserId(userId);
        compliance.setKycStatus("pending");
        compliance.setPep(true);
        compliance.setRegulatoryRegion("US");
        compliance.setDataRetentionConsent(false);
        compliance.setLastRiskAssessment(now);

        assertEquals(userId, compliance.getUserId());
        assertEquals("pending", compliance.getKycStatus());
        assertTrue(compliance.isPep());
        assertEquals("US", compliance.getRegulatoryRegion());
        assertFalse(compliance.isDataRetentionConsent());
        assertEquals(now, compliance.getLastRiskAssessment());
    }

    @Test
    void shouldCreateAndModifyTermsAccepted() {
        UserTermsAcceptedDomain terms = new UserTermsAcceptedDomain();
        LocalDateTime now = LocalDateTime.now();

        terms.setVersion("2.0");
        terms.setAcceptedAt(now);
        terms.setIpAddress("10.0.0.1");

        assertEquals("2.0", terms.getVersion());
        assertEquals(now, terms.getAcceptedAt());
        assertEquals("10.0.0.1", terms.getIpAddress());
    }
}
