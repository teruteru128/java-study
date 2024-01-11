// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IPrintDialogCallbackVtbl {
 *     HRESULT (*QueryInterface)(IPrintDialogCallback*,const IID*,void**);
 *     ULONG (*AddRef)(IPrintDialogCallback*);
 *     ULONG (*Release)(IPrintDialogCallback*);
 *     HRESULT (*InitDone)(IPrintDialogCallback*);
 *     HRESULT (*SelectionChange)(IPrintDialogCallback*);
 *     HRESULT (*HandleMessage)(IPrintDialogCallback*,HWND,UINT,WPARAM,LPARAM,LRESULT*);
 * };
 * }
 */
public class IPrintDialogCallbackVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$4455.const$4;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IPrintDialogCallback*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4455.const$5, fi, constants$37.const$3, scope);
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
        return constants$4456.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IPrintDialogCallback*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4456.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IPrintDialogCallback*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$4456.const$0.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4456.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4456.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IPrintDialogCallback*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4456.const$1, fi, constants$18.const$5, scope);
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
        return constants$4456.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IPrintDialogCallback*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4456.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IPrintDialogCallback*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$4456.const$2.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4456.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4456.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IPrintDialogCallback*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4456.const$3, fi, constants$18.const$5, scope);
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
        return constants$4456.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IPrintDialogCallback*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4456.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IPrintDialogCallback*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$4456.const$4.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4456.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4456.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*InitDone)(IPrintDialogCallback*);
     * }
     */
    public interface InitDone {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(InitDone fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4456.const$5, fi, constants$18.const$5, scope);
        }
        static InitDone ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle InitDone$VH() {
        return constants$4457.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*InitDone)(IPrintDialogCallback*);
     * }
     */
    public static MemorySegment InitDone$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4457.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*InitDone)(IPrintDialogCallback*);
     * }
     */
    public static void InitDone$set(MemorySegment seg, MemorySegment x) {
        constants$4457.const$0.set(seg, x);
    }
    public static MemorySegment InitDone$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4457.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void InitDone$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4457.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static InitDone InitDone(MemorySegment segment, Arena scope) {
        return InitDone.ofAddress(InitDone$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*SelectionChange)(IPrintDialogCallback*);
     * }
     */
    public interface SelectionChange {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(SelectionChange fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4457.const$1, fi, constants$18.const$5, scope);
        }
        static SelectionChange ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle SelectionChange$VH() {
        return constants$4457.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SelectionChange)(IPrintDialogCallback*);
     * }
     */
    public static MemorySegment SelectionChange$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4457.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SelectionChange)(IPrintDialogCallback*);
     * }
     */
    public static void SelectionChange$set(MemorySegment seg, MemorySegment x) {
        constants$4457.const$2.set(seg, x);
    }
    public static MemorySegment SelectionChange$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4457.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void SelectionChange$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4457.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static SelectionChange SelectionChange(MemorySegment segment, Arena scope) {
        return SelectionChange.ofAddress(SelectionChange$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*HandleMessage)(IPrintDialogCallback*,HWND,UINT,WPARAM,LPARAM,LRESULT*);
     * }
     */
    public interface HandleMessage {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, long _x3, long _x4, java.lang.foreign.MemorySegment _x5);
        static MemorySegment allocate(HandleMessage fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4457.const$4, fi, constants$4457.const$3, scope);
        }
        static HandleMessage ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, long __x3, long __x4, java.lang.foreign.MemorySegment __x5) -> {
                try {
                    return (int)constants$4457.const$5.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle HandleMessage$VH() {
        return constants$4458.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*HandleMessage)(IPrintDialogCallback*,HWND,UINT,WPARAM,LPARAM,LRESULT*);
     * }
     */
    public static MemorySegment HandleMessage$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4458.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*HandleMessage)(IPrintDialogCallback*,HWND,UINT,WPARAM,LPARAM,LRESULT*);
     * }
     */
    public static void HandleMessage$set(MemorySegment seg, MemorySegment x) {
        constants$4458.const$0.set(seg, x);
    }
    public static MemorySegment HandleMessage$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4458.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void HandleMessage$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4458.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static HandleMessage HandleMessage(MemorySegment segment, Arena scope) {
        return HandleMessage.ofAddress(HandleMessage$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


