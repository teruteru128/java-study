// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ANON_OBJECT_HEADER_V2 {
 *     WORD Sig1;
 *     WORD Sig2;
 *     WORD Version;
 *     WORD Machine;
 *     DWORD TimeDateStamp;
 *     CLSID ClassID;
 *     DWORD SizeOfData;
 *     DWORD Flags;
 *     DWORD MetaDataSize;
 *     DWORD MetaDataOffset;
 * };
 * }
 */
public class ANON_OBJECT_HEADER_V2 {

    public static MemoryLayout $LAYOUT() {
        return constants$383.const$2;
    }
    public static VarHandle Sig1$VH() {
        return constants$383.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Sig1;
     * }
     */
    public static short Sig1$get(MemorySegment seg) {
        return (short)constants$383.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Sig1;
     * }
     */
    public static void Sig1$set(MemorySegment seg, short x) {
        constants$383.const$3.set(seg, x);
    }
    public static short Sig1$get(MemorySegment seg, long index) {
        return (short)constants$383.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Sig1$set(MemorySegment seg, long index, short x) {
        constants$383.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Sig2$VH() {
        return constants$383.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Sig2;
     * }
     */
    public static short Sig2$get(MemorySegment seg) {
        return (short)constants$383.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Sig2;
     * }
     */
    public static void Sig2$set(MemorySegment seg, short x) {
        constants$383.const$4.set(seg, x);
    }
    public static short Sig2$get(MemorySegment seg, long index) {
        return (short)constants$383.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Sig2$set(MemorySegment seg, long index, short x) {
        constants$383.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Version$VH() {
        return constants$383.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Version;
     * }
     */
    public static short Version$get(MemorySegment seg) {
        return (short)constants$383.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, short x) {
        constants$383.const$5.set(seg, x);
    }
    public static short Version$get(MemorySegment seg, long index) {
        return (short)constants$383.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, short x) {
        constants$383.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Machine$VH() {
        return constants$384.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Machine;
     * }
     */
    public static short Machine$get(MemorySegment seg) {
        return (short)constants$384.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Machine;
     * }
     */
    public static void Machine$set(MemorySegment seg, short x) {
        constants$384.const$0.set(seg, x);
    }
    public static short Machine$get(MemorySegment seg, long index) {
        return (short)constants$384.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Machine$set(MemorySegment seg, long index, short x) {
        constants$384.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TimeDateStamp$VH() {
        return constants$384.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static int TimeDateStamp$get(MemorySegment seg) {
        return (int)constants$384.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static void TimeDateStamp$set(MemorySegment seg, int x) {
        constants$384.const$1.set(seg, x);
    }
    public static int TimeDateStamp$get(MemorySegment seg, long index) {
        return (int)constants$384.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeDateStamp$set(MemorySegment seg, long index, int x) {
        constants$384.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ClassID$slice(MemorySegment seg) {
        return seg.asSlice(12, 16);
    }
    public static VarHandle SizeOfData$VH() {
        return constants$384.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SizeOfData;
     * }
     */
    public static int SizeOfData$get(MemorySegment seg) {
        return (int)constants$384.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SizeOfData;
     * }
     */
    public static void SizeOfData$set(MemorySegment seg, int x) {
        constants$384.const$2.set(seg, x);
    }
    public static int SizeOfData$get(MemorySegment seg, long index) {
        return (int)constants$384.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfData$set(MemorySegment seg, long index, int x) {
        constants$384.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Flags$VH() {
        return constants$384.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$384.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$384.const$3.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$384.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$384.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MetaDataSize$VH() {
        return constants$384.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MetaDataSize;
     * }
     */
    public static int MetaDataSize$get(MemorySegment seg) {
        return (int)constants$384.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MetaDataSize;
     * }
     */
    public static void MetaDataSize$set(MemorySegment seg, int x) {
        constants$384.const$4.set(seg, x);
    }
    public static int MetaDataSize$get(MemorySegment seg, long index) {
        return (int)constants$384.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataSize$set(MemorySegment seg, long index, int x) {
        constants$384.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MetaDataOffset$VH() {
        return constants$384.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MetaDataOffset;
     * }
     */
    public static int MetaDataOffset$get(MemorySegment seg) {
        return (int)constants$384.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MetaDataOffset;
     * }
     */
    public static void MetaDataOffset$set(MemorySegment seg, int x) {
        constants$384.const$5.set(seg, x);
    }
    public static int MetaDataOffset$get(MemorySegment seg, long index) {
        return (int)constants$384.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataOffset$set(MemorySegment seg, long index, int x) {
        constants$384.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


