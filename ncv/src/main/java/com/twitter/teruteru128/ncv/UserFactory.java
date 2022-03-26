package com.twitter.teruteru128.ncv;

public class UserFactory {
    private static UserFactory INSTANCE = new UserFactory();

    private UserFactory() {
    }

    public static UserFactory getInstance() {
        return INSTANCE;
    }
}