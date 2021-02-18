package dev.zihasz.hyperion.api;

import dev.zihasz.hyperion.api.interfaces.IEncoding;

public class AbstractEncoding implements IEncoding {

    public String encode(String input) {
        return input;
    }
    public String decode(String input) {
        return input;
    }

}
