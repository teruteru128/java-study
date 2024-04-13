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
 * typedef struct tagRPC_CALL_ATTRIBUTES_V3_W {
 *     unsigned int Version;
 *     unsigned long Flags;
 *     unsigned long ServerPrincipalNameBufferLength;
 *     unsigned short *ServerPrincipalName;
 *     unsigned long ClientPrincipalNameBufferLength;
 *     unsigned short *ClientPrincipalName;
 *     unsigned long AuthenticationLevel;
 *     unsigned long AuthenticationService;
 *     BOOL NullSession;
 *     BOOL KernelModeCaller;
 *     unsigned long ProtocolSequence;
 *     RpcCallClientLocality IsClientLocal;
 *     HANDLE ClientPID;
 *     unsigned long CallStatus;
 *     RpcCallType CallType;
 *     RPC_CALL_LOCAL_ADDRESS_V1 *CallLocalAddress;
 *     unsigned short OpNum;
 *     UUID InterfaceUuid;
 *     unsigned long ClientIdentifierBufferLength;
 *     unsigned char *ClientIdentifier;
 * } RPC_CALL_ATTRIBUTES_V3_W
 * }
 */
public class RPC_CALL_ATTRIBUTES_V3_W extends tagRPC_CALL_ATTRIBUTES_V3_W {

    RPC_CALL_ATTRIBUTES_V3_W() {
        // Should not be called directly
    }
}
