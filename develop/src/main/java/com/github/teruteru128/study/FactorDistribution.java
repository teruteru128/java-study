package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;

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
  private long num = 1000;
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
    ArrayList<Path> paths;
    try (var lines = Files.lines(in, StandardCharsets.UTF_8)) {
      paths = lines.filter(l -> !l.startsWith("#")).map(Path::of)
          .collect(Collectors.toCollection(ArrayList<Path>::new));
    }
    for (Path path : paths) {
      try (var file = new RandomAccessFile(path.toFile(), "r")) {
        var numOfElements = file.length() / 8;
        for (long i = 0; i < numOfElements; i++) {
          var i1 = file.readLong();
          if (Long.compareUnsigned(i1, skip) <= 0) {
            continue;
          }
          var unsignedString = Long.toUnsignedString(i1);
          var url = URI.create(Factory.ENDPOINT + unsignedString).toURL();
          HttpsURLConnection urlConnection;
          int responseCode;
          do {
            urlConnection = (HttpsURLConnection) url.openConnection();
            urlConnection.setRequestProperty("Cookie", "fdbuser=410c610cccf69f308fd32aba309579a3");
            responseCode = urlConnection.getResponseCode();
            if (responseCode == 429) {
              Thread.sleep(1000 * 60 * 5);
            }
          } while (responseCode != 200);
          JsonNode root;
          try (var in = urlConnection.getInputStream()) {
            root = Factory.OBJECT_MAPPER.readTree(in);
          }
          var id = root.get("id");
          var status = root.get("status");
          var o = id.isTextual() ? id.textValue() : Long.toString(id.longValue());
          System.out.printf("%s<%d>: %s%n", o, unsignedString.length(), status.textValue());
        }
      }
    }
    return ExitCode.OK;
  }
}
