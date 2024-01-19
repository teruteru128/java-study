// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _COAUTHIDENTITY {
 *     USHORT* User;
 *     ULONG UserLength;
 *     USHORT* Domain;
 *     ULONG DomainLength;
 *     USHORT* Password;
 *     ULONG PasswordLength;
 *     ULONG Flags;
 * };
 * }
 */
public class _COAUTHIDENTITY {

    public static MemoryLayout $LAYOUT() {
        return constants$2339.const$1;
    }
    public static VarHandle User$VH() {
        return constants$2339.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USHORT* User;
     * }
     */
    public static MemorySegment User$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2339.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USHORT* User;
     * }
     */
    public static void User$set(MemorySegment seg, MemorySegment x) {
        constants$2339.const$2.set(seg, x);
    }
    public static MemorySegment User$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2339.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void User$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2339.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle UserLength$VH() {
        return constants$2339.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG UserLength;
     * }
     */
    public static int UserLength$get(MemorySegment seg) {
        return (int)constants$2339.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG UserLength;
     * }
     */
    public static void UserLength$set(MemorySegment seg, int x) {
        constants$2339.const$3.set(seg, x);
    }
    public static int UserLength$get(MemorySegment seg, long index) {
        return (int)constants$2339.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void UserLength$set(MemorySegment seg, long index, int x) {
        constants$2339.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Domain$VH() {
        return constants$2339.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USHORT* Domain;
     * }
     */
    public static MemorySegment Domain$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2339.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USHORT* Domain;
     * }
     */
    public static void Domain$set(MemorySegment seg, MemorySegment x) {
        constants$2339.const$4.set(seg, x);
    }
    public static MemorySegment Domain$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2339.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Domain$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2339.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DomainLength$VH() {
        return constants$2339.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG DomainLength;
     * }
     */
    public static int DomainLength$get(MemorySegment seg) {
        return (int)constants$2339.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG DomainLength;
     * }
     */
    public static void DomainLength$set(MemorySegment seg, int x) {
        constants$2339.const$5.set(seg, x);
    }
    public static int DomainLength$get(MemorySegment seg, long index) {
        return (int)constants$2339.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void DomainLength$set(MemorySegment seg, long index, int x) {
        constants$2339.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Password$VH() {
        return constants$2340.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USHORT* Password;
     * }
     */
    public static MemorySegment Password$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2340.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USHORT* Password;
     * }
     */
    public static void Password$set(MemorySegment seg, MemorySegment x) {
        constants$2340.const$0.set(seg, x);
    }
    public static MemorySegment Password$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2340.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Password$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2340.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle PasswordLength$VH() {
        return constants$2340.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG PasswordLength;
     * }
     */
    public static int PasswordLength$get(MemorySegment seg) {
        return (int)constants$2340.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG PasswordLength;
     * }
     */
    public static void PasswordLength$set(MemorySegment seg, int x) {
        constants$2340.const$1.set(seg, x);
    }
    public static int PasswordLength$get(MemorySegment seg, long index) {
        return (int)constants$2340.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void PasswordLength$set(MemorySegment seg, long index, int x) {
        constants$2340.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Flags$VH() {
        return constants$2340.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$2340.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$2340.const$2.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$2340.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$2340.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

