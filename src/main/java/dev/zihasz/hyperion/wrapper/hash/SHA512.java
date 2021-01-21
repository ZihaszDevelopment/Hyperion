package dev.zihasz.hyperion.wrapper.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA512 {

    public String hash(String message) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(message.getBytes());
        return new String(md.digest());
    }

}
