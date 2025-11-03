package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.gmp_randinit_default;
import static com.github.teruteru128.gmp.gmp_h.mpz_add;
import static com.github.teruteru128.gmp.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_nextprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_pow_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_urandomm;
import static com.github.teruteru128.study.FactorDatabase.FDB_USER_COOKIE;
import static com.github.teruteru128.study.Factory.seedRandomState;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_set_u64;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.teruteru128.gmp.__gmp_randstate_struct;
import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import javax.net.ssl.HttpsURLConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;

public class FactorDBSpamming {

  public static final String ENDPOINT = "https://factordb.com/api?query=";
  public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
  private static final Logger logger = LoggerFactory.getLogger(FactorDBSpamming.class);

  /**
   * factordb.comへの18桁素数絨毯爆撃
   * @return a
   * @throws IOException a
   * @throws InterruptedException a
   */
  @Command
  private int bom() throws IOException, InterruptedException {
    var auto = Arena.ofAuto();
    var min = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(min, 10);
    mpz_pow_ui(min, min, 18);
    var window = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(window);
    mpz_set_u64(window, 8999999999999999961L);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    seedRandomState(state);
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(n);
    var stringBuilder = new StringBuilder(20 * 21621);
    var str = auto.allocate(21);
    for (int i = 0; i < 1000; i++) {
      mpz_urandomm(n, state, window);
      mpz_add(n, n, min);
      mpz_nextprime(n, n);
      mpz_get_str(str, 10, n);
      if (i != 0) {
        stringBuilder.append('*');
      }
      stringBuilder.append(str.getString(0));
    }
    var url = URI.create(
        ENDPOINT + URLEncoder.encode(stringBuilder.toString(), StandardCharsets.UTF_8)).toURL();
    var urlConnection = (HttpsURLConnection) url.openConnection();
    int code;
    do {
      urlConnection = (HttpsURLConnection) url.openConnection();
      urlConnection.setRequestProperty("Cookie", FDB_USER_COOKIE);
      code = urlConnection.getResponseCode();
      if (code == HttpStatusCode.HTTP_TOO_MANY_REQUESTS) {
        System.err.println("TOO MANY REQUEST");
        Thread.sleep(1000 * 60 * 5);
      } else if (code != 200) {
        System.err.println("code " + code);
      }
    } while (code != 200);
    JsonNode root;
    try (var inputStream = urlConnection.getInputStream()) {
      root = OBJECT_MAPPER.readTree(inputStream);
    }
    var id = root.get("id");
    var status = root.get("status");
    logger.info("{}: {}", id.isTextual() ? id.textValue() : id.longValue(), status.textValue());

    return ExitCode.OK;
  }

  @Command
  private int send(@Option(names = {"--cof"}, defaultValue = "50001") int i1,
      @Option(names = {"--max"}, defaultValue = "100000") int i2)
      throws IOException, InterruptedException {
    for (int i = i1; i < i2; i++) {
      var str = ENDPOINT + URLEncoder.encode("21181*2^" + i + "+1", StandardCharsets.UTF_8);
      var url = URI.create(str).toURL();
      HttpsURLConnection urlConnection;
      int code;
      do {
        urlConnection = (HttpsURLConnection) url.openConnection();
        urlConnection.setRequestProperty("Cookie", FDB_USER_COOKIE);
        code = urlConnection.getResponseCode();
        if (code == HttpStatusCode.HTTP_TOO_MANY_REQUESTS) {
          Thread.sleep(1000 * 60 * 5);
        }
      } while (code != 200);
      JsonNode root;
      try (var inputStream = urlConnection.getInputStream()) {
        root = OBJECT_MAPPER.readTree(inputStream);
      }
      var id = root.get("id");
      var status = root.get("status");
      logger.info("{}: {}, {}", id.isTextual() ? id.textValue() : id.longValue(), i,
          status.textValue());
    }
    return ExitCode.OK;
  }

}
