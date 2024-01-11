// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_OID_INFO {
 *     DWORD cbSize;
 *     LPCSTR pszOID;
 *     LPCWSTR pwszName;
 *     DWORD dwGroupId;
 *     union {
 *         DWORD dwValue;
 *         ALG_ID Algid;
 *         DWORD dwLength;
 *     };
 *     CRYPT_DATA_BLOB ExtraInfo;
 * };
 * }
 */
public class _CRYPT_OID_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$2075.const$2;
    }
    public static VarHandle cbSize$VH() {
        return constants$2075.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$2075.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$2075.const$3.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$2075.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$2075.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pszOID$VH() {
        return constants$2075.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR pszOID;
     * }
     */
    public static MemorySegment pszOID$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2075.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR pszOID;
     * }
     */
    public static void pszOID$set(MemorySegment seg, MemorySegment x) {
        constants$2075.const$4.set(seg, x);
    }
    public static MemorySegment pszOID$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2075.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pszOID$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2075.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pwszName$VH() {
        return constants$2075.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR pwszName;
     * }
     */
    public static MemorySegment pwszName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2075.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR pwszName;
     * }
     */
    public static void pwszName$set(MemorySegment seg, MemorySegment x) {
        constants$2075.const$5.set(seg, x);
    }
    public static MemorySegment pwszName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2075.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2075.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwGroupId$VH() {
        return constants$2076.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwGroupId;
     * }
     */
    public static int dwGroupId$get(MemorySegment seg) {
        return (int)constants$2076.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwGroupId;
     * }
     */
    public static void dwGroupId$set(MemorySegment seg, int x) {
        constants$2076.const$0.set(seg, x);
    }
    public static int dwGroupId$get(MemorySegment seg, long index) {
        return (int)constants$2076.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwGroupId$set(MemorySegment seg, long index, int x) {
        constants$2076.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwValue$VH() {
        return constants$2076.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwValue;
     * }
     */
    public static int dwValue$get(MemorySegment seg) {
        return (int)constants$2076.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwValue;
     * }
     */
    public static void dwValue$set(MemorySegment seg, int x) {
        constants$2076.const$1.set(seg, x);
    }
    public static int dwValue$get(MemorySegment seg, long index) {
        return (int)constants$2076.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwValue$set(MemorySegment seg, long index, int x) {
        constants$2076.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Algid$VH() {
        return constants$2076.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ALG_ID Algid;
     * }
     */
    public static int Algid$get(MemorySegment seg) {
        return (int)constants$2076.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ALG_ID Algid;
     * }
     */
    public static void Algid$set(MemorySegment seg, int x) {
        constants$2076.const$2.set(seg, x);
    }
    public static int Algid$get(MemorySegment seg, long index) {
        return (int)constants$2076.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Algid$set(MemorySegment seg, long index, int x) {
        constants$2076.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwLength$VH() {
        return constants$2076.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwLength;
     * }
     */
    public static int dwLength$get(MemorySegment seg) {
        return (int)constants$2076.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwLength;
     * }
     */
    public static void dwLength$set(MemorySegment seg, int x) {
        constants$2076.const$3.set(seg, x);
    }
    public static int dwLength$get(MemorySegment seg, long index) {
        return (int)constants$2076.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLength$set(MemorySegment seg, long index, int x) {
        constants$2076.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ExtraInfo$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

