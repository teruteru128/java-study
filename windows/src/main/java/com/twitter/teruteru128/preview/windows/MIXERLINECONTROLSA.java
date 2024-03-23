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
 * typedef struct tagMIXERLINECONTROLSA {
 *     DWORD cbStruct;
 *     DWORD dwLineID;
 *     union {
 *         DWORD dwControlID;
 *         DWORD dwControlType;
 *     };
 *     DWORD cControls;
 *     DWORD cbmxctrl;
 *     LPMIXERCONTROLA pamxctrl;
 * } MIXERLINECONTROLSA
 * }
 */
public class MIXERLINECONTROLSA extends tagMIXERLINECONTROLSA {

    MIXERLINECONTROLSA() {
        // Should not be called directly
    }
}

