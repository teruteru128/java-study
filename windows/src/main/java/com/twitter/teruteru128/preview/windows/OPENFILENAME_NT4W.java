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
 * typedef struct tagOFN_NT4W {
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
 * } OPENFILENAME_NT4W
 * }
 */
public class OPENFILENAME_NT4W extends tagOFN_NT4W {

    OPENFILENAME_NT4W() {
        // Should not be called directly
    }
}

