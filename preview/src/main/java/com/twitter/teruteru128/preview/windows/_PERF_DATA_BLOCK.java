// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PERF_DATA_BLOCK {
 *     WCHAR Signature[4];
 *     DWORD LittleEndian;
 *     DWORD Version;
 *     DWORD Revision;
 *     DWORD TotalByteLength;
 *     DWORD HeaderLength;
 *     DWORD NumObjectTypes;
 *     LONG DefaultObject;
 *     SYSTEMTIME SystemTime;
 *     LARGE_INTEGER PerfTime;
 *     LARGE_INTEGER PerfFreq;
 *     LARGE_INTEGER PerfTime100nSec;
 *     DWORD SystemNameLength;
 *     DWORD SystemNameOffset;
 * };
 * }
 */
public class _PERF_DATA_BLOCK {

    public static MemoryLayout $LAYOUT() {
        return constants$1889.const$1;
    }
    public static MemorySegment Signature$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static VarHandle LittleEndian$VH() {
        return constants$1889.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD LittleEndian;
     * }
     */
    public static int LittleEndian$get(MemorySegment seg) {
        return (int)constants$1889.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD LittleEndian;
     * }
     */
    public static void LittleEndian$set(MemorySegment seg, int x) {
        constants$1889.const$2.set(seg, x);
    }
    public static int LittleEndian$get(MemorySegment seg, long index) {
        return (int)constants$1889.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void LittleEndian$set(MemorySegment seg, long index, int x) {
        constants$1889.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Version$VH() {
        return constants$1889.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)constants$1889.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        constants$1889.const$3.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)constants$1889.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        constants$1889.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Revision$VH() {
        return constants$1889.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Revision;
     * }
     */
    public static int Revision$get(MemorySegment seg) {
        return (int)constants$1889.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Revision;
     * }
     */
    public static void Revision$set(MemorySegment seg, int x) {
        constants$1889.const$4.set(seg, x);
    }
    public static int Revision$get(MemorySegment seg, long index) {
        return (int)constants$1889.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Revision$set(MemorySegment seg, long index, int x) {
        constants$1889.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TotalByteLength$VH() {
        return constants$1889.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TotalByteLength;
     * }
     */
    public static int TotalByteLength$get(MemorySegment seg) {
        return (int)constants$1889.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TotalByteLength;
     * }
     */
    public static void TotalByteLength$set(MemorySegment seg, int x) {
        constants$1889.const$5.set(seg, x);
    }
    public static int TotalByteLength$get(MemorySegment seg, long index) {
        return (int)constants$1889.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalByteLength$set(MemorySegment seg, long index, int x) {
        constants$1889.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle HeaderLength$VH() {
        return constants$1890.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD HeaderLength;
     * }
     */
    public static int HeaderLength$get(MemorySegment seg) {
        return (int)constants$1890.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD HeaderLength;
     * }
     */
    public static void HeaderLength$set(MemorySegment seg, int x) {
        constants$1890.const$0.set(seg, x);
    }
    public static int HeaderLength$get(MemorySegment seg, long index) {
        return (int)constants$1890.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void HeaderLength$set(MemorySegment seg, long index, int x) {
        constants$1890.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NumObjectTypes$VH() {
        return constants$1890.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumObjectTypes;
     * }
     */
    public static int NumObjectTypes$get(MemorySegment seg) {
        return (int)constants$1890.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumObjectTypes;
     * }
     */
    public static void NumObjectTypes$set(MemorySegment seg, int x) {
        constants$1890.const$1.set(seg, x);
    }
    public static int NumObjectTypes$get(MemorySegment seg, long index) {
        return (int)constants$1890.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void NumObjectTypes$set(MemorySegment seg, long index, int x) {
        constants$1890.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DefaultObject$VH() {
        return constants$1890.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG DefaultObject;
     * }
     */
    public static int DefaultObject$get(MemorySegment seg) {
        return (int)constants$1890.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG DefaultObject;
     * }
     */
    public static void DefaultObject$set(MemorySegment seg, int x) {
        constants$1890.const$2.set(seg, x);
    }
    public static int DefaultObject$get(MemorySegment seg, long index) {
        return (int)constants$1890.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void DefaultObject$set(MemorySegment seg, long index, int x) {
        constants$1890.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment SystemTime$slice(MemorySegment seg) {
        return seg.asSlice(36, 16);
    }
    public static MemorySegment PerfTime$slice(MemorySegment seg) {
        return seg.asSlice(56, 8);
    }
    public static MemorySegment PerfFreq$slice(MemorySegment seg) {
        return seg.asSlice(64, 8);
    }
    public static MemorySegment PerfTime100nSec$slice(MemorySegment seg) {
        return seg.asSlice(72, 8);
    }
    public static VarHandle SystemNameLength$VH() {
        return constants$1890.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SystemNameLength;
     * }
     */
    public static int SystemNameLength$get(MemorySegment seg) {
        return (int)constants$1890.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SystemNameLength;
     * }
     */
    public static void SystemNameLength$set(MemorySegment seg, int x) {
        constants$1890.const$3.set(seg, x);
    }
    public static int SystemNameLength$get(MemorySegment seg, long index) {
        return (int)constants$1890.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void SystemNameLength$set(MemorySegment seg, long index, int x) {
        constants$1890.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SystemNameOffset$VH() {
        return constants$1890.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SystemNameOffset;
     * }
     */
    public static int SystemNameOffset$get(MemorySegment seg) {
        return (int)constants$1890.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SystemNameOffset;
     * }
     */
    public static void SystemNameOffset$set(MemorySegment seg, int x) {
        constants$1890.const$4.set(seg, x);
    }
    public static int SystemNameOffset$get(MemorySegment seg, long index) {
        return (int)constants$1890.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void SystemNameOffset$set(MemorySegment seg, long index, int x) {
        constants$1890.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


