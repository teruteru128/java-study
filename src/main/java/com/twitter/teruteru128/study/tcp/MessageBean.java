package com.twitter.teruteru128.study.tcp;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.ArrayList;

public class MessageBean implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1850020399742005350L;
    private ArrayList<OffsetDateTime> timestamps = new ArrayList<>();
    private boolean connectionClose = false;

    public MessageBean() {
    }

    public void setTimestamps(ArrayList<OffsetDateTime> timestamps) {
        this.timestamps = timestamps;
    }

    public ArrayList<OffsetDateTime> getTimestamps() {
        return timestamps;
    }

    public boolean isConnectionClose() {
        return connectionClose;
    }

    public void setConnectionClose(boolean connectionClose) {
        this.connectionClose = connectionClose;
    }
}
