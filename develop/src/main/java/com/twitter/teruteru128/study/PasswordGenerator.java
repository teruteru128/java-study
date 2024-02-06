package com.twitter.teruteru128.study;

@FunctionalInterface
public interface PasswordGenerator {

    public char[] generatePassword(int length);
}
