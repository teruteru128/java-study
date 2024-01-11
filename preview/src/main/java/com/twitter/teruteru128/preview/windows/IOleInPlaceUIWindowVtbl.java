// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IOleInPlaceUIWindowVtbl {
 *     HRESULT (*QueryInterface)(IOleInPlaceUIWindow*,const IID*,void**);
 *     ULONG (*AddRef)(IOleInPlaceUIWindow*);
 *     ULONG (*Release)(IOleInPlaceUIWindow*);
 *     HRESULT (*GetWindow)(IOleInPlaceUIWindow*,HWND*);
 *     HRESULT (*ContextSensitiveHelp)(IOleInPlaceUIWindow*,BOOL);
 *     HRESULT (*GetBorder)(IOleInPlaceUIWindow*,LPRECT);
 *     HRESULT (*RequestBorderSpace)(IOleInPlaceUIWindow*,LPCBORDERWIDTHS);
 *     HRESULT (*SetBorderSpace)(IOleInPlaceUIWindow*,LPCBORDERWIDTHS);
 *     HRESULT (*SetActiveObject)(IOleInPlaceUIWindow*,IOleInPlaceActiveObject*,LPCOLESTR);
 * };
 * }
 */
public class IOleInPlaceUIWindowVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3679.const$5;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IOleInPlaceUIWindow*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3680.const$0, fi, constants$37.const$3, scope);
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
        return constants$3680.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IOleInPlaceUIWindow*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3680.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IOleInPlaceUIWindow*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3680.const$1.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3680.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3680.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IOleInPlaceUIWindow*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3680.const$2, fi, constants$18.const$5, scope);
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
        return constants$3680.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IOleInPlaceUIWindow*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3680.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IOleInPlaceUIWindow*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3680.const$3.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3680.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3680.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IOleInPlaceUIWindow*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3680.const$4, fi, constants$18.const$5, scope);
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
        return constants$3680.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IOleInPlaceUIWindow*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3680.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IOleInPlaceUIWindow*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3680.const$5.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3680.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3680.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetWindow)(IOleInPlaceUIWindow*,HWND*);
     * }
     */
    public interface GetWindow {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetWindow fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3681.const$0, fi, constants$34.const$0, scope);
        }
        static GetWindow ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle GetWindow$VH() {
        return constants$3681.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetWindow)(IOleInPlaceUIWindow*,HWND*);
     * }
     */
    public static MemorySegment GetWindow$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3681.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetWindow)(IOleInPlaceUIWindow*,HWND*);
     * }
     */
    public static void GetWindow$set(MemorySegment seg, MemorySegment x) {
        constants$3681.const$1.set(seg, x);
    }
    public static MemorySegment GetWindow$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3681.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void GetWindow$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3681.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetWindow GetWindow(MemorySegment segment, Arena scope) {
        return GetWindow.ofAddress(GetWindow$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*ContextSensitiveHelp)(IOleInPlaceUIWindow*,BOOL);
     * }
     */
    public interface ContextSensitiveHelp {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(ContextSensitiveHelp fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3681.const$2, fi, constants$65.const$2, scope);
        }
        static ContextSensitiveHelp ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle ContextSensitiveHelp$VH() {
        return constants$3681.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*ContextSensitiveHelp)(IOleInPlaceUIWindow*,BOOL);
     * }
     */
    public static MemorySegment ContextSensitiveHelp$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3681.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*ContextSensitiveHelp)(IOleInPlaceUIWindow*,BOOL);
     * }
     */
    public static void ContextSensitiveHelp$set(MemorySegment seg, MemorySegment x) {
        constants$3681.const$3.set(seg, x);
    }
    public static MemorySegment ContextSensitiveHelp$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3681.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ContextSensitiveHelp$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3681.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static ContextSensitiveHelp ContextSensitiveHelp(MemorySegment segment, Arena scope) {
        return ContextSensitiveHelp.ofAddress(ContextSensitiveHelp$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetBorder)(IOleInPlaceUIWindow*,LPRECT);
     * }
     */
    public interface GetBorder {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetBorder fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3681.const$4, fi, constants$34.const$0, scope);
        }
        static GetBorder ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle GetBorder$VH() {
        return constants$3681.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetBorder)(IOleInPlaceUIWindow*,LPRECT);
     * }
     */
    public static MemorySegment GetBorder$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3681.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetBorder)(IOleInPlaceUIWindow*,LPRECT);
     * }
     */
    public static void GetBorder$set(MemorySegment seg, MemorySegment x) {
        constants$3681.const$5.set(seg, x);
    }
    public static MemorySegment GetBorder$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3681.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBorder$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3681.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBorder GetBorder(MemorySegment segment, Arena scope) {
        return GetBorder.ofAddress(GetBorder$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*RequestBorderSpace)(IOleInPlaceUIWindow*,LPCBORDERWIDTHS);
     * }
     */
    public interface RequestBorderSpace {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(RequestBorderSpace fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3682.const$0, fi, constants$34.const$0, scope);
        }
        static RequestBorderSpace ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle RequestBorderSpace$VH() {
        return constants$3682.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*RequestBorderSpace)(IOleInPlaceUIWindow*,LPCBORDERWIDTHS);
     * }
     */
    public static MemorySegment RequestBorderSpace$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3682.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*RequestBorderSpace)(IOleInPlaceUIWindow*,LPCBORDERWIDTHS);
     * }
     */
    public static void RequestBorderSpace$set(MemorySegment seg, MemorySegment x) {
        constants$3682.const$1.set(seg, x);
    }
    public static MemorySegment RequestBorderSpace$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3682.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void RequestBorderSpace$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3682.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static RequestBorderSpace RequestBorderSpace(MemorySegment segment, Arena scope) {
        return RequestBorderSpace.ofAddress(RequestBorderSpace$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*SetBorderSpace)(IOleInPlaceUIWindow*,LPCBORDERWIDTHS);
     * }
     */
    public interface SetBorderSpace {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(SetBorderSpace fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3682.const$2, fi, constants$34.const$0, scope);
        }
        static SetBorderSpace ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle SetBorderSpace$VH() {
        return constants$3682.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetBorderSpace)(IOleInPlaceUIWindow*,LPCBORDERWIDTHS);
     * }
     */
    public static MemorySegment SetBorderSpace$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3682.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetBorderSpace)(IOleInPlaceUIWindow*,LPCBORDERWIDTHS);
     * }
     */
    public static void SetBorderSpace$set(MemorySegment seg, MemorySegment x) {
        constants$3682.const$3.set(seg, x);
    }
    public static MemorySegment SetBorderSpace$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3682.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void SetBorderSpace$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3682.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetBorderSpace SetBorderSpace(MemorySegment segment, Arena scope) {
        return SetBorderSpace.ofAddress(SetBorderSpace$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*SetActiveObject)(IOleInPlaceUIWindow*,IOleInPlaceActiveObject*,LPCOLESTR);
     * }
     */
    public interface SetActiveObject {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(SetActiveObject fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3682.const$4, fi, constants$37.const$3, scope);
        }
        static SetActiveObject ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle SetActiveObject$VH() {
        return constants$3682.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetActiveObject)(IOleInPlaceUIWindow*,IOleInPlaceActiveObject*,LPCOLESTR);
     * }
     */
    public static MemorySegment SetActiveObject$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3682.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetActiveObject)(IOleInPlaceUIWindow*,IOleInPlaceActiveObject*,LPCOLESTR);
     * }
     */
    public static void SetActiveObject$set(MemorySegment seg, MemorySegment x) {
        constants$3682.const$5.set(seg, x);
    }
    public static MemorySegment SetActiveObject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3682.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void SetActiveObject$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3682.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetActiveObject SetActiveObject(MemorySegment segment, Arena scope) {
        return SetActiveObject.ofAddress(SetActiveObject$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


