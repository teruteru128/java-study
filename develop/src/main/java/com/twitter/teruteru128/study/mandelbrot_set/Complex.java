package com.twitter.teruteru128.study.mandelbrot_set;

/**
 * @author Teruteru
 *
 */
public class Complex {
    private double re;
    private double im;
    /**
     * 
     */
    public Complex() {
        this(0,0);
    }
    /**
     * 
     */
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public double getRe(){
        return(re);
    }
    public void setRe(double re){
        this.re =re;
    }
    public double getIm(){
        return(im);
    }
    public void setIm(double im){
        this.im =im;
    }
    /** (非 Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s[re=%f,im=%f]",getClass().getName(), re,im);
    }
}
