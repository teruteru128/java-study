package com.twitter.teruteru128.ncv.adapter;

import java.time.Instant;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class InstantAdapter extends XmlAdapter<Long, Instant> {

  @Override
  public Instant unmarshal(Long v) throws Exception {
    return Instant.ofEpochSecond(v);
  }

  @Override
  public Long marshal(Instant v) throws Exception {
    return v.getEpochSecond();
  }

}
