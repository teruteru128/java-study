package com.github.teruteru128.foreign;

import static com.github.teruteru128.bcrypt.bcrypt_h.BCRYPT_ALG_HANDLE;
import static com.github.teruteru128.bcrypt.bcrypt_h.BCRYPT_HASH_HANDLE;
import static com.github.teruteru128.bcrypt.bcrypt_h.BCRYPT_HASH_LENGTH;
import static com.github.teruteru128.bcrypt.bcrypt_h.BCRYPT_OBJECT_LENGTH;
import static com.github.teruteru128.bcrypt.bcrypt_h.BCRYPT_SHA256_ALGORITHM;
import static com.github.teruteru128.bcrypt.bcrypt_h.BCryptCloseAlgorithmProvider;
import static com.github.teruteru128.bcrypt.bcrypt_h.BCryptCreateHash;
import static com.github.teruteru128.bcrypt.bcrypt_h.BCryptDestroyHash;
import static com.github.teruteru128.bcrypt.bcrypt_h.BCryptFinishHash;
import static com.github.teruteru128.bcrypt.bcrypt_h.BCryptGetProperty;
import static com.github.teruteru128.bcrypt.bcrypt_h.BCryptHashData;
import static com.github.teruteru128.bcrypt.bcrypt_h.BCryptOpenAlgorithmProvider;
import static com.github.teruteru128.bcrypt.bcrypt_h.C_LONG;
import static com.github.teruteru128.bcrypt.bcrypt_h.C_POINTER;
import static com.github.teruteru128.bcrypt.bcrypt_h.DWORD;
import static com.github.teruteru128.bcrypt.bcrypt_h.PBYTE;
import static com.github.teruteru128.heapapi.heapapi_h.GetProcessHeap;
import static com.github.teruteru128.heapapi.heapapi_h.HeapAlloc;
import static com.github.teruteru128.heapapi.heapapi_h.HeapFree;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.ADDRESS;

import java.lang.foreign.Arena;

public class BCrypt {

  /**
   * @see <a href="https://learn.microsoft.com/ja-jp/windows/win32/seccng/creating-a-hash-with-cng">a</a>
   * @param str
   */
  static void SHA256(String str) {
    var auto = Arena.ofAuto();
    var hAlgPtr = auto.allocate(BCRYPT_ALG_HANDLE);
    var hHashPtr = auto.allocate(BCRYPT_HASH_HANDLE);
    var status = 0xC0000001;
    var cbData = auto.allocate(C_LONG);
    var cbHash = auto.allocate(PBYTE);
    var cbHashObjectPtr = auto.allocate(C_LONG);

    if (!NT_SUCCESS(
        status = BCryptOpenAlgorithmProvider(hAlgPtr, BCRYPT_SHA256_ALGORITHM(), NULL, 0))) {
      throw new IllegalArgumentException(
          "**** Error 0x%x returned by BCryptOpenAlgorithmProvider".formatted(status));
    }
    var hAlg = hAlgPtr.getAtIndex(ADDRESS, 0);
    if (!NT_SUCCESS(status = BCryptGetProperty(hAlg, BCRYPT_OBJECT_LENGTH(), cbHashObjectPtr,
        (int) DWORD.byteSize(), cbData, 0))) {
      throw new IllegalArgumentException(
          "**** Error 0x%x returned by BCryptGetProperty".formatted(status));
    }
    var cbHashObject = cbHashObjectPtr.getAtIndex(DWORD, 0);
    var pbHashObject = HeapAlloc(GetProcessHeap(), 0, cbHashObject);
    if (pbHashObject.equals(NULL)) {
      throw new RuntimeException("**** memory allocation failed");
    }
    if (!NT_SUCCESS(
        status = BCryptGetProperty(hAlg, BCRYPT_HASH_LENGTH(), cbHash, (int) DWORD.byteSize(),
            cbData, 0))) {
      throw new IllegalArgumentException(
          "**** Error 0x%x returned by BCryptGetProperty".formatted(status));
    }
    var pbHash = HeapAlloc(GetProcessHeap(), 0, cbHash.getAtIndex(C_LONG, 0));
    if (pbHash.equals(NULL)) {
      throw new RuntimeException("**** memory allocation failed");
    }
    if (!NT_SUCCESS(
        status = BCryptCreateHash(hAlg, hHashPtr, pbHashObject, cbHashObject, NULL, 0, 0))) {
      throw new IllegalArgumentException(
          "**** Error 0x%x returned by BCryptCreateHash".formatted(status));
    }
    var hHash = hHashPtr.getAtIndex(C_POINTER, 0);
    var a = auto.allocateFrom(str);
    if (!NT_SUCCESS(status = BCryptHashData(hHash, a, (int) (a.byteSize() - 1), 0))) {
      throw new IllegalArgumentException(
          "**** Error 0x%x returned by BCryptHashData".formatted(status));
    }
    if (!NT_SUCCESS(status = BCryptFinishHash(hHash, pbHash, cbHash.getAtIndex(C_LONG, 0), 0))) {
      throw new IllegalArgumentException(
          "**** Error 0x%x returned by BCryptFinishHash".formatted(status));
    }
    System.out.println("Success!");
    BCryptCloseAlgorithmProvider(hAlg, 0);
    BCryptDestroyHash(hHash);
    HeapFree(GetProcessHeap(), 0, pbHashObject);
    HeapFree(GetProcessHeap(), 0, pbHash);
  }

  static boolean NT_SUCCESS(int status) {
    return status >= 0;
  }
}
