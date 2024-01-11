// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_BIOMETRIC_DATA {
 *     DWORD dwTypeOfBiometricDataChoice;
 *     union {
 *         DWORD dwPredefined;
 *         LPSTR pszObjId;
 *     };
 *     CERT_HASHED_URL HashedUrl;
 * };
 * }
 */
public class _CERT_BIOMETRIC_DATA {

    public static MemoryLayout $LAYOUT() {
        return constants$2064.const$1;
    }
    public static VarHandle dwTypeOfBiometricDataChoice$VH() {
        return constants$2064.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwTypeOfBiometricDataChoice;
     * }
     */
    public static int dwTypeOfBiometricDataChoice$get(MemorySegment seg) {
        return (int)constants$2064.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwTypeOfBiometricDataChoice;
     * }
     */
    public static void dwTypeOfBiometricDataChoice$set(MemorySegment seg, int x) {
        constants$2064.const$2.set(seg, x);
    }
    public static int dwTypeOfBiometricDataChoice$get(MemorySegment seg, long index) {
        return (int)constants$2064.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTypeOfBiometricDataChoice$set(MemorySegment seg, long index, int x) {
        constants$2064.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwPredefined$VH() {
        return constants$2064.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwPredefined;
     * }
     */
    public static int dwPredefined$get(MemorySegment seg) {
        return (int)constants$2064.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwPredefined;
     * }
     */
    public static void dwPredefined$set(MemorySegment seg, int x) {
        constants$2064.const$3.set(seg, x);
    }
    public static int dwPredefined$get(MemorySegment seg, long index) {
        return (int)constants$2064.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPredefined$set(MemorySegment seg, long index, int x) {
        constants$2064.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pszObjId$VH() {
        return constants$2064.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pszObjId;
     * }
     */
    public static MemorySegment pszObjId$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2064.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pszObjId;
     * }
     */
    public static void pszObjId$set(MemorySegment seg, MemorySegment x) {
        constants$2064.const$4.set(seg, x);
    }
    public static MemorySegment pszObjId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2064.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pszObjId$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2064.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment HashedUrl$slice(MemorySegment seg) {
        return seg.asSlice(16, 48);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


