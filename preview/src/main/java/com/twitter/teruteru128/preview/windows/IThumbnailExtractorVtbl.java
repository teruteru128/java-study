// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IThumbnailExtractorVtbl {
 *     HRESULT (*QueryInterface)(IThumbnailExtractor*,const IID*,void**);
 *     ULONG (*AddRef)(IThumbnailExtractor*);
 *     ULONG (*Release)(IThumbnailExtractor*);
 *     HRESULT (*ExtractThumbnail)(IThumbnailExtractor*,IStorage*,ULONG,ULONG,ULONG*,ULONG*,HBITMAP*);
 *     HRESULT (*OnFileUpdated)(IThumbnailExtractor*,IStorage*);
 * };
 * }
 */
public class IThumbnailExtractorVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3369.const$1;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IThumbnailExtractor*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3369.const$2, fi, constants$37.const$3, scope);
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
        return constants$3369.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IThumbnailExtractor*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3369.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IThumbnailExtractor*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3369.const$3.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3369.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3369.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IThumbnailExtractor*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3369.const$4, fi, constants$18.const$5, scope);
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
        return constants$3369.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IThumbnailExtractor*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3369.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IThumbnailExtractor*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3369.const$5.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3369.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3369.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IThumbnailExtractor*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3370.const$0, fi, constants$18.const$5, scope);
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
        return constants$3370.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IThumbnailExtractor*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3370.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IThumbnailExtractor*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3370.const$1.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3370.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3370.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*ExtractThumbnail)(IThumbnailExtractor*,IStorage*,ULONG,ULONG,ULONG*,ULONG*,HBITMAP*);
     * }
     */
    public interface ExtractThumbnail {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5, java.lang.foreign.MemorySegment _x6);
        static MemorySegment allocate(ExtractThumbnail fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3370.const$2, fi, constants$1019.const$2, scope);
        }
        static ExtractThumbnail ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5, java.lang.foreign.MemorySegment __x6) -> {
                try {
                    return (int)constants$3370.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle ExtractThumbnail$VH() {
        return constants$3370.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*ExtractThumbnail)(IThumbnailExtractor*,IStorage*,ULONG,ULONG,ULONG*,ULONG*,HBITMAP*);
     * }
     */
    public static MemorySegment ExtractThumbnail$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3370.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*ExtractThumbnail)(IThumbnailExtractor*,IStorage*,ULONG,ULONG,ULONG*,ULONG*,HBITMAP*);
     * }
     */
    public static void ExtractThumbnail$set(MemorySegment seg, MemorySegment x) {
        constants$3370.const$4.set(seg, x);
    }
    public static MemorySegment ExtractThumbnail$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3370.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ExtractThumbnail$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3370.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static ExtractThumbnail ExtractThumbnail(MemorySegment segment, Arena scope) {
        return ExtractThumbnail.ofAddress(ExtractThumbnail$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*OnFileUpdated)(IThumbnailExtractor*,IStorage*);
     * }
     */
    public interface OnFileUpdated {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(OnFileUpdated fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3370.const$5, fi, constants$34.const$0, scope);
        }
        static OnFileUpdated ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle OnFileUpdated$VH() {
        return constants$3371.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*OnFileUpdated)(IThumbnailExtractor*,IStorage*);
     * }
     */
    public static MemorySegment OnFileUpdated$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3371.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*OnFileUpdated)(IThumbnailExtractor*,IStorage*);
     * }
     */
    public static void OnFileUpdated$set(MemorySegment seg, MemorySegment x) {
        constants$3371.const$0.set(seg, x);
    }
    public static MemorySegment OnFileUpdated$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3371.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void OnFileUpdated$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3371.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnFileUpdated OnFileUpdated(MemorySegment segment, Arena scope) {
        return OnFileUpdated.ofAddress(OnFileUpdated$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


