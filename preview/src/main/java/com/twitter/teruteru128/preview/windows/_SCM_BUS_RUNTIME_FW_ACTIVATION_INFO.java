// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCM_BUS_RUNTIME_FW_ACTIVATION_INFO {
 *     DWORD Version;
 *     DWORD Size;
 *     BOOLEAN RuntimeFwActivationSupported;
 *     SCM_BUS_FIRMWARE_ACTIVATION_STATE FirmwareActivationState;
 *     struct  FirmwareActivationCapability;
 *     DWORDLONG EstimatedFirmwareActivationTimeInUSecs;
 *     DWORDLONG EstimatedProcessorAccessQuiesceTimeInUSecs;
 *     DWORDLONG EstimatedIOAccessQuiesceTimeInUSecs;
 *     DWORDLONG PlatformSupportedMaxIOAccessQuiesceTimeInUSecs;
 * };
 * }
 */
public class _SCM_BUS_RUNTIME_FW_ACTIVATION_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$2509.const$1;
    }
    public static VarHandle Version$VH() {
        return constants$2509.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)constants$2509.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        constants$2509.const$2.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)constants$2509.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        constants$2509.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Size$VH() {
        return constants$2509.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$2509.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$2509.const$3.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$2509.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$2509.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle RuntimeFwActivationSupported$VH() {
        return constants$2509.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN RuntimeFwActivationSupported;
     * }
     */
    public static byte RuntimeFwActivationSupported$get(MemorySegment seg) {
        return (byte)constants$2509.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN RuntimeFwActivationSupported;
     * }
     */
    public static void RuntimeFwActivationSupported$set(MemorySegment seg, byte x) {
        constants$2509.const$4.set(seg, x);
    }
    public static byte RuntimeFwActivationSupported$get(MemorySegment seg, long index) {
        return (byte)constants$2509.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void RuntimeFwActivationSupported$set(MemorySegment seg, long index, byte x) {
        constants$2509.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle FirmwareActivationState$VH() {
        return constants$2509.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SCM_BUS_FIRMWARE_ACTIVATION_STATE FirmwareActivationState;
     * }
     */
    public static int FirmwareActivationState$get(MemorySegment seg) {
        return (int)constants$2509.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SCM_BUS_FIRMWARE_ACTIVATION_STATE FirmwareActivationState;
     * }
     */
    public static void FirmwareActivationState$set(MemorySegment seg, int x) {
        constants$2509.const$5.set(seg, x);
    }
    public static int FirmwareActivationState$get(MemorySegment seg, long index) {
        return (int)constants$2509.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void FirmwareActivationState$set(MemorySegment seg, long index, int x) {
        constants$2509.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * struct {
     *          *     DWORD FwManagedIoQuiesceFwActivationSupported;
     *     DWORD OsManagedIoQuiesceFwActivationSupported;
     *     DWORD WarmResetBasedFwActivationSupported;
     *     DWORD Reserved;
     * };
     * }
     */
    public static final class FirmwareActivationCapability {

        // Suppresses default constructor, ensuring non-instantiability.
        private FirmwareActivationCapability() {}
        public static MemoryLayout $LAYOUT() {
            return constants$128.const$3;
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment FirmwareActivationCapability$slice(MemorySegment seg) {
        return seg.asSlice(16, 4);
    }
    public static VarHandle EstimatedFirmwareActivationTimeInUSecs$VH() {
        return constants$2510.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG EstimatedFirmwareActivationTimeInUSecs;
     * }
     */
    public static long EstimatedFirmwareActivationTimeInUSecs$get(MemorySegment seg) {
        return (long)constants$2510.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG EstimatedFirmwareActivationTimeInUSecs;
     * }
     */
    public static void EstimatedFirmwareActivationTimeInUSecs$set(MemorySegment seg, long x) {
        constants$2510.const$0.set(seg, x);
    }
    public static long EstimatedFirmwareActivationTimeInUSecs$get(MemorySegment seg, long index) {
        return (long)constants$2510.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void EstimatedFirmwareActivationTimeInUSecs$set(MemorySegment seg, long index, long x) {
        constants$2510.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle EstimatedProcessorAccessQuiesceTimeInUSecs$VH() {
        return constants$2510.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG EstimatedProcessorAccessQuiesceTimeInUSecs;
     * }
     */
    public static long EstimatedProcessorAccessQuiesceTimeInUSecs$get(MemorySegment seg) {
        return (long)constants$2510.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG EstimatedProcessorAccessQuiesceTimeInUSecs;
     * }
     */
    public static void EstimatedProcessorAccessQuiesceTimeInUSecs$set(MemorySegment seg, long x) {
        constants$2510.const$1.set(seg, x);
    }
    public static long EstimatedProcessorAccessQuiesceTimeInUSecs$get(MemorySegment seg, long index) {
        return (long)constants$2510.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void EstimatedProcessorAccessQuiesceTimeInUSecs$set(MemorySegment seg, long index, long x) {
        constants$2510.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle EstimatedIOAccessQuiesceTimeInUSecs$VH() {
        return constants$2510.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG EstimatedIOAccessQuiesceTimeInUSecs;
     * }
     */
    public static long EstimatedIOAccessQuiesceTimeInUSecs$get(MemorySegment seg) {
        return (long)constants$2510.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG EstimatedIOAccessQuiesceTimeInUSecs;
     * }
     */
    public static void EstimatedIOAccessQuiesceTimeInUSecs$set(MemorySegment seg, long x) {
        constants$2510.const$2.set(seg, x);
    }
    public static long EstimatedIOAccessQuiesceTimeInUSecs$get(MemorySegment seg, long index) {
        return (long)constants$2510.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void EstimatedIOAccessQuiesceTimeInUSecs$set(MemorySegment seg, long index, long x) {
        constants$2510.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle PlatformSupportedMaxIOAccessQuiesceTimeInUSecs$VH() {
        return constants$2510.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG PlatformSupportedMaxIOAccessQuiesceTimeInUSecs;
     * }
     */
    public static long PlatformSupportedMaxIOAccessQuiesceTimeInUSecs$get(MemorySegment seg) {
        return (long)constants$2510.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG PlatformSupportedMaxIOAccessQuiesceTimeInUSecs;
     * }
     */
    public static void PlatformSupportedMaxIOAccessQuiesceTimeInUSecs$set(MemorySegment seg, long x) {
        constants$2510.const$3.set(seg, x);
    }
    public static long PlatformSupportedMaxIOAccessQuiesceTimeInUSecs$get(MemorySegment seg, long index) {
        return (long)constants$2510.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void PlatformSupportedMaxIOAccessQuiesceTimeInUSecs$set(MemorySegment seg, long index, long x) {
        constants$2510.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


