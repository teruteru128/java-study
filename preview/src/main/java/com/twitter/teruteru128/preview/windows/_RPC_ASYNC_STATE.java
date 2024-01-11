// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _RPC_ASYNC_STATE {
 *     unsigned int Size;
 *     unsigned long Signature;
 *     long Lock;
 *     unsigned long Flags;
 *     void* StubInfo;
 *     void* UserInfo;
 *     void* RuntimeInfo;
 *     RPC_ASYNC_EVENT Event;
 *     RPC_NOTIFICATION_TYPES NotificationType;
 *     RPC_ASYNC_NOTIFICATION_INFO u;
 *     LONG_PTR Reserved[4];
 * };
 * }
 */
public class _RPC_ASYNC_STATE {

    public static MemoryLayout $LAYOUT() {
        return constants$1822.const$2;
    }
    public static VarHandle Size$VH() {
        return constants$1822.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$1822.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$1822.const$3.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$1822.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$1822.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Signature$VH() {
        return constants$1822.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long Signature;
     * }
     */
    public static int Signature$get(MemorySegment seg) {
        return (int)constants$1822.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long Signature;
     * }
     */
    public static void Signature$set(MemorySegment seg, int x) {
        constants$1822.const$4.set(seg, x);
    }
    public static int Signature$get(MemorySegment seg, long index) {
        return (int)constants$1822.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Signature$set(MemorySegment seg, long index, int x) {
        constants$1822.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Lock$VH() {
        return constants$1822.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long Lock;
     * }
     */
    public static int Lock$get(MemorySegment seg) {
        return (int)constants$1822.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long Lock;
     * }
     */
    public static void Lock$set(MemorySegment seg, int x) {
        constants$1822.const$5.set(seg, x);
    }
    public static int Lock$get(MemorySegment seg, long index) {
        return (int)constants$1822.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Lock$set(MemorySegment seg, long index, int x) {
        constants$1822.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Flags$VH() {
        return constants$1823.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$1823.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$1823.const$0.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$1823.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$1823.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle StubInfo$VH() {
        return constants$1823.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* StubInfo;
     * }
     */
    public static MemorySegment StubInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1823.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* StubInfo;
     * }
     */
    public static void StubInfo$set(MemorySegment seg, MemorySegment x) {
        constants$1823.const$1.set(seg, x);
    }
    public static MemorySegment StubInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1823.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void StubInfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1823.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle UserInfo$VH() {
        return constants$1823.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* UserInfo;
     * }
     */
    public static MemorySegment UserInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1823.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* UserInfo;
     * }
     */
    public static void UserInfo$set(MemorySegment seg, MemorySegment x) {
        constants$1823.const$2.set(seg, x);
    }
    public static MemorySegment UserInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1823.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void UserInfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1823.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle RuntimeInfo$VH() {
        return constants$1823.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* RuntimeInfo;
     * }
     */
    public static MemorySegment RuntimeInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1823.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* RuntimeInfo;
     * }
     */
    public static void RuntimeInfo$set(MemorySegment seg, MemorySegment x) {
        constants$1823.const$3.set(seg, x);
    }
    public static MemorySegment RuntimeInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1823.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void RuntimeInfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1823.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Event$VH() {
        return constants$1823.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * RPC_ASYNC_EVENT Event;
     * }
     */
    public static int Event$get(MemorySegment seg) {
        return (int)constants$1823.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * RPC_ASYNC_EVENT Event;
     * }
     */
    public static void Event$set(MemorySegment seg, int x) {
        constants$1823.const$4.set(seg, x);
    }
    public static int Event$get(MemorySegment seg, long index) {
        return (int)constants$1823.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Event$set(MemorySegment seg, long index, int x) {
        constants$1823.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NotificationType$VH() {
        return constants$1823.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * RPC_NOTIFICATION_TYPES NotificationType;
     * }
     */
    public static int NotificationType$get(MemorySegment seg) {
        return (int)constants$1823.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * RPC_NOTIFICATION_TYPES NotificationType;
     * }
     */
    public static void NotificationType$set(MemorySegment seg, int x) {
        constants$1823.const$5.set(seg, x);
    }
    public static int NotificationType$get(MemorySegment seg, long index) {
        return (int)constants$1823.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void NotificationType$set(MemorySegment seg, long index, int x) {
        constants$1823.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment u$slice(MemorySegment seg) {
        return seg.asSlice(48, 32);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(80, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


