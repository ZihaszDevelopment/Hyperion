package dev.zihasz.hyperion.api;

import dev.zihasz.hyperion.api.interfaces.IEncoding;

import java.util.Base64;

public class AbstractEncoding implements IEncoding {

    Base64.Encoder encoder = Base64.getEncoder();
    Base64.Decoder decoder = Base64.getDecoder();

    public String encode(String input) {
        return input;
    }
    public String decode(String input) {
        return input;
    }

}
