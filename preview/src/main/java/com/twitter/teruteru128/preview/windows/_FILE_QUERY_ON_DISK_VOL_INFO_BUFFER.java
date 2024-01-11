// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FILE_QUERY_ON_DISK_VOL_INFO_BUFFER {
 *     LARGE_INTEGER DirectoryCount;
 *     LARGE_INTEGER FileCount;
 *     WORD FsFormatMajVersion;
 *     WORD FsFormatMinVersion;
 *     WCHAR FsFormatName[12];
 *     LARGE_INTEGER FormatTime;
 *     LARGE_INTEGER LastUpdateTime;
 *     WCHAR CopyrightInfo[34];
 *     WCHAR AbstractInfo[34];
 *     WCHAR FormattingImplementationInfo[34];
 *     WCHAR LastModifyingImplementationInfo[34];
 * };
 * }
 */
public class _FILE_QUERY_ON_DISK_VOL_INFO_BUFFER {

    public static MemoryLayout $LAYOUT() {
        return constants$2644.const$5;
    }
    public static MemorySegment DirectoryCount$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment FileCount$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static VarHandle FsFormatMajVersion$VH() {
        return constants$2645.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD FsFormatMajVersion;
     * }
     */
    public static short FsFormatMajVersion$get(MemorySegment seg) {
        return (short)constants$2645.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD FsFormatMajVersion;
     * }
     */
    public static void FsFormatMajVersion$set(MemorySegment seg, short x) {
        constants$2645.const$0.set(seg, x);
    }
    public static short FsFormatMajVersion$get(MemorySegment seg, long index) {
        return (short)constants$2645.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void FsFormatMajVersion$set(MemorySegment seg, long index, short x) {
        constants$2645.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle FsFormatMinVersion$VH() {
        return constants$2645.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD FsFormatMinVersion;
     * }
     */
    public static short FsFormatMinVersion$get(MemorySegment seg) {
        return (short)constants$2645.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD FsFormatMinVersion;
     * }
     */
    public static void FsFormatMinVersion$set(MemorySegment seg, short x) {
        constants$2645.const$1.set(seg, x);
    }
    public static short FsFormatMinVersion$get(MemorySegment seg, long index) {
        return (short)constants$2645.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void FsFormatMinVersion$set(MemorySegment seg, long index, short x) {
        constants$2645.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FsFormatName$slice(MemorySegment seg) {
        return seg.asSlice(20, 24);
    }
    public static MemorySegment FormatTime$slice(MemorySegment seg) {
        return seg.asSlice(48, 8);
    }
    public static MemorySegment LastUpdateTime$slice(MemorySegment seg) {
        return seg.asSlice(56, 8);
    }
    public static MemorySegment CopyrightInfo$slice(MemorySegment seg) {
        return seg.asSlice(64, 68);
    }
    public static MemorySegment AbstractInfo$slice(MemorySegment seg) {
        return seg.asSlice(132, 68);
    }
    public static MemorySegment FormattingImplementationInfo$slice(MemorySegment seg) {
        return seg.asSlice(200, 68);
    }
    public static MemorySegment LastModifyingImplementationInfo$slice(MemorySegment seg) {
        return seg.asSlice(268, 68);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

