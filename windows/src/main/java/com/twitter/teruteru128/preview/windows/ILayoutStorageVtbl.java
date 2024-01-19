// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ILayoutStorageVtbl {
 *     HRESULT (*QueryInterface)(ILayoutStorage*,const IID*,void**);
 *     ULONG (*AddRef)(ILayoutStorage*);
 *     ULONG (*Release)(ILayoutStorage*);
 *     HRESULT (*LayoutScript)(ILayoutStorage*,StorageLayout*,DWORD,DWORD);
 *     HRESULT (*BeginMonitor)(ILayoutStorage*);
 *     HRESULT (*EndMonitor)(ILayoutStorage*);
 *     HRESULT (*ReLayoutDocfile)(ILayoutStorage*,OLECHAR*);
 *     HRESULT (*ReLayoutDocfileOnILockBytes)(ILayoutStorage*,ILockBytes*);
 * };
 * }
 */
public class ILayoutStorageVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3350.const$5;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(ILayoutStorage*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3351.const$0, fi, constants$37.const$3, scope);
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
        return constants$3351.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ILayoutStorage*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3351.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(ILayoutStorage*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3351.const$1.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3351.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3351.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(ILayoutStorage*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3351.const$2, fi, constants$18.const$5, scope);
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
        return constants$3351.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(ILayoutStorage*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3351.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(ILayoutStorage*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3351.const$3.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3351.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3351.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(ILayoutStorage*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3351.const$4, fi, constants$18.const$5, scope);
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
        return constants$3351.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(ILayoutStorage*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3351.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(ILayoutStorage*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3351.const$5.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3351.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3351.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*LayoutScript)(ILayoutStorage*,StorageLayout*,DWORD,DWORD);
     * }
     */
    public interface LayoutScript {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3);
        static MemorySegment allocate(LayoutScript fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3352.const$0, fi, constants$584.const$5, scope);
        }
        static LayoutScript ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3) -> {
                try {
                    return (int)constants$2092.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle LayoutScript$VH() {
        return constants$3352.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*LayoutScript)(ILayoutStorage*,StorageLayout*,DWORD,DWORD);
     * }
     */
    public static MemorySegment LayoutScript$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3352.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*LayoutScript)(ILayoutStorage*,StorageLayout*,DWORD,DWORD);
     * }
     */
    public static void LayoutScript$set(MemorySegment seg, MemorySegment x) {
        constants$3352.const$1.set(seg, x);
    }
    public static MemorySegment LayoutScript$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3352.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void LayoutScript$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3352.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static LayoutScript LayoutScript(MemorySegment segment, Arena scope) {
        return LayoutScript.ofAddress(LayoutScript$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*BeginMonitor)(ILayoutStorage*);
     * }
     */
    public interface BeginMonitor {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(BeginMonitor fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3352.const$2, fi, constants$18.const$5, scope);
        }
        static BeginMonitor ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle BeginMonitor$VH() {
        return constants$3352.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*BeginMonitor)(ILayoutStorage*);
     * }
     */
    public static MemorySegment BeginMonitor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3352.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*BeginMonitor)(ILayoutStorage*);
     * }
     */
    public static void BeginMonitor$set(MemorySegment seg, MemorySegment x) {
        constants$3352.const$3.set(seg, x);
    }
    public static MemorySegment BeginMonitor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3352.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void BeginMonitor$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3352.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static BeginMonitor BeginMonitor(MemorySegment segment, Arena scope) {
        return BeginMonitor.ofAddress(BeginMonitor$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*EndMonitor)(ILayoutStorage*);
     * }
     */
    public interface EndMonitor {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(EndMonitor fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3352.const$4, fi, constants$18.const$5, scope);
        }
        static EndMonitor ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle EndMonitor$VH() {
        return constants$3352.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*EndMonitor)(ILayoutStorage*);
     * }
     */
    public static MemorySegment EndMonitor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3352.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*EndMonitor)(ILayoutStorage*);
     * }
     */
    public static void EndMonitor$set(MemorySegment seg, MemorySegment x) {
        constants$3352.const$5.set(seg, x);
    }
    public static MemorySegment EndMonitor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3352.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void EndMonitor$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3352.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static EndMonitor EndMonitor(MemorySegment segment, Arena scope) {
        return EndMonitor.ofAddress(EndMonitor$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*ReLayoutDocfile)(ILayoutStorage*,OLECHAR*);
     * }
     */
    public interface ReLayoutDocfile {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(ReLayoutDocfile fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3353.const$0, fi, constants$34.const$0, scope);
        }
        static ReLayoutDocfile ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle ReLayoutDocfile$VH() {
        return constants$3353.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*ReLayoutDocfile)(ILayoutStorage*,OLECHAR*);
     * }
     */
    public static MemorySegment ReLayoutDocfile$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3353.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*ReLayoutDocfile)(ILayoutStorage*,OLECHAR*);
     * }
     */
    public static void ReLayoutDocfile$set(MemorySegment seg, MemorySegment x) {
        constants$3353.const$1.set(seg, x);
    }
    public static MemorySegment ReLayoutDocfile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3353.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ReLayoutDocfile$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3353.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReLayoutDocfile ReLayoutDocfile(MemorySegment segment, Arena scope) {
        return ReLayoutDocfile.ofAddress(ReLayoutDocfile$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*ReLayoutDocfileOnILockBytes)(ILayoutStorage*,ILockBytes*);
     * }
     */
    public interface ReLayoutDocfileOnILockBytes {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(ReLayoutDocfileOnILockBytes fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3353.const$2, fi, constants$34.const$0, scope);
        }
        static ReLayoutDocfileOnILockBytes ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle ReLayoutDocfileOnILockBytes$VH() {
        return constants$3353.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*ReLayoutDocfileOnILockBytes)(ILayoutStorage*,ILockBytes*);
     * }
     */
    public static MemorySegment ReLayoutDocfileOnILockBytes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3353.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*ReLayoutDocfileOnILockBytes)(ILayoutStorage*,ILockBytes*);
     * }
     */
    public static void ReLayoutDocfileOnILockBytes$set(MemorySegment seg, MemorySegment x) {
        constants$3353.const$3.set(seg, x);
    }
    public static MemorySegment ReLayoutDocfileOnILockBytes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3353.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ReLayoutDocfileOnILockBytes$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3353.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReLayoutDocfileOnILockBytes ReLayoutDocfileOnILockBytes(MemorySegment segment, Arena scope) {
        return ReLayoutDocfileOnILockBytes.ofAddress(ReLayoutDocfileOnILockBytes$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

