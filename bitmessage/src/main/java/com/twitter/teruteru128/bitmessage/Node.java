package com.twitter.teruteru128.bitmessage;

import java.net.InetSocketAddress;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * bitmessage node
 */
public class Node {

    private InetSocketAddress peer;
    private Info info;
    private int stream;

    public Node() {
    }

    public InetSocketAddress getPeer() {
        return peer;
    }

    public void setPeer(InetSocketAddress peer) {
        this.peer = peer;
    }

    public Info getInfo() {
        return info;
    }

    @JsonProperty("peer")
    private void unpackPeer(Map<String, Object> peer) {
        if (peer.get("host") instanceof String host && peer.get("port") instanceof Integer port) {
            this.peer = InetSocketAddress.createUnresolved(host, port);
        }
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public int getStream() {
        return stream;
    }

    public void setStream(int stream) {
        this.stream = stream;
    }

    @Override
    public String toString() {
        return "Node [peer=" + peer + ", info=" + info + ", stream=" + stream + "]";
    }


}
