// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IOleCache2Vtbl {
 *     HRESULT (*QueryInterface)(IOleCache2*,const IID*,void**);
 *     ULONG (*AddRef)(IOleCache2*);
 *     ULONG (*Release)(IOleCache2*);
 *     HRESULT (*Cache)(IOleCache2*,FORMATETC*,DWORD,DWORD*);
 *     HRESULT (*Uncache)(IOleCache2*,DWORD);
 *     HRESULT (*EnumCache)(IOleCache2*,IEnumSTATDATA**);
 *     HRESULT (*InitCache)(IOleCache2*,IDataObject*);
 *     HRESULT (*SetData)(IOleCache2*,FORMATETC*,STGMEDIUM*,BOOL);
 *     HRESULT (*UpdateCache)(IOleCache2*,LPDATAOBJECT,DWORD,LPVOID);
 *     HRESULT (*DiscardCache)(IOleCache2*,DWORD);
 * };
 * }
 */
public class IOleCache2Vtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3643.const$0;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IOleCache2*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3643.const$1, fi, constants$37.const$3, scope);
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
        return constants$3643.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IOleCache2*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3643.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IOleCache2*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3643.const$2.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3643.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3643.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IOleCache2*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3643.const$3, fi, constants$18.const$5, scope);
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
        return constants$3643.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IOleCache2*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3643.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IOleCache2*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3643.const$4.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3643.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3643.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IOleCache2*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3643.const$5, fi, constants$18.const$5, scope);
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
        return constants$3644.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IOleCache2*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3644.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IOleCache2*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3644.const$0.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3644.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3644.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Cache)(IOleCache2*,FORMATETC*,DWORD,DWORD*);
     * }
     */
    public interface Cache {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(Cache fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3644.const$1, fi, constants$586.const$5, scope);
        }
        static Cache ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)constants$2117.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Cache$VH() {
        return constants$3644.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Cache)(IOleCache2*,FORMATETC*,DWORD,DWORD*);
     * }
     */
    public static MemorySegment Cache$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3644.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Cache)(IOleCache2*,FORMATETC*,DWORD,DWORD*);
     * }
     */
    public static void Cache$set(MemorySegment seg, MemorySegment x) {
        constants$3644.const$2.set(seg, x);
    }
    public static MemorySegment Cache$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3644.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Cache$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3644.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static Cache Cache(MemorySegment segment, Arena scope) {
        return Cache.ofAddress(Cache$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Uncache)(IOleCache2*,DWORD);
     * }
     */
    public interface Uncache {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(Uncache fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3644.const$3, fi, constants$65.const$2, scope);
        }
        static Uncache ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Uncache$VH() {
        return constants$3644.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Uncache)(IOleCache2*,DWORD);
     * }
     */
    public static MemorySegment Uncache$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3644.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Uncache)(IOleCache2*,DWORD);
     * }
     */
    public static void Uncache$set(MemorySegment seg, MemorySegment x) {
        constants$3644.const$4.set(seg, x);
    }
    public static MemorySegment Uncache$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3644.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Uncache$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3644.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Uncache Uncache(MemorySegment segment, Arena scope) {
        return Uncache.ofAddress(Uncache$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*EnumCache)(IOleCache2*,IEnumSTATDATA**);
     * }
     */
    public interface EnumCache {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(EnumCache fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3644.const$5, fi, constants$34.const$0, scope);
        }
        static EnumCache ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle EnumCache$VH() {
        return constants$3645.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*EnumCache)(IOleCache2*,IEnumSTATDATA**);
     * }
     */
    public static MemorySegment EnumCache$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3645.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*EnumCache)(IOleCache2*,IEnumSTATDATA**);
     * }
     */
    public static void EnumCache$set(MemorySegment seg, MemorySegment x) {
        constants$3645.const$0.set(seg, x);
    }
    public static MemorySegment EnumCache$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3645.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void EnumCache$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3645.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static EnumCache EnumCache(MemorySegment segment, Arena scope) {
        return EnumCache.ofAddress(EnumCache$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*InitCache)(IOleCache2*,IDataObject*);
     * }
     */
    public interface InitCache {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(InitCache fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3645.const$1, fi, constants$34.const$0, scope);
        }
        static InitCache ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle InitCache$VH() {
        return constants$3645.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*InitCache)(IOleCache2*,IDataObject*);
     * }
     */
    public static MemorySegment InitCache$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3645.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*InitCache)(IOleCache2*,IDataObject*);
     * }
     */
    public static void InitCache$set(MemorySegment seg, MemorySegment x) {
        constants$3645.const$2.set(seg, x);
    }
    public static MemorySegment InitCache$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3645.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void InitCache$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3645.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static InitCache InitCache(MemorySegment segment, Arena scope) {
        return InitCache.ofAddress(InitCache$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*SetData)(IOleCache2*,FORMATETC*,STGMEDIUM*,BOOL);
     * }
     */
    public interface SetData {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3);
        static MemorySegment allocate(SetData fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3645.const$3, fi, constants$607.const$3, scope);
        }
        static SetData ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle SetData$VH() {
        return constants$3645.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetData)(IOleCache2*,FORMATETC*,STGMEDIUM*,BOOL);
     * }
     */
    public static MemorySegment SetData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3645.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetData)(IOleCache2*,FORMATETC*,STGMEDIUM*,BOOL);
     * }
     */
    public static void SetData$set(MemorySegment seg, MemorySegment x) {
        constants$3645.const$4.set(seg, x);
    }
    public static MemorySegment SetData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3645.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void SetData$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3645.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetData SetData(MemorySegment segment, Arena scope) {
        return SetData.ofAddress(SetData$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*UpdateCache)(IOleCache2*,LPDATAOBJECT,DWORD,LPVOID);
     * }
     */
    public interface UpdateCache {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(UpdateCache fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3645.const$5, fi, constants$586.const$5, scope);
        }
        static UpdateCache ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)constants$2117.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle UpdateCache$VH() {
        return constants$3646.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*UpdateCache)(IOleCache2*,LPDATAOBJECT,DWORD,LPVOID);
     * }
     */
    public static MemorySegment UpdateCache$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3646.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*UpdateCache)(IOleCache2*,LPDATAOBJECT,DWORD,LPVOID);
     * }
     */
    public static void UpdateCache$set(MemorySegment seg, MemorySegment x) {
        constants$3646.const$0.set(seg, x);
    }
    public static MemorySegment UpdateCache$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3646.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void UpdateCache$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3646.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static UpdateCache UpdateCache(MemorySegment segment, Arena scope) {
        return UpdateCache.ofAddress(UpdateCache$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*DiscardCache)(IOleCache2*,DWORD);
     * }
     */
    public interface DiscardCache {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(DiscardCache fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3646.const$1, fi, constants$65.const$2, scope);
        }
        static DiscardCache ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle DiscardCache$VH() {
        return constants$3646.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*DiscardCache)(IOleCache2*,DWORD);
     * }
     */
    public static MemorySegment DiscardCache$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3646.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*DiscardCache)(IOleCache2*,DWORD);
     * }
     */
    public static void DiscardCache$set(MemorySegment seg, MemorySegment x) {
        constants$3646.const$2.set(seg, x);
    }
    public static MemorySegment DiscardCache$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3646.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void DiscardCache$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3646.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static DiscardCache DiscardCache(MemorySegment segment, Arena scope) {
        return DiscardCache.ofAddress(DiscardCache$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


