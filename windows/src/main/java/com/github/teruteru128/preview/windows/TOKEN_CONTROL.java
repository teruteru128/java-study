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
 * typedef struct _TOKEN_CONTROL {
 *     LUID TokenId;
 *     LUID AuthenticationId;
 *     LUID ModifiedId;
 *     TOKEN_SOURCE TokenSource;
 * } TOKEN_CONTROL
 * }
 */
public class TOKEN_CONTROL extends _TOKEN_CONTROL {

    TOKEN_CONTROL() {
        // Should not be called directly
    }
}
