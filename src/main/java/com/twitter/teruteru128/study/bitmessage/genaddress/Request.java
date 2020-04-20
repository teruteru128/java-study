package com.twitter.teruteru128.study.bitmessage.genaddress;

// Number of Leading Zero
public class Request {

    private int requireNlz;
    private int taskID;

    public Request(int nlzbytes, int taskID) {
        this.requireNlz = nlzbytes;
        this.taskID = taskID;
    }

    /**
     * @return the requireNlz
     */
    public int getRequireNlz() {
        return requireNlz;
    }

    /**
     * @return the taskID
     */
    public int getTaskID() {
        return taskID;
    }

}
