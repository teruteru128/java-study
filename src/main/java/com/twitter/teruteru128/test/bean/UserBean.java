package com.twitter.teruteru128.test.bean;

import java.io.Serializable;

/**
 * 
 * create table user (user_id long not null,user_name varchar(32) not null
 * unique,display_name nvarchar(64) not null default '',email varchar(128) not
 * null unique,iteratins int not not null default 65535,salt char(128) not null,
 * hash char(512) ,primary key(id))
 * */
public class UserBean implements Serializable {
    /**
     * */
    private static final long serialVersionUID = 0;
    /**
     * long(bigint(19)) primary key(not null, unique)
     * */
    private long user_id;
    /**
     * varchar(32) unique
     * */
    private String user_name;
    /**
     * 
     * */
    private String display_name;
    private String email;
    /**
     * ログイン済みフラグtrueでログイン済み
     * */
    private boolean logged;
    /**
     * ハッシュ計算繰り返し回数
     * */
    private int iteratins;
    /**
     * ソルト 16進数文字列
     * */
    private String salt;
    /**
     * パスワードハッシュ 16進数文字列
     * */
    private String hash;

    public UserBean() {
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public int getIteratins() {
        return iteratins;
    }

    public void setIteratins(int iteratins) {
        this.iteratins = iteratins;
    }

    public boolean isLogged() {
        return logged;
    }

    void setLogged(boolean logged) {
        this.logged = logged;
    }
}
