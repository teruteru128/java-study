package com.twitter.teruteru128.study.brainfuck;

/**
 * @author Teruteru
 *
 */
public class BrainfuckTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        BrainfuckCompiler compiler=new BrainfuckCompiler("-----");
        compiler.run();
        System.out.println(compiler.getCurrentValue());
    }

}
