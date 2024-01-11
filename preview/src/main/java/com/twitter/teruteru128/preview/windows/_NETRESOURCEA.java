// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _NETRESOURCEA {
 *     DWORD dwScope;
 *     DWORD dwType;
 *     DWORD dwDisplayType;
 *     DWORD dwUsage;
 *     LPSTR lpLocalName;
 *     LPSTR lpRemoteName;
 *     LPSTR lpComment;
 *     LPSTR lpProvider;
 * };
 * }
 */
public class _NETRESOURCEA {

    public static MemoryLayout $LAYOUT() {
        return constants$1502.const$0;
    }
    public static VarHandle dwScope$VH() {
        return constants$1502.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwScope;
     * }
     */
    public static int dwScope$get(MemorySegment seg) {
        return (int)constants$1502.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwScope;
     * }
     */
    public static void dwScope$set(MemorySegment seg, int x) {
        constants$1502.const$1.set(seg, x);
    }
    public static int dwScope$get(MemorySegment seg, long index) {
        return (int)constants$1502.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwScope$set(MemorySegment seg, long index, int x) {
        constants$1502.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwType$VH() {
        return constants$1502.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwType;
     * }
     */
    public static int dwType$get(MemorySegment seg) {
        return (int)constants$1502.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwType;
     * }
     */
    public static void dwType$set(MemorySegment seg, int x) {
        constants$1502.const$2.set(seg, x);
    }
    public static int dwType$get(MemorySegment seg, long index) {
        return (int)constants$1502.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwType$set(MemorySegment seg, long index, int x) {
        constants$1502.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwDisplayType$VH() {
        return constants$1502.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwDisplayType;
     * }
     */
    public static int dwDisplayType$get(MemorySegment seg) {
        return (int)constants$1502.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwDisplayType;
     * }
     */
    public static void dwDisplayType$set(MemorySegment seg, int x) {
        constants$1502.const$3.set(seg, x);
    }
    public static int dwDisplayType$get(MemorySegment seg, long index) {
        return (int)constants$1502.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDisplayType$set(MemorySegment seg, long index, int x) {
        constants$1502.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwUsage$VH() {
        return constants$1502.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwUsage;
     * }
     */
    public static int dwUsage$get(MemorySegment seg) {
        return (int)constants$1502.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwUsage;
     * }
     */
    public static void dwUsage$set(MemorySegment seg, int x) {
        constants$1502.const$4.set(seg, x);
    }
    public static int dwUsage$get(MemorySegment seg, long index) {
        return (int)constants$1502.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwUsage$set(MemorySegment seg, long index, int x) {
        constants$1502.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpLocalName$VH() {
        return constants$1502.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpLocalName;
     * }
     */
    public static MemorySegment lpLocalName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1502.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpLocalName;
     * }
     */
    public static void lpLocalName$set(MemorySegment seg, MemorySegment x) {
        constants$1502.const$5.set(seg, x);
    }
    public static MemorySegment lpLocalName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1502.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void lpLocalName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1502.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpRemoteName$VH() {
        return constants$1503.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpRemoteName;
     * }
     */
    public static MemorySegment lpRemoteName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1503.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpRemoteName;
     * }
     */
    public static void lpRemoteName$set(MemorySegment seg, MemorySegment x) {
        constants$1503.const$0.set(seg, x);
    }
    public static MemorySegment lpRemoteName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1503.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lpRemoteName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1503.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpComment$VH() {
        return constants$1503.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpComment;
     * }
     */
    public static MemorySegment lpComment$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1503.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpComment;
     * }
     */
    public static void lpComment$set(MemorySegment seg, MemorySegment x) {
        constants$1503.const$1.set(seg, x);
    }
    public static MemorySegment lpComment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1503.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void lpComment$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1503.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpProvider$VH() {
        return constants$1503.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpProvider;
     * }
     */
    public static MemorySegment lpProvider$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1503.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpProvider;
     * }
     */
    public static void lpProvider$set(MemorySegment seg, MemorySegment x) {
        constants$1503.const$2.set(seg, x);
    }
    public static MemorySegment lpProvider$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1503.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void lpProvider$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1503.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

