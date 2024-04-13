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
 * typedef struct tagFILTERKEYS {
 *     UINT cbSize;
 *     DWORD dwFlags;
 *     DWORD iWaitMSec;
 *     DWORD iDelayMSec;
 *     DWORD iRepeatMSec;
 *     DWORD iBounceMSec;
 * } FILTERKEYS
 * }
 */
public class FILTERKEYS extends tagFILTERKEYS {

    FILTERKEYS() {
        // Should not be called directly
    }
}
