// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _SE_ACCESS_REPLY {
 *     DWORD Size;
 *     DWORD ResultListCount;
 *     PACCESS_MASK GrantedAccess;
 *     PDWORD AccessStatus;
 *     PACCESS_REASONS AccessReason;
 *     PPRIVILEGE_SET *Privileges;
 * } SE_ACCESS_REPLY
 * }
 */
public class SE_ACCESS_REPLY extends _SE_ACCESS_REPLY {

    SE_ACCESS_REPLY() {
        // Should not be called directly
    }
}

