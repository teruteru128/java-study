// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagCONVINFO {
 *     DWORD cb;
 *     DWORD_PTR hUser;
 *     HCONV hConvPartner;
 *     HSZ hszSvcPartner;
 *     HSZ hszServiceReq;
 *     HSZ hszTopic;
 *     HSZ hszItem;
 *     UINT wFmt;
 *     UINT wType;
 *     UINT wStatus;
 *     UINT wConvst;
 *     UINT wLastError;
 *     HCONVLIST hConvList;
 *     CONVCONTEXT ConvCtxt;
 *     HWND hwnd;
 *     HWND hwndPartner;
 * };
 * }
 */
public class tagCONVINFO {

    public static MemoryLayout $LAYOUT() {
        return constants$1527.const$3;
    }
    public static VarHandle cb$VH() {
        return constants$1527.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cb;
     * }
     */
    public static int cb$get(MemorySegment seg) {
        return (int)constants$1527.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cb;
     * }
     */
    public static void cb$set(MemorySegment seg, int x) {
        constants$1527.const$4.set(seg, x);
    }
    public static int cb$get(MemorySegment seg, long index) {
        return (int)constants$1527.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cb$set(MemorySegment seg, long index, int x) {
        constants$1527.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hUser$VH() {
        return constants$1527.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD_PTR hUser;
     * }
     */
    public static long hUser$get(MemorySegment seg) {
        return (long)constants$1527.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD_PTR hUser;
     * }
     */
    public static void hUser$set(MemorySegment seg, long x) {
        constants$1527.const$5.set(seg, x);
    }
    public static long hUser$get(MemorySegment seg, long index) {
        return (long)constants$1527.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void hUser$set(MemorySegment seg, long index, long x) {
        constants$1527.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hConvPartner$VH() {
        return constants$1528.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCONV hConvPartner;
     * }
     */
    public static MemorySegment hConvPartner$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1528.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCONV hConvPartner;
     * }
     */
    public static void hConvPartner$set(MemorySegment seg, MemorySegment x) {
        constants$1528.const$0.set(seg, x);
    }
    public static MemorySegment hConvPartner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1528.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void hConvPartner$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1528.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hszSvcPartner$VH() {
        return constants$1528.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HSZ hszSvcPartner;
     * }
     */
    public static MemorySegment hszSvcPartner$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1528.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HSZ hszSvcPartner;
     * }
     */
    public static void hszSvcPartner$set(MemorySegment seg, MemorySegment x) {
        constants$1528.const$1.set(seg, x);
    }
    public static MemorySegment hszSvcPartner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1528.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void hszSvcPartner$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1528.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hszServiceReq$VH() {
        return constants$1528.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HSZ hszServiceReq;
     * }
     */
    public static MemorySegment hszServiceReq$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1528.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HSZ hszServiceReq;
     * }
     */
    public static void hszServiceReq$set(MemorySegment seg, MemorySegment x) {
        constants$1528.const$2.set(seg, x);
    }
    public static MemorySegment hszServiceReq$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1528.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void hszServiceReq$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1528.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hszTopic$VH() {
        return constants$1528.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HSZ hszTopic;
     * }
     */
    public static MemorySegment hszTopic$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1528.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HSZ hszTopic;
     * }
     */
    public static void hszTopic$set(MemorySegment seg, MemorySegment x) {
        constants$1528.const$3.set(seg, x);
    }
    public static MemorySegment hszTopic$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1528.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void hszTopic$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1528.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hszItem$VH() {
        return constants$1528.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HSZ hszItem;
     * }
     */
    public static MemorySegment hszItem$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1528.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HSZ hszItem;
     * }
     */
    public static void hszItem$set(MemorySegment seg, MemorySegment x) {
        constants$1528.const$4.set(seg, x);
    }
    public static MemorySegment hszItem$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1528.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void hszItem$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1528.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wFmt$VH() {
        return constants$1528.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wFmt;
     * }
     */
    public static int wFmt$get(MemorySegment seg) {
        return (int)constants$1528.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wFmt;
     * }
     */
    public static void wFmt$set(MemorySegment seg, int x) {
        constants$1528.const$5.set(seg, x);
    }
    public static int wFmt$get(MemorySegment seg, long index) {
        return (int)constants$1528.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void wFmt$set(MemorySegment seg, long index, int x) {
        constants$1528.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wType$VH() {
        return constants$1529.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wType;
     * }
     */
    public static int wType$get(MemorySegment seg) {
        return (int)constants$1529.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wType;
     * }
     */
    public static void wType$set(MemorySegment seg, int x) {
        constants$1529.const$0.set(seg, x);
    }
    public static int wType$get(MemorySegment seg, long index) {
        return (int)constants$1529.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void wType$set(MemorySegment seg, long index, int x) {
        constants$1529.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wStatus$VH() {
        return constants$1529.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wStatus;
     * }
     */
    public static int wStatus$get(MemorySegment seg) {
        return (int)constants$1529.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wStatus;
     * }
     */
    public static void wStatus$set(MemorySegment seg, int x) {
        constants$1529.const$1.set(seg, x);
    }
    public static int wStatus$get(MemorySegment seg, long index) {
        return (int)constants$1529.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void wStatus$set(MemorySegment seg, long index, int x) {
        constants$1529.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wConvst$VH() {
        return constants$1529.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wConvst;
     * }
     */
    public static int wConvst$get(MemorySegment seg) {
        return (int)constants$1529.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wConvst;
     * }
     */
    public static void wConvst$set(MemorySegment seg, int x) {
        constants$1529.const$2.set(seg, x);
    }
    public static int wConvst$get(MemorySegment seg, long index) {
        return (int)constants$1529.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void wConvst$set(MemorySegment seg, long index, int x) {
        constants$1529.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wLastError$VH() {
        return constants$1529.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wLastError;
     * }
     */
    public static int wLastError$get(MemorySegment seg) {
        return (int)constants$1529.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wLastError;
     * }
     */
    public static void wLastError$set(MemorySegment seg, int x) {
        constants$1529.const$3.set(seg, x);
    }
    public static int wLastError$get(MemorySegment seg, long index) {
        return (int)constants$1529.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void wLastError$set(MemorySegment seg, long index, int x) {
        constants$1529.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hConvList$VH() {
        return constants$1529.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCONVLIST hConvList;
     * }
     */
    public static MemorySegment hConvList$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1529.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCONVLIST hConvList;
     * }
     */
    public static void hConvList$set(MemorySegment seg, MemorySegment x) {
        constants$1529.const$4.set(seg, x);
    }
    public static MemorySegment hConvList$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1529.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void hConvList$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1529.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ConvCtxt$slice(MemorySegment seg) {
        return seg.asSlice(88, 36);
    }
    public static VarHandle hwnd$VH() {
        return constants$1529.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwnd;
     * }
     */
    public static MemorySegment hwnd$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1529.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwnd;
     * }
     */
    public static void hwnd$set(MemorySegment seg, MemorySegment x) {
        constants$1529.const$5.set(seg, x);
    }
    public static MemorySegment hwnd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1529.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void hwnd$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1529.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hwndPartner$VH() {
        return constants$1530.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwndPartner;
     * }
     */
    public static MemorySegment hwndPartner$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1530.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwndPartner;
     * }
     */
    public static void hwndPartner$set(MemorySegment seg, MemorySegment x) {
        constants$1530.const$0.set(seg, x);
    }
    public static MemorySegment hwndPartner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1530.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndPartner$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1530.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

