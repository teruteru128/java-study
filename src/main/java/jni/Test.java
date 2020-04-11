package jni;


/**
 * @author Teruteru
 *
 */
public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("a");
    }

    public native byte[] test(String a);
}
