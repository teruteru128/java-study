// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagRPC_CALL_ATTRIBUTES_V2_A {
 *     unsigned int Version;
 *     unsigned long Flags;
 *     unsigned long ServerPrincipalNameBufferLength;
 *     unsigned char* ServerPrincipalName;
 *     unsigned long ClientPrincipalNameBufferLength;
 *     unsigned char* ClientPrincipalName;
 *     unsigned long AuthenticationLevel;
 *     unsigned long AuthenticationService;
 *     BOOL NullSession;
 *     BOOL KernelModeCaller;
 *     unsigned long ProtocolSequence;
 *     unsigned long IsClientLocal;
 *     HANDLE ClientPID;
 *     unsigned long CallStatus;
 *     RpcCallType CallType;
 *     RPC_CALL_LOCAL_ADDRESS_V1* CallLocalAddress;
 *     unsigned short OpNum;
 *     UUID InterfaceUuid;
 * };
 * }
 */
public class tagRPC_CALL_ATTRIBUTES_V2_A {

    public static MemoryLayout $LAYOUT() {
        return constants$1838.const$4;
    }
    public static VarHandle Version$VH() {
        return constants$1838.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)constants$1838.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        constants$1838.const$5.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)constants$1838.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        constants$1838.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Flags$VH() {
        return constants$1839.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$1839.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$1839.const$0.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$1839.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$1839.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ServerPrincipalNameBufferLength$VH() {
        return constants$1839.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long ServerPrincipalNameBufferLength;
     * }
     */
    public static int ServerPrincipalNameBufferLength$get(MemorySegment seg) {
        return (int)constants$1839.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long ServerPrincipalNameBufferLength;
     * }
     */
    public static void ServerPrincipalNameBufferLength$set(MemorySegment seg, int x) {
        constants$1839.const$1.set(seg, x);
    }
    public static int ServerPrincipalNameBufferLength$get(MemorySegment seg, long index) {
        return (int)constants$1839.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ServerPrincipalNameBufferLength$set(MemorySegment seg, long index, int x) {
        constants$1839.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ServerPrincipalName$VH() {
        return constants$1839.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* ServerPrincipalName;
     * }
     */
    public static MemorySegment ServerPrincipalName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1839.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* ServerPrincipalName;
     * }
     */
    public static void ServerPrincipalName$set(MemorySegment seg, MemorySegment x) {
        constants$1839.const$2.set(seg, x);
    }
    public static MemorySegment ServerPrincipalName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1839.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ServerPrincipalName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1839.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ClientPrincipalNameBufferLength$VH() {
        return constants$1839.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long ClientPrincipalNameBufferLength;
     * }
     */
    public static int ClientPrincipalNameBufferLength$get(MemorySegment seg) {
        return (int)constants$1839.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long ClientPrincipalNameBufferLength;
     * }
     */
    public static void ClientPrincipalNameBufferLength$set(MemorySegment seg, int x) {
        constants$1839.const$3.set(seg, x);
    }
    public static int ClientPrincipalNameBufferLength$get(MemorySegment seg, long index) {
        return (int)constants$1839.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ClientPrincipalNameBufferLength$set(MemorySegment seg, long index, int x) {
        constants$1839.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ClientPrincipalName$VH() {
        return constants$1839.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* ClientPrincipalName;
     * }
     */
    public static MemorySegment ClientPrincipalName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1839.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* ClientPrincipalName;
     * }
     */
    public static void ClientPrincipalName$set(MemorySegment seg, MemorySegment x) {
        constants$1839.const$4.set(seg, x);
    }
    public static MemorySegment ClientPrincipalName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1839.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ClientPrincipalName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1839.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle AuthenticationLevel$VH() {
        return constants$1839.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long AuthenticationLevel;
     * }
     */
    public static int AuthenticationLevel$get(MemorySegment seg) {
        return (int)constants$1839.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long AuthenticationLevel;
     * }
     */
    public static void AuthenticationLevel$set(MemorySegment seg, int x) {
        constants$1839.const$5.set(seg, x);
    }
    public static int AuthenticationLevel$get(MemorySegment seg, long index) {
        return (int)constants$1839.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthenticationLevel$set(MemorySegment seg, long index, int x) {
        constants$1839.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle AuthenticationService$VH() {
        return constants$1840.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long AuthenticationService;
     * }
     */
    public static int AuthenticationService$get(MemorySegment seg) {
        return (int)constants$1840.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long AuthenticationService;
     * }
     */
    public static void AuthenticationService$set(MemorySegment seg, int x) {
        constants$1840.const$0.set(seg, x);
    }
    public static int AuthenticationService$get(MemorySegment seg, long index) {
        return (int)constants$1840.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthenticationService$set(MemorySegment seg, long index, int x) {
        constants$1840.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NullSession$VH() {
        return constants$1840.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL NullSession;
     * }
     */
    public static int NullSession$get(MemorySegment seg) {
        return (int)constants$1840.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL NullSession;
     * }
     */
    public static void NullSession$set(MemorySegment seg, int x) {
        constants$1840.const$1.set(seg, x);
    }
    public static int NullSession$get(MemorySegment seg, long index) {
        return (int)constants$1840.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void NullSession$set(MemorySegment seg, long index, int x) {
        constants$1840.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle KernelModeCaller$VH() {
        return constants$1840.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL KernelModeCaller;
     * }
     */
    public static int KernelModeCaller$get(MemorySegment seg) {
        return (int)constants$1840.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL KernelModeCaller;
     * }
     */
    public static void KernelModeCaller$set(MemorySegment seg, int x) {
        constants$1840.const$2.set(seg, x);
    }
    public static int KernelModeCaller$get(MemorySegment seg, long index) {
        return (int)constants$1840.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void KernelModeCaller$set(MemorySegment seg, long index, int x) {
        constants$1840.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ProtocolSequence$VH() {
        return constants$1840.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long ProtocolSequence;
     * }
     */
    public static int ProtocolSequence$get(MemorySegment seg) {
        return (int)constants$1840.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long ProtocolSequence;
     * }
     */
    public static void ProtocolSequence$set(MemorySegment seg, int x) {
        constants$1840.const$3.set(seg, x);
    }
    public static int ProtocolSequence$get(MemorySegment seg, long index) {
        return (int)constants$1840.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ProtocolSequence$set(MemorySegment seg, long index, int x) {
        constants$1840.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle IsClientLocal$VH() {
        return constants$1840.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long IsClientLocal;
     * }
     */
    public static int IsClientLocal$get(MemorySegment seg) {
        return (int)constants$1840.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long IsClientLocal;
     * }
     */
    public static void IsClientLocal$set(MemorySegment seg, int x) {
        constants$1840.const$4.set(seg, x);
    }
    public static int IsClientLocal$get(MemorySegment seg, long index) {
        return (int)constants$1840.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void IsClientLocal$set(MemorySegment seg, long index, int x) {
        constants$1840.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ClientPID$VH() {
        return constants$1840.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE ClientPID;
     * }
     */
    public static MemorySegment ClientPID$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1840.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE ClientPID;
     * }
     */
    public static void ClientPID$set(MemorySegment seg, MemorySegment x) {
        constants$1840.const$5.set(seg, x);
    }
    public static MemorySegment ClientPID$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1840.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ClientPID$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1840.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle CallStatus$VH() {
        return constants$1841.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long CallStatus;
     * }
     */
    public static int CallStatus$get(MemorySegment seg) {
        return (int)constants$1841.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long CallStatus;
     * }
     */
    public static void CallStatus$set(MemorySegment seg, int x) {
        constants$1841.const$0.set(seg, x);
    }
    public static int CallStatus$get(MemorySegment seg, long index) {
        return (int)constants$1841.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void CallStatus$set(MemorySegment seg, long index, int x) {
        constants$1841.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle CallType$VH() {
        return constants$1841.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * RpcCallType CallType;
     * }
     */
    public static int CallType$get(MemorySegment seg) {
        return (int)constants$1841.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * RpcCallType CallType;
     * }
     */
    public static void CallType$set(MemorySegment seg, int x) {
        constants$1841.const$1.set(seg, x);
    }
    public static int CallType$get(MemorySegment seg, long index) {
        return (int)constants$1841.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void CallType$set(MemorySegment seg, long index, int x) {
        constants$1841.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle CallLocalAddress$VH() {
        return constants$1841.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * RPC_CALL_LOCAL_ADDRESS_V1* CallLocalAddress;
     * }
     */
    public static MemorySegment CallLocalAddress$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1841.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * RPC_CALL_LOCAL_ADDRESS_V1* CallLocalAddress;
     * }
     */
    public static void CallLocalAddress$set(MemorySegment seg, MemorySegment x) {
        constants$1841.const$2.set(seg, x);
    }
    public static MemorySegment CallLocalAddress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1841.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void CallLocalAddress$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1841.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle OpNum$VH() {
        return constants$1841.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short OpNum;
     * }
     */
    public static short OpNum$get(MemorySegment seg) {
        return (short)constants$1841.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short OpNum;
     * }
     */
    public static void OpNum$set(MemorySegment seg, short x) {
        constants$1841.const$3.set(seg, x);
    }
    public static short OpNum$get(MemorySegment seg, long index) {
        return (short)constants$1841.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void OpNum$set(MemorySegment seg, long index, short x) {
        constants$1841.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment InterfaceUuid$slice(MemorySegment seg) {
        return seg.asSlice(92, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

