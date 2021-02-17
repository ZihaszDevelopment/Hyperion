package dev.zihasz.hyperion.impl.wrapper.hashing;

import dev.zihasz.hyperion.api.IHash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 implements IHash {

    public String hash(String message) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(message.getBytes());
        return new String(md.digest());
    }

}
