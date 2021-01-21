package dev.zihasz.hyperion.base;

import java.security.NoSuchAlgorithmException;

public interface IHash {
    String hash(String message) throws NoSuchAlgorithmException;
}
