package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_mul;
import static com.github.teruteru128.gmp.gmp_h.mpz_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_sizeinbase;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_set_u64;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import com.github.teruteru128.study.converters.UnsignedLongConverter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.ValueLayout.OfLong;
import java.net.URI;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;
import javax.net.ssl.HttpsURLConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "factor")
public class FactorDistribution implements Callable<Integer> {

  public static final OfLong JAVA_LONG_WITH_BIG_ENDIAN = ValueLayout.JAVA_LONG.withOrder(
      ByteOrder.BIG_ENDIAN);
  private static final Logger logger = LoggerFactory.getLogger(FactorDistribution.class);
  private static final Arena auto = Arena.ofAuto();
  private static final ThreadLocal<MemorySegment> N_THREAD_LOCAL = ThreadLocal.withInitial(() -> {
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(p, 1);
    return p;
  });
  private static final ThreadLocal<MemorySegment> PRIME_THREAD_LOCAL = ThreadLocal.withInitial(
      () -> {
        var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
        mpz_init_set_ui(p, 1);
        return p;
      });
  private final Object lock = new Object();
  @Option(names = {"--num", "-n"})
  private long num = 300000;
  @Option(names = {"--offset"})
  private long offset;
  @Option(names = {"--skip"}, converter = UnsignedLongConverter.class)
  private long skip;
  @Parameters
  private Path in;
  @Option(names = {"--period", "-p"})
  private int period = 800;

  public FactorDistribution() {
  }

  @Override
  public Integer call() throws IOException, InterruptedException {
    var random = RandomGenerator.of("L64X128MixRandom");
    ArrayList<Path> paths;
    try (var lines = Files.lines(in, StandardCharsets.UTF_8)) {
      paths = lines.map(String::trim).filter(l -> !l.startsWith("#")).map(Path::of)
          .collect(Collectors.toCollection(ArrayList<Path>::new));
    }
    var auto = Arena.ofAuto();
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(n);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    for (long i = 0, max = num; i < max; i++) {
      mpz_set_ui(n, 1);
      for (int j = 0; j < 5; j++) {
        var index = random.nextLong(1L << 33);
        var file = (index >> 31) & 0x03;
        var number = index & 0x7fffffffL;
        try (var f = new RandomAccessFile(paths.get((int) file).toFile(), "r")) {
          f.seek(number * 8);
          mpz_set_u64(p, f.readLong());
        }
        mpz_mul(n, n, p);
      }
      var length = mpz_sizeinbase(n, 10) + 2;
      var str = auto.allocate(length);
      mpz_get_str(str, 10, n);
      var unsignedString = str.getString(0);
      var url = URI.create(Factory.ENDPOINT + unsignedString).toURL();
      HttpsURLConnection urlConnection;
      int responseCode;
      do {
        urlConnection = (HttpsURLConnection) url.openConnection();
        urlConnection.setRequestProperty("Cookie", "fdbuser=410c610cccf69f308fd32aba309579a3");
        responseCode = urlConnection.getResponseCode();
        if (responseCode != 200) {
          urlConnection.disconnect();
          if (responseCode == 429) {
            Thread.sleep(1000 * 60 * 5);
          }
        }
      } while (responseCode != 200);
      JsonNode root;
      try (var in = urlConnection.getInputStream()) {
        root = Factory.OBJECT_MAPPER.readTree(in);
      }
      urlConnection.disconnect();
      var id = root.get("id");
      var status = root.get("status");
      var o = id.isTextual() ? id.textValue() : Long.toString(id.longValue());
      logger.info("{}<{}>: {}", o, unsignedString.length(), status.textValue());
    }
    return ExitCode.OK;
  }
}
