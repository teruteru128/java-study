package com.twitter.teruteru128.study.zip;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipBombCreater {

    public static void main(String[] args) {
        File bomb = new File("0.zip");
        try {

            if (!bomb.exists()) {
                bomb.createNewFile();
            }
        } catch (IOException e) {
        }
        try {
            ZipOutputStream zos = new ZipOutputStream(new BufferedOutputStream(
                    new BufferedOutputStream(new FileOutputStream(bomb))));
            try {
                for (int j = 0; j < 1; j++) {
                    String cfn = String.format("%x.txt", j);
                    zos.putNextEntry(new ZipEntry(cfn));
                    zos.setLevel(9);
                    /* 1ファイル1GB */

                    //for (int i = 0; i < 1024; i++) {
                        //for (int k = 0; k < 1024; i++) {
                            //for (int l = 0; l < 1024; i++) {
                                zos.write(0x55);
                            //}
                        //}
                        //System.out.println(i);
                    //}
                    /*
                     * byte[] array = new byte[1024]; Arrays.fill(array,
                     * (byte)'U');// 0x00 for (long i = 0, txtSize = 1024L *
                     * 1024; i < txtSize; i++) { zos.write(array); if (i %
                     * 131072 == 0) {
                     * System.out.println(String.format("%3s : %4.1f", cfn,
                     * ((double) (i * 100)) / txtSize)); } }
                     */
                    // zos.closeEntry();
                }
            } finally {
                zos.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
