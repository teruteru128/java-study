// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IWinInetFileStreamVtbl {
 *     HRESULT (*QueryInterface)(IWinInetFileStream*,const IID*,void**);
 *     ULONG (*AddRef)(IWinInetFileStream*);
 *     ULONG (*Release)(IWinInetFileStream*);
 *     HRESULT (*SetHandleForUnlock)(IWinInetFileStream*,DWORD_PTR,DWORD_PTR);
 *     HRESULT (*SetDeleteFile)(IWinInetFileStream*,DWORD_PTR);
 * };
 * }
 */
public class IWinInetFileStreamVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$4138.const$2;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IWinInetFileStream*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4138.const$3, fi, constants$37.const$3, scope);
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
        return constants$4138.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IWinInetFileStream*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4138.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IWinInetFileStream*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$4138.const$4.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4138.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4138.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IWinInetFileStream*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4138.const$5, fi, constants$18.const$5, scope);
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
        return constants$4139.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IWinInetFileStream*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4139.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IWinInetFileStream*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$4139.const$0.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4139.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4139.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IWinInetFileStream*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4139.const$1, fi, constants$18.const$5, scope);
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
        return constants$4139.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IWinInetFileStream*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4139.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IWinInetFileStream*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$4139.const$2.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4139.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4139.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*SetHandleForUnlock)(IWinInetFileStream*,DWORD_PTR,DWORD_PTR);
     * }
     */
    public interface SetHandleForUnlock {

        int apply(java.lang.foreign.MemorySegment _x0, long _x1, long _x2);
        static MemorySegment allocate(SetHandleForUnlock fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4139.const$3, fi, constants$676.const$2, scope);
        }
        static SetHandleForUnlock ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, long __x1, long __x2) -> {
                try {
                    return (int)constants$4139.const$4.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle SetHandleForUnlock$VH() {
        return constants$4139.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetHandleForUnlock)(IWinInetFileStream*,DWORD_PTR,DWORD_PTR);
     * }
     */
    public static MemorySegment SetHandleForUnlock$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4139.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetHandleForUnlock)(IWinInetFileStream*,DWORD_PTR,DWORD_PTR);
     * }
     */
    public static void SetHandleForUnlock$set(MemorySegment seg, MemorySegment x) {
        constants$4139.const$5.set(seg, x);
    }
    public static MemorySegment SetHandleForUnlock$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4139.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void SetHandleForUnlock$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4139.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetHandleForUnlock SetHandleForUnlock(MemorySegment segment, Arena scope) {
        return SetHandleForUnlock.ofAddress(SetHandleForUnlock$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*SetDeleteFile)(IWinInetFileStream*,DWORD_PTR);
     * }
     */
    public interface SetDeleteFile {

        int apply(java.lang.foreign.MemorySegment _x0, long _x1);
        static MemorySegment allocate(SetDeleteFile fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4140.const$0, fi, constants$39.const$3, scope);
        }
        static SetDeleteFile ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, long __x1) -> {
                try {
                    return (int)constants$994.const$4.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle SetDeleteFile$VH() {
        return constants$4140.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetDeleteFile)(IWinInetFileStream*,DWORD_PTR);
     * }
     */
    public static MemorySegment SetDeleteFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4140.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetDeleteFile)(IWinInetFileStream*,DWORD_PTR);
     * }
     */
    public static void SetDeleteFile$set(MemorySegment seg, MemorySegment x) {
        constants$4140.const$1.set(seg, x);
    }
    public static MemorySegment SetDeleteFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4140.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void SetDeleteFile$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4140.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetDeleteFile SetDeleteFile(MemorySegment segment, Arena scope) {
        return SetDeleteFile.ofAddress(SetDeleteFile$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


