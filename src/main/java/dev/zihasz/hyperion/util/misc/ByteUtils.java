package dev.zihasz.hyperion.util.misc;

import java.nio.ByteBuffer;

public class ByteUtils {
    public static byte[] toByteArray(int[] ints) {
        ByteBuffer buf = ByteBuffer.allocate(ints.length * Integer.BYTES);
        for (int i : ints) {
            buf.putInt(i);
        }
        return buf.array();
    }
}
