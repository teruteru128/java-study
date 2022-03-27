package com.twitter.teruteru128.ncv.usersetting;

import java.io.Serializable;
import java.time.Instant;

import com.twitter.teruteru128.ncv.adapter.InstantEpochSecondAdapter;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "user")
public class User implements Cloneable, Serializable {

    private static final long serialVersionUID = 0;

    /**
     * ユーザーID
     */
    private String id;

    /**
     * ユーザー名 たまにnullのやつがいる
     */
    private String name;

    /**
     * 登録時刻
     */
    private Instant time;

    /**
     * 依存コミュニティ たいていnull
     */
    private String community;

    /**
     * 背景色 たいていnull
     */
    private Integer bgcolor;

    /**
     * 読み飛ばし たいていnull
     */
    private Boolean readout;

    public User() {
        this("", "", Instant.EPOCH, null, null, null);
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
    public User(String id, String name, Instant time, String community, Integer bgcolor, Boolean readout) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.community = community;
        this.bgcolor = bgcolor;
        this.readout = readout;
    }

    /**
     * 
     * @return the id
     */
    @XmlValue
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return the name
     */
    @XmlAttribute(required = true)
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return the time
     */
    @XmlJavaTypeAdapter(InstantEpochSecondAdapter.class)
    @XmlAttribute(required = true)
    public Instant getTime() {
        return time;
    }

    /**
     * 
     * @param time the time to set
     */
    public void setTime(Instant time) {
        this.time = time;
    }

    /**
     * 
     * @return the community
     */
    @XmlAttribute
    public String getCommunity() {
        return community;
    }

    /**
     * 
     * @param community the community to set
     */
    public void setCommunity(String community) {
        this.community = community;
    }

    /**
     * 
     * @return the bgcolor
     */
    @XmlAttribute
    public Integer getBgcolor() {
        return bgcolor;
    }

    /**
     * 
     * @param bgcolor the bgcolor to set
     */
    public void setBgcolor(Integer bgcolor) {
        this.bgcolor = bgcolor;
    }

    /**
     * 
     * @return the readout
     */
    @XmlAttribute(name = "is_readout")
    public Boolean isReadout() {
        return readout;
    }

    /**
     * 
     * @param readout the readout to set
     */
    public void setReadout(Boolean readout) {
        this.readout = readout;
    }

    /**
     * 
     */
    @Override
    public String toString() {
        return new StringBuilder("User [bgcolor=").append(bgcolor).append(", community=").append(community)
                .append(", id=").append(id).append(", name=").append(name).append(", readout=").append(readout)
                .append(", time=").append(time).append("]").toString();
    }

    /**
     * 
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bgcolor == null) ? 0 : bgcolor.hashCode());
        result = prime * result + ((community == null) ? 0 : community.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((readout == null) ? 0 : readout.hashCode());
        result = prime * result + ((time == null) ? 0 : time.hashCode());
        return result;
    }

    /**
     * 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (bgcolor == null) {
            if (other.bgcolor != null)
                return false;
        } else if (!bgcolor.equals(other.bgcolor))
            return false;
        if (community == null) {
            if (other.community != null)
                return false;
        } else if (!community.equals(other.community))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (readout == null) {
            if (other.readout != null)
                return false;
        } else if (!readout.equals(other.readout))
            return false;
        if (time == null) {
            if (other.time != null)
                return false;
        } else if (!time.equals(other.time))
            return false;
        return true;
    }

    @Override
    public User clone() {
        User user = null;
        try {
            user = (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return user;
    }
}
