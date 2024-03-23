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
 * typedef struct tagPDA {
 *     DWORD lStructSize;
 *     HWND hwndOwner;
 *     HGLOBAL hDevMode;
 *     HGLOBAL hDevNames;
 *     HDC hDC;
 *     DWORD Flags;
 *     WORD nFromPage;
 *     WORD nToPage;
 *     WORD nMinPage;
 *     WORD nMaxPage;
 *     WORD nCopies;
 *     HINSTANCE hInstance;
 *     LPARAM lCustData;
 *     LPPRINTHOOKPROC lpfnPrintHook;
 *     LPSETUPHOOKPROC lpfnSetupHook;
 *     LPCSTR lpPrintTemplateName;
 *     LPCSTR lpSetupTemplateName;
 *     HGLOBAL hPrintTemplate;
 *     HGLOBAL hSetupTemplate;
 * } PRINTDLGA
 * }
 */
public class PRINTDLGA extends tagPDA {

    PRINTDLGA() {
        // Should not be called directly
    }
}

