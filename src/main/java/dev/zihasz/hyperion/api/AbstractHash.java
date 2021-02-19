package dev.zihasz.hyperion.api;

import dev.zihasz.hyperion.api.interfaces.IHash;

public class AbstractHash implements IHash {

    public String hash(String message) throws Exception {
        return message;
    }

}
