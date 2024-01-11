// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagEXCEPINFO {
 *     WORD wCode;
 *     WORD wReserved;
 *     BSTR bstrSource;
 *     BSTR bstrDescription;
 *     BSTR bstrHelpFile;
 *     DWORD dwHelpContext;
 *     PVOID pvReserved;
 *     HRESULT (*pfnDeferredFillIn)(struct tagEXCEPINFO*);
 *     SCODE scode;
 * };
 * }
 */
public class tagEXCEPINFO {

    public static MemoryLayout $LAYOUT() {
        return constants$3438.const$4;
    }
    public static VarHandle wCode$VH() {
        return constants$3438.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wCode;
     * }
     */
    public static short wCode$get(MemorySegment seg) {
        return (short)constants$3438.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wCode;
     * }
     */
    public static void wCode$set(MemorySegment seg, short x) {
        constants$3438.const$5.set(seg, x);
    }
    public static short wCode$get(MemorySegment seg, long index) {
        return (short)constants$3438.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void wCode$set(MemorySegment seg, long index, short x) {
        constants$3438.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wReserved$VH() {
        return constants$3439.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wReserved;
     * }
     */
    public static short wReserved$get(MemorySegment seg) {
        return (short)constants$3439.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wReserved;
     * }
     */
    public static void wReserved$set(MemorySegment seg, short x) {
        constants$3439.const$0.set(seg, x);
    }
    public static short wReserved$get(MemorySegment seg, long index) {
        return (short)constants$3439.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved$set(MemorySegment seg, long index, short x) {
        constants$3439.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bstrSource$VH() {
        return constants$3439.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BSTR bstrSource;
     * }
     */
    public static MemorySegment bstrSource$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3439.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BSTR bstrSource;
     * }
     */
    public static void bstrSource$set(MemorySegment seg, MemorySegment x) {
        constants$3439.const$1.set(seg, x);
    }
    public static MemorySegment bstrSource$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3439.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void bstrSource$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3439.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bstrDescription$VH() {
        return constants$3439.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BSTR bstrDescription;
     * }
     */
    public static MemorySegment bstrDescription$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3439.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BSTR bstrDescription;
     * }
     */
    public static void bstrDescription$set(MemorySegment seg, MemorySegment x) {
        constants$3439.const$2.set(seg, x);
    }
    public static MemorySegment bstrDescription$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3439.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void bstrDescription$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3439.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bstrHelpFile$VH() {
        return constants$3439.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BSTR bstrHelpFile;
     * }
     */
    public static MemorySegment bstrHelpFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3439.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BSTR bstrHelpFile;
     * }
     */
    public static void bstrHelpFile$set(MemorySegment seg, MemorySegment x) {
        constants$3439.const$3.set(seg, x);
    }
    public static MemorySegment bstrHelpFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3439.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void bstrHelpFile$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3439.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwHelpContext$VH() {
        return constants$3439.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwHelpContext;
     * }
     */
    public static int dwHelpContext$get(MemorySegment seg) {
        return (int)constants$3439.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwHelpContext;
     * }
     */
    public static void dwHelpContext$set(MemorySegment seg, int x) {
        constants$3439.const$4.set(seg, x);
    }
    public static int dwHelpContext$get(MemorySegment seg, long index) {
        return (int)constants$3439.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwHelpContext$set(MemorySegment seg, long index, int x) {
        constants$3439.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pvReserved$VH() {
        return constants$3439.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID pvReserved;
     * }
     */
    public static MemorySegment pvReserved$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3439.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID pvReserved;
     * }
     */
    public static void pvReserved$set(MemorySegment seg, MemorySegment x) {
        constants$3439.const$5.set(seg, x);
    }
    public static MemorySegment pvReserved$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3439.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pvReserved$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3439.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * HRESULT (*pfnDeferredFillIn)(struct tagEXCEPINFO*);
     * }
     */
    public interface pfnDeferredFillIn {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(pfnDeferredFillIn fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3440.const$0, fi, constants$18.const$5, scope);
        }
        static pfnDeferredFillIn ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)constants$495.const$0.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle pfnDeferredFillIn$VH() {
        return constants$3440.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*pfnDeferredFillIn)(struct tagEXCEPINFO*);
     * }
     */
    public static MemorySegment pfnDeferredFillIn$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3440.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*pfnDeferredFillIn)(struct tagEXCEPINFO*);
     * }
     */
    public static void pfnDeferredFillIn$set(MemorySegment seg, MemorySegment x) {
        constants$3440.const$1.set(seg, x);
    }
    public static MemorySegment pfnDeferredFillIn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3440.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnDeferredFillIn$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3440.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static pfnDeferredFillIn pfnDeferredFillIn(MemorySegment segment, Arena scope) {
        return pfnDeferredFillIn.ofAddress(pfnDeferredFillIn$get(segment), scope);
    }
    public static VarHandle scode$VH() {
        return constants$3440.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SCODE scode;
     * }
     */
    public static int scode$get(MemorySegment seg) {
        return (int)constants$3440.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SCODE scode;
     * }
     */
    public static void scode$set(MemorySegment seg, int x) {
        constants$3440.const$2.set(seg, x);
    }
    public static int scode$get(MemorySegment seg, long index) {
        return (int)constants$3440.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void scode$set(MemorySegment seg, long index, int x) {
        constants$3440.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


