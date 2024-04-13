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
 * typedef struct _KTMOBJECT_CURSOR {
 *     GUID LastQuery;
 *     DWORD ObjectIdCount;
 *     GUID ObjectIds[1];
 * } KTMOBJECT_CURSOR
 * }
 */
public class KTMOBJECT_CURSOR extends _KTMOBJECT_CURSOR {

    KTMOBJECT_CURSOR() {
        // Should not be called directly
    }
}
