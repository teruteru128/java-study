// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _TOKEN_GROUPS_AND_PRIVILEGES {
 *     DWORD SidCount;
 *     DWORD SidLength;
 *     PSID_AND_ATTRIBUTES Sids;
 *     DWORD RestrictedSidCount;
 *     DWORD RestrictedSidLength;
 *     PSID_AND_ATTRIBUTES RestrictedSids;
 *     DWORD PrivilegeCount;
 *     DWORD PrivilegeLength;
 *     PLUID_AND_ATTRIBUTES Privileges;
 *     LUID AuthenticationId;
 * } TOKEN_GROUPS_AND_PRIVILEGES
 * }
 */
public class TOKEN_GROUPS_AND_PRIVILEGES extends _TOKEN_GROUPS_AND_PRIVILEGES {

    TOKEN_GROUPS_AND_PRIVILEGES() {
        // Should not be called directly
    }
}

