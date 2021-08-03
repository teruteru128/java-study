package com.twitter.teruteru128.study.fx;

import javafx.application.Application;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        int num = 1;

        if (args.length >= 1) {
            num = Integer.parseInt(args[0], 10);
        }

        var clazz = Class.forName(String.format("com.twitter.teruteru128.study.fx.sample%d.Main", num));

        Application.launch((Class<? extends Application>) clazz, args);
    }

}
