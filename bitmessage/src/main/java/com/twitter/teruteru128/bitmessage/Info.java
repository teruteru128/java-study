package com.twitter.teruteru128.bitmessage;

import org.openapitools.jackson.nullable.JsonNullable;

public class Info {

    private float rating;
    private JsonNullable<Boolean> self = JsonNullable.undefined();
    private long lastseen;

    public Info() {
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public JsonNullable<Boolean> isSelf() {
        return self;
    }

    public void setSelf(JsonNullable<Boolean> self) {
        this.self = self;
    }

    public long getLastseen() {
        return lastseen;
    }

    public void setLastseen(long lastseen) {
        this.lastseen = lastseen;
    }

    @Override
    public String toString() {
        return "Info [rating=" + rating + ", self=" + self + ", lastseen=" + lastseen + "]";
    }


}
