package com.github.teruteru128.color;

import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class ColorConverter {

  public static RGBColor HLSToRGB(HLSColor HLSColor) {
    var h = HLSColor.h();
    var l = HLSColor.l();
    var s = HLSColor.s();
    var v = (s * (1 - abs(2 * l - 1))) / 2;
    double dMax = l + v;
    double dMin = l - v;
    double dMaxSubMin = dMax - dMin;
    double dr, dg, db;
    switch ((int) h) {
      case 0 -> {
        dr = dMax;
        dg = dMin + dMaxSubMin * h;
        db = dMin;
      }
      case 1 -> {
        dr = dMin + dMaxSubMin * (2 - h);
        dg = dMax;
        db = dMin;
      }
      case 2 -> {
        dr = dMin;
        dg = dMax;
        db = dMin + dMaxSubMin * (h - 2);
      }
      case 3 -> {
        dr = dMin;
        dg = dMin + dMaxSubMin * (4 - h);
        db = dMax;
      }
      case 4 -> {
        dr = dMin + dMaxSubMin * (h - 4);
        dg = dMin;
        db = dMax;
      }
      case 5 -> {
        dr = dMax;
        dg = dMin;
        db = dMin + dMaxSubMin * (6 - h);
      }
      default -> throw new IllegalStateException("Unexpected value: " + (int) h);
    }
    return new RGBColor((int) (dr * 255), (int) (dg * 255), (int) (db * 255));
  }

  public static HLSColor RGBToHLS(RGBColor RGBColor) {
    var dr = (double) RGBColor.r() / 255;
    var dg = (double) RGBColor.g() / 255;
    var db = (double) RGBColor.b() / 255;
    var dMax = max(max(dr, dg), db);
    var dMin = min(min(dr, dg), db);
    var dMaxSubMin = dMax - dMin;
    var dMaxAddMin = dMax + dMin;
    double h;
    if (dMin == db) {
      h = (dg - dr) / dMaxSubMin + 1;
    } else if (dMin == dr) {
      h = (db - dg) / dMaxSubMin + 3;
    } else {
      h = (dr - db) / dMaxSubMin + 5;
    }

    var l = dMaxAddMin / 2;
    // 円柱モデル
    var s = min(1, max(0, dMaxSubMin / (1 - abs(dMaxAddMin - 1))));
    try {
      return new HLSColor(h, l, s);
    } catch (IllegalArgumentException e) {
      throw new RuntimeException(
          "r: %d, g: %d, b: %d, h: %f, l: %f, s: %f".formatted(RGBColor.r(), RGBColor.g(),
              RGBColor.b(), h, l, s), e);
    }
  }
}
