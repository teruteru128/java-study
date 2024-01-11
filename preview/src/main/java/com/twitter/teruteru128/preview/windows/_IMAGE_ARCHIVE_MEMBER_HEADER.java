// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_ARCHIVE_MEMBER_HEADER {
 *     BYTE Name[16];
 *     BYTE Date[12];
 *     BYTE UserID[6];
 *     BYTE GroupID[6];
 *     BYTE Mode[8];
 *     BYTE Size[10];
 *     BYTE EndHeader[2];
 * };
 * }
 */
public class _IMAGE_ARCHIVE_MEMBER_HEADER {

    public static MemoryLayout $LAYOUT() {
        return constants$402.const$0;
    }
    public static MemorySegment Name$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment Date$slice(MemorySegment seg) {
        return seg.asSlice(16, 12);
    }
    public static MemorySegment UserID$slice(MemorySegment seg) {
        return seg.asSlice(28, 6);
    }
    public static MemorySegment GroupID$slice(MemorySegment seg) {
        return seg.asSlice(34, 6);
    }
    public static MemorySegment Mode$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    public static MemorySegment Size$slice(MemorySegment seg) {
        return seg.asSlice(48, 10);
    }
    public static MemorySegment EndHeader$slice(MemorySegment seg) {
        return seg.asSlice(58, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


