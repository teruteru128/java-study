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
 * typedef struct tagTOUCHINPUT {
 *     LONG x;
 *     LONG y;
 *     HANDLE hSource;
 *     DWORD dwID;
 *     DWORD dwFlags;
 *     DWORD dwMask;
 *     DWORD dwTime;
 *     ULONG_PTR dwExtraInfo;
 *     DWORD cxContact;
 *     DWORD cyContact;
 * } TOUCHINPUT
 * }
 */
public class TOUCHINPUT extends tagTOUCHINPUT {

    TOUCHINPUT() {
        // Should not be called directly
    }
}

