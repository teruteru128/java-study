// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IMarshalVtbl {
 *     HRESULT (*QueryInterface)(IMarshal*,const IID*,void**);
 *     ULONG (*AddRef)(IMarshal*);
 *     ULONG (*Release)(IMarshal*);
 *     HRESULT (*GetUnmarshalClass)(IMarshal*,const IID*,void*,DWORD,void*,DWORD,CLSID*);
 *     HRESULT (*GetMarshalSizeMax)(IMarshal*,const IID*,void*,DWORD,void*,DWORD,DWORD*);
 *     HRESULT (*MarshalInterface)(IMarshal*,IStream*,const IID*,void*,DWORD,void*,DWORD);
 *     HRESULT (*UnmarshalInterface)(IMarshal*,IStream*,const IID*,void**);
 *     HRESULT (*ReleaseMarshalData)(IMarshal*,IStream*);
 *     HRESULT (*DisconnectObject)(IMarshal*,DWORD);
 * };
 * }
 */
public class IMarshalVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3009.const$2;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IMarshal*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3009.const$3, fi, constants$37.const$3, scope);
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
        return constants$3009.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IMarshal*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3009.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IMarshal*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3009.const$4.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3009.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3009.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IMarshal*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3009.const$5, fi, constants$18.const$5, scope);
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
        return constants$3010.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IMarshal*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3010.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IMarshal*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3010.const$0.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3010.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3010.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IMarshal*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3010.const$1, fi, constants$18.const$5, scope);
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
        return constants$3010.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IMarshal*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3010.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IMarshal*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3010.const$2.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3010.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3010.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetUnmarshalClass)(IMarshal*,const IID*,void*,DWORD,void*,DWORD,CLSID*);
     * }
     */
    public interface GetUnmarshalClass {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, java.lang.foreign.MemorySegment _x4, int _x5, java.lang.foreign.MemorySegment _x6);
        static MemorySegment allocate(GetUnmarshalClass fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3010.const$3, fi, constants$1499.const$2, scope);
        }
        static GetUnmarshalClass ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, java.lang.foreign.MemorySegment __x4, int __x5, java.lang.foreign.MemorySegment __x6) -> {
                try {
                    return (int)constants$3010.const$4.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle GetUnmarshalClass$VH() {
        return constants$3010.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetUnmarshalClass)(IMarshal*,const IID*,void*,DWORD,void*,DWORD,CLSID*);
     * }
     */
    public static MemorySegment GetUnmarshalClass$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3010.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetUnmarshalClass)(IMarshal*,const IID*,void*,DWORD,void*,DWORD,CLSID*);
     * }
     */
    public static void GetUnmarshalClass$set(MemorySegment seg, MemorySegment x) {
        constants$3010.const$5.set(seg, x);
    }
    public static MemorySegment GetUnmarshalClass$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3010.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void GetUnmarshalClass$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3010.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetUnmarshalClass GetUnmarshalClass(MemorySegment segment, Arena scope) {
        return GetUnmarshalClass.ofAddress(GetUnmarshalClass$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetMarshalSizeMax)(IMarshal*,const IID*,void*,DWORD,void*,DWORD,DWORD*);
     * }
     */
    public interface GetMarshalSizeMax {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, java.lang.foreign.MemorySegment _x4, int _x5, java.lang.foreign.MemorySegment _x6);
        static MemorySegment allocate(GetMarshalSizeMax fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3011.const$0, fi, constants$1499.const$2, scope);
        }
        static GetMarshalSizeMax ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, java.lang.foreign.MemorySegment __x4, int __x5, java.lang.foreign.MemorySegment __x6) -> {
                try {
                    return (int)constants$3010.const$4.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle GetMarshalSizeMax$VH() {
        return constants$3011.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetMarshalSizeMax)(IMarshal*,const IID*,void*,DWORD,void*,DWORD,DWORD*);
     * }
     */
    public static MemorySegment GetMarshalSizeMax$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3011.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetMarshalSizeMax)(IMarshal*,const IID*,void*,DWORD,void*,DWORD,DWORD*);
     * }
     */
    public static void GetMarshalSizeMax$set(MemorySegment seg, MemorySegment x) {
        constants$3011.const$1.set(seg, x);
    }
    public static MemorySegment GetMarshalSizeMax$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3011.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void GetMarshalSizeMax$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3011.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetMarshalSizeMax GetMarshalSizeMax(MemorySegment segment, Arena scope) {
        return GetMarshalSizeMax.ofAddress(GetMarshalSizeMax$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*MarshalInterface)(IMarshal*,IStream*,const IID*,void*,DWORD,void*,DWORD);
     * }
     */
    public interface MarshalInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, int _x4, java.lang.foreign.MemorySegment _x5, int _x6);
        static MemorySegment allocate(MarshalInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3011.const$2, fi, constants$1960.const$0, scope);
        }
        static MarshalInterface ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, int __x4, java.lang.foreign.MemorySegment __x5, int __x6) -> {
                try {
                    return (int)constants$3011.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle MarshalInterface$VH() {
        return constants$3011.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*MarshalInterface)(IMarshal*,IStream*,const IID*,void*,DWORD,void*,DWORD);
     * }
     */
    public static MemorySegment MarshalInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3011.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*MarshalInterface)(IMarshal*,IStream*,const IID*,void*,DWORD,void*,DWORD);
     * }
     */
    public static void MarshalInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3011.const$4.set(seg, x);
    }
    public static MemorySegment MarshalInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3011.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void MarshalInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3011.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MarshalInterface MarshalInterface(MemorySegment segment, Arena scope) {
        return MarshalInterface.ofAddress(MarshalInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*UnmarshalInterface)(IMarshal*,IStream*,const IID*,void**);
     * }
     */
    public interface UnmarshalInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(UnmarshalInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3011.const$5, fi, constants$1.const$3, scope);
        }
        static UnmarshalInterface ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)constants$55.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle UnmarshalInterface$VH() {
        return constants$3012.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*UnmarshalInterface)(IMarshal*,IStream*,const IID*,void**);
     * }
     */
    public static MemorySegment UnmarshalInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3012.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*UnmarshalInterface)(IMarshal*,IStream*,const IID*,void**);
     * }
     */
    public static void UnmarshalInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3012.const$0.set(seg, x);
    }
    public static MemorySegment UnmarshalInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3012.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void UnmarshalInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3012.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static UnmarshalInterface UnmarshalInterface(MemorySegment segment, Arena scope) {
        return UnmarshalInterface.ofAddress(UnmarshalInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*ReleaseMarshalData)(IMarshal*,IStream*);
     * }
     */
    public interface ReleaseMarshalData {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(ReleaseMarshalData fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3012.const$1, fi, constants$34.const$0, scope);
        }
        static ReleaseMarshalData ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle ReleaseMarshalData$VH() {
        return constants$3012.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*ReleaseMarshalData)(IMarshal*,IStream*);
     * }
     */
    public static MemorySegment ReleaseMarshalData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3012.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*ReleaseMarshalData)(IMarshal*,IStream*);
     * }
     */
    public static void ReleaseMarshalData$set(MemorySegment seg, MemorySegment x) {
        constants$3012.const$2.set(seg, x);
    }
    public static MemorySegment ReleaseMarshalData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3012.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ReleaseMarshalData$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3012.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReleaseMarshalData ReleaseMarshalData(MemorySegment segment, Arena scope) {
        return ReleaseMarshalData.ofAddress(ReleaseMarshalData$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*DisconnectObject)(IMarshal*,DWORD);
     * }
     */
    public interface DisconnectObject {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(DisconnectObject fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3012.const$3, fi, constants$65.const$2, scope);
        }
        static DisconnectObject ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle DisconnectObject$VH() {
        return constants$3012.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*DisconnectObject)(IMarshal*,DWORD);
     * }
     */
    public static MemorySegment DisconnectObject$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3012.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*DisconnectObject)(IMarshal*,DWORD);
     * }
     */
    public static void DisconnectObject$set(MemorySegment seg, MemorySegment x) {
        constants$3012.const$4.set(seg, x);
    }
    public static MemorySegment DisconnectObject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3012.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void DisconnectObject$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3012.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static DisconnectObject DisconnectObject(MemorySegment segment, Arena scope) {
        return DisconnectObject.ofAddress(DisconnectObject$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


