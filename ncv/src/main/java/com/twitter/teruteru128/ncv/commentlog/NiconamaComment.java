package com.twitter.teruteru128.ncv.commentlog;

import java.io.Serializable;
import java.util.List;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NiconamaComment", namespace = "http://posite-c.jp/niconamacommentviewer/usersetting/")
public class NiconamaComment implements Serializable {
  private static final long serialVersionUID = 0;

  private Boolean showedAllRoomComments;
  private Long liveNum;
  private String elapsedTime;
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

  public String getElapsedTime() {
    return elapsedTime;
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
