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
 * typedef struct _TOKEN_STATISTICS {
 *     LUID TokenId;
 *     LUID AuthenticationId;
 *     LARGE_INTEGER ExpirationTime;
 *     TOKEN_TYPE TokenType;
 *     SECURITY_IMPERSONATION_LEVEL ImpersonationLevel;
 *     DWORD DynamicCharged;
 *     DWORD DynamicAvailable;
 *     DWORD GroupCount;
 *     DWORD PrivilegeCount;
 *     LUID ModifiedId;
 * } TOKEN_STATISTICS
 * }
 */
public class TOKEN_STATISTICS extends _TOKEN_STATISTICS {

    TOKEN_STATISTICS() {
        // Should not be called directly
    }
}

