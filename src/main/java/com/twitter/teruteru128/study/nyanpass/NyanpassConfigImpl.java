package com.twitter.teruteru128.study.nyanpass;

import java.net.URI;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class NyanpassConfigImpl implements Cloneable, NyanpassConfig {
    protected NyanpassConfigImpl() {
    }

    private static final URI DEFAULT_ENDPOINT_URI = URI.create("http://nyanpass.com/api/get_count");
    private static final DateTimeFormatter DEFAULT_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss",
            Locale.JAPAN);
    private URI endpointURI = DEFAULT_ENDPOINT_URI;
    private DateTimeFormatter formatter = DEFAULT_FORMATTER;
    private BlockingQueue<NyanpassBean> queue = new LinkedBlockingQueue<>();

    public URI getEndpointURI() {
        return endpointURI;
    }

    public void setEndpointURI(URI endpointURI) {
        this.endpointURI = endpointURI;
    }

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public void setQueue(BlockingQueue<NyanpassBean> queue) {
        this.queue = queue;
    }

    public BlockingQueue<NyanpassBean> getQueue() {
        return queue;
    }

    @Override
    public NyanpassConfigImpl clone() {
        NyanpassConfigImpl base = null;
        try {
            base = (NyanpassConfigImpl) super.clone();
        } catch (CloneNotSupportedException e) {
        }
        return base;
    }
}