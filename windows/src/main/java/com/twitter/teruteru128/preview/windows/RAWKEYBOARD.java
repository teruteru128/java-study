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
 * typedef struct tagRAWKEYBOARD {
 *     USHORT MakeCode;
 *     USHORT Flags;
 *     USHORT Reserved;
 *     USHORT VKey;
 *     UINT Message;
 *     ULONG ExtraInformation;
 * } RAWKEYBOARD
 * }
 */
public class RAWKEYBOARD extends tagRAWKEYBOARD {

    RAWKEYBOARD() {
        // Should not be called directly
    }
}

