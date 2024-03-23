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
 * typedef struct tagRAWINPUT {
 *     RAWINPUTHEADER header;
 *     union {
 *         RAWMOUSE mouse;
 *         RAWKEYBOARD keyboard;
 *         RAWHID hid;
 *     } data;
 * } RAWINPUT
 * }
 */
public class RAWINPUT extends tagRAWINPUT {

    RAWINPUT() {
        // Should not be called directly
    }
}

