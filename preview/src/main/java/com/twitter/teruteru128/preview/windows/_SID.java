// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SID {
 *     BYTE Revision;
 *     BYTE SubAuthorityCount;
 *     SID_IDENTIFIER_AUTHORITY IdentifierAuthority;
 *     DWORD SubAuthority[1];
 * };
 * }
 */
public class _SID {

    public static MemoryLayout $LAYOUT() {
        return constants$140.const$4;
    }
    public static VarHandle Revision$VH() {
        return constants$140.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE Revision;
     * }
     */
    public static byte Revision$get(MemorySegment seg) {
        return (byte)constants$140.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE Revision;
     * }
     */
    public static void Revision$set(MemorySegment seg, byte x) {
        constants$140.const$5.set(seg, x);
    }
    public static byte Revision$get(MemorySegment seg, long index) {
        return (byte)constants$140.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Revision$set(MemorySegment seg, long index, byte x) {
        constants$140.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SubAuthorityCount$VH() {
        return constants$141.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE SubAuthorityCount;
     * }
     */
    public static byte SubAuthorityCount$get(MemorySegment seg) {
        return (byte)constants$141.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE SubAuthorityCount;
     * }
     */
    public static void SubAuthorityCount$set(MemorySegment seg, byte x) {
        constants$141.const$0.set(seg, x);
    }
    public static byte SubAuthorityCount$get(MemorySegment seg, long index) {
        return (byte)constants$141.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void SubAuthorityCount$set(MemorySegment seg, long index, byte x) {
        constants$141.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment IdentifierAuthority$slice(MemorySegment seg) {
        return seg.asSlice(2, 6);
    }
    public static MemorySegment SubAuthority$slice(MemorySegment seg) {
        return seg.asSlice(8, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


