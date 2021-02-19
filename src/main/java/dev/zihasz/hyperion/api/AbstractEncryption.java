package dev.zihasz.hyperion.api;

import dev.zihasz.hyperion.api.interfaces.IEncryption;

import java.util.Base64;

public class AbstractEncryption implements IEncryption {

    Base64.Encoder encoder = Base64.getEncoder();
    Base64.Decoder decoder = Base64.getDecoder();

    public String encrypt(String input, String key, String salt) {
        return input;
    }
    public String decrypt(String input, String key, String salt) {
        return input;
    }

}
