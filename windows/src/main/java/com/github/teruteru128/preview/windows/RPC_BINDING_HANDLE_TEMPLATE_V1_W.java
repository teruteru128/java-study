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
 * typedef struct _RPC_BINDING_HANDLE_TEMPLATE_V1_W {
 *     unsigned long Version;
 *     unsigned long Flags;
 *     unsigned long ProtocolSequence;
 *     unsigned short *NetworkAddress;
 *     unsigned short *StringEndpoint;
 *     union {
 *         unsigned short *Reserved;
 *     } u1;
 *     UUID ObjectUuid;
 * } RPC_BINDING_HANDLE_TEMPLATE_V1_W
 * }
 */
public class RPC_BINDING_HANDLE_TEMPLATE_V1_W extends _RPC_BINDING_HANDLE_TEMPLATE_V1_W {

    RPC_BINDING_HANDLE_TEMPLATE_V1_W() {
        // Should not be called directly
    }
}
