// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SECURITY_CAPABILITIES {
 *     PSID AppContainerSid;
 *     PSID_AND_ATTRIBUTES Capabilities;
 *     DWORD CapabilityCount;
 *     DWORD Reserved;
 * };
 * }
 */
public class _SECURITY_CAPABILITIES {

    public static MemoryLayout $LAYOUT() {
        return constants$182.const$0;
    }
    public static VarHandle AppContainerSid$VH() {
        return constants$182.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PSID AppContainerSid;
     * }
     */
    public static MemorySegment AppContainerSid$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$182.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PSID AppContainerSid;
     * }
     */
    public static void AppContainerSid$set(MemorySegment seg, MemorySegment x) {
        constants$182.const$1.set(seg, x);
    }
    public static MemorySegment AppContainerSid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$182.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void AppContainerSid$set(MemorySegment seg, long index, MemorySegment x) {
        constants$182.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Capabilities$VH() {
        return constants$182.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PSID_AND_ATTRIBUTES Capabilities;
     * }
     */
    public static MemorySegment Capabilities$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$182.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PSID_AND_ATTRIBUTES Capabilities;
     * }
     */
    public static void Capabilities$set(MemorySegment seg, MemorySegment x) {
        constants$182.const$2.set(seg, x);
    }
    public static MemorySegment Capabilities$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$182.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Capabilities$set(MemorySegment seg, long index, MemorySegment x) {
        constants$182.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle CapabilityCount$VH() {
        return constants$182.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD CapabilityCount;
     * }
     */
    public static int CapabilityCount$get(MemorySegment seg) {
        return (int)constants$182.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD CapabilityCount;
     * }
     */
    public static void CapabilityCount$set(MemorySegment seg, int x) {
        constants$182.const$3.set(seg, x);
    }
    public static int CapabilityCount$get(MemorySegment seg, long index) {
        return (int)constants$182.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void CapabilityCount$set(MemorySegment seg, long index, int x) {
        constants$182.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Reserved$VH() {
        return constants$182.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static int Reserved$get(MemorySegment seg) {
        return (int)constants$182.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, int x) {
        constants$182.const$4.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)constants$182.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        constants$182.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


