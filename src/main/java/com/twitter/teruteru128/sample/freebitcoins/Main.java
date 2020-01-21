package com.twitter.teruteru128.sample.freebitcoins;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.bouncycastle.util.encoders.Hex;

public class Main {

	public static void main(String[] args) throws IOException {
		Path in = Paths.get("C:\\Users\\terut\\OneDrive\\デスクトップ\\free-bitcoins.txt");
		Path out = Paths.get("C:\\Users\\terut\\OneDrive\\デスクトップ\\free-bitcoins.exe");
		Files.readAllLines(in).stream().map(Hex::decode).forEach(l -> {
			try {
				Files.write(out, l, StandardOpenOption.CREATE);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}

}
