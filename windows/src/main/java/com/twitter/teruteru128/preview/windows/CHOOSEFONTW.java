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
 * typedef struct tagCHOOSEFONTW {
 *     DWORD lStructSize;
 *     HWND hwndOwner;
 *     HDC hDC;
 *     LPLOGFONTW lpLogFont;
 *     INT iPointSize;
 *     DWORD Flags;
 *     COLORREF rgbColors;
 *     LPARAM lCustData;
 *     LPCFHOOKPROC lpfnHook;
 *     LPCWSTR lpTemplateName;
 *     HINSTANCE hInstance;
 *     LPWSTR lpszStyle;
 *     WORD nFontType;
 *     WORD ___MISSING_ALIGNMENT__;
 *     INT nSizeMin;
 *     INT nSizeMax;
 * } CHOOSEFONTW
 * }
 */
public class CHOOSEFONTW extends tagCHOOSEFONTW {

    CHOOSEFONTW() {
        // Should not be called directly
    }
}

