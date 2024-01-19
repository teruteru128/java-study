// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DEVICE_POWER_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     BOOLEAN DeviceAttentionSupported;
 *     BOOLEAN AsynchronousNotificationSupported;
 *     BOOLEAN IdlePowerManagementEnabled;
 *     BOOLEAN D3ColdEnabled;
 *     BOOLEAN D3ColdSupported;
 *     BOOLEAN NoVerifyDuringIdlePower;
 *     BYTE Reserved[2];
 *     DWORD IdleTimeoutInMS;
 * };
 * }
 */
public class _DEVICE_POWER_DESCRIPTOR {

    public static MemoryLayout $LAYOUT() {
        return constants$2400.const$1;
    }
    public static VarHandle Version$VH() {
        return constants$2400.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)constants$2400.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        constants$2400.const$2.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)constants$2400.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        constants$2400.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Size$VH() {
        return constants$2400.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$2400.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$2400.const$3.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$2400.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$2400.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DeviceAttentionSupported$VH() {
        return constants$2400.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN DeviceAttentionSupported;
     * }
     */
    public static byte DeviceAttentionSupported$get(MemorySegment seg) {
        return (byte)constants$2400.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN DeviceAttentionSupported;
     * }
     */
    public static void DeviceAttentionSupported$set(MemorySegment seg, byte x) {
        constants$2400.const$4.set(seg, x);
    }
    public static byte DeviceAttentionSupported$get(MemorySegment seg, long index) {
        return (byte)constants$2400.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceAttentionSupported$set(MemorySegment seg, long index, byte x) {
        constants$2400.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle AsynchronousNotificationSupported$VH() {
        return constants$2400.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN AsynchronousNotificationSupported;
     * }
     */
    public static byte AsynchronousNotificationSupported$get(MemorySegment seg) {
        return (byte)constants$2400.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN AsynchronousNotificationSupported;
     * }
     */
    public static void AsynchronousNotificationSupported$set(MemorySegment seg, byte x) {
        constants$2400.const$5.set(seg, x);
    }
    public static byte AsynchronousNotificationSupported$get(MemorySegment seg, long index) {
        return (byte)constants$2400.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void AsynchronousNotificationSupported$set(MemorySegment seg, long index, byte x) {
        constants$2400.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle IdlePowerManagementEnabled$VH() {
        return constants$2401.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN IdlePowerManagementEnabled;
     * }
     */
    public static byte IdlePowerManagementEnabled$get(MemorySegment seg) {
        return (byte)constants$2401.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN IdlePowerManagementEnabled;
     * }
     */
    public static void IdlePowerManagementEnabled$set(MemorySegment seg, byte x) {
        constants$2401.const$0.set(seg, x);
    }
    public static byte IdlePowerManagementEnabled$get(MemorySegment seg, long index) {
        return (byte)constants$2401.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void IdlePowerManagementEnabled$set(MemorySegment seg, long index, byte x) {
        constants$2401.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle D3ColdEnabled$VH() {
        return constants$2401.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN D3ColdEnabled;
     * }
     */
    public static byte D3ColdEnabled$get(MemorySegment seg) {
        return (byte)constants$2401.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN D3ColdEnabled;
     * }
     */
    public static void D3ColdEnabled$set(MemorySegment seg, byte x) {
        constants$2401.const$1.set(seg, x);
    }
    public static byte D3ColdEnabled$get(MemorySegment seg, long index) {
        return (byte)constants$2401.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void D3ColdEnabled$set(MemorySegment seg, long index, byte x) {
        constants$2401.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle D3ColdSupported$VH() {
        return constants$2401.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN D3ColdSupported;
     * }
     */
    public static byte D3ColdSupported$get(MemorySegment seg) {
        return (byte)constants$2401.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN D3ColdSupported;
     * }
     */
    public static void D3ColdSupported$set(MemorySegment seg, byte x) {
        constants$2401.const$2.set(seg, x);
    }
    public static byte D3ColdSupported$get(MemorySegment seg, long index) {
        return (byte)constants$2401.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void D3ColdSupported$set(MemorySegment seg, long index, byte x) {
        constants$2401.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NoVerifyDuringIdlePower$VH() {
        return constants$2401.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN NoVerifyDuringIdlePower;
     * }
     */
    public static byte NoVerifyDuringIdlePower$get(MemorySegment seg) {
        return (byte)constants$2401.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN NoVerifyDuringIdlePower;
     * }
     */
    public static void NoVerifyDuringIdlePower$set(MemorySegment seg, byte x) {
        constants$2401.const$3.set(seg, x);
    }
    public static byte NoVerifyDuringIdlePower$get(MemorySegment seg, long index) {
        return (byte)constants$2401.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void NoVerifyDuringIdlePower$set(MemorySegment seg, long index, byte x) {
        constants$2401.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(14, 2);
    }
    public static VarHandle IdleTimeoutInMS$VH() {
        return constants$2401.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD IdleTimeoutInMS;
     * }
     */
    public static int IdleTimeoutInMS$get(MemorySegment seg) {
        return (int)constants$2401.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD IdleTimeoutInMS;
     * }
     */
    public static void IdleTimeoutInMS$set(MemorySegment seg, int x) {
        constants$2401.const$4.set(seg, x);
    }
    public static int IdleTimeoutInMS$get(MemorySegment seg, long index) {
        return (int)constants$2401.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void IdleTimeoutInMS$set(MemorySegment seg, long index, int x) {
        constants$2401.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

