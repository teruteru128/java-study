package com.twitter.teruteru128.mandelbrot_set;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.loadLibrary("calc");
        Complex c=new Complex(0.25,0);
        Complex z;
        z=mandelbrot_calc(c, 1.0D, 1048576);
        System.out.println(z);
        System.out.println(Math.hypot(z.getRe(), z.getIm()));
        /*
        Method[] ms = Complex.class.getMethods();
        for(Method m : ms){
            System.out.printf("%s%n",m.getName());
        }*/
    }

    /**
     * @param c 複素数c
     * @param threshold しきい値
     * @param max_iteration 最大反復回数
     * @return 計算結果
     * */
    public static native Complex mandelbrot_calc(Complex c,double threshold,int max_iteration);
}
