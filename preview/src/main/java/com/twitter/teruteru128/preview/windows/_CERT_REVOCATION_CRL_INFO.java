// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_REVOCATION_CRL_INFO {
 *     DWORD cbSize;
 *     PCCRL_CONTEXT pBaseCrlContext;
 *     PCCRL_CONTEXT pDeltaCrlContext;
 *     PCRL_ENTRY pCrlEntry;
 *     BOOL fDeltaCrlEntry;
 * };
 * }
 */
public class _CERT_REVOCATION_CRL_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$2157.const$0;
    }
    public static VarHandle cbSize$VH() {
        return constants$2157.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$2157.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$2157.const$1.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$2157.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$2157.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pBaseCrlContext$VH() {
        return constants$2157.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCCRL_CONTEXT pBaseCrlContext;
     * }
     */
    public static MemorySegment pBaseCrlContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2157.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCCRL_CONTEXT pBaseCrlContext;
     * }
     */
    public static void pBaseCrlContext$set(MemorySegment seg, MemorySegment x) {
        constants$2157.const$2.set(seg, x);
    }
    public static MemorySegment pBaseCrlContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2157.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pBaseCrlContext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2157.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDeltaCrlContext$VH() {
        return constants$2157.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCCRL_CONTEXT pDeltaCrlContext;
     * }
     */
    public static MemorySegment pDeltaCrlContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2157.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCCRL_CONTEXT pDeltaCrlContext;
     * }
     */
    public static void pDeltaCrlContext$set(MemorySegment seg, MemorySegment x) {
        constants$2157.const$3.set(seg, x);
    }
    public static MemorySegment pDeltaCrlContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2157.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pDeltaCrlContext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2157.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pCrlEntry$VH() {
        return constants$2157.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCRL_ENTRY pCrlEntry;
     * }
     */
    public static MemorySegment pCrlEntry$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2157.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCRL_ENTRY pCrlEntry;
     * }
     */
    public static void pCrlEntry$set(MemorySegment seg, MemorySegment x) {
        constants$2157.const$4.set(seg, x);
    }
    public static MemorySegment pCrlEntry$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2157.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pCrlEntry$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2157.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fDeltaCrlEntry$VH() {
        return constants$2157.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL fDeltaCrlEntry;
     * }
     */
    public static int fDeltaCrlEntry$get(MemorySegment seg) {
        return (int)constants$2157.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL fDeltaCrlEntry;
     * }
     */
    public static void fDeltaCrlEntry$set(MemorySegment seg, int x) {
        constants$2157.const$5.set(seg, x);
    }
    public static int fDeltaCrlEntry$get(MemorySegment seg, long index) {
        return (int)constants$2157.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void fDeltaCrlEntry$set(MemorySegment seg, long index, int x) {
        constants$2157.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


