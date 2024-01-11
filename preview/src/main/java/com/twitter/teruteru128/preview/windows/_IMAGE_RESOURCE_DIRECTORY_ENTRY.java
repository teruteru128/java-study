// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_RESOURCE_DIRECTORY_ENTRY {
 *     union {
 *         struct {
 *              *             DWORD NameOffset;
 *             DWORD NameIsString;
 *         };
 *         DWORD Name;
 *         WORD Id;
 *     };
 *     union {
 *         DWORD OffsetToData;
 *         struct {
 *              *             DWORD OffsetToDirectory;
 *             DWORD DataIsDirectory;
 *         };
 *     };
 * };
 * }
 */
public class _IMAGE_RESOURCE_DIRECTORY_ENTRY {

    public static MemoryLayout $LAYOUT() {
        return constants$414.const$4;
    }
    public static VarHandle Name$VH() {
        return constants$414.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Name;
     * }
     */
    public static int Name$get(MemorySegment seg) {
        return (int)constants$414.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Name;
     * }
     */
    public static void Name$set(MemorySegment seg, int x) {
        constants$414.const$5.set(seg, x);
    }
    public static int Name$get(MemorySegment seg, long index) {
        return (int)constants$414.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Name$set(MemorySegment seg, long index, int x) {
        constants$414.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Id$VH() {
        return constants$415.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Id;
     * }
     */
    public static short Id$get(MemorySegment seg) {
        return (short)constants$415.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Id;
     * }
     */
    public static void Id$set(MemorySegment seg, short x) {
        constants$415.const$0.set(seg, x);
    }
    public static short Id$get(MemorySegment seg, long index) {
        return (short)constants$415.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Id$set(MemorySegment seg, long index, short x) {
        constants$415.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle OffsetToData$VH() {
        return constants$415.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD OffsetToData;
     * }
     */
    public static int OffsetToData$get(MemorySegment seg) {
        return (int)constants$415.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD OffsetToData;
     * }
     */
    public static void OffsetToData$set(MemorySegment seg, int x) {
        constants$415.const$1.set(seg, x);
    }
    public static int OffsetToData$get(MemorySegment seg, long index) {
        return (int)constants$415.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void OffsetToData$set(MemorySegment seg, long index, int x) {
        constants$415.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


