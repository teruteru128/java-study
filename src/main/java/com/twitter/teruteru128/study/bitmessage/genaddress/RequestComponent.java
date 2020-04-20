package com.twitter.teruteru128.study.bitmessage.genaddress;

// Number of Leading Zero
public class RequestComponent {

    private int requireNlz;
    private int taskID;

    public RequestComponent(int nlzbytes, int taskID) {
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
