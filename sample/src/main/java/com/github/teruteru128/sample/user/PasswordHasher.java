package com.github.teruteru128.sample.user;

import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.generators.Argon2BytesGenerator;
import org.bouncycastle.crypto.params.Argon2Parameters;

public class PasswordHasher {
  Argon2Parameters.Builder builder = new Argon2Parameters.Builder(Argon2Parameters.ARGON2_id).withIterations(1)
        .withMemoryAsKB(2097152).withParallelism(1);
  public PasswordHasher() {}

  public void hash(byte[] hash, String password, byte[] salt) {
    var generator = new Argon2BytesGenerator();
    generator.init(builder.withSalt(salt).build());
    generator.generateBytes(password.getBytes(StandardCharsets.UTF_8), hash);
  }
}
