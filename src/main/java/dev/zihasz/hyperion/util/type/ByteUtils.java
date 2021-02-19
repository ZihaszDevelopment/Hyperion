package dev.zihasz.hyperion.util.type;

import dev.zihasz.hyperion.util.Util;

import java.nio.ByteBuffer;

public class ByteUtils extends Util {
    public static byte[] toByteArray(int[] ints) {
        ByteBuffer buf = ByteBuffer.allocate(ints.length * Integer.BYTES);
        for (int i : ints) {
            buf.putInt(i);
        }
        return buf.array();
    }
}
