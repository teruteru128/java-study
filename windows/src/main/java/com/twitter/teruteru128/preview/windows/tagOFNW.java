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
 * struct tagOFNW {
 *     DWORD lStructSize;
 *     HWND hwndOwner;
 *     HINSTANCE hInstance;
 *     LPCWSTR lpstrFilter;
 *     LPWSTR lpstrCustomFilter;
 *     DWORD nMaxCustFilter;
 *     DWORD nFilterIndex;
 *     LPWSTR lpstrFile;
 *     DWORD nMaxFile;
 *     LPWSTR lpstrFileTitle;
 *     DWORD nMaxFileTitle;
 *     LPCWSTR lpstrInitialDir;
 *     LPCWSTR lpstrTitle;
 *     DWORD Flags;
 *     WORD nFileOffset;
 *     WORD nFileExtension;
 *     LPCWSTR lpstrDefExt;
 *     LPARAM lCustData;
 *     LPOFNHOOKPROC lpfnHook;
 *     LPCWSTR lpTemplateName;
 *     void *pvReserved;
 *     DWORD dwReserved;
 *     DWORD FlagsEx;
 * }
 * }
 */
public class tagOFNW {

    tagOFNW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("lStructSize"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("hwndOwner"),
        Windows_h.C_POINTER.withName("hInstance"),
        Windows_h.C_POINTER.withName("lpstrFilter"),
        Windows_h.C_POINTER.withName("lpstrCustomFilter"),
        Windows_h.C_LONG.withName("nMaxCustFilter"),
        Windows_h.C_LONG.withName("nFilterIndex"),
        Windows_h.C_POINTER.withName("lpstrFile"),
        Windows_h.C_LONG.withName("nMaxFile"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("lpstrFileTitle"),
        Windows_h.C_LONG.withName("nMaxFileTitle"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("lpstrInitialDir"),
        Windows_h.C_POINTER.withName("lpstrTitle"),
        Windows_h.C_LONG.withName("Flags"),
        Windows_h.C_SHORT.withName("nFileOffset"),
        Windows_h.C_SHORT.withName("nFileExtension"),
        Windows_h.C_POINTER.withName("lpstrDefExt"),
        Windows_h.C_LONG_LONG.withName("lCustData"),
        Windows_h.C_POINTER.withName("lpfnHook"),
        Windows_h.C_POINTER.withName("lpTemplateName"),
        Windows_h.C_POINTER.withName("pvReserved"),
        Windows_h.C_LONG.withName("dwReserved"),
        Windows_h.C_LONG.withName("FlagsEx")
    ).withName("tagOFNW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt lStructSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lStructSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD lStructSize
     * }
     */
    public static final OfInt lStructSize$layout() {
        return lStructSize$LAYOUT;
    }

    private static final long lStructSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD lStructSize
     * }
     */
    public static final long lStructSize$offset() {
        return lStructSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD lStructSize
     * }
     */
    public static int lStructSize(MemorySegment struct) {
        return struct.get(lStructSize$LAYOUT, lStructSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD lStructSize
     * }
     */
    public static void lStructSize(MemorySegment struct, int fieldValue) {
        struct.set(lStructSize$LAYOUT, lStructSize$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndOwner$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndOwner"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndOwner
     * }
     */
    public static final AddressLayout hwndOwner$layout() {
        return hwndOwner$LAYOUT;
    }

    private static final long hwndOwner$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndOwner
     * }
     */
    public static final long hwndOwner$offset() {
        return hwndOwner$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndOwner
     * }
     */
    public static MemorySegment hwndOwner(MemorySegment struct) {
        return struct.get(hwndOwner$LAYOUT, hwndOwner$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndOwner
     * }
     */
    public static void hwndOwner(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndOwner$LAYOUT, hwndOwner$OFFSET, fieldValue);
    }

    private static final AddressLayout hInstance$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hInstance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HINSTANCE hInstance
     * }
     */
    public static final AddressLayout hInstance$layout() {
        return hInstance$LAYOUT;
    }

    private static final long hInstance$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HINSTANCE hInstance
     * }
     */
    public static final long hInstance$offset() {
        return hInstance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HINSTANCE hInstance
     * }
     */
    public static MemorySegment hInstance(MemorySegment struct) {
        return struct.get(hInstance$LAYOUT, hInstance$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HINSTANCE hInstance
     * }
     */
    public static void hInstance(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hInstance$LAYOUT, hInstance$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstrFilter$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrFilter"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrFilter
     * }
     */
    public static final AddressLayout lpstrFilter$layout() {
        return lpstrFilter$LAYOUT;
    }

    private static final long lpstrFilter$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrFilter
     * }
     */
    public static final long lpstrFilter$offset() {
        return lpstrFilter$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrFilter
     * }
     */
    public static MemorySegment lpstrFilter(MemorySegment struct) {
        return struct.get(lpstrFilter$LAYOUT, lpstrFilter$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrFilter
     * }
     */
    public static void lpstrFilter(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrFilter$LAYOUT, lpstrFilter$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstrCustomFilter$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrCustomFilter"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpstrCustomFilter
     * }
     */
    public static final AddressLayout lpstrCustomFilter$layout() {
        return lpstrCustomFilter$LAYOUT;
    }

    private static final long lpstrCustomFilter$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpstrCustomFilter
     * }
     */
    public static final long lpstrCustomFilter$offset() {
        return lpstrCustomFilter$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpstrCustomFilter
     * }
     */
    public static MemorySegment lpstrCustomFilter(MemorySegment struct) {
        return struct.get(lpstrCustomFilter$LAYOUT, lpstrCustomFilter$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpstrCustomFilter
     * }
     */
    public static void lpstrCustomFilter(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrCustomFilter$LAYOUT, lpstrCustomFilter$OFFSET, fieldValue);
    }

    private static final OfInt nMaxCustFilter$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nMaxCustFilter"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nMaxCustFilter
     * }
     */
    public static final OfInt nMaxCustFilter$layout() {
        return nMaxCustFilter$LAYOUT;
    }

    private static final long nMaxCustFilter$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nMaxCustFilter
     * }
     */
    public static final long nMaxCustFilter$offset() {
        return nMaxCustFilter$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nMaxCustFilter
     * }
     */
    public static int nMaxCustFilter(MemorySegment struct) {
        return struct.get(nMaxCustFilter$LAYOUT, nMaxCustFilter$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nMaxCustFilter
     * }
     */
    public static void nMaxCustFilter(MemorySegment struct, int fieldValue) {
        struct.set(nMaxCustFilter$LAYOUT, nMaxCustFilter$OFFSET, fieldValue);
    }

    private static final OfInt nFilterIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nFilterIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nFilterIndex
     * }
     */
    public static final OfInt nFilterIndex$layout() {
        return nFilterIndex$LAYOUT;
    }

    private static final long nFilterIndex$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nFilterIndex
     * }
     */
    public static final long nFilterIndex$offset() {
        return nFilterIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nFilterIndex
     * }
     */
    public static int nFilterIndex(MemorySegment struct) {
        return struct.get(nFilterIndex$LAYOUT, nFilterIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nFilterIndex
     * }
     */
    public static void nFilterIndex(MemorySegment struct, int fieldValue) {
        struct.set(nFilterIndex$LAYOUT, nFilterIndex$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstrFile$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrFile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpstrFile
     * }
     */
    public static final AddressLayout lpstrFile$layout() {
        return lpstrFile$LAYOUT;
    }

    private static final long lpstrFile$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpstrFile
     * }
     */
    public static final long lpstrFile$offset() {
        return lpstrFile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpstrFile
     * }
     */
    public static MemorySegment lpstrFile(MemorySegment struct) {
        return struct.get(lpstrFile$LAYOUT, lpstrFile$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpstrFile
     * }
     */
    public static void lpstrFile(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrFile$LAYOUT, lpstrFile$OFFSET, fieldValue);
    }

    private static final OfInt nMaxFile$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nMaxFile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nMaxFile
     * }
     */
    public static final OfInt nMaxFile$layout() {
        return nMaxFile$LAYOUT;
    }

    private static final long nMaxFile$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nMaxFile
     * }
     */
    public static final long nMaxFile$offset() {
        return nMaxFile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nMaxFile
     * }
     */
    public static int nMaxFile(MemorySegment struct) {
        return struct.get(nMaxFile$LAYOUT, nMaxFile$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nMaxFile
     * }
     */
    public static void nMaxFile(MemorySegment struct, int fieldValue) {
        struct.set(nMaxFile$LAYOUT, nMaxFile$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstrFileTitle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrFileTitle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpstrFileTitle
     * }
     */
    public static final AddressLayout lpstrFileTitle$layout() {
        return lpstrFileTitle$LAYOUT;
    }

    private static final long lpstrFileTitle$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpstrFileTitle
     * }
     */
    public static final long lpstrFileTitle$offset() {
        return lpstrFileTitle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpstrFileTitle
     * }
     */
    public static MemorySegment lpstrFileTitle(MemorySegment struct) {
        return struct.get(lpstrFileTitle$LAYOUT, lpstrFileTitle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpstrFileTitle
     * }
     */
    public static void lpstrFileTitle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrFileTitle$LAYOUT, lpstrFileTitle$OFFSET, fieldValue);
    }

    private static final OfInt nMaxFileTitle$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nMaxFileTitle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nMaxFileTitle
     * }
     */
    public static final OfInt nMaxFileTitle$layout() {
        return nMaxFileTitle$LAYOUT;
    }

    private static final long nMaxFileTitle$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nMaxFileTitle
     * }
     */
    public static final long nMaxFileTitle$offset() {
        return nMaxFileTitle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nMaxFileTitle
     * }
     */
    public static int nMaxFileTitle(MemorySegment struct) {
        return struct.get(nMaxFileTitle$LAYOUT, nMaxFileTitle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nMaxFileTitle
     * }
     */
    public static void nMaxFileTitle(MemorySegment struct, int fieldValue) {
        struct.set(nMaxFileTitle$LAYOUT, nMaxFileTitle$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstrInitialDir$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrInitialDir"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrInitialDir
     * }
     */
    public static final AddressLayout lpstrInitialDir$layout() {
        return lpstrInitialDir$LAYOUT;
    }

    private static final long lpstrInitialDir$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrInitialDir
     * }
     */
    public static final long lpstrInitialDir$offset() {
        return lpstrInitialDir$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrInitialDir
     * }
     */
    public static MemorySegment lpstrInitialDir(MemorySegment struct) {
        return struct.get(lpstrInitialDir$LAYOUT, lpstrInitialDir$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrInitialDir
     * }
     */
    public static void lpstrInitialDir(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrInitialDir$LAYOUT, lpstrInitialDir$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstrTitle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrTitle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrTitle
     * }
     */
    public static final AddressLayout lpstrTitle$layout() {
        return lpstrTitle$LAYOUT;
    }

    private static final long lpstrTitle$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrTitle
     * }
     */
    public static final long lpstrTitle$offset() {
        return lpstrTitle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrTitle
     * }
     */
    public static MemorySegment lpstrTitle(MemorySegment struct) {
        return struct.get(lpstrTitle$LAYOUT, lpstrTitle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrTitle
     * }
     */
    public static void lpstrTitle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrTitle$LAYOUT, lpstrTitle$OFFSET, fieldValue);
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
    }

    private static final OfShort nFileOffset$LAYOUT = (OfShort)$LAYOUT.select(groupElement("nFileOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD nFileOffset
     * }
     */
    public static final OfShort nFileOffset$layout() {
        return nFileOffset$LAYOUT;
    }

    private static final long nFileOffset$OFFSET = 100;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD nFileOffset
     * }
     */
    public static final long nFileOffset$offset() {
        return nFileOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD nFileOffset
     * }
     */
    public static short nFileOffset(MemorySegment struct) {
        return struct.get(nFileOffset$LAYOUT, nFileOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD nFileOffset
     * }
     */
    public static void nFileOffset(MemorySegment struct, short fieldValue) {
        struct.set(nFileOffset$LAYOUT, nFileOffset$OFFSET, fieldValue);
    }

    private static final OfShort nFileExtension$LAYOUT = (OfShort)$LAYOUT.select(groupElement("nFileExtension"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD nFileExtension
     * }
     */
    public static final OfShort nFileExtension$layout() {
        return nFileExtension$LAYOUT;
    }

    private static final long nFileExtension$OFFSET = 102;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD nFileExtension
     * }
     */
    public static final long nFileExtension$offset() {
        return nFileExtension$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD nFileExtension
     * }
     */
    public static short nFileExtension(MemorySegment struct) {
        return struct.get(nFileExtension$LAYOUT, nFileExtension$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD nFileExtension
     * }
     */
    public static void nFileExtension(MemorySegment struct, short fieldValue) {
        struct.set(nFileExtension$LAYOUT, nFileExtension$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstrDefExt$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrDefExt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrDefExt
     * }
     */
    public static final AddressLayout lpstrDefExt$layout() {
        return lpstrDefExt$LAYOUT;
    }

    private static final long lpstrDefExt$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrDefExt
     * }
     */
    public static final long lpstrDefExt$offset() {
        return lpstrDefExt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrDefExt
     * }
     */
    public static MemorySegment lpstrDefExt(MemorySegment struct) {
        return struct.get(lpstrDefExt$LAYOUT, lpstrDefExt$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrDefExt
     * }
     */
    public static void lpstrDefExt(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrDefExt$LAYOUT, lpstrDefExt$OFFSET, fieldValue);
    }

    private static final OfLong lCustData$LAYOUT = (OfLong)$LAYOUT.select(groupElement("lCustData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPARAM lCustData
     * }
     */
    public static final OfLong lCustData$layout() {
        return lCustData$LAYOUT;
    }

    private static final long lCustData$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPARAM lCustData
     * }
     */
    public static final long lCustData$offset() {
        return lCustData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPARAM lCustData
     * }
     */
    public static long lCustData(MemorySegment struct) {
        return struct.get(lCustData$LAYOUT, lCustData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPARAM lCustData
     * }
     */
    public static void lCustData(MemorySegment struct, long fieldValue) {
        struct.set(lCustData$LAYOUT, lCustData$OFFSET, fieldValue);
    }

    private static final AddressLayout lpfnHook$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpfnHook"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPOFNHOOKPROC lpfnHook
     * }
     */
    public static final AddressLayout lpfnHook$layout() {
        return lpfnHook$LAYOUT;
    }

    private static final long lpfnHook$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPOFNHOOKPROC lpfnHook
     * }
     */
    public static final long lpfnHook$offset() {
        return lpfnHook$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPOFNHOOKPROC lpfnHook
     * }
     */
    public static MemorySegment lpfnHook(MemorySegment struct) {
        return struct.get(lpfnHook$LAYOUT, lpfnHook$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPOFNHOOKPROC lpfnHook
     * }
     */
    public static void lpfnHook(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpfnHook$LAYOUT, lpfnHook$OFFSET, fieldValue);
    }

    private static final AddressLayout lpTemplateName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpTemplateName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR lpTemplateName
     * }
     */
    public static final AddressLayout lpTemplateName$layout() {
        return lpTemplateName$LAYOUT;
    }

    private static final long lpTemplateName$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR lpTemplateName
     * }
     */
    public static final long lpTemplateName$offset() {
        return lpTemplateName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR lpTemplateName
     * }
     */
    public static MemorySegment lpTemplateName(MemorySegment struct) {
        return struct.get(lpTemplateName$LAYOUT, lpTemplateName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR lpTemplateName
     * }
     */
    public static void lpTemplateName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpTemplateName$LAYOUT, lpTemplateName$OFFSET, fieldValue);
    }

    private static final AddressLayout pvReserved$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pvReserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *pvReserved
     * }
     */
    public static final AddressLayout pvReserved$layout() {
        return pvReserved$LAYOUT;
    }

    private static final long pvReserved$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *pvReserved
     * }
     */
    public static final long pvReserved$offset() {
        return pvReserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *pvReserved
     * }
     */
    public static MemorySegment pvReserved(MemorySegment struct) {
        return struct.get(pvReserved$LAYOUT, pvReserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *pvReserved
     * }
     */
    public static void pvReserved(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pvReserved$LAYOUT, pvReserved$OFFSET, fieldValue);
    }

    private static final OfInt dwReserved$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwReserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwReserved
     * }
     */
    public static final OfInt dwReserved$layout() {
        return dwReserved$LAYOUT;
    }

    private static final long dwReserved$OFFSET = 144;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwReserved
     * }
     */
    public static final long dwReserved$offset() {
        return dwReserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwReserved
     * }
     */
    public static int dwReserved(MemorySegment struct) {
        return struct.get(dwReserved$LAYOUT, dwReserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwReserved
     * }
     */
    public static void dwReserved(MemorySegment struct, int fieldValue) {
        struct.set(dwReserved$LAYOUT, dwReserved$OFFSET, fieldValue);
    }

    private static final OfInt FlagsEx$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FlagsEx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FlagsEx
     * }
     */
    public static final OfInt FlagsEx$layout() {
        return FlagsEx$LAYOUT;
    }

    private static final long FlagsEx$OFFSET = 148;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FlagsEx
     * }
     */
    public static final long FlagsEx$offset() {
        return FlagsEx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FlagsEx
     * }
     */
    public static int FlagsEx(MemorySegment struct) {
        return struct.get(FlagsEx$LAYOUT, FlagsEx$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FlagsEx
     * }
     */
    public static void FlagsEx(MemorySegment struct, int fieldValue) {
        struct.set(FlagsEx$LAYOUT, FlagsEx$OFFSET, fieldValue);
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

