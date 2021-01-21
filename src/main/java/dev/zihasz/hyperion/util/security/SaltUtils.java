package dev.zihasz.hyperion.util.security;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SaltUtils {
    public static byte[] getSalt() throws NoSuchAlgorithmException {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return salt;
    }
}
