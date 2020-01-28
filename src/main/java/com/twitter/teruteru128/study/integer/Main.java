package com.twitter.teruteru128.study.integer;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		String i = "18.5";
		Gson gson = new Gson();
		int j = gson.fromJson(i, Integer.TYPE);
		System.out.println(j);
	}

}
