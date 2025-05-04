package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.gmp_randinit_default;
import static com.github.teruteru128.gmp.gmp_h.mpz_add;
import static com.github.teruteru128.gmp.gmp_h.mpz_add_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_mul;
import static com.github.teruteru128.gmp.gmp_h.mpz_nextprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_pow_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_probab_prime_p;
import static com.github.teruteru128.gmp.gmp_h.mpz_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_sizeinbase;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_urandomm;
import static com.github.teruteru128.study.Factory.OBJECT_MAPPER;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_set_u64;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.teruteru128.gmp.__gmp_randstate_struct;
import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.Callable;
import javax.net.ssl.HttpsURLConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Parameters;

/**
 * 素数をファイルに大量に吐き出す。
 * <p>
 * 最初の素数(long)とそれ以降の素数の間隔のリストの形式のほうがいいんだろうか……
 * </p>
 */
@Command(name = "project19g")
public class Project19G implements Callable<Integer> {

  private static final Logger logger = LoggerFactory.getLogger(Project19G.class);
  @Parameters(defaultValue = "100000")
  long num;

  private static void sendToFDB(MemorySegment n, Arena auto) throws IOException {
    var length = mpz_sizeinbase(n, 10) + 2;
    var str = auto.allocate(length);
    mpz_get_str(str, 10, n);
    var string = str.getString(0);
    var url = URI.create(Factory.ENDPOINT + string).toURL();
    var urlConnection = getHttpsURLConnection(url);
    JsonNode root;
    try (var in = new BufferedInputStream(urlConnection.getInputStream())) {
      root = OBJECT_MAPPER.readTree(in);
    }
    var id = root.get("id");
    var status = root.get("status");
    logger.info("{}<{}>: {}", id.isTextual() ? id.textValue() : id.longValue(), string.length(),
        status.textValue());
  }

  private static HttpsURLConnection getHttpsURLConnection(URL url) throws IOException {
    HttpsURLConnection urlConnection;
    int responseCode;
    do {
      urlConnection = (HttpsURLConnection) url.openConnection();
      urlConnection.setRequestProperty("Cookie", FactorDatabase.FDB_USER_COOKIE);
      responseCode = urlConnection.getResponseCode();
      if (responseCode != 200) {
        System.err.println("error: " + responseCode);
        if (responseCode == FactorDistribution.HTTP_TOO_MANY_REQUESTS) {
          try {
            Thread.sleep(5 * 60 * 1000);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
      }
    } while (responseCode != 200);
    return urlConnection;
  }

  @Override
  public Integer call() throws IOException {
    var auto = Arena.ofAuto();
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    var min = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(min, 10);
    mpz_pow_ui(min, min, 18);
    var window = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    // 10^19未満で最大の素数 9999999999999999961 - min = 8999999999999999961
    mpz_init(window);
    mpz_set_u64(window, 8999999999999999961L);
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(n, 1);
    var nSub1 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(nSub1);
    var nAdd1 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(nAdd1);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    Project19.seedRandomState(state);
    for (long i = 0; i < num; i++) {
      for (int j = 0; j < 5; j++) {
        mpz_urandomm(p, state, window);
        mpz_add(p, p, min);
        mpz_nextprime(p, p);
        mpz_mul(n, n, p);
      }
      sendToFDB(n, auto);
      mpz_sub_ui(nSub1, n, 1);
      mpz_add_ui(nAdd1, n, 1);
      if (mpz_probab_prime_p(nSub1, 25) != 0) {
        sendToFDB(nSub1, auto);
      }
      if (mpz_probab_prime_p(nAdd1, 25) != 0) {
        sendToFDB(nAdd1, auto);
      }
      // clean
      mpz_set_ui(n, 1);
    }
    return ExitCode.OK;
  }
}
