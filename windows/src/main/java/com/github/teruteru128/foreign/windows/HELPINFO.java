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
 * typedef struct tagHELPINFO {
 *     UINT cbSize;
 *     int iContextType;
 *     int iCtrlId;
 *     HANDLE hItemHandle;
 *     DWORD_PTR dwContextId;
 *     POINT MousePos;
 * } HELPINFO
 * }
 */
public class HELPINFO extends tagHELPINFO {

    HELPINFO() {
        // Should not be called directly
    }
}

