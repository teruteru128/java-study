// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IViewObjectVtbl {
 *     HRESULT (*QueryInterface)(IViewObject*,const IID*,void**);
 *     ULONG (*AddRef)(IViewObject*);
 *     ULONG (*Release)(IViewObject*);
 *     HRESULT (*Draw)(IViewObject*,DWORD,LONG,void*,DVTARGETDEVICE*,HDC,HDC,LPCRECTL,LPCRECTL,BOOL (*)(ULONG_PTR),ULONG_PTR);
 *     HRESULT (*GetColorSet)(IViewObject*,DWORD,LONG,void*,DVTARGETDEVICE*,HDC,LOGPALETTE**);
 *     HRESULT (*Freeze)(IViewObject*,DWORD,LONG,void*,DWORD*);
 *     HRESULT (*Unfreeze)(IViewObject*,DWORD);
 *     HRESULT (*SetAdvise)(IViewObject*,DWORD,DWORD,IAdviseSink*);
 *     HRESULT (*GetAdvise)(IViewObject*,DWORD*,DWORD*,IAdviseSink**);
 * };
 * }
 */
public class IViewObjectVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3706.const$5;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IViewObject*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3707.const$0, fi, constants$37.const$3, scope);
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
        return constants$3707.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IViewObject*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3707.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IViewObject*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3707.const$1.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3707.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3707.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IViewObject*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3707.const$2, fi, constants$18.const$5, scope);
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
        return constants$3707.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IViewObject*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3707.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IViewObject*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3707.const$3.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3707.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3707.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IViewObject*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3707.const$4, fi, constants$18.const$5, scope);
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
        return constants$3707.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IViewObject*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3707.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IViewObject*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3707.const$5.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3707.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3707.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Draw)(IViewObject*,DWORD,LONG,void*,DVTARGETDEVICE*,HDC,HDC,LPCRECTL,LPCRECTL,BOOL (*)(ULONG_PTR),ULONG_PTR);
     * }
     */
    public interface Draw {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5, java.lang.foreign.MemorySegment _x6, java.lang.foreign.MemorySegment _x7, java.lang.foreign.MemorySegment _x8, java.lang.foreign.MemorySegment _x9, long _x10);
        static MemorySegment allocate(Draw fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3708.const$1, fi, constants$3708.const$0, scope);
        }
        static Draw ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5, java.lang.foreign.MemorySegment __x6, java.lang.foreign.MemorySegment __x7, java.lang.foreign.MemorySegment __x8, java.lang.foreign.MemorySegment __x9, long __x10) -> {
                try {
                    return (int)constants$3708.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6, __x7, __x8, __x9, __x10);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Draw$VH() {
        return constants$3708.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Draw)(IViewObject*,DWORD,LONG,void*,DVTARGETDEVICE*,HDC,HDC,LPCRECTL,LPCRECTL,BOOL (*)(ULONG_PTR),ULONG_PTR);
     * }
     */
    public static MemorySegment Draw$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3708.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Draw)(IViewObject*,DWORD,LONG,void*,DVTARGETDEVICE*,HDC,HDC,LPCRECTL,LPCRECTL,BOOL (*)(ULONG_PTR),ULONG_PTR);
     * }
     */
    public static void Draw$set(MemorySegment seg, MemorySegment x) {
        constants$3708.const$3.set(seg, x);
    }
    public static MemorySegment Draw$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3708.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Draw$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3708.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static Draw Draw(MemorySegment segment, Arena scope) {
        return Draw.ofAddress(Draw$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetColorSet)(IViewObject*,DWORD,LONG,void*,DVTARGETDEVICE*,HDC,LOGPALETTE**);
     * }
     */
    public interface GetColorSet {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5, java.lang.foreign.MemorySegment _x6);
        static MemorySegment allocate(GetColorSet fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3708.const$4, fi, constants$1283.const$2, scope);
        }
        static GetColorSet ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5, java.lang.foreign.MemorySegment __x6) -> {
                try {
                    return (int)constants$3708.const$5.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle GetColorSet$VH() {
        return constants$3709.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetColorSet)(IViewObject*,DWORD,LONG,void*,DVTARGETDEVICE*,HDC,LOGPALETTE**);
     * }
     */
    public static MemorySegment GetColorSet$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3709.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetColorSet)(IViewObject*,DWORD,LONG,void*,DVTARGETDEVICE*,HDC,LOGPALETTE**);
     * }
     */
    public static void GetColorSet$set(MemorySegment seg, MemorySegment x) {
        constants$3709.const$0.set(seg, x);
    }
    public static MemorySegment GetColorSet$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3709.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void GetColorSet$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3709.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetColorSet GetColorSet(MemorySegment segment, Arena scope) {
        return GetColorSet.ofAddress(GetColorSet$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Freeze)(IViewObject*,DWORD,LONG,void*,DWORD*);
     * }
     */
    public interface Freeze {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(Freeze fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3709.const$1, fi, constants$1007.const$4, scope);
        }
        static Freeze ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)constants$3467.const$0.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Freeze$VH() {
        return constants$3709.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Freeze)(IViewObject*,DWORD,LONG,void*,DWORD*);
     * }
     */
    public static MemorySegment Freeze$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3709.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Freeze)(IViewObject*,DWORD,LONG,void*,DWORD*);
     * }
     */
    public static void Freeze$set(MemorySegment seg, MemorySegment x) {
        constants$3709.const$2.set(seg, x);
    }
    public static MemorySegment Freeze$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3709.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Freeze$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3709.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static Freeze Freeze(MemorySegment segment, Arena scope) {
        return Freeze.ofAddress(Freeze$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Unfreeze)(IViewObject*,DWORD);
     * }
     */
    public interface Unfreeze {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(Unfreeze fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3709.const$3, fi, constants$65.const$2, scope);
        }
        static Unfreeze ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Unfreeze$VH() {
        return constants$3709.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Unfreeze)(IViewObject*,DWORD);
     * }
     */
    public static MemorySegment Unfreeze$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3709.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Unfreeze)(IViewObject*,DWORD);
     * }
     */
    public static void Unfreeze$set(MemorySegment seg, MemorySegment x) {
        constants$3709.const$4.set(seg, x);
    }
    public static MemorySegment Unfreeze$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3709.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Unfreeze$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3709.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Unfreeze Unfreeze(MemorySegment segment, Arena scope) {
        return Unfreeze.ofAddress(Unfreeze$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*SetAdvise)(IViewObject*,DWORD,DWORD,IAdviseSink*);
     * }
     */
    public interface SetAdvise {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(SetAdvise fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3709.const$5, fi, constants$644.const$5, scope);
        }
        static SetAdvise ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)constants$2131.const$5.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle SetAdvise$VH() {
        return constants$3710.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetAdvise)(IViewObject*,DWORD,DWORD,IAdviseSink*);
     * }
     */
    public static MemorySegment SetAdvise$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3710.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetAdvise)(IViewObject*,DWORD,DWORD,IAdviseSink*);
     * }
     */
    public static void SetAdvise$set(MemorySegment seg, MemorySegment x) {
        constants$3710.const$0.set(seg, x);
    }
    public static MemorySegment SetAdvise$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3710.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void SetAdvise$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3710.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetAdvise SetAdvise(MemorySegment segment, Arena scope) {
        return SetAdvise.ofAddress(SetAdvise$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetAdvise)(IViewObject*,DWORD*,DWORD*,IAdviseSink**);
     * }
     */
    public interface GetAdvise {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(GetAdvise fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3710.const$1, fi, constants$1.const$3, scope);
        }
        static GetAdvise ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle GetAdvise$VH() {
        return constants$3710.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetAdvise)(IViewObject*,DWORD*,DWORD*,IAdviseSink**);
     * }
     */
    public static MemorySegment GetAdvise$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3710.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetAdvise)(IViewObject*,DWORD*,DWORD*,IAdviseSink**);
     * }
     */
    public static void GetAdvise$set(MemorySegment seg, MemorySegment x) {
        constants$3710.const$2.set(seg, x);
    }
    public static MemorySegment GetAdvise$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3710.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void GetAdvise$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3710.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetAdvise GetAdvise(MemorySegment segment, Arena scope) {
        return GetAdvise.ofAddress(GetAdvise$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

