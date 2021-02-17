package dev.zihasz.hyperion.impl.wrapper.hashing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1 {

    public String hash(String message) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.update(message.getBytes());
        return new String(md.digest());
    }

}
