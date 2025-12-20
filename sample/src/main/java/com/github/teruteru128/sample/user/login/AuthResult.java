package com.github.teruteru128.sample.user.login;

import java.util.OptionalLong;

public record AuthResult(Status status, OptionalLong userId) {
  public enum Status {
    SUCCESS,
    USER_NOT_FOUND,      // ユーザーが存在しない
    INVALID_PASSWORD,    // パスワードが違う
    PASSKEY_REQUIRED,    // パスワード未設定（パスキー専用ユーザー）
    LOCKED               // アカウントロック中など
  }
}
