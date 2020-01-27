package com.twitter.teruteru128.study.bouyomichan;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SocketChannel;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
	private static final String host = "localhost";
	private static final int port = 50001;
	private static InetAddress addr = null;
	private static InetSocketAddress address = null;

	private static void init() {
		try {
			addr = InetAddress.getByName(host);
			address = new InetSocketAddress(addr, port);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		init();
		LocalDateTime dateTime = LocalDateTime.now(Clock.systemDefaultZone());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 ah時m分s秒", Locale.JAPAN);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("Gy年M月d日", Locale.JAPAN);
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("ah時m分s秒", Locale.JAPAN);
		JapaneseDate date = JapaneseDate.from(dateTime);
		LocalTime time = LocalTime.from(dateTime);
		// for (;;) {
		//readText(String.format("今は %s %s ですよー", date.format(formatter2), time.format(formatter3)));
		readText("hakatanoshio");
		// Thread.sleep(1000 * 30);
		// }
	}

	private static void readText(String text) {
		String message = text;
		byte[] messageData = message.getBytes();
		int capacity = 0;
		short command = 1;
		capacity += getDataLength(command);
		short speed = -1;
		capacity += getDataLength(speed);
		short tone = -1;
		capacity += getDataLength(tone);
		short volume = -1;
		capacity += getDataLength(volume);
		short voice = 0;
		capacity += getDataLength(voice);
		byte encode = 0;
		capacity += getDataLength(encode);
		int length = messageData.length;
		capacity += getDataLength(length);
		capacity += length;
		ByteBuffer buffer = ByteBuffer.allocate(capacity).order(ByteOrder.LITTLE_ENDIAN);
		buffer.putShort(command);
		buffer.putShort(speed);
		buffer.putShort(tone);
		buffer.putShort(volume);
		buffer.putShort(voice);
		buffer.put(encode);
		buffer.putInt(length);
		buffer.put(messageData);
		System.out.printf("command : %d\n", buffer.getShort(0));
		System.out.printf("speed : %d\n", buffer.getShort(2));
		System.out.printf("tone : %d\n", buffer.getShort(4));
		System.out.printf("volume : %d\n", buffer.getShort(6));
		System.out.printf("voice : %d\n", buffer.getShort(8));
		System.out.printf("encode : %d\n", buffer.get(10));
		System.out.printf("length : %d\n", buffer.getInt(11));
		buffer.flip();
		byte[] array = buffer.array();
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%02x", array[i]);
			if (i % 15 == 14) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.printf("fulllength : %dbytes\n", buffer.capacity());
		System.out.printf("datalength : %dbytes\n", messageData.length);
		assert (messageData.length + 15) == buffer.capacity();
		try (SocketChannel channel = SocketChannel.open(address)) {
			channel.write(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int getDataLength(byte b) {
		return 1;
	}

	public static int getDataLength(short b) {
		return 2;
	}

	public static int getDataLength(int b) {
		return 4;
	}

	public static int getDataLength(long b) {
		return 8;
	}

	public static int getDataLength(byte[] b) {
		return b.length;
	}
}
