
package com.example.registerapp.util;
import java.security.SecureRandom;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component


public class OtpUtil {
    private static final int OTP_LENGTH = 6;
    private static final String OTP_CHARS = "123456789";

    public String generateOtp() {
        SecureRandom random = new SecureRandom();
        StringBuilder otp = new StringBuilder(OTP_LENGTH);

        for (int i = 0; i < OTP_LENGTH; i++) {
            int index = random.nextInt(OTP_CHARS.length());
            otp.append(OTP_CHARS.charAt(index));
        }

        return otp.toString();
    }
}

