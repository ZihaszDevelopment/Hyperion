package dev.zihasz.hyperion.api.interfaces;

import java.security.NoSuchAlgorithmException;

public interface IHash {
    String hash(String message) throws Exception;
}
