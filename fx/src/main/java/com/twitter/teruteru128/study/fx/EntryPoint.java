package com.twitter.teruteru128.study.fx;

import javafx.application.Application;

public class EntryPoint {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws ClassNotFoundException {

        if (args.length < 1) {
            System.out.println("project id?");
            return;
        }

        int num = Integer.valueOf(args[0], 10);

        if (args.length >= 1) {
            num = Integer.parseInt(args[0], 10);
        }

        var clazz = Class.forName(String.format("com.twitter.teruteru128.study.fx.sample%d.App%d", num, num));

        Application.launch((Class<? extends Application>) clazz, args);
    }

}
