// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JOB_INFO_4W {
 *     DWORD JobId;
 *     LPWSTR pPrinterName;
 *     LPWSTR pMachineName;
 *     LPWSTR pUserName;
 *     LPWSTR pDocument;
 *     LPWSTR pNotifyName;
 *     LPWSTR pDatatype;
 *     LPWSTR pPrintProcessor;
 *     LPWSTR pParameters;
 *     LPWSTR pDriverName;
 *     LPDEVMODEW pDevMode;
 *     LPWSTR pStatus;
 *     PSECURITY_DESCRIPTOR pSecurityDescriptor;
 *     DWORD Status;
 *     DWORD Priority;
 *     DWORD Position;
 *     DWORD StartTime;
 *     DWORD UntilTime;
 *     DWORD TotalPages;
 *     DWORD Size;
 *     SYSTEMTIME Submitted;
 *     DWORD Time;
 *     DWORD PagesPrinted;
 *     LONG SizeHigh;
 * };
 * }
 */
public class _JOB_INFO_4W {

    public static MemoryLayout $LAYOUT() {
        return constants$2852.const$4;
    }
    public static VarHandle JobId$VH() {
        return constants$2852.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD JobId;
     * }
     */
    public static int JobId$get(MemorySegment seg) {
        return (int)constants$2852.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD JobId;
     * }
     */
    public static void JobId$set(MemorySegment seg, int x) {
        constants$2852.const$5.set(seg, x);
    }
    public static int JobId$get(MemorySegment seg, long index) {
        return (int)constants$2852.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void JobId$set(MemorySegment seg, long index, int x) {
        constants$2852.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pPrinterName$VH() {
        return constants$2853.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pPrinterName;
     * }
     */
    public static MemorySegment pPrinterName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2853.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pPrinterName;
     * }
     */
    public static void pPrinterName$set(MemorySegment seg, MemorySegment x) {
        constants$2853.const$0.set(seg, x);
    }
    public static MemorySegment pPrinterName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2853.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pPrinterName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2853.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pMachineName$VH() {
        return constants$2853.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pMachineName;
     * }
     */
    public static MemorySegment pMachineName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2853.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pMachineName;
     * }
     */
    public static void pMachineName$set(MemorySegment seg, MemorySegment x) {
        constants$2853.const$1.set(seg, x);
    }
    public static MemorySegment pMachineName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2853.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pMachineName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2853.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pUserName$VH() {
        return constants$2853.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pUserName;
     * }
     */
    public static MemorySegment pUserName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2853.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pUserName;
     * }
     */
    public static void pUserName$set(MemorySegment seg, MemorySegment x) {
        constants$2853.const$2.set(seg, x);
    }
    public static MemorySegment pUserName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2853.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pUserName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2853.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDocument$VH() {
        return constants$2853.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pDocument;
     * }
     */
    public static MemorySegment pDocument$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2853.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pDocument;
     * }
     */
    public static void pDocument$set(MemorySegment seg, MemorySegment x) {
        constants$2853.const$3.set(seg, x);
    }
    public static MemorySegment pDocument$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2853.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pDocument$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2853.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNotifyName$VH() {
        return constants$2853.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pNotifyName;
     * }
     */
    public static MemorySegment pNotifyName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2853.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pNotifyName;
     * }
     */
    public static void pNotifyName$set(MemorySegment seg, MemorySegment x) {
        constants$2853.const$4.set(seg, x);
    }
    public static MemorySegment pNotifyName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2853.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pNotifyName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2853.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDatatype$VH() {
        return constants$2853.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pDatatype;
     * }
     */
    public static MemorySegment pDatatype$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2853.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pDatatype;
     * }
     */
    public static void pDatatype$set(MemorySegment seg, MemorySegment x) {
        constants$2853.const$5.set(seg, x);
    }
    public static MemorySegment pDatatype$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2853.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pDatatype$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2853.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pPrintProcessor$VH() {
        return constants$2854.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pPrintProcessor;
     * }
     */
    public static MemorySegment pPrintProcessor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2854.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pPrintProcessor;
     * }
     */
    public static void pPrintProcessor$set(MemorySegment seg, MemorySegment x) {
        constants$2854.const$0.set(seg, x);
    }
    public static MemorySegment pPrintProcessor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2854.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pPrintProcessor$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2854.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pParameters$VH() {
        return constants$2854.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pParameters;
     * }
     */
    public static MemorySegment pParameters$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2854.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pParameters;
     * }
     */
    public static void pParameters$set(MemorySegment seg, MemorySegment x) {
        constants$2854.const$1.set(seg, x);
    }
    public static MemorySegment pParameters$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2854.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pParameters$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2854.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDriverName$VH() {
        return constants$2854.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pDriverName;
     * }
     */
    public static MemorySegment pDriverName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2854.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pDriverName;
     * }
     */
    public static void pDriverName$set(MemorySegment seg, MemorySegment x) {
        constants$2854.const$2.set(seg, x);
    }
    public static MemorySegment pDriverName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2854.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pDriverName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2854.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDevMode$VH() {
        return constants$2854.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPDEVMODEW pDevMode;
     * }
     */
    public static MemorySegment pDevMode$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2854.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPDEVMODEW pDevMode;
     * }
     */
    public static void pDevMode$set(MemorySegment seg, MemorySegment x) {
        constants$2854.const$3.set(seg, x);
    }
    public static MemorySegment pDevMode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2854.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pDevMode$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2854.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pStatus$VH() {
        return constants$2854.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pStatus;
     * }
     */
    public static MemorySegment pStatus$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2854.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pStatus;
     * }
     */
    public static void pStatus$set(MemorySegment seg, MemorySegment x) {
        constants$2854.const$4.set(seg, x);
    }
    public static MemorySegment pStatus$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2854.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pStatus$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2854.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pSecurityDescriptor$VH() {
        return constants$2854.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PSECURITY_DESCRIPTOR pSecurityDescriptor;
     * }
     */
    public static MemorySegment pSecurityDescriptor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2854.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PSECURITY_DESCRIPTOR pSecurityDescriptor;
     * }
     */
    public static void pSecurityDescriptor$set(MemorySegment seg, MemorySegment x) {
        constants$2854.const$5.set(seg, x);
    }
    public static MemorySegment pSecurityDescriptor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2854.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pSecurityDescriptor$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2854.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Status$VH() {
        return constants$2855.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Status;
     * }
     */
    public static int Status$get(MemorySegment seg) {
        return (int)constants$2855.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Status;
     * }
     */
    public static void Status$set(MemorySegment seg, int x) {
        constants$2855.const$0.set(seg, x);
    }
    public static int Status$get(MemorySegment seg, long index) {
        return (int)constants$2855.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Status$set(MemorySegment seg, long index, int x) {
        constants$2855.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Priority$VH() {
        return constants$2855.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Priority;
     * }
     */
    public static int Priority$get(MemorySegment seg) {
        return (int)constants$2855.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Priority;
     * }
     */
    public static void Priority$set(MemorySegment seg, int x) {
        constants$2855.const$1.set(seg, x);
    }
    public static int Priority$get(MemorySegment seg, long index) {
        return (int)constants$2855.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Priority$set(MemorySegment seg, long index, int x) {
        constants$2855.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Position$VH() {
        return constants$2855.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Position;
     * }
     */
    public static int Position$get(MemorySegment seg) {
        return (int)constants$2855.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Position;
     * }
     */
    public static void Position$set(MemorySegment seg, int x) {
        constants$2855.const$2.set(seg, x);
    }
    public static int Position$get(MemorySegment seg, long index) {
        return (int)constants$2855.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Position$set(MemorySegment seg, long index, int x) {
        constants$2855.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle StartTime$VH() {
        return constants$2855.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD StartTime;
     * }
     */
    public static int StartTime$get(MemorySegment seg) {
        return (int)constants$2855.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD StartTime;
     * }
     */
    public static void StartTime$set(MemorySegment seg, int x) {
        constants$2855.const$3.set(seg, x);
    }
    public static int StartTime$get(MemorySegment seg, long index) {
        return (int)constants$2855.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void StartTime$set(MemorySegment seg, long index, int x) {
        constants$2855.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle UntilTime$VH() {
        return constants$2855.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD UntilTime;
     * }
     */
    public static int UntilTime$get(MemorySegment seg) {
        return (int)constants$2855.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD UntilTime;
     * }
     */
    public static void UntilTime$set(MemorySegment seg, int x) {
        constants$2855.const$4.set(seg, x);
    }
    public static int UntilTime$get(MemorySegment seg, long index) {
        return (int)constants$2855.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void UntilTime$set(MemorySegment seg, long index, int x) {
        constants$2855.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TotalPages$VH() {
        return constants$2855.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TotalPages;
     * }
     */
    public static int TotalPages$get(MemorySegment seg) {
        return (int)constants$2855.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TotalPages;
     * }
     */
    public static void TotalPages$set(MemorySegment seg, int x) {
        constants$2855.const$5.set(seg, x);
    }
    public static int TotalPages$get(MemorySegment seg, long index) {
        return (int)constants$2855.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalPages$set(MemorySegment seg, long index, int x) {
        constants$2855.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Size$VH() {
        return constants$2856.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$2856.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$2856.const$0.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$2856.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$2856.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Submitted$slice(MemorySegment seg) {
        return seg.asSlice(132, 16);
    }
    public static VarHandle Time$VH() {
        return constants$2856.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Time;
     * }
     */
    public static int Time$get(MemorySegment seg) {
        return (int)constants$2856.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Time;
     * }
     */
    public static void Time$set(MemorySegment seg, int x) {
        constants$2856.const$1.set(seg, x);
    }
    public static int Time$get(MemorySegment seg, long index) {
        return (int)constants$2856.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Time$set(MemorySegment seg, long index, int x) {
        constants$2856.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle PagesPrinted$VH() {
        return constants$2856.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD PagesPrinted;
     * }
     */
    public static int PagesPrinted$get(MemorySegment seg) {
        return (int)constants$2856.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD PagesPrinted;
     * }
     */
    public static void PagesPrinted$set(MemorySegment seg, int x) {
        constants$2856.const$2.set(seg, x);
    }
    public static int PagesPrinted$get(MemorySegment seg, long index) {
        return (int)constants$2856.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void PagesPrinted$set(MemorySegment seg, long index, int x) {
        constants$2856.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SizeHigh$VH() {
        return constants$2856.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG SizeHigh;
     * }
     */
    public static int SizeHigh$get(MemorySegment seg) {
        return (int)constants$2856.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG SizeHigh;
     * }
     */
    public static void SizeHigh$set(MemorySegment seg, int x) {
        constants$2856.const$3.set(seg, x);
    }
    public static int SizeHigh$get(MemorySegment seg, long index) {
        return (int)constants$2856.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeHigh$set(MemorySegment seg, long index, int x) {
        constants$2856.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


