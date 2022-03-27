package com.twitter.teruteru128.ncv.commentlog;

import java.io.Serializable;
import java.time.Instant;

import com.twitter.teruteru128.ncv.adapters.InstantEpochSecondAdapter;

import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class LiveInfo implements Serializable {
  private String liveTitle;
  private String broadcaster;
  private String defaultCommunity;
  private String communityName;
  private Boolean memberOnly;
  private Boolean productStream;
  private Instant openTime;
  private Instant startTime;
  private Instant endTime;
  private Integer providerType;

  public LiveInfo() {
  }

  public String getLiveTitle() {
    return liveTitle;
  }

  public void setLiveTitle(String liveTitle) {
    this.liveTitle = liveTitle;
  }

  public String getBroadcaster() {
    return broadcaster;
  }

  public void setBroadcaster(String broadcaster) {
    this.broadcaster = broadcaster;
  }

  public String getDefaultCommunity() {
    return defaultCommunity;
  }

  public void setDefaultCommunity(String defaultCommunity) {
    this.defaultCommunity = defaultCommunity;
  }

  public String getCommunityName() {
    return communityName;
  }

  public void setCommunityName(String communityName) {
    this.communityName = communityName;
  }

  public Boolean getMemberOnly() {
    return memberOnly;
  }

  public void setMemberOnly(Boolean memberOnly) {
    this.memberOnly = memberOnly;
  }

  public Boolean getProductStream() {
    return productStream;
  }

  public void setProductStream(Boolean productStream) {
    this.productStream = productStream;
  }

  @XmlJavaTypeAdapter(InstantEpochSecondAdapter.class)
  @XmlValue
  public Instant getOpenTime() {
    return openTime;
  }

  public void setOpenTime(Instant openTime) {
    this.openTime = openTime;
  }

  @XmlJavaTypeAdapter(InstantEpochSecondAdapter.class)
  @XmlValue
  public Instant getStartTime() {
    return startTime;
  }

  public void setStartTime(Instant startTime) {
    this.startTime = startTime;
  }

  @XmlJavaTypeAdapter(InstantEpochSecondAdapter.class)
  @XmlValue
  public Instant getEndTime() {
    return endTime;
  }

  public void setEndTime(Instant endTime) {
    this.endTime = endTime;
  }

  public Integer getProviderType() {
    return providerType;
  }

  public void setProviderType(Integer providerType) {
    this.providerType = providerType;
  }

}
