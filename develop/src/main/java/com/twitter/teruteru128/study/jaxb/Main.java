package com.twitter.teruteru128.study.jaxb;

import jakarta.xml.bind.JAXB;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        User user = new User();
        JAXB.marshal(user, System.out);
        System.out.println(Class.forName("com.sun.xml.bind.v2.ContextFactory"));
    }

}
