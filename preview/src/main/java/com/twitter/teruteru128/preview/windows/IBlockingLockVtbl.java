// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IBlockingLockVtbl {
 *     HRESULT (*QueryInterface)(IBlockingLock*,const IID*,void**);
 *     ULONG (*AddRef)(IBlockingLock*);
 *     ULONG (*Release)(IBlockingLock*);
 *     HRESULT (*Lock)(IBlockingLock*,DWORD);
 *     HRESULT (*Unlock)(IBlockingLock*);
 * };
 * }
 */
public class IBlockingLockVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3354.const$3;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IBlockingLock*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3354.const$4, fi, constants$37.const$3, scope);
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
        return constants$3354.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IBlockingLock*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3354.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IBlockingLock*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3354.const$5.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3354.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3354.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IBlockingLock*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3355.const$0, fi, constants$18.const$5, scope);
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
        return constants$3355.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IBlockingLock*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3355.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IBlockingLock*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3355.const$1.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3355.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3355.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IBlockingLock*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3355.const$2, fi, constants$18.const$5, scope);
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
        return constants$3355.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IBlockingLock*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3355.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IBlockingLock*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3355.const$3.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3355.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3355.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Lock)(IBlockingLock*,DWORD);
     * }
     */
    public interface Lock {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(Lock fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3355.const$4, fi, constants$65.const$2, scope);
        }
        static Lock ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Lock$VH() {
        return constants$3355.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Lock)(IBlockingLock*,DWORD);
     * }
     */
    public static MemorySegment Lock$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3355.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Lock)(IBlockingLock*,DWORD);
     * }
     */
    public static void Lock$set(MemorySegment seg, MemorySegment x) {
        constants$3355.const$5.set(seg, x);
    }
    public static MemorySegment Lock$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3355.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Lock$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3355.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static Lock Lock(MemorySegment segment, Arena scope) {
        return Lock.ofAddress(Lock$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Unlock)(IBlockingLock*);
     * }
     */
    public interface Unlock {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Unlock fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3356.const$0, fi, constants$18.const$5, scope);
        }
        static Unlock ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Unlock$VH() {
        return constants$3356.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Unlock)(IBlockingLock*);
     * }
     */
    public static MemorySegment Unlock$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3356.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Unlock)(IBlockingLock*);
     * }
     */
    public static void Unlock$set(MemorySegment seg, MemorySegment x) {
        constants$3356.const$1.set(seg, x);
    }
    public static MemorySegment Unlock$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3356.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Unlock$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3356.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static Unlock Unlock(MemorySegment segment, Arena scope) {
        return Unlock.ofAddress(Unlock$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

