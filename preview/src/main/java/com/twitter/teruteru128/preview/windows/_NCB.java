// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _NCB {
 *     UCHAR ncb_command;
 *     UCHAR ncb_retcode;
 *     UCHAR ncb_lsn;
 *     UCHAR ncb_num;
 *     PUCHAR ncb_buffer;
 *     WORD ncb_length;
 *     UCHAR ncb_callname[16];
 *     UCHAR ncb_name[16];
 *     UCHAR ncb_rto;
 *     UCHAR ncb_sto;
 *     void (*ncb_post)(struct _NCB*);
 *     UCHAR ncb_lana_num;
 *     UCHAR ncb_cmd_cplt;
 *     UCHAR ncb_reserve[18];
 *     HANDLE ncb_event;
 * };
 * }
 */
public class _NCB {

    public static MemoryLayout $LAYOUT() {
        return constants$1700.const$3;
    }
    public static VarHandle ncb_command$VH() {
        return constants$1700.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR ncb_command;
     * }
     */
    public static byte ncb_command$get(MemorySegment seg) {
        return (byte)constants$1700.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR ncb_command;
     * }
     */
    public static void ncb_command$set(MemorySegment seg, byte x) {
        constants$1700.const$4.set(seg, x);
    }
    public static byte ncb_command$get(MemorySegment seg, long index) {
        return (byte)constants$1700.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_command$set(MemorySegment seg, long index, byte x) {
        constants$1700.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ncb_retcode$VH() {
        return constants$1700.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR ncb_retcode;
     * }
     */
    public static byte ncb_retcode$get(MemorySegment seg) {
        return (byte)constants$1700.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR ncb_retcode;
     * }
     */
    public static void ncb_retcode$set(MemorySegment seg, byte x) {
        constants$1700.const$5.set(seg, x);
    }
    public static byte ncb_retcode$get(MemorySegment seg, long index) {
        return (byte)constants$1700.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_retcode$set(MemorySegment seg, long index, byte x) {
        constants$1700.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ncb_lsn$VH() {
        return constants$1701.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR ncb_lsn;
     * }
     */
    public static byte ncb_lsn$get(MemorySegment seg) {
        return (byte)constants$1701.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR ncb_lsn;
     * }
     */
    public static void ncb_lsn$set(MemorySegment seg, byte x) {
        constants$1701.const$0.set(seg, x);
    }
    public static byte ncb_lsn$get(MemorySegment seg, long index) {
        return (byte)constants$1701.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_lsn$set(MemorySegment seg, long index, byte x) {
        constants$1701.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ncb_num$VH() {
        return constants$1701.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR ncb_num;
     * }
     */
    public static byte ncb_num$get(MemorySegment seg) {
        return (byte)constants$1701.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR ncb_num;
     * }
     */
    public static void ncb_num$set(MemorySegment seg, byte x) {
        constants$1701.const$1.set(seg, x);
    }
    public static byte ncb_num$get(MemorySegment seg, long index) {
        return (byte)constants$1701.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_num$set(MemorySegment seg, long index, byte x) {
        constants$1701.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ncb_buffer$VH() {
        return constants$1701.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PUCHAR ncb_buffer;
     * }
     */
    public static MemorySegment ncb_buffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1701.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PUCHAR ncb_buffer;
     * }
     */
    public static void ncb_buffer$set(MemorySegment seg, MemorySegment x) {
        constants$1701.const$2.set(seg, x);
    }
    public static MemorySegment ncb_buffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1701.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_buffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1701.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ncb_length$VH() {
        return constants$1701.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD ncb_length;
     * }
     */
    public static short ncb_length$get(MemorySegment seg) {
        return (short)constants$1701.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD ncb_length;
     * }
     */
    public static void ncb_length$set(MemorySegment seg, short x) {
        constants$1701.const$3.set(seg, x);
    }
    public static short ncb_length$get(MemorySegment seg, long index) {
        return (short)constants$1701.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_length$set(MemorySegment seg, long index, short x) {
        constants$1701.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ncb_callname$slice(MemorySegment seg) {
        return seg.asSlice(18, 16);
    }
    public static MemorySegment ncb_name$slice(MemorySegment seg) {
        return seg.asSlice(34, 16);
    }
    public static VarHandle ncb_rto$VH() {
        return constants$1701.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR ncb_rto;
     * }
     */
    public static byte ncb_rto$get(MemorySegment seg) {
        return (byte)constants$1701.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR ncb_rto;
     * }
     */
    public static void ncb_rto$set(MemorySegment seg, byte x) {
        constants$1701.const$4.set(seg, x);
    }
    public static byte ncb_rto$get(MemorySegment seg, long index) {
        return (byte)constants$1701.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_rto$set(MemorySegment seg, long index, byte x) {
        constants$1701.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ncb_sto$VH() {
        return constants$1701.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR ncb_sto;
     * }
     */
    public static byte ncb_sto$get(MemorySegment seg) {
        return (byte)constants$1701.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR ncb_sto;
     * }
     */
    public static void ncb_sto$set(MemorySegment seg, byte x) {
        constants$1701.const$5.set(seg, x);
    }
    public static byte ncb_sto$get(MemorySegment seg, long index) {
        return (byte)constants$1701.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_sto$set(MemorySegment seg, long index, byte x) {
        constants$1701.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * void (*ncb_post)(struct _NCB*);
     * }
     */
    public interface ncb_post {

        void apply(java.lang.foreign.MemorySegment pParameter);
        static MemorySegment allocate(ncb_post fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1702.const$0, fi, constants$0.const$0, scope);
        }
        static ncb_post ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _pParameter) -> {
                try {
                    constants$496.const$2.invokeExact(symbol, _pParameter);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle ncb_post$VH() {
        return constants$1702.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*ncb_post)(struct _NCB*);
     * }
     */
    public static MemorySegment ncb_post$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1702.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*ncb_post)(struct _NCB*);
     * }
     */
    public static void ncb_post$set(MemorySegment seg, MemorySegment x) {
        constants$1702.const$1.set(seg, x);
    }
    public static MemorySegment ncb_post$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1702.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_post$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1702.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static ncb_post ncb_post(MemorySegment segment, Arena scope) {
        return ncb_post.ofAddress(ncb_post$get(segment), scope);
    }
    public static VarHandle ncb_lana_num$VH() {
        return constants$1702.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR ncb_lana_num;
     * }
     */
    public static byte ncb_lana_num$get(MemorySegment seg) {
        return (byte)constants$1702.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR ncb_lana_num;
     * }
     */
    public static void ncb_lana_num$set(MemorySegment seg, byte x) {
        constants$1702.const$2.set(seg, x);
    }
    public static byte ncb_lana_num$get(MemorySegment seg, long index) {
        return (byte)constants$1702.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_lana_num$set(MemorySegment seg, long index, byte x) {
        constants$1702.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ncb_cmd_cplt$VH() {
        return constants$1702.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR ncb_cmd_cplt;
     * }
     */
    public static byte ncb_cmd_cplt$get(MemorySegment seg) {
        return (byte)constants$1702.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR ncb_cmd_cplt;
     * }
     */
    public static void ncb_cmd_cplt$set(MemorySegment seg, byte x) {
        constants$1702.const$3.set(seg, x);
    }
    public static byte ncb_cmd_cplt$get(MemorySegment seg, long index) {
        return (byte)constants$1702.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_cmd_cplt$set(MemorySegment seg, long index, byte x) {
        constants$1702.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ncb_reserve$slice(MemorySegment seg) {
        return seg.asSlice(66, 18);
    }
    public static VarHandle ncb_event$VH() {
        return constants$1702.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE ncb_event;
     * }
     */
    public static MemorySegment ncb_event$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1702.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE ncb_event;
     * }
     */
    public static void ncb_event$set(MemorySegment seg, MemorySegment x) {
        constants$1702.const$4.set(seg, x);
    }
    public static MemorySegment ncb_event$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1702.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_event$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1702.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


