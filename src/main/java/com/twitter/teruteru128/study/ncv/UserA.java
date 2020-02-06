package com.twitter.teruteru128.study.ncv;

import java.io.Serializable;
import java.util.Optional;

public class UserA implements Comparable<UserA>, Serializable {
    private static final long serialVersionUID = 0;
    private String id;
    private String name;
    private long time;
    private String community;
    private String bgcolor;
    private boolean readout;

    public UserA() {
        this("", "", 0, null, null, true);
    }

    public UserA(String id, String name, long time, String community, String bgcolor, boolean readout) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.community = community;
        this.bgcolor = bgcolor;
        this.readout = readout;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getBgcolor() {
        return bgcolor;
    }

    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }

    public boolean isReadout() {
        return readout;
    }

    public void setReadout(boolean readout) {
        this.readout = readout;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bgcolor == null) ? 0 : bgcolor.hashCode());
        result = prime * result + ((community == null) ? 0 : community.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + (readout ? 1231 : 1237);
        result = prime * result + (int) (time ^ (time >>> 32));
        return result;
    }

    /**
     * {@code a.compareTo(b) > 0}
     */
    @Override
    public int compareTo(UserA o) {
        String thisStr = this.getId();
        String otherStr = o.getId();
        Optional<Long> thisValue = parseLong(thisStr);
        Optional<Long> otherValue = parseLong(o.getId());
        boolean thisIsNum = thisValue.isPresent();
        boolean otherIsNum = otherValue.isPresent();
        if (thisStr.equals(otherStr)) {
            return Long.compare(this.getTime(), o.getTime());
        } else if (thisIsNum && otherIsNum) {
            return thisValue.get().compareTo(otherValue.get());
        } else if (thisIsNum) {
            return -1;
        } else if (otherIsNum) {
            return 1;
        } else {
            return thisStr.compareTo(otherStr);
        }
    }

    private static Optional<Long> parseLong(String a) {
        try {
            return Optional.of(Long.valueOf(a, 10));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserA other = (UserA) obj;
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
        if (readout != other.readout)
            return false;
        if (time != other.time)
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("<user");
        if (!community.isEmpty()) {
            builder.append(" community=\"");
            builder.append(community);
            builder.append("\"");
        }
        if (!bgcolor.isEmpty()) {
            builder.append(" bgcolor=\"");
            builder.append(bgcolor);
            builder.append("\"");
        }
        builder.append(" name=\"");
        builder.append(name);
        builder.append("\"");
        builder.append(" time=\"");
        builder.append(time);
        builder.append("\"");
        if (!readout) {
            builder.append(" readout=\"");
            builder.append(readout);
            builder.append("\"");
        }
        builder.append(">");
        builder.append(id);
        builder.append("</user>");
        return builder.toString();
    }

}