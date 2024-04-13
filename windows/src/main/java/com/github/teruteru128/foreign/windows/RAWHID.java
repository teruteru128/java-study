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
 * typedef struct tagRAWHID {
 *     DWORD dwSizeHid;
 *     DWORD dwCount;
 *     BYTE bRawData[1];
 * } RAWHID
 * }
 */
public class RAWHID extends tagRAWHID {

    RAWHID() {
        // Should not be called directly
    }
}
