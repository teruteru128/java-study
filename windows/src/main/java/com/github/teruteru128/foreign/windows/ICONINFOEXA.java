// Generated by jextract

package com.github.teruteru128.foreign.windows;

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
 * typedef struct _ICONINFOEXA {
 *     DWORD cbSize;
 *     BOOL fIcon;
 *     DWORD xHotspot;
 *     DWORD yHotspot;
 *     HBITMAP hbmMask;
 *     HBITMAP hbmColor;
 *     WORD wResID;
 *     CHAR szModName[260];
 *     CHAR szResName[260];
 * } ICONINFOEXA
 * }
 */
public class ICONINFOEXA extends _ICONINFOEXA {

    ICONINFOEXA() {
        // Should not be called directly
    }
}
