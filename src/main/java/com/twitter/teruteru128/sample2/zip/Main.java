package com.twitter.teruteru128.sample2.zip;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipOutputStream;

public class Main {

	public static void main(String[] args) {
		File outfile = new File("out.zip");

		try (ZipOutputStream zos = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(outfile)))) {
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
