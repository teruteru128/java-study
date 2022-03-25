package com.twitter.teruteru128.study.ncv;

import java.util.ArrayList;
import java.util.concurrent.Callable;

import com.twitter.teruteru128.ncv.User;
import com.twitter.teruteru128.ncv.UserSetting;

import jakarta.xml.bind.JAXB;

class UserSettingSaveSample implements Callable<Void> {
    @Override
    public Void call() throws Exception {
        var setting = new UserSetting();
        var users = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            users.add(new User());
        }
        setting.setUser(users);
        JAXB.marshal(setting, System.out);
        return null;
    }
}
