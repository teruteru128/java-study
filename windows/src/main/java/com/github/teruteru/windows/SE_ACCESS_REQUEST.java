// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _SE_ACCESS_REQUEST {
 *     DWORD Size;
 *     PSE_SECURITY_DESCRIPTOR SeSecurityDescriptor;
 *     ACCESS_MASK DesiredAccess;
 *     ACCESS_MASK PreviouslyGrantedAccess;
 *     PSID PrincipalSelfSid;
 *     PGENERIC_MAPPING GenericMapping;
 *     DWORD ObjectTypeListCount;
 *     POBJECT_TYPE_LIST ObjectTypeList;
 * } SE_ACCESS_REQUEST
 * }
 */
public class SE_ACCESS_REQUEST extends _SE_ACCESS_REQUEST {

    SE_ACCESS_REQUEST() {
        // Should not be called directly
    }
}

