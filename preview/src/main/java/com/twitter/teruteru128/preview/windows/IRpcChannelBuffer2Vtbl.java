// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IRpcChannelBuffer2Vtbl {
 *     HRESULT (*QueryInterface)(IRpcChannelBuffer2*,const IID*,void**);
 *     ULONG (*AddRef)(IRpcChannelBuffer2*);
 *     ULONG (*Release)(IRpcChannelBuffer2*);
 *     HRESULT (*GetBuffer)(IRpcChannelBuffer2*,RPCOLEMESSAGE*,const IID*);
 *     HRESULT (*SendReceive)(IRpcChannelBuffer2*,RPCOLEMESSAGE*,ULONG*);
 *     HRESULT (*FreeBuffer)(IRpcChannelBuffer2*,RPCOLEMESSAGE*);
 *     HRESULT (*GetDestCtx)(IRpcChannelBuffer2*,DWORD*,void**);
 *     HRESULT (*IsConnected)(IRpcChannelBuffer2*);
 *     HRESULT (*GetProtocolVersion)(IRpcChannelBuffer2*,DWORD*);
 * };
 * }
 */
public class IRpcChannelBuffer2Vtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3062.const$2;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IRpcChannelBuffer2*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3062.const$3, fi, constants$37.const$3, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)constants$620.const$5.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle QueryInterface$VH() {
        return constants$3062.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IRpcChannelBuffer2*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3062.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IRpcChannelBuffer2*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3062.const$4.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3062.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3062.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IRpcChannelBuffer2*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3062.const$5, fi, constants$18.const$5, scope);
        }
        static AddRef ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)constants$495.const$0.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle AddRef$VH() {
        return constants$3063.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IRpcChannelBuffer2*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3063.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IRpcChannelBuffer2*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3063.const$0.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3063.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3063.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IRpcChannelBuffer2*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3063.const$1, fi, constants$18.const$5, scope);
        }
        static Release ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)constants$495.const$0.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Release$VH() {
        return constants$3063.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IRpcChannelBuffer2*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3063.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IRpcChannelBuffer2*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3063.const$2.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3063.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3063.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetBuffer)(IRpcChannelBuffer2*,RPCOLEMESSAGE*,const IID*);
     * }
     */
    public interface GetBuffer {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(GetBuffer fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3063.const$3, fi, constants$37.const$3, scope);
        }
        static GetBuffer ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)constants$620.const$5.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle GetBuffer$VH() {
        return constants$3063.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetBuffer)(IRpcChannelBuffer2*,RPCOLEMESSAGE*,const IID*);
     * }
     */
    public static MemorySegment GetBuffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3063.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetBuffer)(IRpcChannelBuffer2*,RPCOLEMESSAGE*,const IID*);
     * }
     */
    public static void GetBuffer$set(MemorySegment seg, MemorySegment x) {
        constants$3063.const$4.set(seg, x);
    }
    public static MemorySegment GetBuffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3063.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBuffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3063.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBuffer GetBuffer(MemorySegment segment, Arena scope) {
        return GetBuffer.ofAddress(GetBuffer$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*SendReceive)(IRpcChannelBuffer2*,RPCOLEMESSAGE*,ULONG*);
     * }
     */
    public interface SendReceive {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(SendReceive fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3063.const$5, fi, constants$37.const$3, scope);
        }
        static SendReceive ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)constants$620.const$5.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle SendReceive$VH() {
        return constants$3064.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SendReceive)(IRpcChannelBuffer2*,RPCOLEMESSAGE*,ULONG*);
     * }
     */
    public static MemorySegment SendReceive$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3064.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SendReceive)(IRpcChannelBuffer2*,RPCOLEMESSAGE*,ULONG*);
     * }
     */
    public static void SendReceive$set(MemorySegment seg, MemorySegment x) {
        constants$3064.const$0.set(seg, x);
    }
    public static MemorySegment SendReceive$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3064.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void SendReceive$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3064.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static SendReceive SendReceive(MemorySegment segment, Arena scope) {
        return SendReceive.ofAddress(SendReceive$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*FreeBuffer)(IRpcChannelBuffer2*,RPCOLEMESSAGE*);
     * }
     */
    public interface FreeBuffer {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(FreeBuffer fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3064.const$1, fi, constants$34.const$0, scope);
        }
        static FreeBuffer ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)constants$92.const$2.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle FreeBuffer$VH() {
        return constants$3064.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*FreeBuffer)(IRpcChannelBuffer2*,RPCOLEMESSAGE*);
     * }
     */
    public static MemorySegment FreeBuffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3064.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*FreeBuffer)(IRpcChannelBuffer2*,RPCOLEMESSAGE*);
     * }
     */
    public static void FreeBuffer$set(MemorySegment seg, MemorySegment x) {
        constants$3064.const$2.set(seg, x);
    }
    public static MemorySegment FreeBuffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3064.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void FreeBuffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3064.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static FreeBuffer FreeBuffer(MemorySegment segment, Arena scope) {
        return FreeBuffer.ofAddress(FreeBuffer$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetDestCtx)(IRpcChannelBuffer2*,DWORD*,void**);
     * }
     */
    public interface GetDestCtx {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(GetDestCtx fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3064.const$3, fi, constants$37.const$3, scope);
        }
        static GetDestCtx ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)constants$620.const$5.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle GetDestCtx$VH() {
        return constants$3064.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetDestCtx)(IRpcChannelBuffer2*,DWORD*,void**);
     * }
     */
    public static MemorySegment GetDestCtx$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3064.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetDestCtx)(IRpcChannelBuffer2*,DWORD*,void**);
     * }
     */
    public static void GetDestCtx$set(MemorySegment seg, MemorySegment x) {
        constants$3064.const$4.set(seg, x);
    }
    public static MemorySegment GetDestCtx$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3064.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void GetDestCtx$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3064.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetDestCtx GetDestCtx(MemorySegment segment, Arena scope) {
        return GetDestCtx.ofAddress(GetDestCtx$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*IsConnected)(IRpcChannelBuffer2*);
     * }
     */
    public interface IsConnected {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(IsConnected fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3064.const$5, fi, constants$18.const$5, scope);
        }
        static IsConnected ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)constants$495.const$0.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle IsConnected$VH() {
        return constants$3065.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*IsConnected)(IRpcChannelBuffer2*);
     * }
     */
    public static MemorySegment IsConnected$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3065.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*IsConnected)(IRpcChannelBuffer2*);
     * }
     */
    public static void IsConnected$set(MemorySegment seg, MemorySegment x) {
        constants$3065.const$0.set(seg, x);
    }
    public static MemorySegment IsConnected$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3065.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void IsConnected$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3065.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static IsConnected IsConnected(MemorySegment segment, Arena scope) {
        return IsConnected.ofAddress(IsConnected$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetProtocolVersion)(IRpcChannelBuffer2*,DWORD*);
     * }
     */
    public interface GetProtocolVersion {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetProtocolVersion fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3065.const$1, fi, constants$34.const$0, scope);
        }
        static GetProtocolVersion ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)constants$92.const$2.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle GetProtocolVersion$VH() {
        return constants$3065.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetProtocolVersion)(IRpcChannelBuffer2*,DWORD*);
     * }
     */
    public static MemorySegment GetProtocolVersion$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3065.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetProtocolVersion)(IRpcChannelBuffer2*,DWORD*);
     * }
     */
    public static void GetProtocolVersion$set(MemorySegment seg, MemorySegment x) {
        constants$3065.const$2.set(seg, x);
    }
    public static MemorySegment GetProtocolVersion$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3065.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void GetProtocolVersion$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3065.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetProtocolVersion GetProtocolVersion(MemorySegment segment, Arena scope) {
        return GetProtocolVersion.ofAddress(GetProtocolVersion$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

