package com.twitter.teruteru128.jaxb;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 0;

    private String id;
    private String name;
    private long time;
    private String community;
    private String bgcolor;
    private boolean readout;

    public User() {
        this("", "", 0, null, null, true);
    }

    /**
     * 
     * @param id
     * @param name
     * @param time
     * @param community
     * @param bgcolor
     * @param readout
     */
    public User(String id, String name, long time, String community, String bgcolor, boolean readout) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.community = community;
        this.bgcolor = bgcolor;
        this.readout = readout;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the time
     */
    public long getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(long time) {
        this.time = time;
    }

    /**
     * @return the community
     */
    public String getCommunity() {
        return community;
    }

    /**
     * @param community the community to set
     */
    public void setCommunity(String community) {
        this.community = community;
    }

    /**
     * @return the bgcolor
     */
    public String getBgcolor() {
        return bgcolor;
    }

    /**
     * @param bgcolor the bgcolor to set
     */
    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }

    /**
     * @return the readout
     */
    public boolean isReadout() {
        return readout;
    }

    /**
     * @param readout the readout to set
     */
    public void setReadout(boolean readout) {
        this.readout = readout;
    }
}
