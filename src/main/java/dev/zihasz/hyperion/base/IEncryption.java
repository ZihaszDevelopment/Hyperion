package dev.zihasz.hyperion.base;

public interface IEncryption {
    String encrypt(String input, String key, String salt);
    String decrypt(String input, String key, String salt);
}
