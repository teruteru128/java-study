package com.twitter.teruteru128.study.rsa.sample006;

import java.math.BigInteger;

public class RSAOtherPrimeInfo {
    private BigInteger prime;
    private BigInteger exponent;
    private BigInteger crtCoefficient;

    /**
     * 
     */
    public RSAOtherPrimeInfo(BigInteger prime, BigInteger exponent,
            BigInteger cetCoefficient) {
    }

    /**
     * @return prime
     */
    public BigInteger getPrime() {
        return prime;
    }

    /**
     * @param prime
     *            セットする prime
     */
    public void setPrime(BigInteger prime) {
        this.prime = prime;
    }

    /**
     * @return exponent
     */
    public BigInteger getExponent() {
        return exponent;
    }

    /**
     * @param exponent
     *            セットする exponent
     */
    public void setExponent(BigInteger exponent) {
        this.exponent = exponent;
    }

    /**
     * @return cetCoefficient
     */
    public BigInteger getCrtCoefficient() {
        return crtCoefficient;
    }

    /**
     * @param crtCoefficient
     *            セットする crtCoefficient
     */
    public void setCrtCoefficient(BigInteger crtCoefficient) {
        this.crtCoefficient = crtCoefficient;
    }
}
