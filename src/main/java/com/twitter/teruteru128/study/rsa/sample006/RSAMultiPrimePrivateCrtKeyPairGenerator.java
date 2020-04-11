package com.twitter.teruteru128.study.rsa.sample006;

import java.math.BigInteger;

public class RSAMultiPrimePrivateCrtKeyPairGenerator implements
        KeyPairGenerator {
    private RSAMultiPrimePrivateCrtKeyGenerationParameters parameters;
    private int otherPrimeInfoNum;

    /**
     * 
     */
    public RSAMultiPrimePrivateCrtKeyPairGenerator() {
    }

    /**
     * 
     * @see com.twitter.teruteru128.study.rsa.sample006.KeyPairGenerator#init(KeyGenerationParameters)
     */
    @Override
    public void init(KeyGenerationParameters param) {
        this.parameters = (RSAMultiPrimePrivateCrtKeyGenerationParameters) param;
        this.otherPrimeInfoNum = this.parameters.getOtherPrimeInfoNum();
    }

    /**
     * 
     * @see com.twitter.teruteru128.study.rsa.sample006.KeyPairGenerator#generateKeyPair()
     */
    @Override
    public AsymmetricKeyPair generateKeyPair() {
        AsymmetricKeyPair result;
        boolean done = false;
        int strength = parameters.getStrength();
        int otherPrimeInfoNum = this.otherPrimeInfoNum;
        int pbitlength = (strength + otherPrimeInfoNum + 1)
                / (otherPrimeInfoNum + 2);
        int qbitlength = strength - pbitlength;
        int[] othersbitlength = new int[otherPrimeInfoNum];

        BigInteger p;
        BigInteger q;
        BigInteger n;
        BigInteger d;
        BigInteger e;
        BigInteger pSub1;
        BigInteger qSub1;
        BigInteger gcm;
        BigInteger lcm;
        BigInteger pExponent;
        BigInteger qExponent;
        BigInteger pCetCoefficient;
        BigInteger qCetCoefficient;
        RSAOtherPrimeInfo[] infos = new RSAOtherPrimeInfo[otherPrimeInfoNum];

        return null;
    }
}
