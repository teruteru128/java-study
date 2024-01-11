// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _HTTPSPolicyCallbackData {
 *     union {
 *         DWORD cbStruct;
 *         DWORD cbSize;
 *     };
 *     DWORD dwAuthType;
 *     DWORD fdwChecks;
 *     WCHAR* pwszServerName;
 * };
 * }
 */
public class _HTTPSPolicyCallbackData {

    public static MemoryLayout $LAYOUT() {
        return constants$2223.const$0;
    }
    public static VarHandle cbStruct$VH() {
        return constants$2223.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbStruct;
     * }
     */
    public static int cbStruct$get(MemorySegment seg) {
        return (int)constants$2223.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbStruct;
     * }
     */
    public static void cbStruct$set(MemorySegment seg, int x) {
        constants$2223.const$1.set(seg, x);
    }
    public static int cbStruct$get(MemorySegment seg, long index) {
        return (int)constants$2223.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cbStruct$set(MemorySegment seg, long index, int x) {
        constants$2223.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbSize$VH() {
        return constants$2223.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$2223.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$2223.const$2.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$2223.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$2223.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwAuthType$VH() {
        return constants$2223.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwAuthType;
     * }
     */
    public static int dwAuthType$get(MemorySegment seg) {
        return (int)constants$2223.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwAuthType;
     * }
     */
    public static void dwAuthType$set(MemorySegment seg, int x) {
        constants$2223.const$3.set(seg, x);
    }
    public static int dwAuthType$get(MemorySegment seg, long index) {
        return (int)constants$2223.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAuthType$set(MemorySegment seg, long index, int x) {
        constants$2223.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fdwChecks$VH() {
        return constants$2223.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD fdwChecks;
     * }
     */
    public static int fdwChecks$get(MemorySegment seg) {
        return (int)constants$2223.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD fdwChecks;
     * }
     */
    public static void fdwChecks$set(MemorySegment seg, int x) {
        constants$2223.const$4.set(seg, x);
    }
    public static int fdwChecks$get(MemorySegment seg, long index) {
        return (int)constants$2223.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void fdwChecks$set(MemorySegment seg, long index, int x) {
        constants$2223.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pwszServerName$VH() {
        return constants$2223.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WCHAR* pwszServerName;
     * }
     */
    public static MemorySegment pwszServerName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2223.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WCHAR* pwszServerName;
     * }
     */
    public static void pwszServerName$set(MemorySegment seg, MemorySegment x) {
        constants$2223.const$5.set(seg, x);
    }
    public static MemorySegment pwszServerName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2223.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszServerName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2223.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

