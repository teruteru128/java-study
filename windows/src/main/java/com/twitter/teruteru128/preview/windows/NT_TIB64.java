// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef struct _NT_TIB64 {
 *     DWORD64 ExceptionList;
 *     DWORD64 StackBase;
 *     DWORD64 StackLimit;
 *     DWORD64 SubSystemTib;
 *     union {
 *         DWORD64 FiberData;
 *         DWORD Version;
 *     };
 *     DWORD64 ArbitraryUserPointer;
 *     DWORD64 Self;
 * } NT_TIB64
 * }
 */
public class NT_TIB64 extends _NT_TIB64 {

    NT_TIB64() {
        // Should not be called directly
    }
}

