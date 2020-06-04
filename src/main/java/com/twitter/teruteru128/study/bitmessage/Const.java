package com.twitter.teruteru128.study.bitmessage;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECPoint;

/**
 * Const
 */
public class Const {

    public static final ECPoint G = CustomNamedCurves.getByName("secp256k1").getG();
    public static final int PRIVATE_KEY_LENGTH = 32;
    public static final int PUBLIC_KEY_LENGTH = 65;
    public static final int RIPEMD160_DIGEST_LENGTH = 20;
    public static final int SHA256_DIGEST_LENGTH = 32;
    public static final int SHA512_DIGEST_LENGTH = 64;

}
