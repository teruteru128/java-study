package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.__gmp_randinit_default;
import static com.github.teruteru128.gmp.gmp_h.gmp_randseed;
import static com.github.teruteru128.gmp.gmp_h.mpz_add;
import static com.github.teruteru128.gmp.gmp_h.mpz_add_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_import;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_mul_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_nextprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_pow_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_prevprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_sizeinbase;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub;
import static com.github.teruteru128.gmp.gmp_h.mpz_urandomm;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.teruteru128.gmp.__gmp_randstate_struct;
import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URI;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;
import javax.net.ssl.HttpsURLConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;

@Command(name = "project19")
public class Project19 implements Callable<Integer> {

  private static final String ENDPOINT = "https://factordb.com/api?query=";
  @Option(names = {"--count"}, defaultValue = "10")
  private int count;

  @Override
  public Integer call() throws Exception {
    var auto = Arena.ofAuto();
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    var min = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(min, 10);
    mpz_pow_ui(min, min, 18);
    var window = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(window, 10);
    mpz_pow_ui(window, window, 19);
    mpz_prevprime(window, window);
    mpz_sub(window, window, min);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    __gmp_randinit_default(state);
    {
      var seed = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
      mpz_init(seed);
      var elementCount = 2493;
      var seedNativeSegment = auto.allocate(JAVA_BYTE, elementCount);
      MemorySegment.copy(((SecureRandom) Factory.SECURE_RANDOM_GENERATOR).generateSeed(elementCount), 0,
          seedNativeSegment, JAVA_BYTE, 0, elementCount);
      mpz_import(seed, elementCount, 1, 1, 0, 0, seedNativeSegment);
      gmp_randseed(state, seed);
    }
    // ScheduledThreadPoolExecutor
    try (var executor = new ScheduledThreadPoolExecutor(4)) {
      var latch = new CountDownLatch(count);
      var task = new FactorDBPostingTask(state, window, min, ENDPOINT, latch);
      var tasks = new ArrayList<ScheduledFuture<?>>();
      for (int i = 0; i < 4; i++) {
        tasks.add(executor.scheduleAtFixedRate(task, 375 * i, 1500, TimeUnit.MILLISECONDS));
      }
      latch.await();
      for (ScheduledFuture<?> scheduledFuture : tasks) {
        scheduledFuture.cancel(false);
      }
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
    return ExitCode.OK;
  }

  protected record FactorDBPostingTask(MemorySegment state, MemorySegment window, MemorySegment min,
                                       String endpoint, CountDownLatch latch) implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(FactorDBPostingTask.class);
    private static final Proxy LOCALHOST_SOCKS_PROXY = new Proxy(Type.SOCKS,
        new InetSocketAddress("localhost", 9150));
    private static final String FDB_USER_ID = System.getenv("FDBUSER");
    private static final String FDB_USER_COOKIE =
        FDB_USER_ID != null ? "fdbuser=" + FDB_USER_ID : "";
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final Arena auto = Arena.ofAuto();
    private static final ThreadLocal<MemorySegment> THREAD_LOCAL_P = ThreadLocal.withInitial(() -> {
      var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
      mpz_init(p);
      return p;
    });
    // FIXME スレッドローカルで持つバッファのサイズを変えられるようにしたい
    private static final ThreadLocal<MemorySegment> THREAD_LOCAL_BUF = ThreadLocal.withInitial(
        () -> auto.allocate(21));

    @Override
    public void run() {
      var p = THREAD_LOCAL_P.get();
      // stateの同期を他のどこでも取って無さそうなのでここで取る
      synchronized (state) {
        mpz_urandomm(p, state, window);
      }
      mpz_add(p, p, min);
      mpz_nextprime(p, p);
      MemorySegment buf;
      long size = mpz_sizeinbase(p, 10) + 2;
      if (size <= 21) {
        buf = THREAD_LOCAL_BUF.get();
      } else {
        // mpz_sizeinbaseは厳密に桁数を計算してないため、しきい値にある程度以上近づくと22桁判定になる
        buf = auto.allocate(size);
      }
      mpz_get_str(buf, 10, p);
      var prime = buf.getString(0);
      URL url;
      try {
        url = URI.create(endpoint + prime).toURL();
      } catch (MalformedURLException e) {
        throw new RuntimeException("URL Construction Exception when query=" + prime, e);
      }
      HttpsURLConnection connection;
      int responseCode;
      do {
        try {
          connection = (HttpsURLConnection) url.openConnection(LOCALHOST_SOCKS_PROXY);
          if (FDB_USER_ID != null) {
            connection.setRequestProperty("Cookie", FDB_USER_COOKIE);
          }
          connection.connect();
          responseCode = connection.getResponseCode();
          // query limitに到達したときにどのような形式のどのようなデータが返ってくるのか予想がつかない
          // 通常のウェブサイトでは429 Too Many Requestsが帰ってきていた
          JsonNode root;
          try (var in = new BufferedInputStream(connection.getInputStream())) {
            root = OBJECT_MAPPER.readTree(in);
          }
          var id = root.get("id").longValue();
          var status = root.get("status").textValue();
          if (id != 0 || !status.equals("PRP")) {
            System.err.printf("known prime: %d, %s, %s%n", id, status, prime);
          }
        } catch (IOException e) {
          throw new RuntimeException("exception in query=" + prime, e);
        }
        if (responseCode != 200) {
          // 成功するまでやり直し給え
          logger.error("error  : {}, {}", prime, responseCode);
          connection.disconnect();
        } else {
          logger.info("success: {}", prime);
        }
      } while (responseCode != 200);
      latch.countDown();
    }
  }
}
