// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IServerSecurityVtbl {
 *     HRESULT (*QueryInterface)(IServerSecurity*,const IID*,void**);
 *     ULONG (*AddRef)(IServerSecurity*);
 *     ULONG (*Release)(IServerSecurity*);
 *     HRESULT (*QueryBlanket)(IServerSecurity*,DWORD*,DWORD*,OLECHAR**,DWORD*,DWORD*,void**,DWORD*);
 *     HRESULT (*ImpersonateClient)(IServerSecurity*);
 *     HRESULT (*RevertToSelf)(IServerSecurity*);
 *     BOOL (*IsImpersonating)(IServerSecurity*);
 * };
 * }
 */
public class IServerSecurityVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3100.const$0;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IServerSecurity*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3100.const$1, fi, constants$37.const$3, scope);
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
        return constants$3100.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IServerSecurity*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3100.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IServerSecurity*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3100.const$2.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3100.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3100.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IServerSecurity*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3100.const$3, fi, constants$18.const$5, scope);
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
        return constants$3100.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IServerSecurity*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3100.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IServerSecurity*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3100.const$4.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3100.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3100.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IServerSecurity*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3100.const$5, fi, constants$18.const$5, scope);
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
        return constants$3101.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IServerSecurity*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3101.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IServerSecurity*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3101.const$0.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3101.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3101.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*QueryBlanket)(IServerSecurity*,DWORD*,DWORD*,OLECHAR**,DWORD*,DWORD*,void**,DWORD*);
     * }
     */
    public interface QueryBlanket {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5, java.lang.foreign.MemorySegment _x6, java.lang.foreign.MemorySegment _x7);
        static MemorySegment allocate(QueryBlanket fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3101.const$1, fi, constants$2107.const$1, scope);
        }
        static QueryBlanket ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5, java.lang.foreign.MemorySegment __x6, java.lang.foreign.MemorySegment __x7) -> {
                try {
                    return (int)constants$2107.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6, __x7);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle QueryBlanket$VH() {
        return constants$3101.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryBlanket)(IServerSecurity*,DWORD*,DWORD*,OLECHAR**,DWORD*,DWORD*,void**,DWORD*);
     * }
     */
    public static MemorySegment QueryBlanket$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3101.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryBlanket)(IServerSecurity*,DWORD*,DWORD*,OLECHAR**,DWORD*,DWORD*,void**,DWORD*);
     * }
     */
    public static void QueryBlanket$set(MemorySegment seg, MemorySegment x) {
        constants$3101.const$2.set(seg, x);
    }
    public static MemorySegment QueryBlanket$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3101.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryBlanket$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3101.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryBlanket QueryBlanket(MemorySegment segment, Arena scope) {
        return QueryBlanket.ofAddress(QueryBlanket$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*ImpersonateClient)(IServerSecurity*);
     * }
     */
    public interface ImpersonateClient {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(ImpersonateClient fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3101.const$3, fi, constants$18.const$5, scope);
        }
        static ImpersonateClient ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle ImpersonateClient$VH() {
        return constants$3101.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*ImpersonateClient)(IServerSecurity*);
     * }
     */
    public static MemorySegment ImpersonateClient$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3101.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*ImpersonateClient)(IServerSecurity*);
     * }
     */
    public static void ImpersonateClient$set(MemorySegment seg, MemorySegment x) {
        constants$3101.const$4.set(seg, x);
    }
    public static MemorySegment ImpersonateClient$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3101.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ImpersonateClient$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3101.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static ImpersonateClient ImpersonateClient(MemorySegment segment, Arena scope) {
        return ImpersonateClient.ofAddress(ImpersonateClient$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*RevertToSelf)(IServerSecurity*);
     * }
     */
    public interface RevertToSelf {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(RevertToSelf fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3101.const$5, fi, constants$18.const$5, scope);
        }
        static RevertToSelf ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle RevertToSelf$VH() {
        return constants$3102.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*RevertToSelf)(IServerSecurity*);
     * }
     */
    public static MemorySegment RevertToSelf$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3102.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*RevertToSelf)(IServerSecurity*);
     * }
     */
    public static void RevertToSelf$set(MemorySegment seg, MemorySegment x) {
        constants$3102.const$0.set(seg, x);
    }
    public static MemorySegment RevertToSelf$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3102.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void RevertToSelf$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3102.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static RevertToSelf RevertToSelf(MemorySegment segment, Arena scope) {
        return RevertToSelf.ofAddress(RevertToSelf$get(segment), scope);
    }
    /**
     * {@snippet :
 * BOOL (*IsImpersonating)(IServerSecurity*);
     * }
     */
    public interface IsImpersonating {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(IsImpersonating fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3102.const$1, fi, constants$18.const$5, scope);
        }
        static IsImpersonating ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle IsImpersonating$VH() {
        return constants$3102.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL (*IsImpersonating)(IServerSecurity*);
     * }
     */
    public static MemorySegment IsImpersonating$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3102.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL (*IsImpersonating)(IServerSecurity*);
     * }
     */
    public static void IsImpersonating$set(MemorySegment seg, MemorySegment x) {
        constants$3102.const$2.set(seg, x);
    }
    public static MemorySegment IsImpersonating$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3102.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void IsImpersonating$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3102.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static IsImpersonating IsImpersonating(MemorySegment segment, Arena scope) {
        return IsImpersonating.ofAddress(IsImpersonating$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


