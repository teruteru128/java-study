package com.github.teruteru128.color;

/**
 *
 * @param r Red, [0, 255]
 * @param g Green, [0, 255]
 * @param b Blue, [0, 255]
 */
public record RGBColor(int r, int g, int b) {

  /**
   *
   * @param r Red, [0, 255]
   * @param g Green, [0, 255]
   * @param b Blue, [0, 255]
   */
  public RGBColor {
    if (r < 0 || 255 < r) {
      throw new IllegalArgumentException("");
    }
    if (g < 0 || 255 < g) {
      throw new IllegalArgumentException("");
    }
    if (b < 0 || 255 < b) {
      throw new IllegalArgumentException("");
    }
  }

  /**
   * The alpha channel is ignored.
   * @param argb [-2147483648, 2147483647]
   */
  public RGBColor(int argb) {
    this(argb >> 16 & 0xff, argb >> 8 & 0xff, argb & 0xff);
  }
}
