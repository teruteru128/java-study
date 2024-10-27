// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _IMAGE_POLICY_ENTRY {
 *     IMAGE_POLICY_ENTRY_TYPE Type;
 *     IMAGE_POLICY_ID PolicyId;
 *     union {
 *         const void *None;
 *         BOOLEAN BoolValue;
 *         INT8 Int8Value;
 *         UINT8 UInt8Value;
 *         INT16 Int16Value;
 *         UINT16 UInt16Value;
 *         INT32 Int32Value;
 *         UINT32 UInt32Value;
 *         INT64 Int64Value;
 *         UINT64 UInt64Value;
 *         PCSTR AnsiStringValue;
 *         PCWSTR UnicodeStringValue;
 *     } u;
 * } IMAGE_POLICY_ENTRY
 * }
 */
public class IMAGE_POLICY_ENTRY extends _IMAGE_POLICY_ENTRY {

    IMAGE_POLICY_ENTRY() {
        // Should not be called directly
    }
}

