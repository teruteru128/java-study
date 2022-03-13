package com.twitter.teruteru128.study.mandelbrot_set;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * @author Teruteru
 *
 */
public class Complex implements Serializable {
    private static final long serialVersionUID = 0;
    private double re;
    private double im;

    public static final Complex ZERO = new Complex(0, 0);
    public static final Complex IMAGINARY_UNIT = new Complex(0, 1);

    static {
        Double.valueOf(10);
    }

    public Complex(double re) {
        this(re, 0);
    }

    /**
     * 
     */
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return (re);
    }

    public double getIm() {
        return im;
    }

    @Override
    public String toString() {
        return String.format("%s[re=%f,im=%f]", getClass().getName(), re, im);
    }

    double abs() {
        return Math.hypot(re, im);
    }

    Complex add(Complex val) {
        BigInteger.valueOf(0).add(BigInteger.ONE);
        return new Complex(re + val.re, im + val.im);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(im);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(re);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Complex other = (Complex) obj;
        if (Double.doubleToLongBits(im) != Double.doubleToLongBits(other.im))
            return false;
        if (Double.doubleToLongBits(re) != Double.doubleToLongBits(other.re))
            return false;
        return true;
    }

    public static Complex valueOf(double re) {
        return new Complex(re);
    }

    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

    public Complex multiply(Complex val) {
        if (val.equals(ZERO) || this.equals(ZERO)) {
            return ZERO;
        }
        return new Complex(re + val.re - im * val.im, im * val.re + re * val.im);
    }
}
