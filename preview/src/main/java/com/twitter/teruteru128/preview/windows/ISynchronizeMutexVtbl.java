// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ISynchronizeMutexVtbl {
 *     HRESULT (*QueryInterface)(ISynchronizeMutex*,const IID*,void**);
 *     ULONG (*AddRef)(ISynchronizeMutex*);
 *     ULONG (*Release)(ISynchronizeMutex*);
 *     HRESULT (*Wait)(ISynchronizeMutex*,DWORD,DWORD);
 *     HRESULT (*Signal)(ISynchronizeMutex*);
 *     HRESULT (*Reset)(ISynchronizeMutex*);
 *     HRESULT (*ReleaseMutex)(ISynchronizeMutex*);
 * };
 * }
 */
public class ISynchronizeMutexVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3123.const$2;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(ISynchronizeMutex*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3123.const$3, fi, constants$37.const$3, scope);
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
        return constants$3123.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ISynchronizeMutex*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3123.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ISynchronizeMutex*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3123.const$4.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3123.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3123.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(ISynchronizeMutex*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3123.const$5, fi, constants$18.const$5, scope);
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
        return constants$3124.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(ISynchronizeMutex*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3124.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(ISynchronizeMutex*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3124.const$0.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3124.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3124.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(ISynchronizeMutex*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3124.const$1, fi, constants$18.const$5, scope);
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
        return constants$3124.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(ISynchronizeMutex*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3124.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(ISynchronizeMutex*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3124.const$2.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3124.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3124.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Wait)(ISynchronizeMutex*,DWORD,DWORD);
     * }
     */
    public interface Wait {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2);
        static MemorySegment allocate(Wait fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3124.const$3, fi, constants$67.const$1, scope);
        }
        static Wait ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2) -> {
                try {
                    return (int)constants$3030.const$1.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Wait$VH() {
        return constants$3124.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Wait)(ISynchronizeMutex*,DWORD,DWORD);
     * }
     */
    public static MemorySegment Wait$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3124.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Wait)(ISynchronizeMutex*,DWORD,DWORD);
     * }
     */
    public static void Wait$set(MemorySegment seg, MemorySegment x) {
        constants$3124.const$4.set(seg, x);
    }
    public static MemorySegment Wait$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3124.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Wait$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3124.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Wait Wait(MemorySegment segment, Arena scope) {
        return Wait.ofAddress(Wait$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Signal)(ISynchronizeMutex*);
     * }
     */
    public interface Signal {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Signal fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3124.const$5, fi, constants$18.const$5, scope);
        }
        static Signal ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Signal$VH() {
        return constants$3125.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Signal)(ISynchronizeMutex*);
     * }
     */
    public static MemorySegment Signal$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3125.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Signal)(ISynchronizeMutex*);
     * }
     */
    public static void Signal$set(MemorySegment seg, MemorySegment x) {
        constants$3125.const$0.set(seg, x);
    }
    public static MemorySegment Signal$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3125.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Signal$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3125.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static Signal Signal(MemorySegment segment, Arena scope) {
        return Signal.ofAddress(Signal$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Reset)(ISynchronizeMutex*);
     * }
     */
    public interface Reset {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Reset fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3125.const$1, fi, constants$18.const$5, scope);
        }
        static Reset ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Reset$VH() {
        return constants$3125.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Reset)(ISynchronizeMutex*);
     * }
     */
    public static MemorySegment Reset$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3125.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Reset)(ISynchronizeMutex*);
     * }
     */
    public static void Reset$set(MemorySegment seg, MemorySegment x) {
        constants$3125.const$2.set(seg, x);
    }
    public static MemorySegment Reset$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3125.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Reset$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3125.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static Reset Reset(MemorySegment segment, Arena scope) {
        return Reset.ofAddress(Reset$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*ReleaseMutex)(ISynchronizeMutex*);
     * }
     */
    public interface ReleaseMutex {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(ReleaseMutex fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3125.const$3, fi, constants$18.const$5, scope);
        }
        static ReleaseMutex ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle ReleaseMutex$VH() {
        return constants$3125.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*ReleaseMutex)(ISynchronizeMutex*);
     * }
     */
    public static MemorySegment ReleaseMutex$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3125.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*ReleaseMutex)(ISynchronizeMutex*);
     * }
     */
    public static void ReleaseMutex$set(MemorySegment seg, MemorySegment x) {
        constants$3125.const$4.set(seg, x);
    }
    public static MemorySegment ReleaseMutex$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3125.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ReleaseMutex$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3125.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReleaseMutex ReleaseMutex(MemorySegment segment, Arena scope) {
        return ReleaseMutex.ofAddress(ReleaseMutex$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


