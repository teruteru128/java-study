// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IEnumMonikerVtbl {
 *     HRESULT (*QueryInterface)(IEnumMoniker*,const IID*,void**);
 *     ULONG (*AddRef)(IEnumMoniker*);
 *     ULONG (*Release)(IEnumMoniker*);
 *     HRESULT (*Next)(IEnumMoniker*,ULONG,IMoniker**,ULONG*);
 *     HRESULT (*Skip)(IEnumMoniker*,ULONG);
 *     HRESULT (*Reset)(IEnumMoniker*);
 *     HRESULT (*Clone)(IEnumMoniker*,IEnumMoniker**);
 * };
 * }
 */
public class IEnumMonikerVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3232.const$3;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IEnumMoniker*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3232.const$4, fi, constants$37.const$3, scope);
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
        return constants$3232.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IEnumMoniker*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3232.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IEnumMoniker*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3232.const$5.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3232.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3232.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IEnumMoniker*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3233.const$0, fi, constants$18.const$5, scope);
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
        return constants$3233.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IEnumMoniker*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3233.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IEnumMoniker*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3233.const$1.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3233.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3233.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IEnumMoniker*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3233.const$2, fi, constants$18.const$5, scope);
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
        return constants$3233.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IEnumMoniker*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3233.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IEnumMoniker*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3233.const$3.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3233.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3233.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Next)(IEnumMoniker*,ULONG,IMoniker**,ULONG*);
     * }
     */
    public interface Next {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(Next fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3233.const$4, fi, constants$585.const$2, scope);
        }
        static Next ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)constants$2151.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Next$VH() {
        return constants$3233.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Next)(IEnumMoniker*,ULONG,IMoniker**,ULONG*);
     * }
     */
    public static MemorySegment Next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3233.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Next)(IEnumMoniker*,ULONG,IMoniker**,ULONG*);
     * }
     */
    public static void Next$set(MemorySegment seg, MemorySegment x) {
        constants$3233.const$5.set(seg, x);
    }
    public static MemorySegment Next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3233.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Next$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3233.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static Next Next(MemorySegment segment, Arena scope) {
        return Next.ofAddress(Next$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Skip)(IEnumMoniker*,ULONG);
     * }
     */
    public interface Skip {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(Skip fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3234.const$0, fi, constants$65.const$2, scope);
        }
        static Skip ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Skip$VH() {
        return constants$3234.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Skip)(IEnumMoniker*,ULONG);
     * }
     */
    public static MemorySegment Skip$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3234.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Skip)(IEnumMoniker*,ULONG);
     * }
     */
    public static void Skip$set(MemorySegment seg, MemorySegment x) {
        constants$3234.const$1.set(seg, x);
    }
    public static MemorySegment Skip$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3234.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Skip$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3234.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static Skip Skip(MemorySegment segment, Arena scope) {
        return Skip.ofAddress(Skip$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Reset)(IEnumMoniker*);
     * }
     */
    public interface Reset {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Reset fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3234.const$2, fi, constants$18.const$5, scope);
        }
        static Reset ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Reset$VH() {
        return constants$3234.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Reset)(IEnumMoniker*);
     * }
     */
    public static MemorySegment Reset$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3234.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Reset)(IEnumMoniker*);
     * }
     */
    public static void Reset$set(MemorySegment seg, MemorySegment x) {
        constants$3234.const$3.set(seg, x);
    }
    public static MemorySegment Reset$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3234.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Reset$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3234.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static Reset Reset(MemorySegment segment, Arena scope) {
        return Reset.ofAddress(Reset$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Clone)(IEnumMoniker*,IEnumMoniker**);
     * }
     */
    public interface Clone {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(Clone fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3234.const$4, fi, constants$34.const$0, scope);
        }
        static Clone ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Clone$VH() {
        return constants$3234.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Clone)(IEnumMoniker*,IEnumMoniker**);
     * }
     */
    public static MemorySegment Clone$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3234.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Clone)(IEnumMoniker*,IEnumMoniker**);
     * }
     */
    public static void Clone$set(MemorySegment seg, MemorySegment x) {
        constants$3234.const$5.set(seg, x);
    }
    public static MemorySegment Clone$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3234.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Clone$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3234.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static Clone Clone(MemorySegment segment, Arena scope) {
        return Clone.ofAddress(Clone$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


