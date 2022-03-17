package com.twitter.teruteru128.study.utf8;

import java.util.concurrent.Callable;

import jakarta.xml.bind.DatatypeConverter;

public class UTF8DecodeSample implements Callable<String> {

    public String call() {
        String code ="e381ab e38198 e38288 e38281 e381a1 e38283 e38293";
        return new String(DatatypeConverter.parseHexBinary(code.replaceAll(" ", "")));
    }
}
