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
 * typedef struct _NETRESOURCEA {
 *     DWORD dwScope;
 *     DWORD dwType;
 *     DWORD dwDisplayType;
 *     DWORD dwUsage;
 *     LPSTR lpLocalName;
 *     LPSTR lpRemoteName;
 *     LPSTR lpComment;
 *     LPSTR lpProvider;
 * } NETRESOURCEA
 * }
 */
public class NETRESOURCEA extends _NETRESOURCEA {

    NETRESOURCEA() {
        // Should not be called directly
    }
}
