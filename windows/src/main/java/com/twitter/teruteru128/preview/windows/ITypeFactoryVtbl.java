// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ITypeFactoryVtbl {
 *     HRESULT (*QueryInterface)(ITypeFactory*,const IID*,void**);
 *     ULONG (*AddRef)(ITypeFactory*);
 *     ULONG (*Release)(ITypeFactory*);
 *     HRESULT (*CreateFromTypeInfo)(ITypeFactory*,ITypeInfo*,const IID*,IUnknown**);
 * };
 * }
 */
public class ITypeFactoryVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3546.const$5;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(ITypeFactory*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3547.const$0, fi, constants$37.const$3, scope);
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
        return constants$3547.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ITypeFactory*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3547.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ITypeFactory*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3547.const$1.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3547.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3547.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(ITypeFactory*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3547.const$2, fi, constants$18.const$5, scope);
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
        return constants$3547.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(ITypeFactory*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3547.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(ITypeFactory*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3547.const$3.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3547.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3547.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(ITypeFactory*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3547.const$4, fi, constants$18.const$5, scope);
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
        return constants$3547.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(ITypeFactory*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3547.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(ITypeFactory*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3547.const$5.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3547.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3547.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*CreateFromTypeInfo)(ITypeFactory*,ITypeInfo*,const IID*,IUnknown**);
     * }
     */
    public interface CreateFromTypeInfo {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(CreateFromTypeInfo fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3548.const$0, fi, constants$1.const$3, scope);
        }
        static CreateFromTypeInfo ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle CreateFromTypeInfo$VH() {
        return constants$3548.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*CreateFromTypeInfo)(ITypeFactory*,ITypeInfo*,const IID*,IUnknown**);
     * }
     */
    public static MemorySegment CreateFromTypeInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3548.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*CreateFromTypeInfo)(ITypeFactory*,ITypeInfo*,const IID*,IUnknown**);
     * }
     */
    public static void CreateFromTypeInfo$set(MemorySegment seg, MemorySegment x) {
        constants$3548.const$1.set(seg, x);
    }
    public static MemorySegment CreateFromTypeInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3548.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void CreateFromTypeInfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3548.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static CreateFromTypeInfo CreateFromTypeInfo(MemorySegment segment, Arena scope) {
        return CreateFromTypeInfo.ofAddress(CreateFromTypeInfo$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

