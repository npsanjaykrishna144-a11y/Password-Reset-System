package com.example.reset;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordResetServiceTest {
    @Test
    public void testInvalidReset() {
        PasswordResetService service = new PasswordResetService();
        service.generateOTP("user@vit.edu", "123456");
        assertFalse(service.resetPassword("user@vit.edu", "wrong-otp"));
    }
}
