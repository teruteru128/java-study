package com.twitter.teruteru128.ncv.adapters;

import java.time.Instant;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public abstract class InstantAdapter extends XmlAdapter<Long, Instant> {
}
