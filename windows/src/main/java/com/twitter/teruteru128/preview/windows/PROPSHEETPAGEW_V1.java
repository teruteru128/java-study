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
 * typedef struct _PROPSHEETPAGEW_V1 {
 *     DWORD dwSize;
 *     DWORD dwFlags;
 *     HINSTANCE hInstance;
 *     union {
 *         LPCWSTR pszTemplate;
 *         PROPSHEETPAGE_RESOURCE pResource;
 *     };
 *     union {
 *         HICON hIcon;
 *         LPCWSTR pszIcon;
 *     };
 *     LPCWSTR pszTitle;
 *     DLGPROC pfnDlgProc;
 *     LPARAM lParam;
 *     LPFNPSPCALLBACKW pfnCallback;
 *     UINT *pcRefParent;
 * } PROPSHEETPAGEW_V1
 * }
 */
public class PROPSHEETPAGEW_V1 extends _PROPSHEETPAGEW_V1 {

    PROPSHEETPAGEW_V1() {
        // Should not be called directly
    }
}

