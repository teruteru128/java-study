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
 * typedef struct _CMC_RESPONSE_INFO {
 *     DWORD cTaggedAttribute;
 *     PCMC_TAGGED_ATTRIBUTE rgTaggedAttribute;
 *     DWORD cTaggedContentInfo;
 *     PCMC_TAGGED_CONTENT_INFO rgTaggedContentInfo;
 *     DWORD cTaggedOtherMsg;
 *     PCMC_TAGGED_OTHER_MSG rgTaggedOtherMsg;
 * } CMC_RESPONSE_INFO
 * }
 */
public class CMC_RESPONSE_INFO extends _CMC_RESPONSE_INFO {

    CMC_RESPONSE_INFO() {
        // Should not be called directly
    }
}
