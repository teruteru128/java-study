package com.twitter.teruteru128.study.regex;

import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Teruteru
 *
 */
public class RegexSample implements Callable<String> {
    public String call() {
        Pattern p = Pattern.compile("^(\\+|-)?[\\d]+(\\.[\\d]*)?$");
        Matcher m = p.matcher("1.0");
        if (m.matches()) {
            return m.group();
        } else {
            return null;
        }
    }
}
