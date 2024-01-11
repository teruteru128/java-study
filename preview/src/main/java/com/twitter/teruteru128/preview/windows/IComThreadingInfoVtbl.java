// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IComThreadingInfoVtbl {
 *     HRESULT (*QueryInterface)(IComThreadingInfo*,const IID*,void**);
 *     ULONG (*AddRef)(IComThreadingInfo*);
 *     ULONG (*Release)(IComThreadingInfo*);
 *     HRESULT (*GetCurrentApartmentType)(IComThreadingInfo*,APTTYPE*);
 *     HRESULT (*GetCurrentThreadType)(IComThreadingInfo*,THDTYPE*);
 *     HRESULT (*GetCurrentLogicalThreadId)(IComThreadingInfo*,GUID*);
 *     HRESULT (*SetCurrentLogicalThreadId)(IComThreadingInfo*,const GUID*);
 * };
 * }
 */
public class IComThreadingInfoVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3161.const$0;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IComThreadingInfo*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3161.const$1, fi, constants$37.const$3, scope);
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
        return constants$3161.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IComThreadingInfo*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3161.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IComThreadingInfo*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3161.const$2.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3161.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3161.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IComThreadingInfo*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3161.const$3, fi, constants$18.const$5, scope);
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
        return constants$3161.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IComThreadingInfo*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3161.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IComThreadingInfo*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3161.const$4.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3161.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3161.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IComThreadingInfo*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3161.const$5, fi, constants$18.const$5, scope);
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
        return constants$3162.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IComThreadingInfo*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3162.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IComThreadingInfo*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3162.const$0.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3162.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3162.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetCurrentApartmentType)(IComThreadingInfo*,APTTYPE*);
     * }
     */
    public interface GetCurrentApartmentType {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetCurrentApartmentType fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3162.const$1, fi, constants$34.const$0, scope);
        }
        static GetCurrentApartmentType ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle GetCurrentApartmentType$VH() {
        return constants$3162.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetCurrentApartmentType)(IComThreadingInfo*,APTTYPE*);
     * }
     */
    public static MemorySegment GetCurrentApartmentType$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3162.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetCurrentApartmentType)(IComThreadingInfo*,APTTYPE*);
     * }
     */
    public static void GetCurrentApartmentType$set(MemorySegment seg, MemorySegment x) {
        constants$3162.const$2.set(seg, x);
    }
    public static MemorySegment GetCurrentApartmentType$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3162.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void GetCurrentApartmentType$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3162.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetCurrentApartmentType GetCurrentApartmentType(MemorySegment segment, Arena scope) {
        return GetCurrentApartmentType.ofAddress(GetCurrentApartmentType$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetCurrentThreadType)(IComThreadingInfo*,THDTYPE*);
     * }
     */
    public interface GetCurrentThreadType {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetCurrentThreadType fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3162.const$3, fi, constants$34.const$0, scope);
        }
        static GetCurrentThreadType ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle GetCurrentThreadType$VH() {
        return constants$3162.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetCurrentThreadType)(IComThreadingInfo*,THDTYPE*);
     * }
     */
    public static MemorySegment GetCurrentThreadType$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3162.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetCurrentThreadType)(IComThreadingInfo*,THDTYPE*);
     * }
     */
    public static void GetCurrentThreadType$set(MemorySegment seg, MemorySegment x) {
        constants$3162.const$4.set(seg, x);
    }
    public static MemorySegment GetCurrentThreadType$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3162.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void GetCurrentThreadType$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3162.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetCurrentThreadType GetCurrentThreadType(MemorySegment segment, Arena scope) {
        return GetCurrentThreadType.ofAddress(GetCurrentThreadType$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetCurrentLogicalThreadId)(IComThreadingInfo*,GUID*);
     * }
     */
    public interface GetCurrentLogicalThreadId {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetCurrentLogicalThreadId fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3162.const$5, fi, constants$34.const$0, scope);
        }
        static GetCurrentLogicalThreadId ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle GetCurrentLogicalThreadId$VH() {
        return constants$3163.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetCurrentLogicalThreadId)(IComThreadingInfo*,GUID*);
     * }
     */
    public static MemorySegment GetCurrentLogicalThreadId$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3163.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetCurrentLogicalThreadId)(IComThreadingInfo*,GUID*);
     * }
     */
    public static void GetCurrentLogicalThreadId$set(MemorySegment seg, MemorySegment x) {
        constants$3163.const$0.set(seg, x);
    }
    public static MemorySegment GetCurrentLogicalThreadId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3163.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void GetCurrentLogicalThreadId$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3163.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetCurrentLogicalThreadId GetCurrentLogicalThreadId(MemorySegment segment, Arena scope) {
        return GetCurrentLogicalThreadId.ofAddress(GetCurrentLogicalThreadId$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*SetCurrentLogicalThreadId)(IComThreadingInfo*,const GUID*);
     * }
     */
    public interface SetCurrentLogicalThreadId {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(SetCurrentLogicalThreadId fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3163.const$1, fi, constants$34.const$0, scope);
        }
        static SetCurrentLogicalThreadId ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle SetCurrentLogicalThreadId$VH() {
        return constants$3163.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetCurrentLogicalThreadId)(IComThreadingInfo*,const GUID*);
     * }
     */
    public static MemorySegment SetCurrentLogicalThreadId$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3163.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetCurrentLogicalThreadId)(IComThreadingInfo*,const GUID*);
     * }
     */
    public static void SetCurrentLogicalThreadId$set(MemorySegment seg, MemorySegment x) {
        constants$3163.const$2.set(seg, x);
    }
    public static MemorySegment SetCurrentLogicalThreadId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3163.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void SetCurrentLogicalThreadId$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3163.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetCurrentLogicalThreadId SetCurrentLogicalThreadId(MemorySegment segment, Arena scope) {
        return SetCurrentLogicalThreadId.ofAddress(SetCurrentLogicalThreadId$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


