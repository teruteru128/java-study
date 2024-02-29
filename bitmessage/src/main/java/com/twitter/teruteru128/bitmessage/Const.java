package com.twitter.teruteru128.bitmessage;

import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.math.ec.ECPoint;

/**
 * Const
 */
public final class Const {

    private Const() {
    }

    public static final X9ECParameters SEC_P256_K1 = CustomNamedCurves.getByName("secp256k1");
    public static final ECNamedCurveParameterSpec SEC_P256_K1_PARAMETER_SPEC = ECNamedCurveTable.getParameterSpec("secp256k1");
    public static final ECPoint SEC_P256_K1_G = SEC_P256_K1.getG();
    public static final int PRIVATE_KEY_LENGTH = 32;
    public static final int PUBLIC_KEY_LENGTH = 65;
    public static final int RIPEMD160_DIGEST_LENGTH = 20;
    public static final int SHA256_DIGEST_LENGTH = 32;
    public static final int SHA512_DIGEST_LENGTH = 64;

}
