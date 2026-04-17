package com.example.reset;
import java.util.HashMap;
import java.util.Map;

public class PasswordResetService {
    private Map<String, String> otpStorage = new HashMap<>();
    public void generateOTP(String email, String otp) { otpStorage.put(email, otp); }
    public boolean resetPassword(String email, String userOtp) {
        return otpStorage.containsKey(email) && otpStorage.get(email).equals(userOtp);
    }
}
