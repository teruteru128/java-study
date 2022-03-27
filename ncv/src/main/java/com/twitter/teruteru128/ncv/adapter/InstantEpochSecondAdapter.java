package com.twitter.teruteru128.ncv.adapter;

import java.time.Instant;

public class InstantEpochSecondAdapter extends InstantAdapter {
  @Override
  public Instant unmarshal(Long v) throws Exception {
    return Instant.ofEpochSecond(v);
  }

  @Override
  public Long marshal(Instant v) throws Exception {
    return v.getEpochSecond();
  }
}
