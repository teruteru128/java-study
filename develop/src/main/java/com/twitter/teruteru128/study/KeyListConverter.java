package com.twitter.teruteru128.study;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import com.twitter.teruteru128.study.bitmessage.KeyPair;

/**
 * 公開鍵と秘密鍵をファイルから読み出して鍵ペアのリストに変換するコンバーター。
 * */
public class KeyListConverter implements Callable<List<KeyPair>> {
    private int i;

    public KeyListConverter(int i) {
        this.i = i;
    }

    @Override
    public List<KeyPair> call() throws Exception {
        var list = new ArrayList<KeyPair>(16777216 * 8);
        byte[] pubkeysallbyte = Files.readAllBytes(new File(String.format("../publicKeys%d.bin", i)).toPath());
        byte[] prikeysallbyte = Files.readAllBytes(new File(String.format("../privateKeys%d.bin", i)).toPath());
        int pubkeyoffset = 0;
        int prikeyoffset = 0;
        for (var i = 0; i < 16777216; i++, pubkeyoffset += 65, prikeyoffset += 32) {
            list.add(new KeyPair(prikeysallbyte, prikeyoffset, 32, pubkeysallbyte, pubkeyoffset, 65));
        }
        Runtime.getRuntime().gc();
        return list;
    }
}