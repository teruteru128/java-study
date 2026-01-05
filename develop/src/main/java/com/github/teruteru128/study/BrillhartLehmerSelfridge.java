package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_cmp;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_cmp_ui;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_divexact;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_divisible_p;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_divisible_ui_p;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_gcd;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_init_set;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_mul;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_pow_ui;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_powm;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_remove;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_set_ui;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_sub_ui;

import com.github.teruteru128.gmp.msys2.__mpz_struct;
import com.github.teruteru128.gmp.msys2.gmp_h;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.math.BigInteger;
import java.util.Set;

public class BrillhartLehmerSelfridge {

  /**
   * Brillhart-Lehmer-Selfridge N-1 素数判定テスト
   *
   * @see <a href="https://share.google/aimode/ZAjIgTat19Ul1sw8a">Google AI</a>
   * @param n テスト対象の数 N (N > 1)
   * @param nSub1FactorsSet N-1 の既知の素因数 q のセット
   * @return Nが素数であれば true、そうでなければ false
   */
  public boolean isPrime(BigInteger n, Set<BigInteger> nSub1FactorsSet) {
    if (n == null || n.compareTo(BigInteger.ONE) <= 0) {
      return false;
    }
    if (n.equals(BigInteger.TWO)) {
      return true;
    }
    if (n.remainder(BigInteger.TWO).equals(BigInteger.ZERO)) {
      return false;
    }

    BigInteger nMinus1 = n.subtract(BigInteger.ONE);
    BigInteger F = BigInteger.ONE;
    BigInteger work = nMinus1;

    // F を既知の素因数から計算
    for (BigInteger q : nSub1FactorsSet) {
      // 素因数qがN-1を割ることを確認（ここでは単純化のため割れるものとしてFに乗算）
      // 実際には、重複する指数やN-1との関係を確認するより堅牢なロジックが必要
      while (true) {
        var divideAndRemainder = work.divideAndRemainder(q);
        if (!divideAndRemainder[1].equals(BigInteger.ZERO)) {
          break;
        }
        F = F.multiply(q);
        work = divideAndRemainder[0];
      }
    }

    // FがN-1の完全な分解の一部であるか、またはN-1を割り切ることを確認
    if (!nMinus1.remainder(F).equals(BigInteger.ZERO)) {
      // 提供された因数セットがN-1を割り切らない場合、テストは適用できない
      System.out.println("Error: Factors provided do not divide N-1 evenly.");
      return false;
    }

    // Brillhart-Lehmer-Selfridgeの条件: F > sqrt(N) である必要がある
    // Nの平方根の概算値を取得
    BigInteger sqrtN = n.sqrt().add(BigInteger.ONE);
    if (F.pow(3).compareTo(n) <= 0) {
      System.out.println("Error: Product of known factors F is not greater than sqrt(N). F=" + F
                         + ", sqrt(N) approx=" + sqrtN);
      return false;
    }

    // 適切な基数 'a' を探し、2つの条件を満たすか確認する
    // 最初のいくつかの小さな素数を試す
    int[] bases = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};
    for (int base : bases) {
      BigInteger a = BigInteger.valueOf(base);

      // gcd(a, N) == 1 であることを確認 (通常は小さい基数でOK)
      if (!n.gcd(a).equals(BigInteger.ONE)) {
        continue;
      }

      // 条件1: a^(N-1) === 1 (mod N) (フェルマーテスト)
      BigInteger aToNMinus1 = a.modPow(nMinus1, n);
      if (!aToNMinus1.equals(BigInteger.ONE)) {
        // フェルマーテストに失敗 -> Nは合成数
        return false;
      }

      boolean condition2Met = true;
      for (BigInteger q : nSub1FactorsSet) {
        // 条件2: すべての素因数 q について a^((N-1)/q) !== 1 (mod N)
        BigInteger nMinus1OverQ = nMinus1.divide(q);
        BigInteger aToNMinus1OverQ = a.modPow(nMinus1OverQ, n);
        if (aToNMinus1OverQ.equals(BigInteger.ONE)) {
          condition2Met = false;
          break; // この基数 'a' は条件を満たさない
        }
      }

      if (condition2Met) {
        // 条件1と条件2の両方を満たす 'a' が見つかった
        return true; // N は素数であると証明された
      }
    }

    // すべての試行された基数で条件を満たせなかった場合、
    // 提供された因数セットだけではNの素数性を証明できないか、
    // 基数の選択が不十分である可能性がある。
    // （理論上は、十分なFがあれば適切なaが存在するはず）
    return false;
  }

  public boolean isPrime(MemorySegment n, Set<MemorySegment> nSub1FactorsSet) {
    if (n == null || mpz_cmp_ui(n, 1) <= 0) {
      return false;
    }
    if (mpz_cmp_ui(n, 2) == 0) {
      return true;
    }
    if (mpz_divisible_ui_p(n, 2) == 1) {
      return false;
    }
    var auto = Arena.ofAuto();
    var nMinus1 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(nMinus1);
    mpz_sub_ui(nMinus1, n, 1);
    var f = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(f, 1);
    var work = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set(work, nMinus1);
    var poweredQ = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(poweredQ);

    for (var q : nSub1FactorsSet) {
      if (mpz_divisible_p(work, q) != 0) {
        var l = mpz_remove(work, work, q);
        mpz_pow_ui(poweredQ, q, l);
        mpz_mul(f, f, poweredQ);
      }
    }

    if (mpz_divisible_p(nMinus1, f) == 0) {
      System.out.println("Error: Factors provided do not divide N-1 evenly.");
      return false;
    }
    var powerF = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(powerF);
    mpz_pow_ui(powerF, f, 3);
    if (mpz_cmp(powerF, n) <= 0) {
      System.out.println("Error: Product of known factors F is not greater than sqrt(N).");
      return false;
    }

    int[] bases = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};
    var a = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(a);
    var gcd = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(gcd);
    var aToNMinus1 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(aToNMinus1);
    var nMinus1OverQ = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(nMinus1OverQ);
    var aToNMinus1OverQ = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(aToNMinus1OverQ);
    for (var base : bases) {
      mpz_set_ui(a, base);

      mpz_gcd(gcd, n, a);
      if (mpz_cmp_ui(gcd, 1) != 0) {
        continue;
      }

      mpz_powm(aToNMinus1, a, nMinus1, n);
      if (mpz_cmp_ui(aToNMinus1, 1) != 0) {
        return false;
      }

      boolean condition2Met = true;
      for (var q : nSub1FactorsSet) {
        // 条件2: すべての素因数 q について a^((N-1)/q) !== 1 (mod N)
        mpz_divexact(nMinus1OverQ, nMinus1, q);
        mpz_powm(aToNMinus1OverQ, a, nMinus1OverQ, n);
        if (mpz_cmp_ui(aToNMinus1OverQ, 1) == 0) {
          condition2Met = false;
          break; // この基数 'a' は条件を満たさない
        }
      }
      if (condition2Met) {
        // 条件1と条件2の両方を満たす 'a' が見つかった
        return true; // N は素数であると証明された
      }
    }

    // すべての試行された基数で条件を満たせなかった場合、
    // 提供された因数セットだけではNの素数性を証明できないか、
    // 基数の選択が不十分である可能性がある。
    // （理論上は、十分なFがあれば適切なaが存在するはず）
    return false;
  }

}
