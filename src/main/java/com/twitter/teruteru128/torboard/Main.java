package com.twitter.teruteru128.torboard;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProxySelector;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://xiwayy2kn32bo3ko.onion/ura/");
		Path outdir = Paths.get(System.getenv("userprofile"), "Downloads", "ura");
		Path datdir = outdir.resolve("dat");
		System.out.println(datdir);
		ProxySelector.setDefault(new TorProxySelector());
		HttpURLConnection connection = (HttpURLConnection) new URL(url, "subject.txt").openConnection();
		connection.connect();
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(connection.getInputStream(), Charset.forName("SJIS")))) {
			var urls = reader.lines().map(l -> l.split("<>")[0]).map(l -> "dat/" + l).map(l -> {
				try {
					return new URL(url, l);
				} catch (MalformedURLException e) {
					return null;
				}
			}).filter(Objects::nonNull).collect(Collectors.toList());
			for (URL url2 : urls) {
				Path file = Paths.get(url2.getPath()).getFileName();
				Path datfile = datdir.resolve(file);
				try (BufferedInputStream in = new BufferedInputStream(url2.openStream())) {
					Files.copy(in, datfile, StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					System.err.printf("err : %s%n", file.getFileName());
				}
			}
		}
	}

}