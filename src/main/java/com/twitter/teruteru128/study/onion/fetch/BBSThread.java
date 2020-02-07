package com.twitter.teruteru128.study.onion.fetch;

import java.io.Serializable;
import java.util.regex.Pattern;

public class BBSThread implements Comparable<BBSThread>, Serializable {
    private static final long serialVersionUID = 0;
    public static final Pattern pattern = Pattern.compile("^((\\d+).dat)<>(.*) \\((\\d+)\\)$");
    private long datid;
    private String datname;
    private String title;
    private int res;

    public BBSThread(long datid, String datname, String title, int res) {
        this.datid = datid;
        this.datname = datname;
        this.title = title;
        this.res = res;
    }

    @Override
    public int compareTo(BBSThread o) {
        return Long.compare(this.datid, o.datid);
    }

    public long getDatid() {
        return datid;
    }
    public String getDatname() {
        return datname;
    }
    public String getTitle() {
        return title;
    }
    public int getRes() {
        return res;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("BBSThread [datid=").append(datid).append(", datname=").append(datname).append(", title=")
                .append(title).append(", res=").append(res).append("]");
        return builder.toString();
    }
    
}