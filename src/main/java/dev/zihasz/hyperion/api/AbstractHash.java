package dev.zihasz.hyperion.api;

import dev.zihasz.hyperion.api.interfaces.IHash;

import java.util.Base64;

public class AbstractHash implements IHash {

    Base64.Encoder encoder = Base64.getEncoder();
    Base64.Decoder decoder = Base64.getDecoder();

    public String hash(String message) throws Exception {
        return message;
    }

}
