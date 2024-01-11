// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _tagRemBINDINFO {
 *     ULONG cbSize;
 *     LPWSTR szExtraInfo;
 *     DWORD grfBindInfoF;
 *     DWORD dwBindVerb;
 *     LPWSTR szCustomVerb;
 *     DWORD cbstgmedData;
 *     DWORD dwOptions;
 *     DWORD dwOptionsFlags;
 *     DWORD dwCodePage;
 *     REMSECURITY_ATTRIBUTES securityAttributes;
 *     IID iid;
 *     IUnknown* pUnk;
 *     DWORD dwReserved;
 * };
 * }
 */
public class _tagRemBINDINFO {

    public static MemoryLayout $LAYOUT() {
        return constants$4109.const$5;
    }
    public static VarHandle cbSize$VH() {
        return constants$4110.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$4110.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$4110.const$0.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$4110.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$4110.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle szExtraInfo$VH() {
        return constants$4110.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR szExtraInfo;
     * }
     */
    public static MemorySegment szExtraInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4110.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR szExtraInfo;
     * }
     */
    public static void szExtraInfo$set(MemorySegment seg, MemorySegment x) {
        constants$4110.const$1.set(seg, x);
    }
    public static MemorySegment szExtraInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4110.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void szExtraInfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4110.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle grfBindInfoF$VH() {
        return constants$4110.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD grfBindInfoF;
     * }
     */
    public static int grfBindInfoF$get(MemorySegment seg) {
        return (int)constants$4110.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD grfBindInfoF;
     * }
     */
    public static void grfBindInfoF$set(MemorySegment seg, int x) {
        constants$4110.const$2.set(seg, x);
    }
    public static int grfBindInfoF$get(MemorySegment seg, long index) {
        return (int)constants$4110.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void grfBindInfoF$set(MemorySegment seg, long index, int x) {
        constants$4110.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwBindVerb$VH() {
        return constants$4110.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwBindVerb;
     * }
     */
    public static int dwBindVerb$get(MemorySegment seg) {
        return (int)constants$4110.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwBindVerb;
     * }
     */
    public static void dwBindVerb$set(MemorySegment seg, int x) {
        constants$4110.const$3.set(seg, x);
    }
    public static int dwBindVerb$get(MemorySegment seg, long index) {
        return (int)constants$4110.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBindVerb$set(MemorySegment seg, long index, int x) {
        constants$4110.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle szCustomVerb$VH() {
        return constants$4110.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR szCustomVerb;
     * }
     */
    public static MemorySegment szCustomVerb$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4110.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR szCustomVerb;
     * }
     */
    public static void szCustomVerb$set(MemorySegment seg, MemorySegment x) {
        constants$4110.const$4.set(seg, x);
    }
    public static MemorySegment szCustomVerb$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4110.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void szCustomVerb$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4110.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbstgmedData$VH() {
        return constants$4110.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbstgmedData;
     * }
     */
    public static int cbstgmedData$get(MemorySegment seg) {
        return (int)constants$4110.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbstgmedData;
     * }
     */
    public static void cbstgmedData$set(MemorySegment seg, int x) {
        constants$4110.const$5.set(seg, x);
    }
    public static int cbstgmedData$get(MemorySegment seg, long index) {
        return (int)constants$4110.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cbstgmedData$set(MemorySegment seg, long index, int x) {
        constants$4110.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwOptions$VH() {
        return constants$4111.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwOptions;
     * }
     */
    public static int dwOptions$get(MemorySegment seg) {
        return (int)constants$4111.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwOptions;
     * }
     */
    public static void dwOptions$set(MemorySegment seg, int x) {
        constants$4111.const$0.set(seg, x);
    }
    public static int dwOptions$get(MemorySegment seg, long index) {
        return (int)constants$4111.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOptions$set(MemorySegment seg, long index, int x) {
        constants$4111.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwOptionsFlags$VH() {
        return constants$4111.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwOptionsFlags;
     * }
     */
    public static int dwOptionsFlags$get(MemorySegment seg) {
        return (int)constants$4111.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwOptionsFlags;
     * }
     */
    public static void dwOptionsFlags$set(MemorySegment seg, int x) {
        constants$4111.const$1.set(seg, x);
    }
    public static int dwOptionsFlags$get(MemorySegment seg, long index) {
        return (int)constants$4111.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOptionsFlags$set(MemorySegment seg, long index, int x) {
        constants$4111.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwCodePage$VH() {
        return constants$4111.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwCodePage;
     * }
     */
    public static int dwCodePage$get(MemorySegment seg) {
        return (int)constants$4111.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwCodePage;
     * }
     */
    public static void dwCodePage$set(MemorySegment seg, int x) {
        constants$4111.const$2.set(seg, x);
    }
    public static int dwCodePage$get(MemorySegment seg, long index) {
        return (int)constants$4111.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCodePage$set(MemorySegment seg, long index, int x) {
        constants$4111.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment securityAttributes$slice(MemorySegment seg) {
        return seg.asSlice(48, 12);
    }
    public static MemorySegment iid$slice(MemorySegment seg) {
        return seg.asSlice(60, 16);
    }
    public static VarHandle pUnk$VH() {
        return constants$4111.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * IUnknown* pUnk;
     * }
     */
    public static MemorySegment pUnk$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4111.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * IUnknown* pUnk;
     * }
     */
    public static void pUnk$set(MemorySegment seg, MemorySegment x) {
        constants$4111.const$3.set(seg, x);
    }
    public static MemorySegment pUnk$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4111.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pUnk$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4111.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwReserved$VH() {
        return constants$4111.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwReserved;
     * }
     */
    public static int dwReserved$get(MemorySegment seg) {
        return (int)constants$4111.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwReserved;
     * }
     */
    public static void dwReserved$set(MemorySegment seg, int x) {
        constants$4111.const$4.set(seg, x);
    }
    public static int dwReserved$get(MemorySegment seg, long index) {
        return (int)constants$4111.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved$set(MemorySegment seg, long index, int x) {
        constants$4111.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

