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
 * typedef struct tagMDICREATESTRUCTA {
 *     LPCSTR szClass;
 *     LPCSTR szTitle;
 *     HANDLE hOwner;
 *     int x;
 *     int y;
 *     int cx;
 *     int cy;
 *     DWORD style;
 *     LPARAM lParam;
 * } MDICREATESTRUCTA
 * }
 */
public class MDICREATESTRUCTA extends tagMDICREATESTRUCTA {

    MDICREATESTRUCTA() {
        // Should not be called directly
    }
}
