// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMCI_SYSINFO_PARMSW {
 *     DWORD_PTR dwCallback;
 *     LPWSTR lpstrReturn;
 *     DWORD dwRetSize;
 *     DWORD dwNumber;
 *     UINT wDeviceType;
 * };
 * }
 */
public class tagMCI_SYSINFO_PARMSW {

    public static MemoryLayout $LAYOUT() {
        return constants$1564.const$0;
    }
    public static VarHandle dwCallback$VH() {
        return constants$1564.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD_PTR dwCallback;
     * }
     */
    public static long dwCallback$get(MemorySegment seg) {
        return (long)constants$1564.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD_PTR dwCallback;
     * }
     */
    public static void dwCallback$set(MemorySegment seg, long x) {
        constants$1564.const$1.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)constants$1564.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        constants$1564.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpstrReturn$VH() {
        return constants$1564.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR lpstrReturn;
     * }
     */
    public static MemorySegment lpstrReturn$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1564.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR lpstrReturn;
     * }
     */
    public static void lpstrReturn$set(MemorySegment seg, MemorySegment x) {
        constants$1564.const$2.set(seg, x);
    }
    public static MemorySegment lpstrReturn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1564.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrReturn$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1564.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwRetSize$VH() {
        return constants$1564.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwRetSize;
     * }
     */
    public static int dwRetSize$get(MemorySegment seg) {
        return (int)constants$1564.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwRetSize;
     * }
     */
    public static void dwRetSize$set(MemorySegment seg, int x) {
        constants$1564.const$3.set(seg, x);
    }
    public static int dwRetSize$get(MemorySegment seg, long index) {
        return (int)constants$1564.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRetSize$set(MemorySegment seg, long index, int x) {
        constants$1564.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwNumber$VH() {
        return constants$1564.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwNumber;
     * }
     */
    public static int dwNumber$get(MemorySegment seg) {
        return (int)constants$1564.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwNumber;
     * }
     */
    public static void dwNumber$set(MemorySegment seg, int x) {
        constants$1564.const$4.set(seg, x);
    }
    public static int dwNumber$get(MemorySegment seg, long index) {
        return (int)constants$1564.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumber$set(MemorySegment seg, long index, int x) {
        constants$1564.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wDeviceType$VH() {
        return constants$1564.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wDeviceType;
     * }
     */
    public static int wDeviceType$get(MemorySegment seg) {
        return (int)constants$1564.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wDeviceType;
     * }
     */
    public static void wDeviceType$set(MemorySegment seg, int x) {
        constants$1564.const$5.set(seg, x);
    }
    public static int wDeviceType$get(MemorySegment seg, long index) {
        return (int)constants$1564.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void wDeviceType$set(MemorySegment seg, long index, int x) {
        constants$1564.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

