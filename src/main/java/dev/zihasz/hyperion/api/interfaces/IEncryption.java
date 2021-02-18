package dev.zihasz.hyperion.api.interfaces;

public interface IEncryption {
    String encrypt(String input, String key, String salt);
    String decrypt(String input, String key, String salt);
}
