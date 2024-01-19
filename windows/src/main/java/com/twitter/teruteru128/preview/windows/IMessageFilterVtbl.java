// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IMessageFilterVtbl {
 *     HRESULT (*QueryInterface)(IMessageFilter*,const IID*,void**);
 *     ULONG (*AddRef)(IMessageFilter*);
 *     ULONG (*Release)(IMessageFilter*);
 *     DWORD (*HandleInComingCall)(IMessageFilter*,DWORD,HTASK,DWORD,LPINTERFACEINFO);
 *     DWORD (*RetryRejectedCall)(IMessageFilter*,HTASK,DWORD,DWORD);
 *     DWORD (*MessagePending)(IMessageFilter*,HTASK,DWORD,DWORD);
 * };
 * }
 */
public class IMessageFilterVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3337.const$1;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IMessageFilter*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3337.const$2, fi, constants$37.const$3, scope);
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
        return constants$3337.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IMessageFilter*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3337.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IMessageFilter*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3337.const$3.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3337.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3337.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IMessageFilter*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3337.const$4, fi, constants$18.const$5, scope);
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
        return constants$3337.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IMessageFilter*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3337.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IMessageFilter*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3337.const$5.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3337.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3337.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IMessageFilter*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3338.const$0, fi, constants$18.const$5, scope);
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
        return constants$3338.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IMessageFilter*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3338.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IMessageFilter*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3338.const$1.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3338.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3338.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * DWORD (*HandleInComingCall)(IMessageFilter*,DWORD,HTASK,DWORD,LPINTERFACEINFO);
     * }
     */
    public interface HandleInComingCall {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, int _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(HandleInComingCall fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3338.const$2, fi, constants$703.const$2, scope);
        }
        static HandleInComingCall ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, int __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)constants$3269.const$5.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle HandleInComingCall$VH() {
        return constants$3338.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD (*HandleInComingCall)(IMessageFilter*,DWORD,HTASK,DWORD,LPINTERFACEINFO);
     * }
     */
    public static MemorySegment HandleInComingCall$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3338.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD (*HandleInComingCall)(IMessageFilter*,DWORD,HTASK,DWORD,LPINTERFACEINFO);
     * }
     */
    public static void HandleInComingCall$set(MemorySegment seg, MemorySegment x) {
        constants$3338.const$3.set(seg, x);
    }
    public static MemorySegment HandleInComingCall$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3338.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void HandleInComingCall$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3338.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static HandleInComingCall HandleInComingCall(MemorySegment segment, Arena scope) {
        return HandleInComingCall.ofAddress(HandleInComingCall$get(segment), scope);
    }
    /**
     * {@snippet :
 * DWORD (*RetryRejectedCall)(IMessageFilter*,HTASK,DWORD,DWORD);
     * }
     */
    public interface RetryRejectedCall {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3);
        static MemorySegment allocate(RetryRejectedCall fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3338.const$4, fi, constants$584.const$5, scope);
        }
        static RetryRejectedCall ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3) -> {
                try {
                    return (int)constants$2092.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle RetryRejectedCall$VH() {
        return constants$3338.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD (*RetryRejectedCall)(IMessageFilter*,HTASK,DWORD,DWORD);
     * }
     */
    public static MemorySegment RetryRejectedCall$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3338.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD (*RetryRejectedCall)(IMessageFilter*,HTASK,DWORD,DWORD);
     * }
     */
    public static void RetryRejectedCall$set(MemorySegment seg, MemorySegment x) {
        constants$3338.const$5.set(seg, x);
    }
    public static MemorySegment RetryRejectedCall$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3338.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void RetryRejectedCall$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3338.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static RetryRejectedCall RetryRejectedCall(MemorySegment segment, Arena scope) {
        return RetryRejectedCall.ofAddress(RetryRejectedCall$get(segment), scope);
    }
    /**
     * {@snippet :
 * DWORD (*MessagePending)(IMessageFilter*,HTASK,DWORD,DWORD);
     * }
     */
    public interface MessagePending {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3);
        static MemorySegment allocate(MessagePending fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3339.const$0, fi, constants$584.const$5, scope);
        }
        static MessagePending ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3) -> {
                try {
                    return (int)constants$2092.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle MessagePending$VH() {
        return constants$3339.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD (*MessagePending)(IMessageFilter*,HTASK,DWORD,DWORD);
     * }
     */
    public static MemorySegment MessagePending$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3339.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD (*MessagePending)(IMessageFilter*,HTASK,DWORD,DWORD);
     * }
     */
    public static void MessagePending$set(MemorySegment seg, MemorySegment x) {
        constants$3339.const$1.set(seg, x);
    }
    public static MemorySegment MessagePending$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3339.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void MessagePending$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3339.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MessagePending MessagePending(MemorySegment segment, Arena scope) {
        return MessagePending.ofAddress(MessagePending$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

