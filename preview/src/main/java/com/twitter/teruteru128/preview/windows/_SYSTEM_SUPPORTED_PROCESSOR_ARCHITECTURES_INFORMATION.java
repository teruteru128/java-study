// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SYSTEM_SUPPORTED_PROCESSOR_ARCHITECTURES_INFORMATION {
 *      *     DWORD Machine;
 *     DWORD KernelMode;
 *     DWORD UserMode;
 *     DWORD Native;
 *     DWORD Process;
 *     DWORD WoW64Container;
 *     DWORD ReservedZero0;
 * };
 * }
 */
public class _SYSTEM_SUPPORTED_PROCESSOR_ARCHITECTURES_INFORMATION {

    public static MemoryLayout $LAYOUT() {
        return constants$238.const$1;
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


