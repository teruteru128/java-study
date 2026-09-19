package com.github.teruteru128.study;

import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.BigIntegers;

/**
 * 起点からGずつ進めた点の列を、非圧縮形式(65バイト)のエンコードとして順に供給する。
 * <p>
 * 素直に{@code point.add(G).normalize()}を繰り返すと、1点ごとにモジュラ逆元が1回走る。
 * これが点加算全体の約82%を占めていた。そこでバッチぶんの点を<strong>正規化せずに</strong>
 * 集めておき、{@link ECAlgorithms#montgomeryTrick}でZ座標をまとめて逆元にする。
 * n個の逆元が1回の逆元と3(n-1)回の乗算で済むので、バッチ256で約3.15倍になる。
 * <p>
 * アフィン座標の復元は、secp256k1がJacobian座標系({@code COORD_JACOBIAN})であることを
 * 前提に{@code x = X * zInv^2}、{@code y = Y * zInv^3}で行う。非正規化の点では
 * {@link ECPoint#getXCoord()}が射影座標を返す({@code getAffineXCoord()}は正規化を
 * 強制してしまうので使えない)。
 * <p>
 * <strong>スレッドセーフではない。</strong>
 */
public final class SequentialPublicKeys {

  /**
   * 非圧縮公開鍵のバイト長。先頭の0x04と、32バイトのx, yで65バイト。
   */
  public static final int PUBLIC_KEY_LENGTH = 65;
  private static final int COORDINATE_LENGTH = 32;

  private final ECPoint g;
  private final ECPoint[] points;
  private final ECFieldElement[] zInverses;
  private final byte[][] encodings;
  /** 次にバッチへ詰める点。{@code filledUpTo}の位置に対応する。正規化されていなくてよい */
  private ECPoint next;
  /** 起点から何個進んだ位置にいるか */
  private long position;
  /** 現在バッチの先頭が起点から何個目か */
  private long batchStart;
  /** どの位置まで埋まっているか(排他的上限) */
  private long filledUpTo;

  /**
   * @param start     起点。正規化されていなくてよい
   * @param g         1回の前進で加える点(通常はベースポイントG)
   * @param batchSize まとめて逆元を取る個数。256程度で十分に効く
   */
  public SequentialPublicKeys(ECPoint start, ECPoint g, int batchSize) {
    if (batchSize < 1) {
      throw new IllegalArgumentException("batchSize: " + batchSize);
    }
    this.g = g;
    this.next = start;
    this.points = new ECPoint[batchSize];
    this.zInverses = new ECFieldElement[batchSize];
    this.encodings = new byte[batchSize][PUBLIC_KEY_LENGTH];
  }

  /**
   * 現在の点の非圧縮エンコード。{@link #advance()}するまで同じ内容を返す。
   *
   * @return 内部バッファへの参照。呼び出し側は書き換えないこと
   */
  public byte[] current() {
    if (position >= filledUpTo) {
      refill();
    }
    return encodings[(int) (position - batchStart)];
  }

  /**
   * 起点から何個進んだ位置にいるか。秘密鍵が必要になった場合は
   * {@code 起点の秘密鍵 + index() mod n}で求められる。
   */
  public long index() {
    return position;
  }

  /**
   * 次の点へ進む。
   */
  public void advance() {
    position++;
  }

  private void refill() {
    var size = points.length;
    batchStart = filledUpTo;
    for (var i = 0; i < size; i++) {
      points[i] = next;
      var z = next.getZCoord(0);
      if (z.isZero()) {
        // 無限遠点。確率は無視できるが、montgomeryTrickが壊れるので明示的に落とす
        throw new IllegalStateException("点の列に無限遠点が現れました: index=" + (batchStart + i));
      }
      zInverses[i] = z;
      next = next.add(g);
    }
    ECAlgorithms.montgomeryTrick(zInverses, 0, size);
    for (var i = 0; i < size; i++) {
      encode(points[i], zInverses[i], encodings[i]);
    }
    filledUpTo = batchStart + size;
  }

  /**
   * Jacobian座標の点を、与えられたZの逆元を使って非圧縮形式へ書き出す。
   */
  private static void encode(ECPoint point, ECFieldElement zInv, byte[] out) {
    var zInv2 = zInv.square();
    var x = point.getXCoord().multiply(zInv2).toBigInteger();
    var y = point.getYCoord().multiply(zInv2).multiply(zInv).toBigInteger();
    out[0] = 4;
    BigIntegers.asUnsignedByteArray(x, out, 1, COORDINATE_LENGTH);
    BigIntegers.asUnsignedByteArray(y, out, 1 + COORDINATE_LENGTH, COORDINATE_LENGTH);
  }
}
