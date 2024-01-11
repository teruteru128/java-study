// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _QUERY_FILE_LAYOUT_OUTPUT {
 *     DWORD FileEntryCount;
 *     DWORD FirstFileOffset;
 *     DWORD Flags;
 *     DWORD Reserved;
 * };
 * }
 */
public class _QUERY_FILE_LAYOUT_OUTPUT {

    public static MemoryLayout $LAYOUT() {
        return constants$2691.const$2;
    }
    public static VarHandle FileEntryCount$VH() {
        return constants$2691.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD FileEntryCount;
     * }
     */
    public static int FileEntryCount$get(MemorySegment seg) {
        return (int)constants$2691.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD FileEntryCount;
     * }
     */
    public static void FileEntryCount$set(MemorySegment seg, int x) {
        constants$2691.const$3.set(seg, x);
    }
    public static int FileEntryCount$get(MemorySegment seg, long index) {
        return (int)constants$2691.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void FileEntryCount$set(MemorySegment seg, long index, int x) {
        constants$2691.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle FirstFileOffset$VH() {
        return constants$2691.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD FirstFileOffset;
     * }
     */
    public static int FirstFileOffset$get(MemorySegment seg) {
        return (int)constants$2691.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD FirstFileOffset;
     * }
     */
    public static void FirstFileOffset$set(MemorySegment seg, int x) {
        constants$2691.const$4.set(seg, x);
    }
    public static int FirstFileOffset$get(MemorySegment seg, long index) {
        return (int)constants$2691.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void FirstFileOffset$set(MemorySegment seg, long index, int x) {
        constants$2691.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Flags$VH() {
        return constants$2691.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$2691.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$2691.const$5.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$2691.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$2691.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Reserved$VH() {
        return constants$2692.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static int Reserved$get(MemorySegment seg) {
        return (int)constants$2692.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, int x) {
        constants$2692.const$0.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)constants$2692.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        constants$2692.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


