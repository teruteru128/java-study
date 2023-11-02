package com.twitter.teruteru128.study;

import java.io.Serializable;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Arrays;

import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;

public class MyAuthenticator extends Authenticator implements Destroyable, Serializable {

    private String username;
    private char[] password;

    public MyAuthenticator(String username, char[] password) {
        super();
        this.username = username;
        this.password = password.clone();
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        getRequestingHost();
        getRequestingPort();
        getRequestingPrompt();
        getRequestingProtocol();
        getRequestingScheme();
        getRequestingSite();
        getRequestingURL();
        getRequestorType();
        return new PasswordAuthentication(username, password);
    }

    @Override
    public synchronized void destroy() throws DestroyFailedException {
        if (password != null) {
            Arrays.fill(password, '\0');
            password = null;
        } else {
            throw new IllegalStateException("destroyed");
        }
    }

    @Override
    public boolean isDestroyed() {
        return password == null;
    }

}
