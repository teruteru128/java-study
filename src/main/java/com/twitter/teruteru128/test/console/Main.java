package com.twitter.teruteru128.test.console;

import java.io.Console;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
          Console console = System.console();
          if(console==null){
              System.out.println("console is null");
              throw new NullPointerException("Console not Found!");
          }
          for (int i = 0;; i++) {
              char[] password = 
                  console.readPassword("パスワード %d: ", i);
              if (password == null) {
                  break;
              }

              console.printf("パスワード: ");
              for (int j = 0; j < password.length; j++) {
                  char c = password[j];
                  console.printf("%c", c);

                  password[j] = '\0';
              }
              console.printf("%n");
          }

    }

}
