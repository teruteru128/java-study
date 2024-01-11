// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _EVENTSFORLOGFILE {
 *     DWORD ulSize;
 *     WCHAR szLogicalLogFile[256];
 *     DWORD ulNumRecords;
 *     EVENTLOGRECORD pEventLogRecords[];
 * };
 * }
 */
public class _EVENTSFORLOGFILE {

    public static MemoryLayout $LAYOUT() {
        return constants$512.const$2;
    }
    public static VarHandle ulSize$VH() {
        return constants$512.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ulSize;
     * }
     */
    public static int ulSize$get(MemorySegment seg) {
        return (int)constants$512.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ulSize;
     * }
     */
    public static void ulSize$set(MemorySegment seg, int x) {
        constants$512.const$3.set(seg, x);
    }
    public static int ulSize$get(MemorySegment seg, long index) {
        return (int)constants$512.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ulSize$set(MemorySegment seg, long index, int x) {
        constants$512.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szLogicalLogFile$slice(MemorySegment seg) {
        return seg.asSlice(4, 512);
    }
    public static VarHandle ulNumRecords$VH() {
        return constants$512.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ulNumRecords;
     * }
     */
    public static int ulNumRecords$get(MemorySegment seg) {
        return (int)constants$512.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ulNumRecords;
     * }
     */
    public static void ulNumRecords$set(MemorySegment seg, int x) {
        constants$512.const$4.set(seg, x);
    }
    public static int ulNumRecords$get(MemorySegment seg, long index) {
        return (int)constants$512.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ulNumRecords$set(MemorySegment seg, long index, int x) {
        constants$512.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


