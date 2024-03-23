// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct _JOB_INFO_2W {
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
 * }
 * }
 */
public class _JOB_INFO_2W {

    _JOB_INFO_2W() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("JobId"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("pPrinterName"),
        Windows_h.C_POINTER.withName("pMachineName"),
        Windows_h.C_POINTER.withName("pUserName"),
        Windows_h.C_POINTER.withName("pDocument"),
        Windows_h.C_POINTER.withName("pNotifyName"),
        Windows_h.C_POINTER.withName("pDatatype"),
        Windows_h.C_POINTER.withName("pPrintProcessor"),
        Windows_h.C_POINTER.withName("pParameters"),
        Windows_h.C_POINTER.withName("pDriverName"),
        Windows_h.C_POINTER.withName("pDevMode"),
        Windows_h.C_POINTER.withName("pStatus"),
        Windows_h.C_POINTER.withName("pSecurityDescriptor"),
        Windows_h.C_LONG.withName("Status"),
        Windows_h.C_LONG.withName("Priority"),
        Windows_h.C_LONG.withName("Position"),
        Windows_h.C_LONG.withName("StartTime"),
        Windows_h.C_LONG.withName("UntilTime"),
        Windows_h.C_LONG.withName("TotalPages"),
        Windows_h.C_LONG.withName("Size"),
        _SYSTEMTIME.layout().withName("Submitted"),
        Windows_h.C_LONG.withName("Time"),
        Windows_h.C_LONG.withName("PagesPrinted"),
        MemoryLayout.paddingLayout(4)
    ).withName("_JOB_INFO_2W");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt JobId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("JobId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD JobId
     * }
     */
    public static final OfInt JobId$layout() {
        return JobId$LAYOUT;
    }

    private static final long JobId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD JobId
     * }
     */
    public static final long JobId$offset() {
        return JobId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD JobId
     * }
     */
    public static int JobId(MemorySegment struct) {
        return struct.get(JobId$LAYOUT, JobId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD JobId
     * }
     */
    public static void JobId(MemorySegment struct, int fieldValue) {
        struct.set(JobId$LAYOUT, JobId$OFFSET, fieldValue);
    }

    private static final AddressLayout pPrinterName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pPrinterName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pPrinterName
     * }
     */
    public static final AddressLayout pPrinterName$layout() {
        return pPrinterName$LAYOUT;
    }

    private static final long pPrinterName$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pPrinterName
     * }
     */
    public static final long pPrinterName$offset() {
        return pPrinterName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pPrinterName
     * }
     */
    public static MemorySegment pPrinterName(MemorySegment struct) {
        return struct.get(pPrinterName$LAYOUT, pPrinterName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pPrinterName
     * }
     */
    public static void pPrinterName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pPrinterName$LAYOUT, pPrinterName$OFFSET, fieldValue);
    }

    private static final AddressLayout pMachineName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pMachineName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pMachineName
     * }
     */
    public static final AddressLayout pMachineName$layout() {
        return pMachineName$LAYOUT;
    }

    private static final long pMachineName$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pMachineName
     * }
     */
    public static final long pMachineName$offset() {
        return pMachineName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pMachineName
     * }
     */
    public static MemorySegment pMachineName(MemorySegment struct) {
        return struct.get(pMachineName$LAYOUT, pMachineName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pMachineName
     * }
     */
    public static void pMachineName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pMachineName$LAYOUT, pMachineName$OFFSET, fieldValue);
    }

    private static final AddressLayout pUserName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pUserName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pUserName
     * }
     */
    public static final AddressLayout pUserName$layout() {
        return pUserName$LAYOUT;
    }

    private static final long pUserName$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pUserName
     * }
     */
    public static final long pUserName$offset() {
        return pUserName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pUserName
     * }
     */
    public static MemorySegment pUserName(MemorySegment struct) {
        return struct.get(pUserName$LAYOUT, pUserName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pUserName
     * }
     */
    public static void pUserName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pUserName$LAYOUT, pUserName$OFFSET, fieldValue);
    }

    private static final AddressLayout pDocument$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pDocument"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pDocument
     * }
     */
    public static final AddressLayout pDocument$layout() {
        return pDocument$LAYOUT;
    }

    private static final long pDocument$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pDocument
     * }
     */
    public static final long pDocument$offset() {
        return pDocument$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pDocument
     * }
     */
    public static MemorySegment pDocument(MemorySegment struct) {
        return struct.get(pDocument$LAYOUT, pDocument$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pDocument
     * }
     */
    public static void pDocument(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pDocument$LAYOUT, pDocument$OFFSET, fieldValue);
    }

    private static final AddressLayout pNotifyName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pNotifyName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pNotifyName
     * }
     */
    public static final AddressLayout pNotifyName$layout() {
        return pNotifyName$LAYOUT;
    }

    private static final long pNotifyName$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pNotifyName
     * }
     */
    public static final long pNotifyName$offset() {
        return pNotifyName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pNotifyName
     * }
     */
    public static MemorySegment pNotifyName(MemorySegment struct) {
        return struct.get(pNotifyName$LAYOUT, pNotifyName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pNotifyName
     * }
     */
    public static void pNotifyName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pNotifyName$LAYOUT, pNotifyName$OFFSET, fieldValue);
    }

    private static final AddressLayout pDatatype$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pDatatype"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pDatatype
     * }
     */
    public static final AddressLayout pDatatype$layout() {
        return pDatatype$LAYOUT;
    }

    private static final long pDatatype$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pDatatype
     * }
     */
    public static final long pDatatype$offset() {
        return pDatatype$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pDatatype
     * }
     */
    public static MemorySegment pDatatype(MemorySegment struct) {
        return struct.get(pDatatype$LAYOUT, pDatatype$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pDatatype
     * }
     */
    public static void pDatatype(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pDatatype$LAYOUT, pDatatype$OFFSET, fieldValue);
    }

    private static final AddressLayout pPrintProcessor$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pPrintProcessor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pPrintProcessor
     * }
     */
    public static final AddressLayout pPrintProcessor$layout() {
        return pPrintProcessor$LAYOUT;
    }

    private static final long pPrintProcessor$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pPrintProcessor
     * }
     */
    public static final long pPrintProcessor$offset() {
        return pPrintProcessor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pPrintProcessor
     * }
     */
    public static MemorySegment pPrintProcessor(MemorySegment struct) {
        return struct.get(pPrintProcessor$LAYOUT, pPrintProcessor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pPrintProcessor
     * }
     */
    public static void pPrintProcessor(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pPrintProcessor$LAYOUT, pPrintProcessor$OFFSET, fieldValue);
    }

    private static final AddressLayout pParameters$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pParameters"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pParameters
     * }
     */
    public static final AddressLayout pParameters$layout() {
        return pParameters$LAYOUT;
    }

    private static final long pParameters$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pParameters
     * }
     */
    public static final long pParameters$offset() {
        return pParameters$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pParameters
     * }
     */
    public static MemorySegment pParameters(MemorySegment struct) {
        return struct.get(pParameters$LAYOUT, pParameters$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pParameters
     * }
     */
    public static void pParameters(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pParameters$LAYOUT, pParameters$OFFSET, fieldValue);
    }

    private static final AddressLayout pDriverName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pDriverName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pDriverName
     * }
     */
    public static final AddressLayout pDriverName$layout() {
        return pDriverName$LAYOUT;
    }

    private static final long pDriverName$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pDriverName
     * }
     */
    public static final long pDriverName$offset() {
        return pDriverName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pDriverName
     * }
     */
    public static MemorySegment pDriverName(MemorySegment struct) {
        return struct.get(pDriverName$LAYOUT, pDriverName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pDriverName
     * }
     */
    public static void pDriverName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pDriverName$LAYOUT, pDriverName$OFFSET, fieldValue);
    }

    private static final AddressLayout pDevMode$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pDevMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPDEVMODEW pDevMode
     * }
     */
    public static final AddressLayout pDevMode$layout() {
        return pDevMode$LAYOUT;
    }

    private static final long pDevMode$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPDEVMODEW pDevMode
     * }
     */
    public static final long pDevMode$offset() {
        return pDevMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPDEVMODEW pDevMode
     * }
     */
    public static MemorySegment pDevMode(MemorySegment struct) {
        return struct.get(pDevMode$LAYOUT, pDevMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPDEVMODEW pDevMode
     * }
     */
    public static void pDevMode(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pDevMode$LAYOUT, pDevMode$OFFSET, fieldValue);
    }

    private static final AddressLayout pStatus$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pStatus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pStatus
     * }
     */
    public static final AddressLayout pStatus$layout() {
        return pStatus$LAYOUT;
    }

    private static final long pStatus$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pStatus
     * }
     */
    public static final long pStatus$offset() {
        return pStatus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pStatus
     * }
     */
    public static MemorySegment pStatus(MemorySegment struct) {
        return struct.get(pStatus$LAYOUT, pStatus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pStatus
     * }
     */
    public static void pStatus(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pStatus$LAYOUT, pStatus$OFFSET, fieldValue);
    }

    private static final AddressLayout pSecurityDescriptor$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pSecurityDescriptor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PSECURITY_DESCRIPTOR pSecurityDescriptor
     * }
     */
    public static final AddressLayout pSecurityDescriptor$layout() {
        return pSecurityDescriptor$LAYOUT;
    }

    private static final long pSecurityDescriptor$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PSECURITY_DESCRIPTOR pSecurityDescriptor
     * }
     */
    public static final long pSecurityDescriptor$offset() {
        return pSecurityDescriptor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PSECURITY_DESCRIPTOR pSecurityDescriptor
     * }
     */
    public static MemorySegment pSecurityDescriptor(MemorySegment struct) {
        return struct.get(pSecurityDescriptor$LAYOUT, pSecurityDescriptor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PSECURITY_DESCRIPTOR pSecurityDescriptor
     * }
     */
    public static void pSecurityDescriptor(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pSecurityDescriptor$LAYOUT, pSecurityDescriptor$OFFSET, fieldValue);
    }

    private static final OfInt Status$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Status"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Status
     * }
     */
    public static final OfInt Status$layout() {
        return Status$LAYOUT;
    }

    private static final long Status$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Status
     * }
     */
    public static final long Status$offset() {
        return Status$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Status
     * }
     */
    public static int Status(MemorySegment struct) {
        return struct.get(Status$LAYOUT, Status$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Status
     * }
     */
    public static void Status(MemorySegment struct, int fieldValue) {
        struct.set(Status$LAYOUT, Status$OFFSET, fieldValue);
    }

    private static final OfInt Priority$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Priority"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Priority
     * }
     */
    public static final OfInt Priority$layout() {
        return Priority$LAYOUT;
    }

    private static final long Priority$OFFSET = 108;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Priority
     * }
     */
    public static final long Priority$offset() {
        return Priority$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Priority
     * }
     */
    public static int Priority(MemorySegment struct) {
        return struct.get(Priority$LAYOUT, Priority$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Priority
     * }
     */
    public static void Priority(MemorySegment struct, int fieldValue) {
        struct.set(Priority$LAYOUT, Priority$OFFSET, fieldValue);
    }

    private static final OfInt Position$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Position"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Position
     * }
     */
    public static final OfInt Position$layout() {
        return Position$LAYOUT;
    }

    private static final long Position$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Position
     * }
     */
    public static final long Position$offset() {
        return Position$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Position
     * }
     */
    public static int Position(MemorySegment struct) {
        return struct.get(Position$LAYOUT, Position$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Position
     * }
     */
    public static void Position(MemorySegment struct, int fieldValue) {
        struct.set(Position$LAYOUT, Position$OFFSET, fieldValue);
    }

    private static final OfInt StartTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("StartTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD StartTime
     * }
     */
    public static final OfInt StartTime$layout() {
        return StartTime$LAYOUT;
    }

    private static final long StartTime$OFFSET = 116;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD StartTime
     * }
     */
    public static final long StartTime$offset() {
        return StartTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD StartTime
     * }
     */
    public static int StartTime(MemorySegment struct) {
        return struct.get(StartTime$LAYOUT, StartTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD StartTime
     * }
     */
    public static void StartTime(MemorySegment struct, int fieldValue) {
        struct.set(StartTime$LAYOUT, StartTime$OFFSET, fieldValue);
    }

    private static final OfInt UntilTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("UntilTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD UntilTime
     * }
     */
    public static final OfInt UntilTime$layout() {
        return UntilTime$LAYOUT;
    }

    private static final long UntilTime$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD UntilTime
     * }
     */
    public static final long UntilTime$offset() {
        return UntilTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD UntilTime
     * }
     */
    public static int UntilTime(MemorySegment struct) {
        return struct.get(UntilTime$LAYOUT, UntilTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD UntilTime
     * }
     */
    public static void UntilTime(MemorySegment struct, int fieldValue) {
        struct.set(UntilTime$LAYOUT, UntilTime$OFFSET, fieldValue);
    }

    private static final OfInt TotalPages$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TotalPages"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TotalPages
     * }
     */
    public static final OfInt TotalPages$layout() {
        return TotalPages$LAYOUT;
    }

    private static final long TotalPages$OFFSET = 124;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TotalPages
     * }
     */
    public static final long TotalPages$offset() {
        return TotalPages$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TotalPages
     * }
     */
    public static int TotalPages(MemorySegment struct) {
        return struct.get(TotalPages$LAYOUT, TotalPages$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TotalPages
     * }
     */
    public static void TotalPages(MemorySegment struct, int fieldValue) {
        struct.set(TotalPages$LAYOUT, TotalPages$OFFSET, fieldValue);
    }

    private static final OfInt Size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final OfInt Size$layout() {
        return Size$LAYOUT;
    }

    private static final long Size$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final long Size$offset() {
        return Size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static int Size(MemorySegment struct) {
        return struct.get(Size$LAYOUT, Size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static void Size(MemorySegment struct, int fieldValue) {
        struct.set(Size$LAYOUT, Size$OFFSET, fieldValue);
    }

    private static final GroupLayout Submitted$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Submitted"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SYSTEMTIME Submitted
     * }
     */
    public static final GroupLayout Submitted$layout() {
        return Submitted$LAYOUT;
    }

    private static final long Submitted$OFFSET = 132;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SYSTEMTIME Submitted
     * }
     */
    public static final long Submitted$offset() {
        return Submitted$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SYSTEMTIME Submitted
     * }
     */
    public static MemorySegment Submitted(MemorySegment struct) {
        return struct.asSlice(Submitted$OFFSET, Submitted$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SYSTEMTIME Submitted
     * }
     */
    public static void Submitted(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Submitted$OFFSET, Submitted$LAYOUT.byteSize());
    }

    private static final OfInt Time$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Time"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Time
     * }
     */
    public static final OfInt Time$layout() {
        return Time$LAYOUT;
    }

    private static final long Time$OFFSET = 148;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Time
     * }
     */
    public static final long Time$offset() {
        return Time$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Time
     * }
     */
    public static int Time(MemorySegment struct) {
        return struct.get(Time$LAYOUT, Time$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Time
     * }
     */
    public static void Time(MemorySegment struct, int fieldValue) {
        struct.set(Time$LAYOUT, Time$OFFSET, fieldValue);
    }

    private static final OfInt PagesPrinted$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PagesPrinted"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD PagesPrinted
     * }
     */
    public static final OfInt PagesPrinted$layout() {
        return PagesPrinted$LAYOUT;
    }

    private static final long PagesPrinted$OFFSET = 152;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD PagesPrinted
     * }
     */
    public static final long PagesPrinted$offset() {
        return PagesPrinted$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD PagesPrinted
     * }
     */
    public static int PagesPrinted(MemorySegment struct) {
        return struct.get(PagesPrinted$LAYOUT, PagesPrinted$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD PagesPrinted
     * }
     */
    public static void PagesPrinted(MemorySegment struct, int fieldValue) {
        struct.set(PagesPrinted$LAYOUT, PagesPrinted$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

