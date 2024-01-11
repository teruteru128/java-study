// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     PRINT_EXECUTION_CONTEXT context;
 *     DWORD clientAppPID;
 * };
 * }
 */
public class PRINT_EXECUTION_DATA {

    public static MemoryLayout $LAYOUT() {
        return constants$2949.const$0;
    }
    public static VarHandle context$VH() {
        return constants$2949.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PRINT_EXECUTION_CONTEXT context;
     * }
     */
    public static int context$get(MemorySegment seg) {
        return (int)constants$2949.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PRINT_EXECUTION_CONTEXT context;
     * }
     */
    public static void context$set(MemorySegment seg, int x) {
        constants$2949.const$1.set(seg, x);
    }
    public static int context$get(MemorySegment seg, long index) {
        return (int)constants$2949.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void context$set(MemorySegment seg, long index, int x) {
        constants$2949.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle clientAppPID$VH() {
        return constants$2949.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD clientAppPID;
     * }
     */
    public static int clientAppPID$get(MemorySegment seg) {
        return (int)constants$2949.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD clientAppPID;
     * }
     */
    public static void clientAppPID$set(MemorySegment seg, int x) {
        constants$2949.const$2.set(seg, x);
    }
    public static int clientAppPID$get(MemorySegment seg, long index) {
        return (int)constants$2949.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void clientAppPID$set(MemorySegment seg, long index, int x) {
        constants$2949.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


