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
 * typedef struct _SYSTEM_ALARM_CALLBACK_OBJECT_ACE {
 *     ACE_HEADER Header;
 *     ACCESS_MASK Mask;
 *     DWORD Flags;
 *     GUID ObjectType;
 *     GUID InheritedObjectType;
 *     DWORD SidStart;
 * } SYSTEM_ALARM_CALLBACK_OBJECT_ACE
 * }
 */
public class SYSTEM_ALARM_CALLBACK_OBJECT_ACE extends _SYSTEM_ALARM_CALLBACK_OBJECT_ACE {

    SYSTEM_ALARM_CALLBACK_OBJECT_ACE() {
        // Should not be called directly
    }
}
