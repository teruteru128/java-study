package com.github.teruteru128.foreign.prime.search;

import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_str;
import static java.util.concurrent.ForkJoinPool.defaultForkJoinWorkerThreadFactory;

import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlite.SQLiteDataSource;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "search", description = {"うんち！"})
public class PrimeSearch implements Callable<Integer> {

  public static final Pattern UUID_PATTERN = Pattern.compile(
      "\\p{XDigit}{8}-\\p{XDigit}{4}-\\p{XDigit}{4}-\\p{XDigit}{4}-\\p{XDigit}{12}");
  private static final Logger logger = LoggerFactory.getLogger(PrimeSearch.class);
  private static final Arena auto = Arena.ofAuto();
  private static final String dbURL;

  static {
    dbURL = Objects.requireNonNull(System.getenv("DB_URL"), "$DB_URL NOT FOUND");
    if (dbURL.isEmpty()) {
      throw new ExceptionInInitializerError("$DB_URL IS EMPTY");
    }
  }

  @Option(names = {"--threads", "-t"})
  private int threads = Math.max(1, Runtime.getRuntime().availableProcessors() - 1);

  @Parameters(description = "even number (text) file")
  private Path evenNumberPath;

  @Override
  public Integer call()
      throws IOException, ClassNotFoundException, InterruptedException, ExecutionException, SQLException {
    logger.info("initialize...");
    var matcher = UUID_PATTERN.matcher(evenNumberPath.getFileName().toString());
    if (!matcher.find()) {
      logger.error("ファイル名にUUIDが含まれていません");
      return ExitCode.SOFTWARE;
    }
    var uuid = UUID.fromString(matcher.group());
    var id = uuid.getMostSignificantBits();
    var even = auto.allocate(__mpz_struct.layout()).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(even, auto.allocateFrom(Files.readAllLines(evenNumberPath).getFirst()), 10);
    var source = new SQLiteDataSource();
    source.setUrl(dbURL);
    var list2 = new ArrayList<Integer>();
    try (var connection = source.getConnection(); var statement = connection.prepareStatement(
        "SELECT step from candidates where composite == 0 and probably_prime == 0 and definitely_prime == 0 and id = ?;")) {
      statement.setLong(1, id);
      try (var set = statement.executeQuery()) {
        while (set.next()) {
          list2.add(set.getInt("step"));
        }
      }
    }
    logger.info("start");
    logger.debug("Number of prime number candidates: {}", list2.size());
    var found = false;
    logger.debug("threads: {}", threads);
    var list = list2.stream().mapToInt(Integer::intValue)
        .mapToObj(step -> new PrimeSearchTask2(even, step, source, id))
        .collect(Collectors.toCollection(() -> new ArrayList<>(list2.size())));
    try (final var pool = new ForkJoinPool(threads, defaultForkJoinWorkerThreadFactory, null,
        true)) {
      final var service = new ExecutorCompletionService<Result>(pool);
      final var n = list.size();
      var futures = new ArrayList<Future<Result>>(n);
      try {
        list.forEach(sex -> futures.add(service.submit(sex)));
        for (int j = n; j > 0; j--) {
          try {
            var foundStep = service.take().get();
            var result = foundStep.result();
            if (result == 1 || result == 2) {
              found = true;
              logger.info("find prime: step {}", foundStep.step());
              System.err.println('\007');
              break;
            }
          } catch (ExecutionException ignored) {
          }
        }
      } finally {
        futures.stream().filter(((Predicate<Future<Result>>) Future::isDone).negate())
            .forEach(f -> f.cancel(true));
      }
    }
    if (found) {
      logger.info("find prime");
      return ExitCode.OK;
    } else {
      logger.error("prime not found");
      return ExitCode.SOFTWARE;
    }
  }

  public record LargeSieve(int searchLength, BitSet sieve) {

  }

}
