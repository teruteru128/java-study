package com.twitter.teruteru128.study;

class MyNumberValidater {

  private static int calcCheckDigit(char[] digits) {
    int p;
    int q;
    int sum = 0;
    for (int i = 1; i <= 11; i++) {
      p = (int) digits[11 - i] - '0';
      q = (i <= 6) ? i + 1 : i - 5;
      sum = (sum + p * q) % 11;
    }
    return sum;
  }

  public static boolean validateMyNumber(String mynumber) {
    char[] digits = mynumber.toCharArray();
    if (digits.length != 12) {
      return false;
    }
    int checkDigit = (int) digits[11] - '0';
    int sum = calcCheckDigit(digits);
    if (sum <= 1) {
      return checkDigit == 0;
    } else {
      return checkDigit == (11 - sum);
    }
  }

}
