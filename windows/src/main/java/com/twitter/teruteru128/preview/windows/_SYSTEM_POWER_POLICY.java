// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SYSTEM_POWER_POLICY {
 *     DWORD Revision;
 *     POWER_ACTION_POLICY PowerButton;
 *     POWER_ACTION_POLICY SleepButton;
 *     POWER_ACTION_POLICY LidClose;
 *     SYSTEM_POWER_STATE LidOpenWake;
 *     DWORD Reserved;
 *     POWER_ACTION_POLICY Idle;
 *     DWORD IdleTimeout;
 *     BYTE IdleSensitivity;
 *     BYTE DynamicThrottle;
 *     BYTE Spare2[2];
 *     SYSTEM_POWER_STATE MinSleep;
 *     SYSTEM_POWER_STATE MaxSleep;
 *     SYSTEM_POWER_STATE ReducedLatencySleep;
 *     DWORD WinLogonFlags;
 *     DWORD Spare3;
 *     DWORD DozeS4Timeout;
 *     DWORD BroadcastCapacityResolution;
 *     SYSTEM_POWER_LEVEL DischargePolicy[4];
 *     DWORD VideoTimeout;
 *     BOOLEAN VideoDimDisplay;
 *     DWORD VideoReserved[3];
 *     DWORD SpindownTimeout;
 *     BOOLEAN OptimizeForPower;
 *     BYTE FanThrottleTolerance;
 *     BYTE ForcedThrottle;
 *     BYTE MinThrottle;
 *     POWER_ACTION_POLICY OverThrottled;
 * };
 * }
 */
public class _SYSTEM_POWER_POLICY {

    public static MemoryLayout $LAYOUT() {
        return constants$332.const$5;
    }
    public static VarHandle Revision$VH() {
        return constants$333.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Revision;
     * }
     */
    public static int Revision$get(MemorySegment seg) {
        return (int)constants$333.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Revision;
     * }
     */
    public static void Revision$set(MemorySegment seg, int x) {
        constants$333.const$0.set(seg, x);
    }
    public static int Revision$get(MemorySegment seg, long index) {
        return (int)constants$333.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Revision$set(MemorySegment seg, long index, int x) {
        constants$333.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment PowerButton$slice(MemorySegment seg) {
        return seg.asSlice(4, 12);
    }
    public static MemorySegment SleepButton$slice(MemorySegment seg) {
        return seg.asSlice(16, 12);
    }
    public static MemorySegment LidClose$slice(MemorySegment seg) {
        return seg.asSlice(28, 12);
    }
    public static VarHandle LidOpenWake$VH() {
        return constants$333.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE LidOpenWake;
     * }
     */
    public static int LidOpenWake$get(MemorySegment seg) {
        return (int)constants$333.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE LidOpenWake;
     * }
     */
    public static void LidOpenWake$set(MemorySegment seg, int x) {
        constants$333.const$1.set(seg, x);
    }
    public static int LidOpenWake$get(MemorySegment seg, long index) {
        return (int)constants$333.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void LidOpenWake$set(MemorySegment seg, long index, int x) {
        constants$333.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Reserved$VH() {
        return constants$333.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static int Reserved$get(MemorySegment seg) {
        return (int)constants$333.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, int x) {
        constants$333.const$2.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)constants$333.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        constants$333.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Idle$slice(MemorySegment seg) {
        return seg.asSlice(48, 12);
    }
    public static VarHandle IdleTimeout$VH() {
        return constants$333.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD IdleTimeout;
     * }
     */
    public static int IdleTimeout$get(MemorySegment seg) {
        return (int)constants$333.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD IdleTimeout;
     * }
     */
    public static void IdleTimeout$set(MemorySegment seg, int x) {
        constants$333.const$3.set(seg, x);
    }
    public static int IdleTimeout$get(MemorySegment seg, long index) {
        return (int)constants$333.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void IdleTimeout$set(MemorySegment seg, long index, int x) {
        constants$333.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle IdleSensitivity$VH() {
        return constants$333.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE IdleSensitivity;
     * }
     */
    public static byte IdleSensitivity$get(MemorySegment seg) {
        return (byte)constants$333.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE IdleSensitivity;
     * }
     */
    public static void IdleSensitivity$set(MemorySegment seg, byte x) {
        constants$333.const$4.set(seg, x);
    }
    public static byte IdleSensitivity$get(MemorySegment seg, long index) {
        return (byte)constants$333.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void IdleSensitivity$set(MemorySegment seg, long index, byte x) {
        constants$333.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DynamicThrottle$VH() {
        return constants$333.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE DynamicThrottle;
     * }
     */
    public static byte DynamicThrottle$get(MemorySegment seg) {
        return (byte)constants$333.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE DynamicThrottle;
     * }
     */
    public static void DynamicThrottle$set(MemorySegment seg, byte x) {
        constants$333.const$5.set(seg, x);
    }
    public static byte DynamicThrottle$get(MemorySegment seg, long index) {
        return (byte)constants$333.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void DynamicThrottle$set(MemorySegment seg, long index, byte x) {
        constants$333.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Spare2$slice(MemorySegment seg) {
        return seg.asSlice(66, 2);
    }
    public static VarHandle MinSleep$VH() {
        return constants$334.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE MinSleep;
     * }
     */
    public static int MinSleep$get(MemorySegment seg) {
        return (int)constants$334.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE MinSleep;
     * }
     */
    public static void MinSleep$set(MemorySegment seg, int x) {
        constants$334.const$0.set(seg, x);
    }
    public static int MinSleep$get(MemorySegment seg, long index) {
        return (int)constants$334.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void MinSleep$set(MemorySegment seg, long index, int x) {
        constants$334.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MaxSleep$VH() {
        return constants$334.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE MaxSleep;
     * }
     */
    public static int MaxSleep$get(MemorySegment seg) {
        return (int)constants$334.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE MaxSleep;
     * }
     */
    public static void MaxSleep$set(MemorySegment seg, int x) {
        constants$334.const$1.set(seg, x);
    }
    public static int MaxSleep$get(MemorySegment seg, long index) {
        return (int)constants$334.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxSleep$set(MemorySegment seg, long index, int x) {
        constants$334.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ReducedLatencySleep$VH() {
        return constants$334.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE ReducedLatencySleep;
     * }
     */
    public static int ReducedLatencySleep$get(MemorySegment seg) {
        return (int)constants$334.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE ReducedLatencySleep;
     * }
     */
    public static void ReducedLatencySleep$set(MemorySegment seg, int x) {
        constants$334.const$2.set(seg, x);
    }
    public static int ReducedLatencySleep$get(MemorySegment seg, long index) {
        return (int)constants$334.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ReducedLatencySleep$set(MemorySegment seg, long index, int x) {
        constants$334.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle WinLogonFlags$VH() {
        return constants$334.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD WinLogonFlags;
     * }
     */
    public static int WinLogonFlags$get(MemorySegment seg) {
        return (int)constants$334.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD WinLogonFlags;
     * }
     */
    public static void WinLogonFlags$set(MemorySegment seg, int x) {
        constants$334.const$3.set(seg, x);
    }
    public static int WinLogonFlags$get(MemorySegment seg, long index) {
        return (int)constants$334.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void WinLogonFlags$set(MemorySegment seg, long index, int x) {
        constants$334.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Spare3$VH() {
        return constants$334.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Spare3;
     * }
     */
    public static int Spare3$get(MemorySegment seg) {
        return (int)constants$334.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Spare3;
     * }
     */
    public static void Spare3$set(MemorySegment seg, int x) {
        constants$334.const$4.set(seg, x);
    }
    public static int Spare3$get(MemorySegment seg, long index) {
        return (int)constants$334.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Spare3$set(MemorySegment seg, long index, int x) {
        constants$334.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DozeS4Timeout$VH() {
        return constants$334.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DozeS4Timeout;
     * }
     */
    public static int DozeS4Timeout$get(MemorySegment seg) {
        return (int)constants$334.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DozeS4Timeout;
     * }
     */
    public static void DozeS4Timeout$set(MemorySegment seg, int x) {
        constants$334.const$5.set(seg, x);
    }
    public static int DozeS4Timeout$get(MemorySegment seg, long index) {
        return (int)constants$334.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void DozeS4Timeout$set(MemorySegment seg, long index, int x) {
        constants$334.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle BroadcastCapacityResolution$VH() {
        return constants$335.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD BroadcastCapacityResolution;
     * }
     */
    public static int BroadcastCapacityResolution$get(MemorySegment seg) {
        return (int)constants$335.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD BroadcastCapacityResolution;
     * }
     */
    public static void BroadcastCapacityResolution$set(MemorySegment seg, int x) {
        constants$335.const$0.set(seg, x);
    }
    public static int BroadcastCapacityResolution$get(MemorySegment seg, long index) {
        return (int)constants$335.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void BroadcastCapacityResolution$set(MemorySegment seg, long index, int x) {
        constants$335.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment DischargePolicy$slice(MemorySegment seg) {
        return seg.asSlice(96, 96);
    }
    public static VarHandle VideoTimeout$VH() {
        return constants$335.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD VideoTimeout;
     * }
     */
    public static int VideoTimeout$get(MemorySegment seg) {
        return (int)constants$335.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD VideoTimeout;
     * }
     */
    public static void VideoTimeout$set(MemorySegment seg, int x) {
        constants$335.const$1.set(seg, x);
    }
    public static int VideoTimeout$get(MemorySegment seg, long index) {
        return (int)constants$335.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void VideoTimeout$set(MemorySegment seg, long index, int x) {
        constants$335.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle VideoDimDisplay$VH() {
        return constants$335.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN VideoDimDisplay;
     * }
     */
    public static byte VideoDimDisplay$get(MemorySegment seg) {
        return (byte)constants$335.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN VideoDimDisplay;
     * }
     */
    public static void VideoDimDisplay$set(MemorySegment seg, byte x) {
        constants$335.const$2.set(seg, x);
    }
    public static byte VideoDimDisplay$get(MemorySegment seg, long index) {
        return (byte)constants$335.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void VideoDimDisplay$set(MemorySegment seg, long index, byte x) {
        constants$335.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment VideoReserved$slice(MemorySegment seg) {
        return seg.asSlice(200, 12);
    }
    public static VarHandle SpindownTimeout$VH() {
        return constants$335.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SpindownTimeout;
     * }
     */
    public static int SpindownTimeout$get(MemorySegment seg) {
        return (int)constants$335.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SpindownTimeout;
     * }
     */
    public static void SpindownTimeout$set(MemorySegment seg, int x) {
        constants$335.const$3.set(seg, x);
    }
    public static int SpindownTimeout$get(MemorySegment seg, long index) {
        return (int)constants$335.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void SpindownTimeout$set(MemorySegment seg, long index, int x) {
        constants$335.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle OptimizeForPower$VH() {
        return constants$335.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN OptimizeForPower;
     * }
     */
    public static byte OptimizeForPower$get(MemorySegment seg) {
        return (byte)constants$335.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN OptimizeForPower;
     * }
     */
    public static void OptimizeForPower$set(MemorySegment seg, byte x) {
        constants$335.const$4.set(seg, x);
    }
    public static byte OptimizeForPower$get(MemorySegment seg, long index) {
        return (byte)constants$335.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void OptimizeForPower$set(MemorySegment seg, long index, byte x) {
        constants$335.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle FanThrottleTolerance$VH() {
        return constants$335.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE FanThrottleTolerance;
     * }
     */
    public static byte FanThrottleTolerance$get(MemorySegment seg) {
        return (byte)constants$335.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE FanThrottleTolerance;
     * }
     */
    public static void FanThrottleTolerance$set(MemorySegment seg, byte x) {
        constants$335.const$5.set(seg, x);
    }
    public static byte FanThrottleTolerance$get(MemorySegment seg, long index) {
        return (byte)constants$335.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void FanThrottleTolerance$set(MemorySegment seg, long index, byte x) {
        constants$335.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ForcedThrottle$VH() {
        return constants$336.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE ForcedThrottle;
     * }
     */
    public static byte ForcedThrottle$get(MemorySegment seg) {
        return (byte)constants$336.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE ForcedThrottle;
     * }
     */
    public static void ForcedThrottle$set(MemorySegment seg, byte x) {
        constants$336.const$0.set(seg, x);
    }
    public static byte ForcedThrottle$get(MemorySegment seg, long index) {
        return (byte)constants$336.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ForcedThrottle$set(MemorySegment seg, long index, byte x) {
        constants$336.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MinThrottle$VH() {
        return constants$336.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE MinThrottle;
     * }
     */
    public static byte MinThrottle$get(MemorySegment seg) {
        return (byte)constants$336.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE MinThrottle;
     * }
     */
    public static void MinThrottle$set(MemorySegment seg, byte x) {
        constants$336.const$1.set(seg, x);
    }
    public static byte MinThrottle$get(MemorySegment seg, long index) {
        return (byte)constants$336.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void MinThrottle$set(MemorySegment seg, long index, byte x) {
        constants$336.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment OverThrottled$slice(MemorySegment seg) {
        return seg.asSlice(220, 12);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

