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
		String publicKey = "MEwDAgcAAgEgAiEA7Vo1+Orf2xuuu6hTPAPldSfrUZZ7WYAzpRcO5DoYFLoCIF1JKVBctOGvMOy495O/BWFuFEYH4i1f6vU0b9+a64RD";
		SecureRandom random = SecureRandomHolder.getInstance();
		int min = 38;
		ArrayList<Callable<Void>> list = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			list.add(Executors.callable(
					new Searcher(publicKey, random.nextLong(), min),
					VoidHolder.getInstance()));
		}
		ExecutorService service = Executors.newWorkStealingPool();
		try {
			service.invokeAll(list);
		} catch (InterruptedException e) {
		}
	}

}