// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IDataAdviseHolderVtbl {
 *     HRESULT (*QueryInterface)(IDataAdviseHolder*,const IID*,void**);
 *     ULONG (*AddRef)(IDataAdviseHolder*);
 *     ULONG (*Release)(IDataAdviseHolder*);
 *     HRESULT (*Advise)(IDataAdviseHolder*,IDataObject*,FORMATETC*,DWORD,IAdviseSink*,DWORD*);
 *     HRESULT (*Unadvise)(IDataAdviseHolder*,DWORD);
 *     HRESULT (*EnumAdvise)(IDataAdviseHolder*,IEnumSTATDATA**);
 *     HRESULT (*SendOnDataChange)(IDataAdviseHolder*,IDataObject*,DWORD,DWORD);
 * };
 * }
 */
public class IDataAdviseHolderVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3333.const$4;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IDataAdviseHolder*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3333.const$5, fi, constants$37.const$3, scope);
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
        return constants$3334.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IDataAdviseHolder*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3334.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IDataAdviseHolder*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3334.const$0.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3334.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3334.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IDataAdviseHolder*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3334.const$1, fi, constants$18.const$5, scope);
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
        return constants$3334.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IDataAdviseHolder*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3334.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IDataAdviseHolder*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3334.const$2.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3334.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3334.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IDataAdviseHolder*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3334.const$3, fi, constants$18.const$5, scope);
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
        return constants$3334.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IDataAdviseHolder*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3334.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IDataAdviseHolder*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3334.const$4.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3334.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3334.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Advise)(IDataAdviseHolder*,IDataObject*,FORMATETC*,DWORD,IAdviseSink*,DWORD*);
     * }
     */
    public interface Advise {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5);
        static MemorySegment allocate(Advise fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3334.const$5, fi, constants$572.const$3, scope);
        }
        static Advise ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5) -> {
                try {
                    return (int)constants$2133.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Advise$VH() {
        return constants$3335.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Advise)(IDataAdviseHolder*,IDataObject*,FORMATETC*,DWORD,IAdviseSink*,DWORD*);
     * }
     */
    public static MemorySegment Advise$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3335.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Advise)(IDataAdviseHolder*,IDataObject*,FORMATETC*,DWORD,IAdviseSink*,DWORD*);
     * }
     */
    public static void Advise$set(MemorySegment seg, MemorySegment x) {
        constants$3335.const$0.set(seg, x);
    }
    public static MemorySegment Advise$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3335.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Advise$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3335.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static Advise Advise(MemorySegment segment, Arena scope) {
        return Advise.ofAddress(Advise$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Unadvise)(IDataAdviseHolder*,DWORD);
     * }
     */
    public interface Unadvise {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(Unadvise fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3335.const$1, fi, constants$65.const$2, scope);
        }
        static Unadvise ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Unadvise$VH() {
        return constants$3335.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Unadvise)(IDataAdviseHolder*,DWORD);
     * }
     */
    public static MemorySegment Unadvise$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3335.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Unadvise)(IDataAdviseHolder*,DWORD);
     * }
     */
    public static void Unadvise$set(MemorySegment seg, MemorySegment x) {
        constants$3335.const$2.set(seg, x);
    }
    public static MemorySegment Unadvise$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3335.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Unadvise$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3335.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static Unadvise Unadvise(MemorySegment segment, Arena scope) {
        return Unadvise.ofAddress(Unadvise$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*EnumAdvise)(IDataAdviseHolder*,IEnumSTATDATA**);
     * }
     */
    public interface EnumAdvise {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(EnumAdvise fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3335.const$3, fi, constants$34.const$0, scope);
        }
        static EnumAdvise ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle EnumAdvise$VH() {
        return constants$3335.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*EnumAdvise)(IDataAdviseHolder*,IEnumSTATDATA**);
     * }
     */
    public static MemorySegment EnumAdvise$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3335.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*EnumAdvise)(IDataAdviseHolder*,IEnumSTATDATA**);
     * }
     */
    public static void EnumAdvise$set(MemorySegment seg, MemorySegment x) {
        constants$3335.const$4.set(seg, x);
    }
    public static MemorySegment EnumAdvise$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3335.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void EnumAdvise$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3335.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static EnumAdvise EnumAdvise(MemorySegment segment, Arena scope) {
        return EnumAdvise.ofAddress(EnumAdvise$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*SendOnDataChange)(IDataAdviseHolder*,IDataObject*,DWORD,DWORD);
     * }
     */
    public interface SendOnDataChange {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3);
        static MemorySegment allocate(SendOnDataChange fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3335.const$5, fi, constants$584.const$5, scope);
        }
        static SendOnDataChange ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle SendOnDataChange$VH() {
        return constants$3336.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SendOnDataChange)(IDataAdviseHolder*,IDataObject*,DWORD,DWORD);
     * }
     */
    public static MemorySegment SendOnDataChange$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3336.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SendOnDataChange)(IDataAdviseHolder*,IDataObject*,DWORD,DWORD);
     * }
     */
    public static void SendOnDataChange$set(MemorySegment seg, MemorySegment x) {
        constants$3336.const$0.set(seg, x);
    }
    public static MemorySegment SendOnDataChange$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3336.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void SendOnDataChange$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3336.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static SendOnDataChange SendOnDataChange(MemorySegment segment, Arena scope) {
        return SendOnDataChange.ofAddress(SendOnDataChange$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

