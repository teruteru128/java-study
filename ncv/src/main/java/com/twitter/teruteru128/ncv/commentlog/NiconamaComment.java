package com.twitter.teruteru128.ncv.commentlog;

import java.io.Serializable;
import java.time.Duration;
import java.util.List;

import com.twitter.teruteru128.ncv.adapter.DurationAdapter;

import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class NiconamaComment implements Serializable {
  private static final long serialVersionUID = 0;

  private Boolean showedAllRoomComments;
  private Long liveNum;
  private Duration elapsedTime;
  private LiveInfo liveInfo;
  private PlayerStatus playerStatus;
  private String rooms;
  private List<Chat> liveCommentDataArray;

  public NiconamaComment() {
  }

  public Boolean isShowedAllRoomComments() {
    return showedAllRoomComments;
  }

  public Long getLiveNum() {
    return liveNum;
  }

  @XmlJavaTypeAdapter(DurationAdapter.class)
  public Duration getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(Duration elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public LiveInfo getLiveInfo() {
    return liveInfo;
  }

  public PlayerStatus getPlayerStatus() {
    return playerStatus;
  }

  public String getRooms() {
    return rooms;
  }

  public List<Chat> getLiveCommentDataArray() {
    return liveCommentDataArray;
  }
}
