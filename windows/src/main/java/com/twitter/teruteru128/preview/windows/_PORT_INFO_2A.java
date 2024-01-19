// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PORT_INFO_2A {
 *     LPSTR pPortName;
 *     LPSTR pMonitorName;
 *     LPSTR pDescription;
 *     DWORD fPortType;
 *     DWORD Reserved;
 * };
 * }
 */
public class _PORT_INFO_2A {

    public static MemoryLayout $LAYOUT() {
        return constants$2898.const$1;
    }
    public static VarHandle pPortName$VH() {
        return constants$2898.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pPortName;
     * }
     */
    public static MemorySegment pPortName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2898.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pPortName;
     * }
     */
    public static void pPortName$set(MemorySegment seg, MemorySegment x) {
        constants$2898.const$2.set(seg, x);
    }
    public static MemorySegment pPortName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2898.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pPortName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2898.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pMonitorName$VH() {
        return constants$2898.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pMonitorName;
     * }
     */
    public static MemorySegment pMonitorName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2898.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pMonitorName;
     * }
     */
    public static void pMonitorName$set(MemorySegment seg, MemorySegment x) {
        constants$2898.const$3.set(seg, x);
    }
    public static MemorySegment pMonitorName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2898.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pMonitorName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2898.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDescription$VH() {
        return constants$2898.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pDescription;
     * }
     */
    public static MemorySegment pDescription$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2898.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pDescription;
     * }
     */
    public static void pDescription$set(MemorySegment seg, MemorySegment x) {
        constants$2898.const$4.set(seg, x);
    }
    public static MemorySegment pDescription$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2898.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pDescription$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2898.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fPortType$VH() {
        return constants$2898.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD fPortType;
     * }
     */
    public static int fPortType$get(MemorySegment seg) {
        return (int)constants$2898.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD fPortType;
     * }
     */
    public static void fPortType$set(MemorySegment seg, int x) {
        constants$2898.const$5.set(seg, x);
    }
    public static int fPortType$get(MemorySegment seg, long index) {
        return (int)constants$2898.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void fPortType$set(MemorySegment seg, long index, int x) {
        constants$2898.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Reserved$VH() {
        return constants$2899.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static int Reserved$get(MemorySegment seg) {
        return (int)constants$2899.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, int x) {
        constants$2899.const$0.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)constants$2899.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        constants$2899.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

