package com.twitter.teruteru128.study.regex;

import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Teruteru
 *
 */
public class RegexSample implements Callable<String> {
    private static final Pattern PATTERN = Pattern.compile("^(\\+|-)?[\\d]+(\\.[\\d]*)?$");

    public String call() {
        Matcher m = PATTERN.matcher("1.0");
        return m.matches() ? m.group() : null;
    }
}
