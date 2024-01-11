// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ISoftDistExtVtbl {
 *     HRESULT (*QueryInterface)(ISoftDistExt*,const IID*,void**);
 *     ULONG (*AddRef)(ISoftDistExt*);
 *     ULONG (*Release)(ISoftDistExt*);
 *     HRESULT (*ProcessSoftDist)(ISoftDistExt*,LPCWSTR,IXMLElement*,LPSOFTDISTINFO);
 *     HRESULT (*GetFirstCodeBase)(ISoftDistExt*,LPWSTR*,LPDWORD);
 *     HRESULT (*GetNextCodeBase)(ISoftDistExt*,LPWSTR*,LPDWORD);
 *     HRESULT (*AsyncInstallDistributionUnit)(ISoftDistExt*,IBindCtx*,LPVOID,DWORD,LPCODEBASEHOLD);
 * };
 * }
 */
public class ISoftDistExtVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$4301.const$4;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(ISoftDistExt*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4301.const$5, fi, constants$37.const$3, scope);
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
        return constants$4302.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ISoftDistExt*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4302.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ISoftDistExt*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$4302.const$0.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4302.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4302.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(ISoftDistExt*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4302.const$1, fi, constants$18.const$5, scope);
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
        return constants$4302.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(ISoftDistExt*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4302.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(ISoftDistExt*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$4302.const$2.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4302.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4302.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(ISoftDistExt*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4302.const$3, fi, constants$18.const$5, scope);
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
        return constants$4302.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(ISoftDistExt*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4302.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(ISoftDistExt*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$4302.const$4.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4302.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4302.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*ProcessSoftDist)(ISoftDistExt*,LPCWSTR,IXMLElement*,LPSOFTDISTINFO);
     * }
     */
    public interface ProcessSoftDist {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(ProcessSoftDist fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4302.const$5, fi, constants$1.const$3, scope);
        }
        static ProcessSoftDist ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle ProcessSoftDist$VH() {
        return constants$4303.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*ProcessSoftDist)(ISoftDistExt*,LPCWSTR,IXMLElement*,LPSOFTDISTINFO);
     * }
     */
    public static MemorySegment ProcessSoftDist$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4303.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*ProcessSoftDist)(ISoftDistExt*,LPCWSTR,IXMLElement*,LPSOFTDISTINFO);
     * }
     */
    public static void ProcessSoftDist$set(MemorySegment seg, MemorySegment x) {
        constants$4303.const$0.set(seg, x);
    }
    public static MemorySegment ProcessSoftDist$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4303.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcessSoftDist$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4303.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static ProcessSoftDist ProcessSoftDist(MemorySegment segment, Arena scope) {
        return ProcessSoftDist.ofAddress(ProcessSoftDist$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetFirstCodeBase)(ISoftDistExt*,LPWSTR*,LPDWORD);
     * }
     */
    public interface GetFirstCodeBase {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(GetFirstCodeBase fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4303.const$1, fi, constants$37.const$3, scope);
        }
        static GetFirstCodeBase ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle GetFirstCodeBase$VH() {
        return constants$4303.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetFirstCodeBase)(ISoftDistExt*,LPWSTR*,LPDWORD);
     * }
     */
    public static MemorySegment GetFirstCodeBase$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4303.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetFirstCodeBase)(ISoftDistExt*,LPWSTR*,LPDWORD);
     * }
     */
    public static void GetFirstCodeBase$set(MemorySegment seg, MemorySegment x) {
        constants$4303.const$2.set(seg, x);
    }
    public static MemorySegment GetFirstCodeBase$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4303.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void GetFirstCodeBase$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4303.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetFirstCodeBase GetFirstCodeBase(MemorySegment segment, Arena scope) {
        return GetFirstCodeBase.ofAddress(GetFirstCodeBase$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetNextCodeBase)(ISoftDistExt*,LPWSTR*,LPDWORD);
     * }
     */
    public interface GetNextCodeBase {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(GetNextCodeBase fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4303.const$3, fi, constants$37.const$3, scope);
        }
        static GetNextCodeBase ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle GetNextCodeBase$VH() {
        return constants$4303.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetNextCodeBase)(ISoftDistExt*,LPWSTR*,LPDWORD);
     * }
     */
    public static MemorySegment GetNextCodeBase$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4303.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetNextCodeBase)(ISoftDistExt*,LPWSTR*,LPDWORD);
     * }
     */
    public static void GetNextCodeBase$set(MemorySegment seg, MemorySegment x) {
        constants$4303.const$4.set(seg, x);
    }
    public static MemorySegment GetNextCodeBase$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4303.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void GetNextCodeBase$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4303.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetNextCodeBase GetNextCodeBase(MemorySegment segment, Arena scope) {
        return GetNextCodeBase.ofAddress(GetNextCodeBase$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*AsyncInstallDistributionUnit)(ISoftDistExt*,IBindCtx*,LPVOID,DWORD,LPCODEBASEHOLD);
     * }
     */
    public interface AsyncInstallDistributionUnit {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(AsyncInstallDistributionUnit fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4303.const$5, fi, constants$691.const$2, scope);
        }
        static AsyncInstallDistributionUnit ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)constants$2112.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle AsyncInstallDistributionUnit$VH() {
        return constants$4304.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*AsyncInstallDistributionUnit)(ISoftDistExt*,IBindCtx*,LPVOID,DWORD,LPCODEBASEHOLD);
     * }
     */
    public static MemorySegment AsyncInstallDistributionUnit$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4304.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*AsyncInstallDistributionUnit)(ISoftDistExt*,IBindCtx*,LPVOID,DWORD,LPCODEBASEHOLD);
     * }
     */
    public static void AsyncInstallDistributionUnit$set(MemorySegment seg, MemorySegment x) {
        constants$4304.const$0.set(seg, x);
    }
    public static MemorySegment AsyncInstallDistributionUnit$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4304.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void AsyncInstallDistributionUnit$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4304.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static AsyncInstallDistributionUnit AsyncInstallDistributionUnit(MemorySegment segment, Arena scope) {
        return AsyncInstallDistributionUnit.ofAddress(AsyncInstallDistributionUnit$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


