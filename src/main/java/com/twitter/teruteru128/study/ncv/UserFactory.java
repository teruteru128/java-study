package com.twitter.teruteru128.study.ncv;

class UserFactory {
    private static UserFactory INSTANCE = new UserFactory();

    private UserFactory() {
    }

    public static UserFactory getInstance() {
        return INSTANCE;
    }
}