// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union _DISPATCHER_CONTEXT_NONVOLREG_ARM64 {
 *     BYTE Buffer[152];
 *     struct {
 *         DWORD64 GpNvRegs[11];
 *         double FpNvRegs[8];
 *     };
 * };
 * }
 */
public class _DISPATCHER_CONTEXT_NONVOLREG_ARM64 {

    public static MemoryLayout $LAYOUT() {
        return constants$121.const$0;
    }
    public static MemorySegment Buffer$slice(MemorySegment seg) {
        return seg.asSlice(0, 152);
    }
    public static MemorySegment GpNvRegs$slice(MemorySegment seg) {
        return seg.asSlice(0, 88);
    }
    public static MemorySegment FpNvRegs$slice(MemorySegment seg) {
        return seg.asSlice(88, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

