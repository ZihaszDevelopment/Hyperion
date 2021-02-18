package dev.zihasz.hyperion.api;

import dev.zihasz.hyperion.api.interfaces.IEncryption;

public class AbstractEncryption implements IEncryption {

    public String encrypt(String input, String key, String salt) {
        return input;
    }
    public String decrypt(String input, String key, String salt) {
        return input;
    }

}
