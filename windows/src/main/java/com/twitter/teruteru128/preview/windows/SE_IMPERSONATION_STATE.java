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
 * typedef struct _SE_IMPERSONATION_STATE {
 *     PACCESS_TOKEN Token;
 *     BOOLEAN CopyOnOpen;
 *     BOOLEAN EffectiveOnly;
 *     SECURITY_IMPERSONATION_LEVEL Level;
 * } SE_IMPERSONATION_STATE
 * }
 */
public class SE_IMPERSONATION_STATE extends _SE_IMPERSONATION_STATE {

    SE_IMPERSONATION_STATE() {
        // Should not be called directly
    }
}

