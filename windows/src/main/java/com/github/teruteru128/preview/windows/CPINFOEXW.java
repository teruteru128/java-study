// Generated by jextract

package com.github.teruteru128.preview.windows;

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
 * typedef struct _cpinfoexW {
 *     UINT MaxCharSize;
 *     BYTE DefaultChar[2];
 *     BYTE LeadByte[12];
 *     WCHAR UnicodeDefaultChar;
 *     UINT CodePage;
 *     WCHAR CodePageName[260];
 * } CPINFOEXW
 * }
 */
public class CPINFOEXW extends _cpinfoexW {

    CPINFOEXW() {
        // Should not be called directly
    }
}
