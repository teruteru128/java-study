package com.github.teruteru128.util;

import java.util.Locale;

public final class Printer {
    private Printer() {
    }

    public static void println(String x) {
        System.out.println(x);
    }

    public static void println(int x) {
        System.out.println(x);
    }

    public static void println(double x) {
        System.out.println(x);
    }

    public static void println(float x) {
        System.out.println(x);
    }

    public static void println(boolean x) {
        System.out.println(x);
    }

    public static void println() {
        System.out.println();
    }

    public static void println(char x) {
        System.out.println(x);
    }

    public static void println(char[] x) {
        System.out.println(x);
    }

    public static void println(long x) {
        System.out.println(x);
    }

    public static void println(Object x) {
        System.out.println(x);
    }

    public static void printfln(String format, Object... args) {
        System.out.printf(format, args);
        println();
    }

    public static void printfln(Locale l, String format, Object... args) {
        System.out.printf(l, format, args);
        System.out.println();
    }

    public static void printf(String format, Object... args) {
        System.out.printf(format, args);
    }

    public static void printf(Locale l, String format, Object... args) {
        System.out.printf(l, format, args);
    }
}
