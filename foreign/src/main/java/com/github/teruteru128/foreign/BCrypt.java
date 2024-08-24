package com.github.teruteru128.foreign;

import static com.github.teruteru128.foreign.windows.Windows_h_20.BCryptCloseAlgorithmProvider;
import static com.github.teruteru128.foreign.windows.Windows_h_20.BCryptCreateHash;
import static com.github.teruteru128.foreign.windows.Windows_h_20.BCryptDestroyHash;
import static com.github.teruteru128.foreign.windows.Windows_h_20.BCryptFinishHash;
import static com.github.teruteru128.foreign.windows.Windows_h_20.BCryptGetProperty;
import static com.github.teruteru128.foreign.windows.Windows_h_20.BCryptHashData;
import static com.github.teruteru128.foreign.windows.Windows_h_20.BCryptOpenAlgorithmProvider;
import static com.github.teruteru128.foreign.windows.Windows_h_27.strlen;
import static com.github.teruteru128.foreign.windows.Windows_h_3.BCRYPT_OBJECT_LENGTH;
import static com.github.teruteru128.foreign.windows.Windows_h_3.BCRYPT_SHA1_ALGORITHM;
import static com.github.teruteru128.foreign.windows.Windows_h_31.BCRYPT_HASH_REUSABLE_FLAG;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_INT;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Arrays;
import java.util.HexFormat;

public class BCrypt {

  static int SHA256(Arena arena, String str) {
    //プロバイダーハンドルを作成
    int status;
    // wchar_tの中身がUTF-16だったりUTF-32だったりSHIFT-JISだったりしろ
    var algorithmHandler = arena.allocate(ADDRESS);
    if (!((status = BCryptOpenAlgorithmProvider(algorithmHandler, BCRYPT_SHA1_ALGORITHM(), NULL, 0))
          >= 0)) {
      return status;
    }
    var handle = algorithmHandler.get(ADDRESS, 0);
    if (handle.equals(NULL)) {
      return 1;
    }
    // オブジェクトの大きさを取得
    var re = arena.allocate(JAVA_INT);
    var i5 = BCryptGetProperty(handle, BCRYPT_OBJECT_LENGTH(), NULL, 0, re, 0);
    if (i5 != 0) {
      throw new IllegalStateException(String.format("BCryptGetProperty 1: %08x", i5));
    }
    var byteSize = re.get(JAVA_INT, 0);
    var bufferSize = arena.allocate(byteSize);
    var i4 = BCryptGetProperty(handle, BCRYPT_OBJECT_LENGTH(), bufferSize, byteSize, re, 0);
    if (i4 != 0) {
      throw new IllegalStateException(String.format("BCryptGetProperty 2: %08x", i4));
    }
    var size1 = bufferSize.get(JAVA_INT, 0);
    // hashオブジェクトを作成
    var buffer = arena.allocate(size1, 1);
    var hash = arena.allocate(ADDRESS);
    var i = BCryptCreateHash(handle, hash, buffer, size1, NULL, 0, BCRYPT_HASH_REUSABLE_FLAG());
    if (i != 0) {
      throw new IllegalStateException(String.format("BCryptCreateHash: %08x", i));
    }
    // hash開始
    var rawStr = arena.allocateFrom(str);
    var strLength = strlen(rawStr);
    var hHash = hash.get(ADDRESS, 0);
    // hash終了
    var hashBuffer = arena.allocate(JAVA_BYTE, 32);
    long[] s = new long[1];
    var hashBuffer1 = new byte[20];
    long start = System.nanoTime();
    i = BCryptHashData(hHash, rawStr, (int) strLength, 0);
    if (i != 0) {
      return i;
    }
    i = BCryptFinishHash(hHash, hashBuffer, 20, 0);
    if (i != 0) {
      return i;
    }
    s[0] = System.nanoTime() - start;
    Arrays.stream(s).average().ifPresent(a -> System.out.println(a / 1e9));
    // javaのbyte配列にコピーして出力
    MemorySegment.copy(hashBuffer, JAVA_BYTE, 0, hashBuffer1, 0, 20);
    System.out.printf("hash: %s%n", HexFormat.of().formatHex(hashBuffer1));
    // hashオブジェクトを破棄
    var i3 = BCryptDestroyHash(hHash);
    if (i3 != 0) {
      throw new RuntimeException("BCryptDestroyHash: " + i3);
    }
    var j6 = BCryptCloseAlgorithmProvider(handle, 0);
    if (j6 != 0) {
      throw new RuntimeException(
          String.format("**** Error 0x%1$08x(%1$d) returned by BCryptCloseAlgorithmProvider", j6));
    }
    return 0;
  }
}
