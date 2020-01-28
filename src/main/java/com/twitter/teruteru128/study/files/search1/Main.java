package com.twitter.teruteru128.study.files.search1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Path dir = Paths.get("D:\\GoogleDrive_backup\\image\\pixiv.net\\");
		final var pattern = Pattern.compile("(\\d+)_.*");
		final var pattern2 = Pattern.compile(".*(\\d{3})$");
		try {
			Files.walk(dir).map(Path::toFile).filter(File::isFile).filter(p -> {
				var matcher = pattern.matcher(p.getName());
				var matcher2 = pattern2.matcher(p.getParent());
				if (!(matcher2.matches() && matcher.matches())) {
					return false;
				}
				return Integer.parseInt(matcher2.group(1),10) != (Integer.parseInt(matcher.group(1), 10) / 1000000);
			}).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
