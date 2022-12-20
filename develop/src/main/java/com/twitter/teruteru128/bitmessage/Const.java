package com.twitter.teruteru128.bitmessage;

import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECPoint;

/**
 * Const
 */
public class Const {

    private Const() {
    }

    public static final X9ECParameters SECP256K1 = CustomNamedCurves.getByName("secp256k1");
    public static final ECPoint G = SECP256K1.getG();
    public static final int PRIVATE_KEY_LENGTH = 32;
    public static final int PUBLIC_KEY_LENGTH = 65;
    public static final int RIPEMD160_DIGEST_LENGTH = 20;
    public static final int SHA256_DIGEST_LENGTH = 32;
    public static final int SHA512_DIGEST_LENGTH = 64;

}
