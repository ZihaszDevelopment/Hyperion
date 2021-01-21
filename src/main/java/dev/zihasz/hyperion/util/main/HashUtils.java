package dev.zihasz.hyperion.util.main;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class HashUtils {
    private static final int BLOCK_BITS = 512;
    private static final int BLOCK_BYTES = BLOCK_BITS / 8;

    public static int[] pad(byte[] message) {
        // new message length: original + 1-bit and padding + 8-byte length
        // --> block count: whole blocks + (padding + length rounded up)
        int finalBlockLength = message.length % BLOCK_BYTES;
        int blockCount = message.length / BLOCK_BYTES + (finalBlockLength + 1 + 8 > BLOCK_BYTES ? 2 : 1);

        final IntBuffer result = IntBuffer.allocate(blockCount * (BLOCK_BYTES / Integer.BYTES));

        // copy as much of the message as possible
        ByteBuffer buf = ByteBuffer.wrap(message);
        for (int i = 0, n = message.length / Integer.BYTES; i < n; ++i) {
            result.put(buf.getInt());
        }
        // copy the remaining bytes (less than 4) and append 1 bit (rest is zero)
        ByteBuffer remainder = ByteBuffer.allocate(4);
        remainder.put(buf).put((byte) 0b10000000).rewind();
        result.put(remainder.getInt());

        // ignore however many pad bytes (implicitly calculated in the beginning)
        result.position(result.capacity() - 2);
        // place original message length as 64-bit integer at the end
        long msgLength = message.length * 8L;
        result.put((int) (msgLength >>> 32));
        result.put((int) msgLength);

        return result.array();
    }

    public static int ch(int x, int y, int z) {
        return (x & y) | ((~x) & z);
    }
    public static int maj(int x, int y, int z) {
        return (x & y) | (x & z) | (y & z);
    }
}
