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
 * typedef struct _HMAC_Info {
 *     ALG_ID HashAlgid;
 *     BYTE *pbInnerString;
 *     DWORD cbInnerString;
 *     BYTE *pbOuterString;
 *     DWORD cbOuterString;
 * } HMAC_INFO
 * }
 */
public class HMAC_INFO extends _HMAC_Info {

    HMAC_INFO() {
        // Should not be called directly
    }
}

