// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STREAM_LAYOUT_ENTRY {
 *     DWORD Version;
 *     DWORD NextStreamOffset;
 *     DWORD Flags;
 *     DWORD ExtentInformationOffset;
 *     LARGE_INTEGER AllocationSize;
 *     LARGE_INTEGER EndOfFile;
 *     DWORD StreamInformationOffset;
 *     DWORD AttributeTypeCode;
 *     DWORD AttributeFlags;
 *     DWORD StreamIdentifierLength;
 *     WCHAR StreamIdentifier[1];
 * };
 * }
 */
public class _STREAM_LAYOUT_ENTRY {

    public static MemoryLayout $LAYOUT() {
        return constants$2696.const$0;
    }
    public static VarHandle Version$VH() {
        return constants$2696.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)constants$2696.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        constants$2696.const$1.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)constants$2696.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        constants$2696.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NextStreamOffset$VH() {
        return constants$2696.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NextStreamOffset;
     * }
     */
    public static int NextStreamOffset$get(MemorySegment seg) {
        return (int)constants$2696.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NextStreamOffset;
     * }
     */
    public static void NextStreamOffset$set(MemorySegment seg, int x) {
        constants$2696.const$2.set(seg, x);
    }
    public static int NextStreamOffset$get(MemorySegment seg, long index) {
        return (int)constants$2696.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void NextStreamOffset$set(MemorySegment seg, long index, int x) {
        constants$2696.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Flags$VH() {
        return constants$2696.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$2696.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$2696.const$3.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$2696.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$2696.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ExtentInformationOffset$VH() {
        return constants$2696.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ExtentInformationOffset;
     * }
     */
    public static int ExtentInformationOffset$get(MemorySegment seg) {
        return (int)constants$2696.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ExtentInformationOffset;
     * }
     */
    public static void ExtentInformationOffset$set(MemorySegment seg, int x) {
        constants$2696.const$4.set(seg, x);
    }
    public static int ExtentInformationOffset$get(MemorySegment seg, long index) {
        return (int)constants$2696.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ExtentInformationOffset$set(MemorySegment seg, long index, int x) {
        constants$2696.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment AllocationSize$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment EndOfFile$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static VarHandle StreamInformationOffset$VH() {
        return constants$2696.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD StreamInformationOffset;
     * }
     */
    public static int StreamInformationOffset$get(MemorySegment seg) {
        return (int)constants$2696.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD StreamInformationOffset;
     * }
     */
    public static void StreamInformationOffset$set(MemorySegment seg, int x) {
        constants$2696.const$5.set(seg, x);
    }
    public static int StreamInformationOffset$get(MemorySegment seg, long index) {
        return (int)constants$2696.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void StreamInformationOffset$set(MemorySegment seg, long index, int x) {
        constants$2696.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle AttributeTypeCode$VH() {
        return constants$2697.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD AttributeTypeCode;
     * }
     */
    public static int AttributeTypeCode$get(MemorySegment seg) {
        return (int)constants$2697.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD AttributeTypeCode;
     * }
     */
    public static void AttributeTypeCode$set(MemorySegment seg, int x) {
        constants$2697.const$0.set(seg, x);
    }
    public static int AttributeTypeCode$get(MemorySegment seg, long index) {
        return (int)constants$2697.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void AttributeTypeCode$set(MemorySegment seg, long index, int x) {
        constants$2697.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle AttributeFlags$VH() {
        return constants$2697.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD AttributeFlags;
     * }
     */
    public static int AttributeFlags$get(MemorySegment seg) {
        return (int)constants$2697.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD AttributeFlags;
     * }
     */
    public static void AttributeFlags$set(MemorySegment seg, int x) {
        constants$2697.const$1.set(seg, x);
    }
    public static int AttributeFlags$get(MemorySegment seg, long index) {
        return (int)constants$2697.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void AttributeFlags$set(MemorySegment seg, long index, int x) {
        constants$2697.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle StreamIdentifierLength$VH() {
        return constants$2697.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD StreamIdentifierLength;
     * }
     */
    public static int StreamIdentifierLength$get(MemorySegment seg) {
        return (int)constants$2697.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD StreamIdentifierLength;
     * }
     */
    public static void StreamIdentifierLength$set(MemorySegment seg, int x) {
        constants$2697.const$2.set(seg, x);
    }
    public static int StreamIdentifierLength$get(MemorySegment seg, long index) {
        return (int)constants$2697.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void StreamIdentifierLength$set(MemorySegment seg, long index, int x) {
        constants$2697.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment StreamIdentifier$slice(MemorySegment seg) {
        return seg.asSlice(48, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

