// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AsyncIUnknownVtbl {
 *     HRESULT (*QueryInterface)(AsyncIUnknown*,const IID*,void**);
 *     ULONG (*AddRef)(AsyncIUnknown*);
 *     ULONG (*Release)(AsyncIUnknown*);
 *     HRESULT (*Begin_QueryInterface)(AsyncIUnknown*,const IID*);
 *     HRESULT (*Finish_QueryInterface)(AsyncIUnknown*,void**);
 *     HRESULT (*Begin_AddRef)(AsyncIUnknown*);
 *     ULONG (*Finish_AddRef)(AsyncIUnknown*);
 *     HRESULT (*Begin_Release)(AsyncIUnknown*);
 *     ULONG (*Finish_Release)(AsyncIUnknown*);
 * };
 * }
 */
public class AsyncIUnknownVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3000.const$1;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(AsyncIUnknown*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3000.const$2, fi, constants$37.const$3, scope);
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
        return constants$3000.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(AsyncIUnknown*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3000.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(AsyncIUnknown*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3000.const$3.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3000.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3000.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(AsyncIUnknown*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3000.const$4, fi, constants$18.const$5, scope);
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
        return constants$3000.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(AsyncIUnknown*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3000.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(AsyncIUnknown*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3000.const$5.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3000.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3000.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(AsyncIUnknown*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3001.const$0, fi, constants$18.const$5, scope);
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
        return constants$3001.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(AsyncIUnknown*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3001.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(AsyncIUnknown*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3001.const$1.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3001.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3001.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Begin_QueryInterface)(AsyncIUnknown*,const IID*);
     * }
     */
    public interface Begin_QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(Begin_QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3001.const$2, fi, constants$34.const$0, scope);
        }
        static Begin_QueryInterface ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Begin_QueryInterface$VH() {
        return constants$3001.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Begin_QueryInterface)(AsyncIUnknown*,const IID*);
     * }
     */
    public static MemorySegment Begin_QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3001.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Begin_QueryInterface)(AsyncIUnknown*,const IID*);
     * }
     */
    public static void Begin_QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3001.const$3.set(seg, x);
    }
    public static MemorySegment Begin_QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3001.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Begin_QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3001.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static Begin_QueryInterface Begin_QueryInterface(MemorySegment segment, Arena scope) {
        return Begin_QueryInterface.ofAddress(Begin_QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Finish_QueryInterface)(AsyncIUnknown*,void**);
     * }
     */
    public interface Finish_QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(Finish_QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3001.const$4, fi, constants$34.const$0, scope);
        }
        static Finish_QueryInterface ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Finish_QueryInterface$VH() {
        return constants$3001.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Finish_QueryInterface)(AsyncIUnknown*,void**);
     * }
     */
    public static MemorySegment Finish_QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3001.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Finish_QueryInterface)(AsyncIUnknown*,void**);
     * }
     */
    public static void Finish_QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3001.const$5.set(seg, x);
    }
    public static MemorySegment Finish_QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3001.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Finish_QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3001.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static Finish_QueryInterface Finish_QueryInterface(MemorySegment segment, Arena scope) {
        return Finish_QueryInterface.ofAddress(Finish_QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Begin_AddRef)(AsyncIUnknown*);
     * }
     */
    public interface Begin_AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Begin_AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3002.const$0, fi, constants$18.const$5, scope);
        }
        static Begin_AddRef ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Begin_AddRef$VH() {
        return constants$3002.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Begin_AddRef)(AsyncIUnknown*);
     * }
     */
    public static MemorySegment Begin_AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3002.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Begin_AddRef)(AsyncIUnknown*);
     * }
     */
    public static void Begin_AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3002.const$1.set(seg, x);
    }
    public static MemorySegment Begin_AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3002.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Begin_AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3002.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static Begin_AddRef Begin_AddRef(MemorySegment segment, Arena scope) {
        return Begin_AddRef.ofAddress(Begin_AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Finish_AddRef)(AsyncIUnknown*);
     * }
     */
    public interface Finish_AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Finish_AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3002.const$2, fi, constants$18.const$5, scope);
        }
        static Finish_AddRef ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Finish_AddRef$VH() {
        return constants$3002.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Finish_AddRef)(AsyncIUnknown*);
     * }
     */
    public static MemorySegment Finish_AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3002.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Finish_AddRef)(AsyncIUnknown*);
     * }
     */
    public static void Finish_AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3002.const$3.set(seg, x);
    }
    public static MemorySegment Finish_AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3002.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Finish_AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3002.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static Finish_AddRef Finish_AddRef(MemorySegment segment, Arena scope) {
        return Finish_AddRef.ofAddress(Finish_AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Begin_Release)(AsyncIUnknown*);
     * }
     */
    public interface Begin_Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Begin_Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3002.const$4, fi, constants$18.const$5, scope);
        }
        static Begin_Release ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Begin_Release$VH() {
        return constants$3002.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Begin_Release)(AsyncIUnknown*);
     * }
     */
    public static MemorySegment Begin_Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3002.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Begin_Release)(AsyncIUnknown*);
     * }
     */
    public static void Begin_Release$set(MemorySegment seg, MemorySegment x) {
        constants$3002.const$5.set(seg, x);
    }
    public static MemorySegment Begin_Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3002.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Begin_Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3002.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static Begin_Release Begin_Release(MemorySegment segment, Arena scope) {
        return Begin_Release.ofAddress(Begin_Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Finish_Release)(AsyncIUnknown*);
     * }
     */
    public interface Finish_Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Finish_Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3003.const$0, fi, constants$18.const$5, scope);
        }
        static Finish_Release ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Finish_Release$VH() {
        return constants$3003.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Finish_Release)(AsyncIUnknown*);
     * }
     */
    public static MemorySegment Finish_Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3003.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Finish_Release)(AsyncIUnknown*);
     * }
     */
    public static void Finish_Release$set(MemorySegment seg, MemorySegment x) {
        constants$3003.const$1.set(seg, x);
    }
    public static MemorySegment Finish_Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3003.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Finish_Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3003.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static Finish_Release Finish_Release(MemorySegment segment, Arena scope) {
        return Finish_Release.ofAddress(Finish_Release$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


