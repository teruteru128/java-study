package com.github.teruteru128.primesearch.gmp;

import java.io.IOException;
import java.lang.foreign.MemorySegment;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * PFGW(gwnum)による底3のFermatテストへの入口。外部プロセスとして{@code pfgw64}を起動する。
 * <p>
 * 2,097,152bitの判定で、1プロセスならFLINT fft_small({@link Mr2fs})の約2.5倍速い(gwnumの
 * AVX-512 FFT、長さ2×120KとMontgomery剰余。1ステップ2.05ms対5.12ms、2026-10-25)。PFGWはGerbiczの誤り検出付きで計算し、丸め誤差を検出したらFFT長を
 * 上げてやり直すので、浮動小数点FFTでも「合成数」の判定は信用できる。
 * <p>
 * 候補は約63万桁あり、コマンドライン引数1個の上限(Linuxの{@code MAX_ARG_STRLEN}、
 * 128KiB)を超えるので{@code -q}では渡せない。候補ごとの作業ディレクトリに10進で書き出して
 * ファイル名を渡す。PFGWは作業ディレクトリに{@code pfgw.ini}と再開用の{@code *.gec}
 * (CPU時間20分ごと)を書くので、候補ごとにディレクトリを分ける。名前を同じにすれば、
 * 再起動後に同じ候補を再開できる。
 * <p>
 * システムプロパティ{@value #EXECUTABLE_PROPERTY}に{@code pfgw64}の絶対パスを渡す。
 * 渡さないか実行できなければ{@link #isAvailable()}がfalseを返すので、呼び出し側は
 * {@link Mr2fs}かGMPの経路へフォールバックすること(壊れはしない)。
 */
public final class Pfgw {

  /** {@code pfgw64}の絶対パスを指定するシステムプロパティ。 */
  public static final String EXECUTABLE_PROPERTY = "com.github.teruteru.pfgw.executable";
  /** 候補ごとの作業ディレクトリを置く場所を指定するシステムプロパティ。 */
  public static final String WORK_DIR_PROPERTY = "com.github.teruteru.pfgw.workdir";
  /** 1プロセスあたりのgwnumのスレッド数({@code -T})を指定するシステムプロパティ。既定は1。 */
  public static final String THREADS_PROPERTY = "com.github.teruteru.pfgw.threads";

  private static final Logger logger = LoggerFactory.getLogger(Pfgw.class);
  private static final Pattern PRP = Pattern.compile(" is \\d+-PRP! ");
  private static final Pattern COMPOSITE = Pattern.compile(
      " is composite: RES64: \\[(\\p{XDigit}{16})] ");
  private static final String INPUT = "n.txt";
  private static final String OUTPUT = "out.log";

  private static final Path EXECUTABLE;
  private static final Path WORK_DIR;
  private static final int THREADS;
  private static final boolean AVAILABLE;
  private static final String UNAVAILABLE_REASON;

  static {
    String reason = null;
    Path executable = null;
    Path workDir = null;
    var threads = Integer.getInteger(THREADS_PROPERTY, 1);
    var path = System.getProperty(EXECUTABLE_PROPERTY);
    if (path == null) {
      reason = EXECUTABLE_PROPERTY + "が設定されていません";
    } else if (!Files.isRegularFile(Path.of(path)) || !Files.isExecutable(Path.of(path))) {
      reason = EXECUTABLE_PROPERTY + "が指すファイルを実行できません: " + path;
    } else if (threads < 1) {
      reason = THREADS_PROPERTY + "が1未満です: " + threads;
    } else {
      executable = Path.of(path);
      workDir = Path.of(System.getProperty(WORK_DIR_PROPERTY,
          System.getProperty("java.io.tmpdir") + "/prime-search-pfgw"));
      try {
        Files.createDirectories(workDir);
      } catch (IOException e) {
        reason = "作業ディレクトリを作れません: " + workDir + ": " + e;
      }
    }
    EXECUTABLE = executable;
    WORK_DIR = workDir;
    THREADS = threads;
    AVAILABLE = reason == null;
    UNAVAILABLE_REASON = reason;
    if (AVAILABLE) {
      // JVMが止まっても子プロセスは残るので、道連れにする(systemd経由ならcgroupごと
      // 止まるが、手で起動したときに孤児が計算を続けないように)
      Runtime.getRuntime().addShutdownHook(new Thread(
          () -> ProcessHandle.current().children().forEach(ProcessHandle::destroy)));
    }
  }

  private Pfgw() {
  }

  /** {@link #fermat}を呼べるか。 */
  public static boolean isAvailable() {
    return AVAILABLE;
  }

  /** 使えない理由。使える場合はnull。 */
  public static String unavailableReason() {
    return UNAVAILABLE_REASON;
  }

  public static Path executable() {
    return EXECUTABLE;
  }

  public static Path workDir() {
    return WORK_DIR;
  }

  public static int threads() {
    return THREADS;
  }

  /**
   * nが底3のFermat確率的素数かを判定する。
   *
   * @param n    初期化済みのmpz_t
   * @param name 作業ディレクトリの名前。候補ごとに一意で、再起動しても同じものを渡すこと
   * @return 1:確率的素数, 0:合成数, -1:判定できなかった(PFGWが使えない、エラーで終わった、
   * 出力を読めなかった)。-1のときは{@link Mr2fs}かGMPに任せること
   * @throws InterruptedException 待っている間に割り込まれた。PFGWは止める。作業ディレクトリは
   *                              再開用に残す
   */
  public static int fermat(MemorySegment n, String name) throws InterruptedException {
    if (!AVAILABLE) {
      return -1;
    }
    var dir = WORK_DIR.resolve(name);
    var output = dir.resolve(OUTPUT);
    Process process;
    try {
      Files.createDirectories(dir);
      Files.writeString(dir.resolve(INPUT), Gmp.toDecimalString(n) + "\n",
          StandardCharsets.US_ASCII);
      // 前回の実行の「ファイルの何行目まで処理したか」が残っていると、その行を飛ばされる
      // おそれがある。再開用の*.gecはPFGWがnとの一致を確かめてから使うので残してよい
      Files.deleteIfExists(dir.resolve("pfgw.ini"));
      var command = new ArrayList<String>();
      command.add(EXECUTABLE.toString());
      // 篩済みなので試し割りはしない
      command.add("-f0");
      // 付けないとPFGWは自分でnice 19(idle優先度)に下がる。本命の計算なので、
      // nice 19のesieveなどより優先させる
      command.add("-N");
      // 再開用ファイルは進捗表示のたびに(CPU時間20分経っていれば)保存されるので、
      // -u0で表示を止めてはいけない。100000回は約3分ごと
      command.add("-u100000");
      if (THREADS > 1) {
        command.add("-T" + THREADS);
      }
      command.add(INPUT);
      process = new ProcessBuilder(command)
          .directory(dir.toFile())
          .redirectErrorStream(true)
          .redirectOutput(output.toFile())
          .start();
    } catch (IOException e) {
      logger.warn("{}: PFGWを起動できませんでした", name, e);
      return -1;
    }
    int exitCode;
    try {
      exitCode = process.waitFor();
    } catch (InterruptedException e) {
      process.destroy();
      if (!process.waitFor(10, TimeUnit.SECONDS)) {
        process.destroyForcibly();
      }
      throw e;
    }
    String text;
    try {
      text = Files.readString(output, StandardCharsets.ISO_8859_1);
    } catch (IOException e) {
      logger.warn("{}: PFGWの出力を読めませんでした", name, e);
      return -1;
    }
    int result;
    var composite = COMPOSITE.matcher(text);
    // 終了コードはPRPなら0、合成数とエラーはどちらも1なので、出力の文言で区別する
    if (exitCode == 0 && PRP.matcher(text).find()) {
      result = 1;
    } else if (exitCode == 1 && composite.find()) {
      result = 0;
      logger.debug("{}: composite RES64={}", name, composite.group(1));
    } else {
      logger.warn("{}: PFGWの結果を判定できませんでした(終了コード{})。出力は{}に残します: {}",
          name, exitCode, output, tail(text));
      return -1;
    }
    if (Files.exists(dir.resolve("pfgw_err.log"))) {
      // 丸め誤差などを検出し、FFT長を上げてやり直した。結果は正しいが、頻発するなら
      // 熱や電源を疑う
      logger.warn("{}: PFGWが誤りを検出してやり直しました: {}", name, tail(text));
    }
    deleteRecursively(dir);
    return result;
  }

  private static String tail(String text) {
    var t = text.replace('\r', '\n').strip();
    return t.substring(Math.max(0, t.length() - 500));
  }

  private static void deleteRecursively(Path dir) {
    try (var paths = Files.walk(dir)) {
      for (var p : paths.sorted(Comparator.reverseOrder()).toList()) {
        Files.delete(p);
      }
    } catch (IOException e) {
      logger.warn("作業ディレクトリを消せませんでした: {}", dir, e);
    }
  }
}
