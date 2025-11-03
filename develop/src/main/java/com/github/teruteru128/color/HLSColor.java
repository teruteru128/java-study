package com.github.teruteru128.color;

/**
 *
 * @param h Hue, [0, 6)
 * @param l Lightness, [0, 1]
 * @param s Saturation, [0, 1]
 */
public record HLSColor(double h, double l, double s) {

  public HLSColor {
    if (h < 0 || 6 <= h) {
      throw new IllegalArgumentException("");
    }
    if (l < 0 || 1 < l) {
      throw new IllegalArgumentException("");
    }
    if (s < 0 || 1 < s) {
      throw new IllegalArgumentException("s is over: " + s);
    }
  }
}
