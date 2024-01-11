// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IRunnableObjectVtbl {
 *     HRESULT (*QueryInterface)(IRunnableObject*,const IID*,void**);
 *     ULONG (*AddRef)(IRunnableObject*);
 *     ULONG (*Release)(IRunnableObject*);
 *     HRESULT (*GetRunningClass)(IRunnableObject*,LPCLSID);
 *     HRESULT (*Run)(IRunnableObject*,LPBINDCTX);
 *     BOOL (*IsRunning)(IRunnableObject*);
 *     HRESULT (*LockRunning)(IRunnableObject*,BOOL,BOOL);
 *     HRESULT (*SetContainedObject)(IRunnableObject*,BOOL);
 * };
 * }
 */
public class IRunnableObjectVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3236.const$1;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IRunnableObject*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3236.const$2, fi, constants$37.const$3, scope);
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
        return constants$3236.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IRunnableObject*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3236.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IRunnableObject*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3236.const$3.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3236.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3236.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IRunnableObject*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3236.const$4, fi, constants$18.const$5, scope);
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
        return constants$3236.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IRunnableObject*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3236.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IRunnableObject*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3236.const$5.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3236.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3236.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IRunnableObject*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3237.const$0, fi, constants$18.const$5, scope);
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
        return constants$3237.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IRunnableObject*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3237.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IRunnableObject*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3237.const$1.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3237.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3237.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetRunningClass)(IRunnableObject*,LPCLSID);
     * }
     */
    public interface GetRunningClass {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetRunningClass fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3237.const$2, fi, constants$34.const$0, scope);
        }
        static GetRunningClass ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle GetRunningClass$VH() {
        return constants$3237.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetRunningClass)(IRunnableObject*,LPCLSID);
     * }
     */
    public static MemorySegment GetRunningClass$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3237.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetRunningClass)(IRunnableObject*,LPCLSID);
     * }
     */
    public static void GetRunningClass$set(MemorySegment seg, MemorySegment x) {
        constants$3237.const$3.set(seg, x);
    }
    public static MemorySegment GetRunningClass$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3237.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void GetRunningClass$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3237.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetRunningClass GetRunningClass(MemorySegment segment, Arena scope) {
        return GetRunningClass.ofAddress(GetRunningClass$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Run)(IRunnableObject*,LPBINDCTX);
     * }
     */
    public interface Run {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(Run fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3237.const$4, fi, constants$34.const$0, scope);
        }
        static Run ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Run$VH() {
        return constants$3237.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Run)(IRunnableObject*,LPBINDCTX);
     * }
     */
    public static MemorySegment Run$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3237.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Run)(IRunnableObject*,LPBINDCTX);
     * }
     */
    public static void Run$set(MemorySegment seg, MemorySegment x) {
        constants$3237.const$5.set(seg, x);
    }
    public static MemorySegment Run$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3237.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Run$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3237.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static Run Run(MemorySegment segment, Arena scope) {
        return Run.ofAddress(Run$get(segment), scope);
    }
    /**
     * {@snippet :
 * BOOL (*IsRunning)(IRunnableObject*);
     * }
     */
    public interface IsRunning {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(IsRunning fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3238.const$0, fi, constants$18.const$5, scope);
        }
        static IsRunning ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle IsRunning$VH() {
        return constants$3238.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL (*IsRunning)(IRunnableObject*);
     * }
     */
    public static MemorySegment IsRunning$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3238.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL (*IsRunning)(IRunnableObject*);
     * }
     */
    public static void IsRunning$set(MemorySegment seg, MemorySegment x) {
        constants$3238.const$1.set(seg, x);
    }
    public static MemorySegment IsRunning$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3238.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void IsRunning$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3238.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static IsRunning IsRunning(MemorySegment segment, Arena scope) {
        return IsRunning.ofAddress(IsRunning$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*LockRunning)(IRunnableObject*,BOOL,BOOL);
     * }
     */
    public interface LockRunning {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2);
        static MemorySegment allocate(LockRunning fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3238.const$2, fi, constants$67.const$1, scope);
        }
        static LockRunning ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2) -> {
                try {
                    return (int)constants$3030.const$1.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle LockRunning$VH() {
        return constants$3238.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*LockRunning)(IRunnableObject*,BOOL,BOOL);
     * }
     */
    public static MemorySegment LockRunning$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3238.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*LockRunning)(IRunnableObject*,BOOL,BOOL);
     * }
     */
    public static void LockRunning$set(MemorySegment seg, MemorySegment x) {
        constants$3238.const$3.set(seg, x);
    }
    public static MemorySegment LockRunning$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3238.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void LockRunning$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3238.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static LockRunning LockRunning(MemorySegment segment, Arena scope) {
        return LockRunning.ofAddress(LockRunning$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*SetContainedObject)(IRunnableObject*,BOOL);
     * }
     */
    public interface SetContainedObject {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(SetContainedObject fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3238.const$4, fi, constants$65.const$2, scope);
        }
        static SetContainedObject ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle SetContainedObject$VH() {
        return constants$3238.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetContainedObject)(IRunnableObject*,BOOL);
     * }
     */
    public static MemorySegment SetContainedObject$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3238.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetContainedObject)(IRunnableObject*,BOOL);
     * }
     */
    public static void SetContainedObject$set(MemorySegment seg, MemorySegment x) {
        constants$3238.const$5.set(seg, x);
    }
    public static MemorySegment SetContainedObject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3238.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void SetContainedObject$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3238.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetContainedObject SetContainedObject(MemorySegment segment, Arena scope) {
        return SetContainedObject.ofAddress(SetContainedObject$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

