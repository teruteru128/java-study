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
 * typedef struct _ACCESS_ALLOWED_OBJECT_ACE {
 *     ACE_HEADER Header;
 *     ACCESS_MASK Mask;
 *     DWORD Flags;
 *     GUID ObjectType;
 *     GUID InheritedObjectType;
 *     DWORD SidStart;
 * } ACCESS_ALLOWED_OBJECT_ACE
 * }
 */
public class ACCESS_ALLOWED_OBJECT_ACE extends _ACCESS_ALLOWED_OBJECT_ACE {

    ACCESS_ALLOWED_OBJECT_ACE() {
        // Should not be called directly
    }
}
