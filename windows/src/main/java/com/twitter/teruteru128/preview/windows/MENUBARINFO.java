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
 * typedef struct tagMENUBARINFO {
 *     DWORD cbSize;
 *     RECT rcBar;
 *     HMENU hMenu;
 *     HWND hwndMenu;
 *     BOOL fBarFocused : 1;
 *     BOOL fFocused : 1;
 *     BOOL fUnused : 30;
 * } MENUBARINFO
 * }
 */
public class MENUBARINFO extends tagMENUBARINFO {

    MENUBARINFO() {
        // Should not be called directly
    }
}

