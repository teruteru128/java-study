// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TOKEN_STATISTICS {
 *     LUID TokenId;
 *     LUID AuthenticationId;
 *     LARGE_INTEGER ExpirationTime;
 *     TOKEN_TYPE TokenType;
 *     SECURITY_IMPERSONATION_LEVEL ImpersonationLevel;
 *     DWORD DynamicCharged;
 *     DWORD DynamicAvailable;
 *     DWORD GroupCount;
 *     DWORD PrivilegeCount;
 *     LUID ModifiedId;
 * };
 * }
 */
public class _TOKEN_STATISTICS {

    public static MemoryLayout $LAYOUT() {
        return constants$172.const$3;
    }
    public static MemorySegment TokenId$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment AuthenticationId$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment ExpirationTime$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static VarHandle TokenType$VH() {
        return constants$172.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * TOKEN_TYPE TokenType;
     * }
     */
    public static int TokenType$get(MemorySegment seg) {
        return (int)constants$172.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * TOKEN_TYPE TokenType;
     * }
     */
    public static void TokenType$set(MemorySegment seg, int x) {
        constants$172.const$4.set(seg, x);
    }
    public static int TokenType$get(MemorySegment seg, long index) {
        return (int)constants$172.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void TokenType$set(MemorySegment seg, long index, int x) {
        constants$172.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ImpersonationLevel$VH() {
        return constants$172.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SECURITY_IMPERSONATION_LEVEL ImpersonationLevel;
     * }
     */
    public static int ImpersonationLevel$get(MemorySegment seg) {
        return (int)constants$172.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SECURITY_IMPERSONATION_LEVEL ImpersonationLevel;
     * }
     */
    public static void ImpersonationLevel$set(MemorySegment seg, int x) {
        constants$172.const$5.set(seg, x);
    }
    public static int ImpersonationLevel$get(MemorySegment seg, long index) {
        return (int)constants$172.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ImpersonationLevel$set(MemorySegment seg, long index, int x) {
        constants$172.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DynamicCharged$VH() {
        return constants$173.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DynamicCharged;
     * }
     */
    public static int DynamicCharged$get(MemorySegment seg) {
        return (int)constants$173.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DynamicCharged;
     * }
     */
    public static void DynamicCharged$set(MemorySegment seg, int x) {
        constants$173.const$0.set(seg, x);
    }
    public static int DynamicCharged$get(MemorySegment seg, long index) {
        return (int)constants$173.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void DynamicCharged$set(MemorySegment seg, long index, int x) {
        constants$173.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DynamicAvailable$VH() {
        return constants$173.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DynamicAvailable;
     * }
     */
    public static int DynamicAvailable$get(MemorySegment seg) {
        return (int)constants$173.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DynamicAvailable;
     * }
     */
    public static void DynamicAvailable$set(MemorySegment seg, int x) {
        constants$173.const$1.set(seg, x);
    }
    public static int DynamicAvailable$get(MemorySegment seg, long index) {
        return (int)constants$173.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void DynamicAvailable$set(MemorySegment seg, long index, int x) {
        constants$173.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle GroupCount$VH() {
        return constants$173.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD GroupCount;
     * }
     */
    public static int GroupCount$get(MemorySegment seg) {
        return (int)constants$173.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD GroupCount;
     * }
     */
    public static void GroupCount$set(MemorySegment seg, int x) {
        constants$173.const$2.set(seg, x);
    }
    public static int GroupCount$get(MemorySegment seg, long index) {
        return (int)constants$173.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void GroupCount$set(MemorySegment seg, long index, int x) {
        constants$173.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle PrivilegeCount$VH() {
        return constants$173.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD PrivilegeCount;
     * }
     */
    public static int PrivilegeCount$get(MemorySegment seg) {
        return (int)constants$173.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD PrivilegeCount;
     * }
     */
    public static void PrivilegeCount$set(MemorySegment seg, int x) {
        constants$173.const$3.set(seg, x);
    }
    public static int PrivilegeCount$get(MemorySegment seg, long index) {
        return (int)constants$173.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void PrivilegeCount$set(MemorySegment seg, long index, int x) {
        constants$173.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ModifiedId$slice(MemorySegment seg) {
        return seg.asSlice(48, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


