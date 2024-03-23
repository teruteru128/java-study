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
 * typedef struct _ENCRYPTION_KEY_CTRL_INPUT {
 *     DWORD HeaderSize;
 *     DWORD StructureSize;
 *     WORD KeyOffset;
 *     WORD KeySize;
 *     DWORD DplLock;
 *     DWORDLONG DplUserId;
 *     DWORDLONG DplCredentialId;
 * } ENCRYPTION_KEY_CTRL_INPUT
 * }
 */
public class ENCRYPTION_KEY_CTRL_INPUT extends _ENCRYPTION_KEY_CTRL_INPUT {

    ENCRYPTION_KEY_CTRL_INPUT() {
        // Should not be called directly
    }
}

