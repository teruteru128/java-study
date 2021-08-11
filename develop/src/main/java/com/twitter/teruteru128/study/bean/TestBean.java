package com.twitter.teruteru128.study.bean;

import java.io.Serializable;

public class TestBean implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 3371877869507568723L;
    /***/
    private long id;
    /***/
    private String name;

    public TestBean() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
