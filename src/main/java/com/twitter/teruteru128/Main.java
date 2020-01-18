package com.twitter.teruteru128;

import java.util.Scanner;
import java.util.regex.*;

class Main{
  public static void main(String[] args){
    Pattern bm = Pattern.compile("^\\[(.*)\\]");
    Pattern label = Pattern.compile("^label = (.*)");
    try(Scanner s = new Scanner(System.in)){
        
        StringBuilder builder = new StringBuilder();
        String buf = "";
        while(s.hasNextLine()){
           buf = s.nextLine();
           Matcher m = bm.matcher(buf);
           if(m.matches()){
               builder.setLength(0);
               builder.append(m.group(1)).append(",");
           }
           m = label.matcher(buf);
           if(m.matches()){
             builder.append(m.group(1));
             System.out.println(builder);
           }
        }
    }catch(Exception e){
        e.printStackTrace();
    }


  }
}

