// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IOplockStorageVtbl {
 *     HRESULT (*QueryInterface)(IOplockStorage*,const IID*,void**);
 *     ULONG (*AddRef)(IOplockStorage*);
 *     ULONG (*Release)(IOplockStorage*);
 *     HRESULT (*CreateStorageEx)(IOplockStorage*,LPCWSTR,DWORD,DWORD,DWORD,const IID*,void**);
 *     HRESULT (*OpenStorageEx)(IOplockStorage*,LPCWSTR,DWORD,DWORD,DWORD,const IID*,void**);
 * };
 * }
 */
public class IOplockStorageVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3358.const$5;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IOplockStorage*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3359.const$0, fi, constants$37.const$3, scope);
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
        return constants$3359.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IOplockStorage*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3359.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IOplockStorage*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3359.const$1.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3359.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3359.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IOplockStorage*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3359.const$2, fi, constants$18.const$5, scope);
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
        return constants$3359.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IOplockStorage*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3359.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IOplockStorage*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3359.const$3.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3359.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3359.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IOplockStorage*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3359.const$4, fi, constants$18.const$5, scope);
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
        return constants$3359.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IOplockStorage*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3359.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IOplockStorage*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3359.const$5.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3359.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3359.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*CreateStorageEx)(IOplockStorage*,LPCWSTR,DWORD,DWORD,DWORD,const IID*,void**);
     * }
     */
    public interface CreateStorageEx {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3, int _x4, java.lang.foreign.MemorySegment _x5, java.lang.foreign.MemorySegment _x6);
        static MemorySegment allocate(CreateStorageEx fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3360.const$1, fi, constants$3360.const$0, scope);
        }
        static CreateStorageEx ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3, int __x4, java.lang.foreign.MemorySegment __x5, java.lang.foreign.MemorySegment __x6) -> {
                try {
                    return (int)constants$3360.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle CreateStorageEx$VH() {
        return constants$3360.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*CreateStorageEx)(IOplockStorage*,LPCWSTR,DWORD,DWORD,DWORD,const IID*,void**);
     * }
     */
    public static MemorySegment CreateStorageEx$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3360.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*CreateStorageEx)(IOplockStorage*,LPCWSTR,DWORD,DWORD,DWORD,const IID*,void**);
     * }
     */
    public static void CreateStorageEx$set(MemorySegment seg, MemorySegment x) {
        constants$3360.const$3.set(seg, x);
    }
    public static MemorySegment CreateStorageEx$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3360.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void CreateStorageEx$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3360.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static CreateStorageEx CreateStorageEx(MemorySegment segment, Arena scope) {
        return CreateStorageEx.ofAddress(CreateStorageEx$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*OpenStorageEx)(IOplockStorage*,LPCWSTR,DWORD,DWORD,DWORD,const IID*,void**);
     * }
     */
    public interface OpenStorageEx {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3, int _x4, java.lang.foreign.MemorySegment _x5, java.lang.foreign.MemorySegment _x6);
        static MemorySegment allocate(OpenStorageEx fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3360.const$4, fi, constants$3360.const$0, scope);
        }
        static OpenStorageEx ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3, int __x4, java.lang.foreign.MemorySegment __x5, java.lang.foreign.MemorySegment __x6) -> {
                try {
                    return (int)constants$3360.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle OpenStorageEx$VH() {
        return constants$3360.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*OpenStorageEx)(IOplockStorage*,LPCWSTR,DWORD,DWORD,DWORD,const IID*,void**);
     * }
     */
    public static MemorySegment OpenStorageEx$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3360.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*OpenStorageEx)(IOplockStorage*,LPCWSTR,DWORD,DWORD,DWORD,const IID*,void**);
     * }
     */
    public static void OpenStorageEx$set(MemorySegment seg, MemorySegment x) {
        constants$3360.const$5.set(seg, x);
    }
    public static MemorySegment OpenStorageEx$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3360.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void OpenStorageEx$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3360.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static OpenStorageEx OpenStorageEx(MemorySegment segment, Arena scope) {
        return OpenStorageEx.ofAddress(OpenStorageEx$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

