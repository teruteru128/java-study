package com.twitter.teruteru128.sample.onion.fetch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://xiwayy2kn32bo3ko.onion/tor/subject.txt");
		Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("localhost", 9050));
		HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxy);
		connection.connect();
		int rescode = connection.getResponseCode();
		if (rescode == 200) {
			try (BufferedReader reader = new BufferedReader(
					new InputStreamReader(connection.getInputStream(), "SJIS"))) {
				reader.lines().map(l -> BBSThread.pattern.matcher(l)).filter(Matcher::matches)
						.map(m -> new BBSThread(Long.valueOf(m.group(2), 10), m.group(1), m.group(3),
								Integer.valueOf(m.group(4), 10))).forEach(System.out::println);
			}
		} else {
			System.out.printf("response code : %d%n", rescode);
		}
	}

}

class BBSThread implements Comparable<BBSThread>, Serializable {
	private static final long serialVersionUID = 0;
	public static final Pattern pattern = Pattern.compile("^((\\d+).dat)<>(.*) \\((\\d+)\\)$");
	private long datid;
	private String datname;
	private String title;
	private int res;

	public BBSThread(long datid, String datname, String title, int res) {
		this.datid = datid;
		this.datname = datname;
		this.title = title;
		this.res = res;
	}

	@Override
	public int compareTo(BBSThread o) {
		return Long.compare(this.datid, o.datid);
	}

	public long getDatid() {
		return datid;
	}
	public String getDatname() {
		return datname;
	}
	public String getTitle() {
		return title;
	}
	public int getRes() {
		return res;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BBSThread [datid=").append(datid).append(", datname=").append(datname).append(", title=")
				.append(title).append(", res=").append(res).append("]");
		return builder.toString();
	}
	
}