// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ITypeMarshalVtbl {
 *     HRESULT (*QueryInterface)(ITypeMarshal*,const IID*,void**);
 *     ULONG (*AddRef)(ITypeMarshal*);
 *     ULONG (*Release)(ITypeMarshal*);
 *     HRESULT (*Size)(ITypeMarshal*,PVOID,DWORD,PVOID,ULONG*);
 *     HRESULT (*Marshal)(ITypeMarshal*,PVOID,DWORD,PVOID,ULONG,BYTE*,ULONG*);
 *     HRESULT (*Unmarshal)(ITypeMarshal*,PVOID,DWORD,ULONG,BYTE*,ULONG*);
 *     HRESULT (*Free)(ITypeMarshal*,PVOID);
 * };
 * }
 */
public class ITypeMarshalVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3548.const$5;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(ITypeMarshal*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3549.const$0, fi, constants$37.const$3, scope);
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
        return constants$3549.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ITypeMarshal*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3549.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ITypeMarshal*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3549.const$1.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3549.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3549.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(ITypeMarshal*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3549.const$2, fi, constants$18.const$5, scope);
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
        return constants$3549.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(ITypeMarshal*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3549.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(ITypeMarshal*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3549.const$3.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3549.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3549.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(ITypeMarshal*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3549.const$4, fi, constants$18.const$5, scope);
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
        return constants$3549.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(ITypeMarshal*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3549.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(ITypeMarshal*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3549.const$5.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3549.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3549.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Size)(ITypeMarshal*,PVOID,DWORD,PVOID,ULONG*);
     * }
     */
    public interface Size {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(Size fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3550.const$0, fi, constants$588.const$3, scope);
        }
        static Size ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)constants$1005.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Size$VH() {
        return constants$3550.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Size)(ITypeMarshal*,PVOID,DWORD,PVOID,ULONG*);
     * }
     */
    public static MemorySegment Size$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3550.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Size)(ITypeMarshal*,PVOID,DWORD,PVOID,ULONG*);
     * }
     */
    public static void Size$set(MemorySegment seg, MemorySegment x) {
        constants$3550.const$1.set(seg, x);
    }
    public static MemorySegment Size$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3550.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3550.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static Size Size(MemorySegment segment, Arena scope) {
        return Size.ofAddress(Size$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Marshal)(ITypeMarshal*,PVOID,DWORD,PVOID,ULONG,BYTE*,ULONG*);
     * }
     */
    public interface Marshal {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3, int _x4, java.lang.foreign.MemorySegment _x5, java.lang.foreign.MemorySegment _x6);
        static MemorySegment allocate(Marshal fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3550.const$2, fi, constants$608.const$4, scope);
        }
        static Marshal ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemorySegment __x3, int __x4, java.lang.foreign.MemorySegment __x5, java.lang.foreign.MemorySegment __x6) -> {
                try {
                    return (int)constants$3550.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Marshal$VH() {
        return constants$3550.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Marshal)(ITypeMarshal*,PVOID,DWORD,PVOID,ULONG,BYTE*,ULONG*);
     * }
     */
    public static MemorySegment Marshal$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3550.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Marshal)(ITypeMarshal*,PVOID,DWORD,PVOID,ULONG,BYTE*,ULONG*);
     * }
     */
    public static void Marshal$set(MemorySegment seg, MemorySegment x) {
        constants$3550.const$4.set(seg, x);
    }
    public static MemorySegment Marshal$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3550.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Marshal$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3550.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Marshal Marshal(MemorySegment segment, Arena scope) {
        return Marshal.ofAddress(Marshal$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Unmarshal)(ITypeMarshal*,PVOID,DWORD,ULONG,BYTE*,ULONG*);
     * }
     */
    public interface Unmarshal {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5);
        static MemorySegment allocate(Unmarshal fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3550.const$5, fi, constants$1489.const$2, scope);
        }
        static Unmarshal ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5) -> {
                try {
                    return (int)constants$2133.const$5.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Unmarshal$VH() {
        return constants$3551.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Unmarshal)(ITypeMarshal*,PVOID,DWORD,ULONG,BYTE*,ULONG*);
     * }
     */
    public static MemorySegment Unmarshal$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3551.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Unmarshal)(ITypeMarshal*,PVOID,DWORD,ULONG,BYTE*,ULONG*);
     * }
     */
    public static void Unmarshal$set(MemorySegment seg, MemorySegment x) {
        constants$3551.const$0.set(seg, x);
    }
    public static MemorySegment Unmarshal$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3551.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Unmarshal$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3551.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static Unmarshal Unmarshal(MemorySegment segment, Arena scope) {
        return Unmarshal.ofAddress(Unmarshal$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Free)(ITypeMarshal*,PVOID);
     * }
     */
    public interface Free {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(Free fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3551.const$1, fi, constants$34.const$0, scope);
        }
        static Free ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Free$VH() {
        return constants$3551.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Free)(ITypeMarshal*,PVOID);
     * }
     */
    public static MemorySegment Free$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3551.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Free)(ITypeMarshal*,PVOID);
     * }
     */
    public static void Free$set(MemorySegment seg, MemorySegment x) {
        constants$3551.const$2.set(seg, x);
    }
    public static MemorySegment Free$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3551.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Free$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3551.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static Free Free(MemorySegment segment, Arena scope) {
        return Free.ofAddress(Free$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


