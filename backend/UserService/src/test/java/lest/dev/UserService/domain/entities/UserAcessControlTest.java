package lest.dev.UserService.domain.entities;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserAcessControlTest {

    @Test
    void shouldCreateUserAcessControlWithConstructor() {
        UUID userId = UUID.randomUUID();
        List<String> scopes = Arrays.asList("transactions:read", "transactions:write");
        UserMfaStatusDomain mfaStatus = new UserMfaStatusDomain(true, "totp");
        LocalDateTime lastLogin = LocalDateTime.now();

        UserAcessControl accessControl = new UserAcessControl(
                userId, "premium_user", scopes, mfaStatus, "active", lastLogin
        );

        assertEquals(userId, accessControl.getUserId());
        assertEquals("premium_user", accessControl.getRole());
        assertEquals(scopes, accessControl.getScopes());
        assertEquals(mfaStatus, accessControl.getMfaStatus());
        assertEquals("active", accessControl.getAccountStatus());
        assertEquals(lastLogin, accessControl.getLastLoginAttempt());
    }

    @Test
    void shouldCreateAndModifyUserAcessControlWithSetters() {
        UserAcessControl accessControl = new UserAcessControl();
        UUID userId = UUID.randomUUID();
        LocalDateTime lastLogin = LocalDateTime.now();
        List<String> scopes = Arrays.asList("reports:export");

        accessControl.setUserId(userId);
        accessControl.setRole("admin");
        accessControl.setScopes(scopes);
        accessControl.setAccountStatus("blocked");
        accessControl.setLastLoginAttempt(lastLogin);

        assertEquals(userId, accessControl.getUserId());
        assertEquals("admin", accessControl.getRole());
        assertEquals(scopes, accessControl.getScopes());
        assertEquals("blocked", accessControl.getAccountStatus());
        assertEquals(lastLogin, accessControl.getLastLoginAttempt());
    }

    @Test
    void shouldCreateAndModifyMfaStatus() {
        UserMfaStatusDomain mfaStatus = new UserMfaStatusDomain();

        mfaStatus.setEnabled(false);
        mfaStatus.setMethod("sms");

        assertFalse(mfaStatus.isEnabled());
        assertEquals("sms", mfaStatus.getMethod());
    }
}
