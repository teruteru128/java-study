// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AsyncIPipeLongVtbl {
 *     HRESULT (*QueryInterface)(AsyncIPipeLong*,const IID*,void**);
 *     ULONG (*AddRef)(AsyncIPipeLong*);
 *     ULONG (*Release)(AsyncIPipeLong*);
 *     HRESULT (*Begin_Pull)(AsyncIPipeLong*,ULONG);
 *     HRESULT (*Finish_Pull)(AsyncIPipeLong*,LONG*,ULONG*);
 *     HRESULT (*Begin_Push)(AsyncIPipeLong*,LONG*,ULONG);
 *     HRESULT (*Finish_Push)(AsyncIPipeLong*);
 * };
 * }
 */
public class AsyncIPipeLongVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3152.const$2;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(AsyncIPipeLong*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3152.const$3, fi, constants$37.const$3, scope);
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
        return constants$3152.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(AsyncIPipeLong*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3152.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(AsyncIPipeLong*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3152.const$4.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3152.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3152.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(AsyncIPipeLong*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3152.const$5, fi, constants$18.const$5, scope);
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
        return constants$3153.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(AsyncIPipeLong*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3153.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(AsyncIPipeLong*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3153.const$0.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3153.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3153.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(AsyncIPipeLong*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3153.const$1, fi, constants$18.const$5, scope);
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
        return constants$3153.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(AsyncIPipeLong*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3153.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(AsyncIPipeLong*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3153.const$2.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3153.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3153.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Begin_Pull)(AsyncIPipeLong*,ULONG);
     * }
     */
    public interface Begin_Pull {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(Begin_Pull fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3153.const$3, fi, constants$65.const$2, scope);
        }
        static Begin_Pull ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)constants$800.const$4.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Begin_Pull$VH() {
        return constants$3153.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Begin_Pull)(AsyncIPipeLong*,ULONG);
     * }
     */
    public static MemorySegment Begin_Pull$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3153.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Begin_Pull)(AsyncIPipeLong*,ULONG);
     * }
     */
    public static void Begin_Pull$set(MemorySegment seg, MemorySegment x) {
        constants$3153.const$4.set(seg, x);
    }
    public static MemorySegment Begin_Pull$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3153.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Begin_Pull$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3153.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Begin_Pull Begin_Pull(MemorySegment segment, Arena scope) {
        return Begin_Pull.ofAddress(Begin_Pull$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Finish_Pull)(AsyncIPipeLong*,LONG*,ULONG*);
     * }
     */
    public interface Finish_Pull {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(Finish_Pull fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3153.const$5, fi, constants$37.const$3, scope);
        }
        static Finish_Pull ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Finish_Pull$VH() {
        return constants$3154.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Finish_Pull)(AsyncIPipeLong*,LONG*,ULONG*);
     * }
     */
    public static MemorySegment Finish_Pull$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3154.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Finish_Pull)(AsyncIPipeLong*,LONG*,ULONG*);
     * }
     */
    public static void Finish_Pull$set(MemorySegment seg, MemorySegment x) {
        constants$3154.const$0.set(seg, x);
    }
    public static MemorySegment Finish_Pull$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3154.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Finish_Pull$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3154.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static Finish_Pull Finish_Pull(MemorySegment segment, Arena scope) {
        return Finish_Pull.ofAddress(Finish_Pull$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Begin_Push)(AsyncIPipeLong*,LONG*,ULONG);
     * }
     */
    public interface Begin_Push {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2);
        static MemorySegment allocate(Begin_Push fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3154.const$1, fi, constants$570.const$5, scope);
        }
        static Begin_Push ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2) -> {
                try {
                    return (int)constants$779.const$5.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Begin_Push$VH() {
        return constants$3154.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Begin_Push)(AsyncIPipeLong*,LONG*,ULONG);
     * }
     */
    public static MemorySegment Begin_Push$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3154.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Begin_Push)(AsyncIPipeLong*,LONG*,ULONG);
     * }
     */
    public static void Begin_Push$set(MemorySegment seg, MemorySegment x) {
        constants$3154.const$2.set(seg, x);
    }
    public static MemorySegment Begin_Push$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3154.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Begin_Push$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3154.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static Begin_Push Begin_Push(MemorySegment segment, Arena scope) {
        return Begin_Push.ofAddress(Begin_Push$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Finish_Push)(AsyncIPipeLong*);
     * }
     */
    public interface Finish_Push {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Finish_Push fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3154.const$3, fi, constants$18.const$5, scope);
        }
        static Finish_Push ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Finish_Push$VH() {
        return constants$3154.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Finish_Push)(AsyncIPipeLong*);
     * }
     */
    public static MemorySegment Finish_Push$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3154.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Finish_Push)(AsyncIPipeLong*);
     * }
     */
    public static void Finish_Push$set(MemorySegment seg, MemorySegment x) {
        constants$3154.const$4.set(seg, x);
    }
    public static MemorySegment Finish_Push$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3154.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Finish_Push$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3154.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Finish_Push Finish_Push(MemorySegment segment, Arena scope) {
        return Finish_Push.ofAddress(Finish_Push$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

