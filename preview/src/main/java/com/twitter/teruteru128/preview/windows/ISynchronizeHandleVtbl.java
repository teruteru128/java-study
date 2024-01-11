// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ISynchronizeHandleVtbl {
 *     HRESULT (*QueryInterface)(ISynchronizeHandle*,const IID*,void**);
 *     ULONG (*AddRef)(ISynchronizeHandle*);
 *     ULONG (*Release)(ISynchronizeHandle*);
 *     HRESULT (*GetHandle)(ISynchronizeHandle*,HANDLE*);
 * };
 * }
 */
public class ISynchronizeHandleVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3116.const$4;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(ISynchronizeHandle*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3116.const$5, fi, constants$37.const$3, scope);
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
        return constants$3117.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ISynchronizeHandle*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3117.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ISynchronizeHandle*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3117.const$0.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3117.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3117.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(ISynchronizeHandle*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3117.const$1, fi, constants$18.const$5, scope);
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
        return constants$3117.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(ISynchronizeHandle*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3117.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(ISynchronizeHandle*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3117.const$2.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3117.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3117.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(ISynchronizeHandle*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3117.const$3, fi, constants$18.const$5, scope);
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
        return constants$3117.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(ISynchronizeHandle*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3117.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(ISynchronizeHandle*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3117.const$4.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3117.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3117.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetHandle)(ISynchronizeHandle*,HANDLE*);
     * }
     */
    public interface GetHandle {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetHandle fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3117.const$5, fi, constants$34.const$0, scope);
        }
        static GetHandle ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle GetHandle$VH() {
        return constants$3118.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetHandle)(ISynchronizeHandle*,HANDLE*);
     * }
     */
    public static MemorySegment GetHandle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3118.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetHandle)(ISynchronizeHandle*,HANDLE*);
     * }
     */
    public static void GetHandle$set(MemorySegment seg, MemorySegment x) {
        constants$3118.const$0.set(seg, x);
    }
    public static MemorySegment GetHandle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3118.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void GetHandle$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3118.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetHandle GetHandle(MemorySegment segment, Arena scope) {
        return GetHandle.ofAddress(GetHandle$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


