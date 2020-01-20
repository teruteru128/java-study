package com.twitter.teruteru128.study.ncv;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 0;
    
    private String id = "";
    private String name = "";
    private String community = null;
    private String bgcolor = null;
    private String time = "";
    private String is_readout = null;

    public User(){

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
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return the is_readout
	 */
	public String getIs_readout() {
		return is_readout;
	}
	/**
	 * @param is_readout the is_readout to set
	 */
	public void setIs_readout(String is_readout) {
		this.is_readout = is_readout;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
