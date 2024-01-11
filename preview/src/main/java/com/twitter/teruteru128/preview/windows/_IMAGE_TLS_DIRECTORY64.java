// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_TLS_DIRECTORY64 {
 *     ULONGLONG StartAddressOfRawData;
 *     ULONGLONG EndAddressOfRawData;
 *     ULONGLONG AddressOfIndex;
 *     ULONGLONG AddressOfCallBacks;
 *     DWORD SizeOfZeroFill;
 *     union {
 *         DWORD Characteristics;
 *         struct {
 *              *             DWORD Reserved0;
 *             DWORD Alignment;
 *             DWORD Reserved1;
 *         };
 *     };
 * };
 * }
 */
public class _IMAGE_TLS_DIRECTORY64 {

    public static MemoryLayout $LAYOUT() {
        return constants$407.const$0;
    }
    public static VarHandle StartAddressOfRawData$VH() {
        return constants$407.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG StartAddressOfRawData;
     * }
     */
    public static long StartAddressOfRawData$get(MemorySegment seg) {
        return (long)constants$407.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG StartAddressOfRawData;
     * }
     */
    public static void StartAddressOfRawData$set(MemorySegment seg, long x) {
        constants$407.const$1.set(seg, x);
    }
    public static long StartAddressOfRawData$get(MemorySegment seg, long index) {
        return (long)constants$407.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void StartAddressOfRawData$set(MemorySegment seg, long index, long x) {
        constants$407.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle EndAddressOfRawData$VH() {
        return constants$407.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG EndAddressOfRawData;
     * }
     */
    public static long EndAddressOfRawData$get(MemorySegment seg) {
        return (long)constants$407.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG EndAddressOfRawData;
     * }
     */
    public static void EndAddressOfRawData$set(MemorySegment seg, long x) {
        constants$407.const$2.set(seg, x);
    }
    public static long EndAddressOfRawData$get(MemorySegment seg, long index) {
        return (long)constants$407.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void EndAddressOfRawData$set(MemorySegment seg, long index, long x) {
        constants$407.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle AddressOfIndex$VH() {
        return constants$407.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG AddressOfIndex;
     * }
     */
    public static long AddressOfIndex$get(MemorySegment seg) {
        return (long)constants$407.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG AddressOfIndex;
     * }
     */
    public static void AddressOfIndex$set(MemorySegment seg, long x) {
        constants$407.const$3.set(seg, x);
    }
    public static long AddressOfIndex$get(MemorySegment seg, long index) {
        return (long)constants$407.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void AddressOfIndex$set(MemorySegment seg, long index, long x) {
        constants$407.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle AddressOfCallBacks$VH() {
        return constants$407.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG AddressOfCallBacks;
     * }
     */
    public static long AddressOfCallBacks$get(MemorySegment seg) {
        return (long)constants$407.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG AddressOfCallBacks;
     * }
     */
    public static void AddressOfCallBacks$set(MemorySegment seg, long x) {
        constants$407.const$4.set(seg, x);
    }
    public static long AddressOfCallBacks$get(MemorySegment seg, long index) {
        return (long)constants$407.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void AddressOfCallBacks$set(MemorySegment seg, long index, long x) {
        constants$407.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SizeOfZeroFill$VH() {
        return constants$407.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SizeOfZeroFill;
     * }
     */
    public static int SizeOfZeroFill$get(MemorySegment seg) {
        return (int)constants$407.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SizeOfZeroFill;
     * }
     */
    public static void SizeOfZeroFill$set(MemorySegment seg, int x) {
        constants$407.const$5.set(seg, x);
    }
    public static int SizeOfZeroFill$get(MemorySegment seg, long index) {
        return (int)constants$407.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfZeroFill$set(MemorySegment seg, long index, int x) {
        constants$407.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Characteristics$VH() {
        return constants$408.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Characteristics;
     * }
     */
    public static int Characteristics$get(MemorySegment seg) {
        return (int)constants$408.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Characteristics;
     * }
     */
    public static void Characteristics$set(MemorySegment seg, int x) {
        constants$408.const$0.set(seg, x);
    }
    public static int Characteristics$get(MemorySegment seg, long index) {
        return (int)constants$408.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Characteristics$set(MemorySegment seg, long index, int x) {
        constants$408.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


