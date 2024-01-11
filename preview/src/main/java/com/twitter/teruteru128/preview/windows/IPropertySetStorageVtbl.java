// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IPropertySetStorageVtbl {
 *     HRESULT (*QueryInterface)(IPropertySetStorage*,const IID*,void**);
 *     ULONG (*AddRef)(IPropertySetStorage*);
 *     ULONG (*Release)(IPropertySetStorage*);
 *     HRESULT (*Create)(IPropertySetStorage*,const IID*,const CLSID*,DWORD,DWORD,IPropertyStorage**);
 *     HRESULT (*Open)(IPropertySetStorage*,const IID*,DWORD,IPropertyStorage**);
 *     HRESULT (*Delete)(IPropertySetStorage*,const IID*);
 *     HRESULT (*Enum)(IPropertySetStorage*,IEnumSTATPROPSETSTG**);
 * };
 * }
 */
public class IPropertySetStorageVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3611.const$3;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IPropertySetStorage*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3611.const$4, fi, constants$37.const$3, scope);
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
        return constants$3611.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IPropertySetStorage*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3611.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IPropertySetStorage*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3611.const$5.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3611.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3611.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IPropertySetStorage*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3612.const$0, fi, constants$18.const$5, scope);
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
        return constants$3612.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IPropertySetStorage*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3612.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IPropertySetStorage*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3612.const$1.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3612.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3612.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IPropertySetStorage*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3612.const$2, fi, constants$18.const$5, scope);
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
        return constants$3612.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IPropertySetStorage*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3612.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IPropertySetStorage*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3612.const$3.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3612.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3612.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Create)(IPropertySetStorage*,const IID*,const CLSID*,DWORD,DWORD,IPropertyStorage**);
     * }
     */
    public interface Create {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, int _x4, java.lang.foreign.MemorySegment _x5);
        static MemorySegment allocate(Create fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3612.const$4, fi, constants$836.const$2, scope);
        }
        static Create ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, int __x4, java.lang.foreign.MemorySegment __x5) -> {
                try {
                    return (int)constants$3267.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Create$VH() {
        return constants$3612.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Create)(IPropertySetStorage*,const IID*,const CLSID*,DWORD,DWORD,IPropertyStorage**);
     * }
     */
    public static MemorySegment Create$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3612.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Create)(IPropertySetStorage*,const IID*,const CLSID*,DWORD,DWORD,IPropertyStorage**);
     * }
     */
    public static void Create$set(MemorySegment seg, MemorySegment x) {
        constants$3612.const$5.set(seg, x);
    }
    public static MemorySegment Create$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3612.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Create$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3612.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static Create Create(MemorySegment segment, Arena scope) {
        return Create.ofAddress(Create$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Open)(IPropertySetStorage*,const IID*,DWORD,IPropertyStorage**);
     * }
     */
    public interface Open {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(Open fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3613.const$0, fi, constants$586.const$5, scope);
        }
        static Open ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Open$VH() {
        return constants$3613.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Open)(IPropertySetStorage*,const IID*,DWORD,IPropertyStorage**);
     * }
     */
    public static MemorySegment Open$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3613.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Open)(IPropertySetStorage*,const IID*,DWORD,IPropertyStorage**);
     * }
     */
    public static void Open$set(MemorySegment seg, MemorySegment x) {
        constants$3613.const$1.set(seg, x);
    }
    public static MemorySegment Open$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3613.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Open$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3613.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static Open Open(MemorySegment segment, Arena scope) {
        return Open.ofAddress(Open$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Delete)(IPropertySetStorage*,const IID*);
     * }
     */
    public interface Delete {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(Delete fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3613.const$2, fi, constants$34.const$0, scope);
        }
        static Delete ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Delete$VH() {
        return constants$3613.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Delete)(IPropertySetStorage*,const IID*);
     * }
     */
    public static MemorySegment Delete$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3613.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Delete)(IPropertySetStorage*,const IID*);
     * }
     */
    public static void Delete$set(MemorySegment seg, MemorySegment x) {
        constants$3613.const$3.set(seg, x);
    }
    public static MemorySegment Delete$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3613.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Delete$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3613.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static Delete Delete(MemorySegment segment, Arena scope) {
        return Delete.ofAddress(Delete$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Enum)(IPropertySetStorage*,IEnumSTATPROPSETSTG**);
     * }
     */
    public interface Enum {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(Enum fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3613.const$4, fi, constants$34.const$0, scope);
        }
        static Enum ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle Enum$VH() {
        return constants$3613.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Enum)(IPropertySetStorage*,IEnumSTATPROPSETSTG**);
     * }
     */
    public static MemorySegment Enum$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3613.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Enum)(IPropertySetStorage*,IEnumSTATPROPSETSTG**);
     * }
     */
    public static void Enum$set(MemorySegment seg, MemorySegment x) {
        constants$3613.const$5.set(seg, x);
    }
    public static MemorySegment Enum$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3613.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Enum$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3613.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static Enum Enum(MemorySegment segment, Arena scope) {
        return Enum.ofAddress(Enum$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

