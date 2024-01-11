// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IFillLockBytesVtbl {
 *     HRESULT (*QueryInterface)(IFillLockBytes*,const IID*,void**);
 *     ULONG (*AddRef)(IFillLockBytes*);
 *     ULONG (*Release)(IFillLockBytes*);
 *     HRESULT (*FillAppend)(IFillLockBytes*,void*,ULONG,ULONG*);
 *     HRESULT (*FillAt)(IFillLockBytes*,ULARGE_INTEGER,void*,ULONG,ULONG*);
 *     HRESULT (*SetFillSize)(IFillLockBytes*,ULARGE_INTEGER);
 *     HRESULT (*Terminate)(IFillLockBytes*,BOOL);
 * };
 * }
 */
public class IFillLockBytesVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3343.const$5;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IFillLockBytes*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3344.const$0, fi, constants$37.const$3, scope);
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
        return constants$3344.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IFillLockBytes*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3344.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IFillLockBytes*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3344.const$1.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3344.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3344.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IFillLockBytes*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3344.const$2, fi, constants$18.const$5, scope);
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
        return constants$3344.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IFillLockBytes*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3344.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IFillLockBytes*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3344.const$3.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3344.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3344.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IFillLockBytes*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3344.const$4, fi, constants$18.const$5, scope);
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
        return constants$3344.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IFillLockBytes*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3344.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IFillLockBytes*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3344.const$5.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3344.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3344.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*FillAppend)(IFillLockBytes*,void*,ULONG,ULONG*);
     * }
     */
    public interface FillAppend {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(FillAppend fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3345.const$0, fi, constants$586.const$5, scope);
        }
        static FillAppend ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)constants$2117.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle FillAppend$VH() {
        return constants$3345.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*FillAppend)(IFillLockBytes*,void*,ULONG,ULONG*);
     * }
     */
    public static MemorySegment FillAppend$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3345.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*FillAppend)(IFillLockBytes*,void*,ULONG,ULONG*);
     * }
     */
    public static void FillAppend$set(MemorySegment seg, MemorySegment x) {
        constants$3345.const$1.set(seg, x);
    }
    public static MemorySegment FillAppend$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3345.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void FillAppend$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3345.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static FillAppend FillAppend(MemorySegment segment, Arena scope) {
        return FillAppend.ofAddress(FillAppend$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*FillAt)(IFillLockBytes*,ULARGE_INTEGER,void*,ULONG,ULONG*);
     * }
     */
    public interface FillAt {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(FillAt fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3345.const$2, fi, constants$3283.const$1, scope);
        }
        static FillAt ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)constants$3283.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle FillAt$VH() {
        return constants$3345.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*FillAt)(IFillLockBytes*,ULARGE_INTEGER,void*,ULONG,ULONG*);
     * }
     */
    public static MemorySegment FillAt$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3345.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*FillAt)(IFillLockBytes*,ULARGE_INTEGER,void*,ULONG,ULONG*);
     * }
     */
    public static void FillAt$set(MemorySegment seg, MemorySegment x) {
        constants$3345.const$3.set(seg, x);
    }
    public static MemorySegment FillAt$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3345.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void FillAt$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3345.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static FillAt FillAt(MemorySegment segment, Arena scope) {
        return FillAt.ofAddress(FillAt$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*SetFillSize)(IFillLockBytes*,ULARGE_INTEGER);
     * }
     */
    public interface SetFillSize {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(SetFillSize fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3345.const$4, fi, constants$3052.const$4, scope);
        }
        static SetFillSize ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)constants$3053.const$0.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle SetFillSize$VH() {
        return constants$3345.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetFillSize)(IFillLockBytes*,ULARGE_INTEGER);
     * }
     */
    public static MemorySegment SetFillSize$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3345.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetFillSize)(IFillLockBytes*,ULARGE_INTEGER);
     * }
     */
    public static void SetFillSize$set(MemorySegment seg, MemorySegment x) {
        constants$3345.const$5.set(seg, x);
    }
    public static MemorySegment SetFillSize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3345.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void SetFillSize$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3345.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetFillSize SetFillSize(MemorySegment segment, Arena scope) {
        return SetFillSize.ofAddress(SetFillSize$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Terminate)(IFillLockBytes*,BOOL);
     * }
     */
    public interface Terminate {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(Terminate fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3346.const$0, fi, constants$65.const$2, scope);
        }
        static Terminate ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Terminate$VH() {
        return constants$3346.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Terminate)(IFillLockBytes*,BOOL);
     * }
     */
    public static MemorySegment Terminate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3346.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Terminate)(IFillLockBytes*,BOOL);
     * }
     */
    public static void Terminate$set(MemorySegment seg, MemorySegment x) {
        constants$3346.const$1.set(seg, x);
    }
    public static MemorySegment Terminate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3346.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Terminate$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3346.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static Terminate Terminate(MemorySegment segment, Arena scope) {
        return Terminate.ofAddress(Terminate$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

