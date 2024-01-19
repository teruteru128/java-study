// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IChannelHookVtbl {
 *     HRESULT (*QueryInterface)(IChannelHook*,const IID*,void**);
 *     ULONG (*AddRef)(IChannelHook*);
 *     ULONG (*Release)(IChannelHook*);
 *     void (*ClientGetSize)(IChannelHook*,const GUID*,const IID*,ULONG*);
 *     void (*ClientFillBuffer)(IChannelHook*,const GUID*,const IID*,ULONG*,void*);
 *     void (*ClientNotify)(IChannelHook*,const GUID*,const IID*,ULONG,void*,DWORD,HRESULT);
 *     void (*ServerNotify)(IChannelHook*,const GUID*,const IID*,ULONG,void*,DWORD);
 *     void (*ServerGetSize)(IChannelHook*,const GUID*,const IID*,HRESULT,ULONG*);
 *     void (*ServerFillBuffer)(IChannelHook*,const GUID*,const IID*,ULONG*,void*,HRESULT);
 * };
 * }
 */
public class IChannelHookVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3089.const$0;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IChannelHook*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3089.const$1, fi, constants$37.const$3, scope);
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
        return constants$3089.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IChannelHook*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3089.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IChannelHook*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3089.const$2.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3089.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3089.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IChannelHook*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3089.const$3, fi, constants$18.const$5, scope);
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
        return constants$3089.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IChannelHook*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3089.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IChannelHook*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3089.const$4.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3089.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3089.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IChannelHook*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3089.const$5, fi, constants$18.const$5, scope);
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
        return constants$3090.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IChannelHook*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3090.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IChannelHook*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3090.const$0.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3090.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3090.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*ClientGetSize)(IChannelHook*,const GUID*,const IID*,ULONG*);
     * }
     */
    public interface ClientGetSize {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(ClientGetSize fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3090.const$1, fi, constants$467.const$0, scope);
        }
        static ClientGetSize ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    constants$3090.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle ClientGetSize$VH() {
        return constants$3090.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*ClientGetSize)(IChannelHook*,const GUID*,const IID*,ULONG*);
     * }
     */
    public static MemorySegment ClientGetSize$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3090.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*ClientGetSize)(IChannelHook*,const GUID*,const IID*,ULONG*);
     * }
     */
    public static void ClientGetSize$set(MemorySegment seg, MemorySegment x) {
        constants$3090.const$3.set(seg, x);
    }
    public static MemorySegment ClientGetSize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3090.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ClientGetSize$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3090.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static ClientGetSize ClientGetSize(MemorySegment segment, Arena scope) {
        return ClientGetSize.ofAddress(ClientGetSize$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*ClientFillBuffer)(IChannelHook*,const GUID*,const IID*,ULONG*,void*);
     * }
     */
    public interface ClientFillBuffer {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(ClientFillBuffer fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3090.const$4, fi, constants$2966.const$0, scope);
        }
        static ClientFillBuffer ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    constants$3090.const$5.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle ClientFillBuffer$VH() {
        return constants$3091.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*ClientFillBuffer)(IChannelHook*,const GUID*,const IID*,ULONG*,void*);
     * }
     */
    public static MemorySegment ClientFillBuffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3091.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*ClientFillBuffer)(IChannelHook*,const GUID*,const IID*,ULONG*,void*);
     * }
     */
    public static void ClientFillBuffer$set(MemorySegment seg, MemorySegment x) {
        constants$3091.const$0.set(seg, x);
    }
    public static MemorySegment ClientFillBuffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3091.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ClientFillBuffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3091.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static ClientFillBuffer ClientFillBuffer(MemorySegment segment, Arena scope) {
        return ClientFillBuffer.ofAddress(ClientFillBuffer$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*ClientNotify)(IChannelHook*,const GUID*,const IID*,ULONG,void*,DWORD,HRESULT);
     * }
     */
    public interface ClientNotify {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, java.lang.foreign.MemorySegment _x4, int _x5, int _x6);
        static MemorySegment allocate(ClientNotify fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3091.const$2, fi, constants$3091.const$1, scope);
        }
        static ClientNotify ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, java.lang.foreign.MemorySegment __x4, int __x5, int __x6) -> {
                try {
                    constants$3091.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle ClientNotify$VH() {
        return constants$3091.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*ClientNotify)(IChannelHook*,const GUID*,const IID*,ULONG,void*,DWORD,HRESULT);
     * }
     */
    public static MemorySegment ClientNotify$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3091.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*ClientNotify)(IChannelHook*,const GUID*,const IID*,ULONG,void*,DWORD,HRESULT);
     * }
     */
    public static void ClientNotify$set(MemorySegment seg, MemorySegment x) {
        constants$3091.const$4.set(seg, x);
    }
    public static MemorySegment ClientNotify$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3091.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ClientNotify$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3091.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static ClientNotify ClientNotify(MemorySegment segment, Arena scope) {
        return ClientNotify.ofAddress(ClientNotify$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*ServerNotify)(IChannelHook*,const GUID*,const IID*,ULONG,void*,DWORD);
     * }
     */
    public interface ServerNotify {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, java.lang.foreign.MemorySegment _x4, int _x5);
        static MemorySegment allocate(ServerNotify fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3092.const$0, fi, constants$3091.const$5, scope);
        }
        static ServerNotify ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, java.lang.foreign.MemorySegment __x4, int __x5) -> {
                try {
                    constants$3092.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle ServerNotify$VH() {
        return constants$3092.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*ServerNotify)(IChannelHook*,const GUID*,const IID*,ULONG,void*,DWORD);
     * }
     */
    public static MemorySegment ServerNotify$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3092.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*ServerNotify)(IChannelHook*,const GUID*,const IID*,ULONG,void*,DWORD);
     * }
     */
    public static void ServerNotify$set(MemorySegment seg, MemorySegment x) {
        constants$3092.const$2.set(seg, x);
    }
    public static MemorySegment ServerNotify$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3092.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ServerNotify$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3092.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static ServerNotify ServerNotify(MemorySegment segment, Arena scope) {
        return ServerNotify.ofAddress(ServerNotify$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*ServerGetSize)(IChannelHook*,const GUID*,const IID*,HRESULT,ULONG*);
     * }
     */
    public interface ServerGetSize {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(ServerGetSize fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3092.const$4, fi, constants$3092.const$3, scope);
        }
        static ServerGetSize ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    constants$3092.const$5.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle ServerGetSize$VH() {
        return constants$3093.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*ServerGetSize)(IChannelHook*,const GUID*,const IID*,HRESULT,ULONG*);
     * }
     */
    public static MemorySegment ServerGetSize$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3093.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*ServerGetSize)(IChannelHook*,const GUID*,const IID*,HRESULT,ULONG*);
     * }
     */
    public static void ServerGetSize$set(MemorySegment seg, MemorySegment x) {
        constants$3093.const$0.set(seg, x);
    }
    public static MemorySegment ServerGetSize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3093.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ServerGetSize$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3093.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static ServerGetSize ServerGetSize(MemorySegment segment, Arena scope) {
        return ServerGetSize.ofAddress(ServerGetSize$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*ServerFillBuffer)(IChannelHook*,const GUID*,const IID*,ULONG*,void*,HRESULT);
     * }
     */
    public interface ServerFillBuffer {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, int _x5);
        static MemorySegment allocate(ServerFillBuffer fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3093.const$1, fi, constants$2231.const$1, scope);
        }
        static ServerFillBuffer ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, int __x5) -> {
                try {
                    constants$2231.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle ServerFillBuffer$VH() {
        return constants$3093.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*ServerFillBuffer)(IChannelHook*,const GUID*,const IID*,ULONG*,void*,HRESULT);
     * }
     */
    public static MemorySegment ServerFillBuffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3093.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*ServerFillBuffer)(IChannelHook*,const GUID*,const IID*,ULONG*,void*,HRESULT);
     * }
     */
    public static void ServerFillBuffer$set(MemorySegment seg, MemorySegment x) {
        constants$3093.const$2.set(seg, x);
    }
    public static MemorySegment ServerFillBuffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3093.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ServerFillBuffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3093.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static ServerFillBuffer ServerFillBuffer(MemorySegment segment, Arena scope) {
        return ServerFillBuffer.ofAddress(ServerFillBuffer$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

