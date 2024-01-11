// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IInternetProtocolInfoVtbl {
 *     HRESULT (*QueryInterface)(IInternetProtocolInfo*,const IID*,void**);
 *     ULONG (*AddRef)(IInternetProtocolInfo*);
 *     ULONG (*Release)(IInternetProtocolInfo*);
 *     HRESULT (*ParseUrl)(IInternetProtocolInfo*,LPCWSTR,PARSEACTION,DWORD,LPWSTR,DWORD,DWORD*,DWORD);
 *     HRESULT (*CombineUrl)(IInternetProtocolInfo*,LPCWSTR,LPCWSTR,DWORD,LPWSTR,DWORD,DWORD*,DWORD);
 *     HRESULT (*CompareUrl)(IInternetProtocolInfo*,LPCWSTR,LPCWSTR,DWORD);
 *     HRESULT (*QueryInfo)(IInternetProtocolInfo*,LPCWSTR,QUERYOPTION,DWORD,LPVOID,DWORD,DWORD*,DWORD);
 * };
 * }
 */
public class IInternetProtocolInfoVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$4234.const$4;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IInternetProtocolInfo*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4234.const$5, fi, constants$37.const$3, scope);
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
        return constants$4235.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IInternetProtocolInfo*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4235.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IInternetProtocolInfo*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$4235.const$0.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4235.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4235.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IInternetProtocolInfo*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4235.const$1, fi, constants$18.const$5, scope);
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
        return constants$4235.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IInternetProtocolInfo*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4235.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IInternetProtocolInfo*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$4235.const$2.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4235.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4235.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IInternetProtocolInfo*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4235.const$3, fi, constants$18.const$5, scope);
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
        return constants$4235.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IInternetProtocolInfo*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4235.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IInternetProtocolInfo*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$4235.const$4.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4235.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4235.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*ParseUrl)(IInternetProtocolInfo*,LPCWSTR,PARSEACTION,DWORD,LPWSTR,DWORD,DWORD*,DWORD);
     * }
     */
    public interface ParseUrl {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3, java.lang.foreign.MemorySegment _x4, int _x5, java.lang.foreign.MemorySegment _x6, int _x7);
        static MemorySegment allocate(ParseUrl fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4236.const$0, fi, constants$4235.const$5, scope);
        }
        static ParseUrl ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3, java.lang.foreign.MemorySegment __x4, int __x5, java.lang.foreign.MemorySegment __x6, int __x7) -> {
                try {
                    return (int)constants$4236.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6, __x7);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle ParseUrl$VH() {
        return constants$4236.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*ParseUrl)(IInternetProtocolInfo*,LPCWSTR,PARSEACTION,DWORD,LPWSTR,DWORD,DWORD*,DWORD);
     * }
     */
    public static MemorySegment ParseUrl$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4236.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*ParseUrl)(IInternetProtocolInfo*,LPCWSTR,PARSEACTION,DWORD,LPWSTR,DWORD,DWORD*,DWORD);
     * }
     */
    public static void ParseUrl$set(MemorySegment seg, MemorySegment x) {
        constants$4236.const$2.set(seg, x);
    }
    public static MemorySegment ParseUrl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4236.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ParseUrl$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4236.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static ParseUrl ParseUrl(MemorySegment segment, Arena scope) {
        return ParseUrl.ofAddress(ParseUrl$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*CombineUrl)(IInternetProtocolInfo*,LPCWSTR,LPCWSTR,DWORD,LPWSTR,DWORD,DWORD*,DWORD);
     * }
     */
    public interface CombineUrl {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, java.lang.foreign.MemorySegment _x4, int _x5, java.lang.foreign.MemorySegment _x6, int _x7);
        static MemorySegment allocate(CombineUrl fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4236.const$3, fi, constants$1961.const$4, scope);
        }
        static CombineUrl ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, java.lang.foreign.MemorySegment __x4, int __x5, java.lang.foreign.MemorySegment __x6, int __x7) -> {
                try {
                    return (int)constants$4236.const$4.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6, __x7);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle CombineUrl$VH() {
        return constants$4236.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*CombineUrl)(IInternetProtocolInfo*,LPCWSTR,LPCWSTR,DWORD,LPWSTR,DWORD,DWORD*,DWORD);
     * }
     */
    public static MemorySegment CombineUrl$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4236.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*CombineUrl)(IInternetProtocolInfo*,LPCWSTR,LPCWSTR,DWORD,LPWSTR,DWORD,DWORD*,DWORD);
     * }
     */
    public static void CombineUrl$set(MemorySegment seg, MemorySegment x) {
        constants$4236.const$5.set(seg, x);
    }
    public static MemorySegment CombineUrl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4236.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void CombineUrl$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4236.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static CombineUrl CombineUrl(MemorySegment segment, Arena scope) {
        return CombineUrl.ofAddress(CombineUrl$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*CompareUrl)(IInternetProtocolInfo*,LPCWSTR,LPCWSTR,DWORD);
     * }
     */
    public interface CompareUrl {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3);
        static MemorySegment allocate(CompareUrl fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4237.const$0, fi, constants$607.const$3, scope);
        }
        static CompareUrl ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3) -> {
                try {
                    return (int)constants$2133.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle CompareUrl$VH() {
        return constants$4237.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*CompareUrl)(IInternetProtocolInfo*,LPCWSTR,LPCWSTR,DWORD);
     * }
     */
    public static MemorySegment CompareUrl$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4237.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*CompareUrl)(IInternetProtocolInfo*,LPCWSTR,LPCWSTR,DWORD);
     * }
     */
    public static void CompareUrl$set(MemorySegment seg, MemorySegment x) {
        constants$4237.const$1.set(seg, x);
    }
    public static MemorySegment CompareUrl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4237.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void CompareUrl$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4237.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static CompareUrl CompareUrl(MemorySegment segment, Arena scope) {
        return CompareUrl.ofAddress(CompareUrl$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInfo)(IInternetProtocolInfo*,LPCWSTR,QUERYOPTION,DWORD,LPVOID,DWORD,DWORD*,DWORD);
     * }
     */
    public interface QueryInfo {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3, java.lang.foreign.MemorySegment _x4, int _x5, java.lang.foreign.MemorySegment _x6, int _x7);
        static MemorySegment allocate(QueryInfo fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4237.const$2, fi, constants$4235.const$5, scope);
        }
        static QueryInfo ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3, java.lang.foreign.MemorySegment __x4, int __x5, java.lang.foreign.MemorySegment __x6, int __x7) -> {
                try {
                    return (int)constants$4236.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6, __x7);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle QueryInfo$VH() {
        return constants$4237.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInfo)(IInternetProtocolInfo*,LPCWSTR,QUERYOPTION,DWORD,LPVOID,DWORD,DWORD*,DWORD);
     * }
     */
    public static MemorySegment QueryInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4237.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInfo)(IInternetProtocolInfo*,LPCWSTR,QUERYOPTION,DWORD,LPVOID,DWORD,DWORD*,DWORD);
     * }
     */
    public static void QueryInfo$set(MemorySegment seg, MemorySegment x) {
        constants$4237.const$3.set(seg, x);
    }
    public static MemorySegment QueryInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4237.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4237.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInfo QueryInfo(MemorySegment segment, Arena scope) {
        return QueryInfo.ofAddress(QueryInfo$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


