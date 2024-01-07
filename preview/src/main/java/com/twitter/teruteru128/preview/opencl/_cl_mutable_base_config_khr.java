// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _cl_mutable_base_config_khr {
 *     cl_command_buffer_structure_type_khr type;
 *     void* next;
 *     cl_uint num_mutable_dispatch;
 *     const cl_mutable_dispatch_config_khr* mutable_dispatch_list;
 * };
 * }
 */
public class _cl_mutable_base_config_khr {

    public static MemoryLayout $LAYOUT() {
        return constants$223.const$5;
    }
    public static VarHandle type$VH() {
        return constants$224.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_command_buffer_structure_type_khr type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$224.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_command_buffer_structure_type_khr type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$224.const$0.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$224.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$224.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle next$VH() {
        return constants$224.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* next;
     * }
     */
    public static MemorySegment next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$224.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* next;
     * }
     */
    public static void next$set(MemorySegment seg, MemorySegment x) {
        constants$224.const$1.set(seg, x);
    }
    public static MemorySegment next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$224.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemorySegment x) {
        constants$224.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle num_mutable_dispatch$VH() {
        return constants$224.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_uint num_mutable_dispatch;
     * }
     */
    public static int num_mutable_dispatch$get(MemorySegment seg) {
        return (int)constants$224.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_uint num_mutable_dispatch;
     * }
     */
    public static void num_mutable_dispatch$set(MemorySegment seg, int x) {
        constants$224.const$2.set(seg, x);
    }
    public static int num_mutable_dispatch$get(MemorySegment seg, long index) {
        return (int)constants$224.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void num_mutable_dispatch$set(MemorySegment seg, long index, int x) {
        constants$224.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle mutable_dispatch_list$VH() {
        return constants$224.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const cl_mutable_dispatch_config_khr* mutable_dispatch_list;
     * }
     */
    public static MemorySegment mutable_dispatch_list$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$224.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const cl_mutable_dispatch_config_khr* mutable_dispatch_list;
     * }
     */
    public static void mutable_dispatch_list$set(MemorySegment seg, MemorySegment x) {
        constants$224.const$3.set(seg, x);
    }
    public static MemorySegment mutable_dispatch_list$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$224.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void mutable_dispatch_list$set(MemorySegment seg, long index, MemorySegment x) {
        constants$224.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

