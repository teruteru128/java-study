// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _SECURITY_DESCRIPTOR {
 *     BYTE Revision;
 *     BYTE Sbz1;
 *     SECURITY_DESCRIPTOR_CONTROL Control;
 *     PSID Owner;
 *     PSID Group;
 *     PACL Sacl;
 *     PACL Dacl;
 * } SECURITY_DESCRIPTOR
 * }
 */
public class SECURITY_DESCRIPTOR extends _SECURITY_DESCRIPTOR {

    SECURITY_DESCRIPTOR() {
        // Should not be called directly
    }
}

