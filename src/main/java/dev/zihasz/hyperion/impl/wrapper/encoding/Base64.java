package dev.zihasz.hyperion.impl.wrapper.encoding;

import dev.zihasz.hyperion.api.interfaces.IEncoding;

import java.nio.charset.StandardCharsets;

public class Base64 implements IEncoding {
    java.util.Base64.Encoder encoder = java.util.Base64.getEncoder();
    java.util.Base64.Decoder decoder = java.util.Base64.getDecoder();

    java.util.Base64.Encoder mimeEncode = java.util.Base64.getMimeEncoder();
    java.util.Base64.Decoder mimeDecode = java.util.Base64.getMimeDecoder();

    java.util.Base64.Encoder urlEncoder = java.util.Base64.getUrlEncoder();
    java.util.Base64.Decoder urlDecoder = java.util.Base64.getUrlDecoder();

    public String encode(String input) {
        return encoder.encodeToString(input.getBytes(StandardCharsets.UTF_8));
    }
    public String decode(String input) {
        return new String(decoder.decode(input.getBytes(StandardCharsets.UTF_8)));
    }

    public String mimeEncode(String input) {
        return mimeEncode.encodeToString(input.getBytes(StandardCharsets.UTF_8));
    }
    public String mimeDecode(String input) {
        return new String(mimeDecode.decode(input.getBytes(StandardCharsets.UTF_8)));
    }

    public String urlEncode(String url) {
        return urlEncoder.encodeToString(url.getBytes(StandardCharsets.UTF_8));
    }
    public String urlDecode(String url) {
        return new String(urlDecoder.decode(url.getBytes(StandardCharsets.UTF_8)));
    }
}
