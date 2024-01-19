// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ICodeInstallVtbl {
 *     HRESULT (*QueryInterface)(ICodeInstall*,const IID*,void**);
 *     ULONG (*AddRef)(ICodeInstall*);
 *     ULONG (*Release)(ICodeInstall*);
 *     HRESULT (*GetWindow)(ICodeInstall*,const GUID*,HWND*);
 *     HRESULT (*OnCodeInstallProblem)(ICodeInstall*,ULONG,LPCWSTR,LPCWSTR,DWORD);
 * };
 * }
 */
public class ICodeInstallVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$4143.const$3;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(ICodeInstall*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4143.const$4, fi, constants$37.const$3, scope);
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
        return constants$4143.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ICodeInstall*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4143.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ICodeInstall*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$4143.const$5.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4143.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4143.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(ICodeInstall*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4144.const$0, fi, constants$18.const$5, scope);
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
        return constants$4144.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(ICodeInstall*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4144.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(ICodeInstall*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$4144.const$1.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4144.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4144.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(ICodeInstall*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4144.const$2, fi, constants$18.const$5, scope);
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
        return constants$4144.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(ICodeInstall*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4144.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(ICodeInstall*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$4144.const$3.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4144.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4144.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetWindow)(ICodeInstall*,const GUID*,HWND*);
     * }
     */
    public interface GetWindow {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(GetWindow fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4144.const$4, fi, constants$37.const$3, scope);
        }
        static GetWindow ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle GetWindow$VH() {
        return constants$4144.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetWindow)(ICodeInstall*,const GUID*,HWND*);
     * }
     */
    public static MemorySegment GetWindow$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4144.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetWindow)(ICodeInstall*,const GUID*,HWND*);
     * }
     */
    public static void GetWindow$set(MemorySegment seg, MemorySegment x) {
        constants$4144.const$5.set(seg, x);
    }
    public static MemorySegment GetWindow$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4144.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void GetWindow$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4144.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetWindow GetWindow(MemorySegment segment, Arena scope) {
        return GetWindow.ofAddress(GetWindow$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*OnCodeInstallProblem)(ICodeInstall*,ULONG,LPCWSTR,LPCWSTR,DWORD);
     * }
     */
    public interface OnCodeInstallProblem {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, int _x4);
        static MemorySegment allocate(OnCodeInstallProblem fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4145.const$0, fi, constants$657.const$2, scope);
        }
        static OnCodeInstallProblem ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, int __x4) -> {
                try {
                    return (int)constants$3607.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle OnCodeInstallProblem$VH() {
        return constants$4145.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*OnCodeInstallProblem)(ICodeInstall*,ULONG,LPCWSTR,LPCWSTR,DWORD);
     * }
     */
    public static MemorySegment OnCodeInstallProblem$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4145.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*OnCodeInstallProblem)(ICodeInstall*,ULONG,LPCWSTR,LPCWSTR,DWORD);
     * }
     */
    public static void OnCodeInstallProblem$set(MemorySegment seg, MemorySegment x) {
        constants$4145.const$1.set(seg, x);
    }
    public static MemorySegment OnCodeInstallProblem$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4145.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void OnCodeInstallProblem$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4145.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnCodeInstallProblem OnCodeInstallProblem(MemorySegment segment, Arena scope) {
        return OnCodeInstallProblem.ofAddress(OnCodeInstallProblem$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

