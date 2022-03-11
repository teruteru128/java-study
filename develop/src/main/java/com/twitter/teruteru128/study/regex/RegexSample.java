package com.twitter.teruteru128.study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Teruteru
 *
 */
public class RegexSample {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^(\\+|-)?[\\d]+(\\.[\\d]*)?$");
        Matcher m = p.matcher("1.0");
        if (m.matches()) {
            System.out.println(m.group());
        }
    }
}
