package com.twitter.teruteru128.test.ts.sample003;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.twitter.teruteru128.holders.SecureRandomHolder;
import com.twitter.teruteru128.holders.VoidHolder;

/**
 * @author Teruteru
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String publicKey1 = "MEwDAgcAAgEgAiEA7Vo1+Orf2xuuu6hTPAPldSfrUZZ7WYAzpRcO5DoYFLoCIF1JKVBctOGvMOy495O/BWFuFEYH4i1f6vU0b9+a64RD";
		String publicKey2 = "MEsDAgcAAgEgAiAoQPNcS7L4k+q2qf3U7uyujtwRQNS3pLKN/zrRGERGagIgFjdV1JlqHF8BiIQne0/E3jVM7hWda/USrFI58per45s=";
		SecureRandom random = SecureRandomHolder.getInstance();
		int min1 = 41;
		int min2 = 37;
		ArrayList<Callable<Void>> list = new ArrayList<>();
		for (int i = 0; i < 1; i++) {
			list.add(Executors.callable(
					new Searcher(publicKey1, random.nextLong(), min1),
					VoidHolder.getInstance()));
		}
		for (int i = 0; i < 3; i++) {
			list.add(Executors.callable(
					new Searcher(publicKey2, random.nextLong(), min2),
					VoidHolder.getInstance()));
		}
		ExecutorService service = Executors.newWorkStealingPool();
		try {
			service.invokeAll(list);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}