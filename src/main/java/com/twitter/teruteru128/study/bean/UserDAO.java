package com.twitter.teruteru128.study.bean;

public interface UserDAO {
    UserBean login(String userid, String password);
}
