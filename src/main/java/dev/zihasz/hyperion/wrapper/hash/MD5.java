package dev.zihasz.hyperion.wrapper.hash;

import dev.zihasz.hyperion.base.IHash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 implements IHash {

    public String hash(String message) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(message.getBytes());
        return new String(md.digest());
    }

}
