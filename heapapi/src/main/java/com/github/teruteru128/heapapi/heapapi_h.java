package com.github.teruteru128.heapapi;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.Arrays;
import java.util.stream.Collectors;

public class heapapi_h {


  static final Arena LIBRARY_ARENA = Arena.ofAuto();
  static final boolean TRACE_DOWNCALLS = Boolean.getBoolean("jextract.trace.downcalls");

  static void traceDowncall(String name, Object... args) {
    String traceArgs = Arrays.stream(args)
        .map(Object::toString)
        .collect(Collectors.joining(", "));
    System.out.printf("%s(%s)\n", name, traceArgs);
  }

  static MemorySegment findOrThrow(String symbol) {
    return SYMBOL_LOOKUP.find(symbol)
        .orElseThrow(() -> new UnsatisfiedLinkError("unresolved symbol: " + symbol));
  }

  static final SymbolLookup SYMBOL_LOOKUP = SymbolLookup.libraryLookup("Kernel32", LIBRARY_ARENA)
      .or(SymbolLookup.loaderLookup())
      .or(Linker.nativeLinker().defaultLookup());

  public static final ValueLayout.OfBoolean C_BOOL = ValueLayout.JAVA_BOOLEAN;
  public static final ValueLayout.OfByte C_CHAR = ValueLayout.JAVA_BYTE;
  public static final ValueLayout.OfShort C_SHORT = ValueLayout.JAVA_SHORT;
  public static final ValueLayout.OfInt C_INT = ValueLayout.JAVA_INT;
  public static final ValueLayout.OfLong C_LONG_LONG = ValueLayout.JAVA_LONG;
  public static final ValueLayout.OfFloat C_FLOAT = ValueLayout.JAVA_FLOAT;
  public static final ValueLayout.OfDouble C_DOUBLE = ValueLayout.JAVA_DOUBLE;
  public static final AddressLayout C_POINTER = ValueLayout.ADDRESS
      .withTargetLayout(MemoryLayout.sequenceLayout(java.lang.Long.MAX_VALUE, JAVA_BYTE));
  public static final ValueLayout.OfInt C_LONG = ValueLayout.JAVA_INT;
  public static final ValueLayout.OfDouble C_LONG_DOUBLE = ValueLayout.JAVA_DOUBLE;

  private static class GetProcessHeap {
    public static final FunctionDescriptor DESC = FunctionDescriptor.of(
        heapapi_h.C_POINTER    );

    public static final MemorySegment ADDR = heapapi_h.findOrThrow("GetProcessHeap");

    public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
  }

  /**
   * Function descriptor for:
   * {@snippet lang=c :
   * HANDLE GetProcessHeap()
   * }
   */
  public static FunctionDescriptor GetProcessHeap$descriptor() {
    return GetProcessHeap.DESC;
  }

  /**
   * Downcall method handle for:
   * {@snippet lang=c :
   * HANDLE GetProcessHeap()
   * }
   */
  public static MethodHandle GetProcessHeap$handle() {
    return GetProcessHeap.HANDLE;
  }

  /**
   * Address for:
   * {@snippet lang=c :
   * HANDLE GetProcessHeap()
   * }
   */
  public static MemorySegment GetProcessHeap$address() {
    return GetProcessHeap.ADDR;
  }

  /**
   * {@snippet lang=c :
   * HANDLE GetProcessHeap()
   * }
   */
  public static MemorySegment GetProcessHeap() {
    var mh$ = GetProcessHeap.HANDLE;
    try {
      if (TRACE_DOWNCALLS) {
        traceDowncall("GetProcessHeap");
      }
      return (MemorySegment)mh$.invokeExact();
    } catch (Throwable ex$) {
      throw new AssertionError("should not reach here", ex$);
    }
  }

  private static class HeapAlloc {
    public static final FunctionDescriptor DESC = FunctionDescriptor.of(
        heapapi_h.C_POINTER,
        heapapi_h.C_POINTER,
        heapapi_h.C_LONG,
        heapapi_h.C_LONG_LONG
    );

    public static final MemorySegment ADDR = heapapi_h.findOrThrow("HeapAlloc");

    public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
  }

  /**
   * Function descriptor for:
   * {@snippet lang=c :
   * LPVOID HeapAlloc(HANDLE hHeap, DWORD dwFlags, SIZE_T dwBytes)
   * }
   */
  public static FunctionDescriptor HeapAlloc$descriptor() {
    return HeapAlloc.DESC;
  }

  /**
   * Downcall method handle for:
   * {@snippet lang=c :
   * LPVOID HeapAlloc(HANDLE hHeap, DWORD dwFlags, SIZE_T dwBytes)
   * }
   */
  public static MethodHandle HeapAlloc$handle() {
    return HeapAlloc.HANDLE;
  }

  /**
   * Address for:
   * {@snippet lang=c :
   * LPVOID HeapAlloc(HANDLE hHeap, DWORD dwFlags, SIZE_T dwBytes)
   * }
   */
  public static MemorySegment HeapAlloc$address() {
    return HeapAlloc.ADDR;
  }

  /**
   * {@snippet lang=c :
   * LPVOID HeapAlloc(HANDLE hHeap, DWORD dwFlags, SIZE_T dwBytes)
   * }
   */
  public static MemorySegment HeapAlloc(MemorySegment hHeap, int dwFlags, long dwBytes) {
    var mh$ = HeapAlloc.HANDLE;
    try {
      if (TRACE_DOWNCALLS) {
        traceDowncall("HeapAlloc", hHeap, dwFlags, dwBytes);
      }
      return (MemorySegment)mh$.invokeExact(hHeap, dwFlags, dwBytes);
    } catch (Throwable ex$) {
      throw new AssertionError("should not reach here", ex$);
    }
  }

  private static class HeapFree {
    public static final FunctionDescriptor DESC = FunctionDescriptor.of(
        heapapi_h.C_INT,
        heapapi_h.C_POINTER,
        heapapi_h.C_LONG,
        heapapi_h.C_POINTER
    );

    public static final MemorySegment ADDR = heapapi_h.findOrThrow("HeapFree");

    public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
  }

  /**
   * Function descriptor for:
   * {@snippet lang=c :
   * BOOL HeapFree(HANDLE hHeap, DWORD dwFlags, LPVOID lpMem)
   * }
   */
  public static FunctionDescriptor HeapFree$descriptor() {
    return HeapFree.DESC;
  }

  /**
   * Downcall method handle for:
   * {@snippet lang=c :
   * BOOL HeapFree(HANDLE hHeap, DWORD dwFlags, LPVOID lpMem)
   * }
   */
  public static MethodHandle HeapFree$handle() {
    return HeapFree.HANDLE;
  }

  /**
   * Address for:
   * {@snippet lang=c :
   * BOOL HeapFree(HANDLE hHeap, DWORD dwFlags, LPVOID lpMem)
   * }
   */
  public static MemorySegment HeapFree$address() {
    return HeapFree.ADDR;
  }

  /**
   * {@snippet lang=c :
   * BOOL HeapFree(HANDLE hHeap, DWORD dwFlags, LPVOID lpMem)
   * }
   */
  public static int HeapFree(MemorySegment hHeap, int dwFlags, MemorySegment lpMem) {
    var mh$ = HeapFree.HANDLE;
    try {
      if (TRACE_DOWNCALLS) {
        traceDowncall("HeapFree", hHeap, dwFlags, lpMem);
      }
      return (int)mh$.invokeExact(hHeap, dwFlags, lpMem);
    } catch (Throwable ex$) {
      throw new AssertionError("should not reach here", ex$);
    }
  }
}
