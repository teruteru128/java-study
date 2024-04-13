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
 * typedef struct _PRIVKEYVER3 {
 *     DWORD magic;
 *     DWORD bitlenP;
 *     DWORD bitlenQ;
 *     DWORD bitlenJ;
 *     DWORD bitlenX;
 *     DSSSEED DSSSeed;
 * } DHPRIVKEY_VER3
 * }
 */
public class DHPRIVKEY_VER3 extends _PRIVKEYVER3 {

    DHPRIVKEY_VER3() {
        // Should not be called directly
    }
}
