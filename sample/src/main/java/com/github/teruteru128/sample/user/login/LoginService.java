package com.github.teruteru128.sample.user.login;

import com.github.teruteru128.sample.user.PasswordCredentialsDao;
import com.github.teruteru128.sample.user.PasswordHasher;
import com.github.teruteru128.sample.user.UserDao;
import com.github.teruteru128.sample.user.login.AuthResult.Status;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.SQLException;
import java.util.HexFormat;
import java.util.OptionalLong;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.bouncycastle.crypto.generators.Argon2BytesGenerator;
import org.bouncycastle.crypto.params.Argon2Parameters;
import org.bouncycastle.crypto.params.Argon2Parameters.Builder;

public class LoginService {

  private static final Logger logger = Logger.getLogger(LoginService.class.getName());

  private final UserDao userDao;
  private final PasswordCredentialsDao credentialsDao;
  private final DataSource dataSource;
  private final PasswordHasher passwordHasher = new PasswordHasher();

  public LoginService(UserDao userDao, PasswordCredentialsDao credentialsDao,
      DataSource dataSource) {
    this.userDao = userDao;
    this.credentialsDao = credentialsDao;
    this.dataSource = dataSource;
  }

  public AuthResult authenticate(String email, String password) throws SQLException {
    try (var connection = dataSource.getConnection()) {
      // 1. メールアドレスからユーザー情報を取得（UserDaoが必要になるかもしれません）
      var user = userDao.findByEmail(connection, email);
      if (user.isEmpty()) {
        return new AuthResult(Status.USER_NOT_FOUND, OptionalLong.empty());
      }
      // 2. ユーザーIDを元に PasswordCredentials (hash, salt) を取得
      var userPasswordCredential = credentialsDao.findByUserId(connection, user.get().getUser_id());
      if (userPasswordCredential.isEmpty()) {
        return new  AuthResult(Status.PASSKEY_REQUIRED, OptionalLong.empty());
      }
      // 3. Argon2でハッシュを計算し、DBの値と照合
      var userPasswordCredential1 = userPasswordCredential.get();
      String storedHashString = userPasswordCredential1.getHash();
      String saltString = userPasswordCredential1.getSalt();
      var format = HexFormat.of();
      var storedHash = format.parseHex(storedHashString);
      var salt = format.parseHex(saltString);

      // 4. 一致すればユーザーIDを返し、失敗すれば INVALID_PASSWORD を返す
      if (passwordHasher.verify(password, storedHash, salt)) {
        return new AuthResult(Status.SUCCESS, OptionalLong.of(userPasswordCredential1.getUser_id()));
      } else {
        return new AuthResult(Status.INVALID_PASSWORD, OptionalLong.empty());
      }
    }
  }
}
