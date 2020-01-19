
class MyNumberValidater{

  static private int calcCheckDigit(char[] digits){
    int p;
    int q;
    int sum=0;
    for(int i = 1;i <= 11; i++){
      p = (int)digits[11-i] - '0';
      q = (i <= 6) ? i+1:i-5;
      sum = (sum + p*q)%11;
    }
    return sum;
  }

  static boolean validateMyNumber(String mynumber){
    char[] digits=mynumber.toCharArray();
    if(digits.length != 12){
      return false;
    }
    int checkDigit = (int)digits[11] - '0';
    int p;
    int q;
    int sum=0;
    for(int i = 1;i <= 11; i++){
      p = (int)digits[11-i] - '0';
      q = (i <= 6) ? i+1:i-5;
      sum = (sum + p*q)%11;
    }
    System.out.printf("%d == %d -> ", checkDigit, sum);
    if(sum <= 1) {
      return checkDigit == 0;
    }else{
      return checkDigit == (11 - sum);
    }
  }

  public static void main(String[] args){
    System.out.println(validateMyNumber("123456789010")); //=> false
    System.out.println(validateMyNumber("123456789011")); //=> false
    System.out.println(validateMyNumber("123456789012")); //=> false
    System.out.println(validateMyNumber("123456789013")); //=> false
    System.out.println(validateMyNumber("123456789014")); //=> false
    System.out.println(validateMyNumber("123456789015")); //=> false
    System.out.println(validateMyNumber("123456789016")); //=> false
    System.out.println(validateMyNumber("123456789017")); //=> false
    System.out.println(validateMyNumber("123456789018")); //=> true
    System.out.println(validateMyNumber("123456789019")); //=> false
    System.out.println(validateMyNumber("023456789013")); //=> true (先頭が0の場合)
    System.out.println(validateMyNumber("114514191900")); //=> true (先頭が0の場合)
  }
}
