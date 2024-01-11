// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_POLICY95_QUALIFIER1 {
 *     LPWSTR pszPracticesReference;
 *     LPSTR pszNoticeIdentifier;
 *     LPSTR pszNSINoticeIdentifier;
 *     DWORD cCPSURLs;
 *     CPS_URLS* rgCPSURLs;
 * };
 * }
 */
public class _CERT_POLICY95_QUALIFIER1 {

    public static MemoryLayout $LAYOUT() {
        return constants$2033.const$0;
    }
    public static VarHandle pszPracticesReference$VH() {
        return constants$2033.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pszPracticesReference;
     * }
     */
    public static MemorySegment pszPracticesReference$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2033.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pszPracticesReference;
     * }
     */
    public static void pszPracticesReference$set(MemorySegment seg, MemorySegment x) {
        constants$2033.const$1.set(seg, x);
    }
    public static MemorySegment pszPracticesReference$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2033.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pszPracticesReference$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2033.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pszNoticeIdentifier$VH() {
        return constants$2033.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pszNoticeIdentifier;
     * }
     */
    public static MemorySegment pszNoticeIdentifier$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2033.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pszNoticeIdentifier;
     * }
     */
    public static void pszNoticeIdentifier$set(MemorySegment seg, MemorySegment x) {
        constants$2033.const$2.set(seg, x);
    }
    public static MemorySegment pszNoticeIdentifier$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2033.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pszNoticeIdentifier$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2033.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pszNSINoticeIdentifier$VH() {
        return constants$2033.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pszNSINoticeIdentifier;
     * }
     */
    public static MemorySegment pszNSINoticeIdentifier$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2033.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pszNSINoticeIdentifier;
     * }
     */
    public static void pszNSINoticeIdentifier$set(MemorySegment seg, MemorySegment x) {
        constants$2033.const$3.set(seg, x);
    }
    public static MemorySegment pszNSINoticeIdentifier$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2033.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pszNSINoticeIdentifier$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2033.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cCPSURLs$VH() {
        return constants$2033.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cCPSURLs;
     * }
     */
    public static int cCPSURLs$get(MemorySegment seg) {
        return (int)constants$2033.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cCPSURLs;
     * }
     */
    public static void cCPSURLs$set(MemorySegment seg, int x) {
        constants$2033.const$4.set(seg, x);
    }
    public static int cCPSURLs$get(MemorySegment seg, long index) {
        return (int)constants$2033.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cCPSURLs$set(MemorySegment seg, long index, int x) {
        constants$2033.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rgCPSURLs$VH() {
        return constants$2033.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * CPS_URLS* rgCPSURLs;
     * }
     */
    public static MemorySegment rgCPSURLs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2033.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * CPS_URLS* rgCPSURLs;
     * }
     */
    public static void rgCPSURLs$set(MemorySegment seg, MemorySegment x) {
        constants$2033.const$5.set(seg, x);
    }
    public static MemorySegment rgCPSURLs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2033.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void rgCPSURLs$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2033.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


