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
        var logger = System.getLogger("jni");
        logger.log(System.Logger.Level.INFO, "a");
    }

    public native byte[] test(String a);
}
