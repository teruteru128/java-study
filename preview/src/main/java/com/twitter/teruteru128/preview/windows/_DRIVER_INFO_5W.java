// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DRIVER_INFO_5W {
 *     DWORD cVersion;
 *     LPWSTR pName;
 *     LPWSTR pEnvironment;
 *     LPWSTR pDriverPath;
 *     LPWSTR pDataFile;
 *     LPWSTR pConfigFile;
 *     DWORD dwDriverAttributes;
 *     DWORD dwConfigVersion;
 *     DWORD dwDriverVersion;
 * };
 * }
 */
public class _DRIVER_INFO_5W {

    public static MemoryLayout $LAYOUT() {
        return constants$2870.const$0;
    }
    public static VarHandle cVersion$VH() {
        return constants$2870.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cVersion;
     * }
     */
    public static int cVersion$get(MemorySegment seg) {
        return (int)constants$2870.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cVersion;
     * }
     */
    public static void cVersion$set(MemorySegment seg, int x) {
        constants$2870.const$1.set(seg, x);
    }
    public static int cVersion$get(MemorySegment seg, long index) {
        return (int)constants$2870.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cVersion$set(MemorySegment seg, long index, int x) {
        constants$2870.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pName$VH() {
        return constants$2870.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pName;
     * }
     */
    public static MemorySegment pName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2870.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pName;
     * }
     */
    public static void pName$set(MemorySegment seg, MemorySegment x) {
        constants$2870.const$2.set(seg, x);
    }
    public static MemorySegment pName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2870.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2870.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pEnvironment$VH() {
        return constants$2870.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pEnvironment;
     * }
     */
    public static MemorySegment pEnvironment$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2870.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pEnvironment;
     * }
     */
    public static void pEnvironment$set(MemorySegment seg, MemorySegment x) {
        constants$2870.const$3.set(seg, x);
    }
    public static MemorySegment pEnvironment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2870.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pEnvironment$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2870.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDriverPath$VH() {
        return constants$2870.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pDriverPath;
     * }
     */
    public static MemorySegment pDriverPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2870.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pDriverPath;
     * }
     */
    public static void pDriverPath$set(MemorySegment seg, MemorySegment x) {
        constants$2870.const$4.set(seg, x);
    }
    public static MemorySegment pDriverPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2870.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pDriverPath$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2870.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDataFile$VH() {
        return constants$2870.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pDataFile;
     * }
     */
    public static MemorySegment pDataFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2870.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pDataFile;
     * }
     */
    public static void pDataFile$set(MemorySegment seg, MemorySegment x) {
        constants$2870.const$5.set(seg, x);
    }
    public static MemorySegment pDataFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2870.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pDataFile$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2870.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pConfigFile$VH() {
        return constants$2871.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pConfigFile;
     * }
     */
    public static MemorySegment pConfigFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2871.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pConfigFile;
     * }
     */
    public static void pConfigFile$set(MemorySegment seg, MemorySegment x) {
        constants$2871.const$0.set(seg, x);
    }
    public static MemorySegment pConfigFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2871.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pConfigFile$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2871.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwDriverAttributes$VH() {
        return constants$2871.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwDriverAttributes;
     * }
     */
    public static int dwDriverAttributes$get(MemorySegment seg) {
        return (int)constants$2871.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwDriverAttributes;
     * }
     */
    public static void dwDriverAttributes$set(MemorySegment seg, int x) {
        constants$2871.const$1.set(seg, x);
    }
    public static int dwDriverAttributes$get(MemorySegment seg, long index) {
        return (int)constants$2871.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDriverAttributes$set(MemorySegment seg, long index, int x) {
        constants$2871.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwConfigVersion$VH() {
        return constants$2871.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwConfigVersion;
     * }
     */
    public static int dwConfigVersion$get(MemorySegment seg) {
        return (int)constants$2871.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwConfigVersion;
     * }
     */
    public static void dwConfigVersion$set(MemorySegment seg, int x) {
        constants$2871.const$2.set(seg, x);
    }
    public static int dwConfigVersion$get(MemorySegment seg, long index) {
        return (int)constants$2871.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwConfigVersion$set(MemorySegment seg, long index, int x) {
        constants$2871.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwDriverVersion$VH() {
        return constants$2871.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwDriverVersion;
     * }
     */
    public static int dwDriverVersion$get(MemorySegment seg) {
        return (int)constants$2871.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwDriverVersion;
     * }
     */
    public static void dwDriverVersion$set(MemorySegment seg, int x) {
        constants$2871.const$3.set(seg, x);
    }
    public static int dwDriverVersion$get(MemorySegment seg, long index) {
        return (int)constants$2871.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDriverVersion$set(MemorySegment seg, long index, int x) {
        constants$2871.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


