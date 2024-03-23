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
 * typedef struct _COAUTHIDENTITY {
 *     USHORT *User;
 *     ULONG UserLength;
 *     USHORT *Domain;
 *     ULONG DomainLength;
 *     USHORT *Password;
 *     ULONG PasswordLength;
 *     ULONG Flags;
 * } COAUTHIDENTITY
 * }
 */
public class COAUTHIDENTITY extends _COAUTHIDENTITY {

    COAUTHIDENTITY() {
        // Should not be called directly
    }
}

