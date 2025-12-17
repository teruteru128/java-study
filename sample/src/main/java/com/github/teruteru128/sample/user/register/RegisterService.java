package com.github.teruteru128.sample.user.register;

import com.github.teruteru128.sample.user.PasskeyCredentialsDao;
import com.github.teruteru128.sample.user.PasswordCredentialsDao;
import com.github.teruteru128.sample.user.PasswordHasher;
import com.github.teruteru128.sample.user.UserDao;
import com.github.teruteru128.sample.user.UserRegisterParameter;
import jakarta.servlet.ServletException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.HexFormat;
import java.util.logging.Logger;
import java.util.random.RandomGenerator;
import javax.sql.DataSource;
import org.bouncycastle.crypto.generators.Argon2BytesGenerator;
import org.bouncycastle.crypto.params.Argon2Parameters;

public class RegisterService {

  private static Logger logger = Logger.getLogger(RegisterService.class.getName());

  private final RandomGenerator generator = RandomGenerator.of("SecureRandom");
  private final UserDao userDao;
  private final PasswordCredentialsDao passwordCredentialsDao;
  private final PasskeyCredentialsDao passkeyCredentialsDao;
  private final DataSource dataSource;
  private final PasswordHasher passwordHasher = new PasswordHasher();

  public RegisterService(UserDao userDao, PasswordCredentialsDao passwordCredentialsDao, PasskeyCredentialsDao passkeyCredentialsDao,
      DataSource dataSource) {
    this.userDao = userDao;
    this.passwordCredentialsDao = passwordCredentialsDao;
    this.passkeyCredentialsDao = passkeyCredentialsDao;
    this.dataSource = dataSource;
  }

  public void register(UserRegisterParameter parameter) throws UserAlreadyExistsException, PasswordTooShortException, PasswordConfirmationFailException {
    var password = parameter.getPassword();
    if (password == null || password.length() < 8) {
      throw new PasswordTooShortException("");
    }
    if(!password.equals(parameter.getPasswordConfirmation())) {
      throw new PasswordConfirmationFailException("");
    }
    var email = parameter.getEmail();
    // 使用可能なメールアドレスかどうかは判定できないので空欄でないなら通すしか無い
    if(email == null || email.isEmpty()) {
      throw new IllegalArgumentException("");
    }
    // UserAlreadyExists はどうやって判別するんでっしゃろ
    var salt = new byte[16];
    generator.nextBytes(salt);
    var hash = new byte[64];
    passwordHasher.hash(hash, password, salt);
    try (var connection = dataSource.getConnection()) {
      connection.setAutoCommit(false);
      long user_id;
      try {
        user_id = userDao.insert(connection, email);
        var format = HexFormat.of();
        passwordCredentialsDao.insert(connection, user_id, format.formatHex(hash), format.formatHex(salt));
        connection.commit();
      } catch (SQLException e) { // 例外発生時はロールバックする
        try {
          connection.rollback();
        } catch (SQLException rollbackEx) {
          // ロールバック失敗時のログ出力など
          logger.severe("Rollback failed: " + rollbackEx.getMessage());
        }
        throw new RegisterFailException("inner", e);
      }
    } catch (SQLException e) {
      throw new RegisterFailException("outer", e);
    }
  }
}
