package com.github.teruteru128.bitmessage.spec;

/**
 * bitmessageアドレスのエンコーダへのstaticファサード。
 * <p>
 * 実装は{@link AddressEncoder}にある。こちらは呼び出しごとにエンコーダを作り捨てるので
 * スレッドセーフだが、そのぶん{@link java.security.MessageDigest}の生成コストが毎回かかる。
 * アドレスを大量に生成するループでは{@link AddressEncoder}を1スレッドに1個持って使い回すこと。
 *
 * @see AddressEncoder
 * @see <a href="https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/addresses.py">addresses.py</a>
 */
public final class AddressFactory {

    private AddressFactory() {
    }

    /**
     * @return encoded bitmessage address
     * @see AddressEncoder#encode(Appendable, int, int, byte[], int, int)
     */
    public static <A extends Appendable> A encodeAddress(A out, int version, int stream, byte[] ripe, int offset,
            int length) {
        return new AddressEncoder().encode(out, version, stream, ripe, offset, length);
    }

    /**
     * @return encoded bitmessage address
     * @see AddressEncoder#encode(Appendable, int, int, byte[], int, int)
     */
    public static <A extends Appendable> A encodeAddress(A out, int version, int stream, byte[] ripe) {
        return encodeAddress(out, version, stream, ripe, 0, ripe.length);
    }

    /**
     * @return encoded bitmessage address
     * @see AddressEncoder#encode(Appendable, int, int, byte[], int, int)
     */
    public static <A extends Appendable> A encodeAddress(A out, byte[] ripe, int offset, int length) {
        return encodeAddress(out, 4, 1, ripe, offset, length);
    }

    /**
     * @return encoded bitmessage address
     * @see AddressEncoder#encode(Appendable, int, int, byte[], int, int)
     */
    public static <A extends Appendable> A encodeAddress(A out, byte[] ripe) {
        return encodeAddress(out, 4, 1, ripe, 0, ripe.length);
    }

    /**
     * @return encoded bitmessage address
     * @see AddressEncoder#encode(Appendable, int, int, byte[], int, int)
     */
    public static String encodeAddress(int version, int stream, byte[] ripe, int offset, int length) {
        return new AddressEncoder().encode(version, stream, ripe, offset, length);
    }

    /**
     * @return encoded bitmessage address
     * @see AddressEncoder#encode(Appendable, int, int, byte[], int, int)
     */
    public static String encodeAddress(int version, int stream, byte[] ripe) {
        return encodeAddress(version, stream, ripe, 0, ripe.length);
    }

    /**
     * @return encoded bitmessage address
     * @see AddressEncoder#encode(Appendable, int, int, byte[], int, int)
     */
    public static String encodeAddress(byte[] ripe, int offset, int length) {
        return encodeAddress(4, 1, ripe, offset, length);
    }

    /**
     * @return encoded bitmessage address
     * @see AddressEncoder#encode(Appendable, int, int, byte[], int, int)
     */
    public static String encodeAddress(byte[] ripe) {
        return encodeAddress(4, 1, ripe, 0, ripe.length);
    }
}
