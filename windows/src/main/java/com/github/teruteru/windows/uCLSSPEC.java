// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct __MIDL___MIDL_itf_wtypes_0000_0001_0001 {
 *     DWORD tyspec;
 *     union __MIDL___MIDL_itf_wtypes_0000_0001_0005 {
 *         CLSID clsid;
 *         LPOLESTR pFileExt;
 *         LPOLESTR pMimeType;
 *         LPOLESTR pProgId;
 *         LPOLESTR pFileName;
 *         struct {
 *             LPOLESTR pPackageName;
 *             GUID PolicyId;
 *         } ByName;
 *         struct {
 *             GUID ObjectId;
 *             GUID PolicyId;
 *         } ByObjectId;
 *     } tagged_union;
 * } uCLSSPEC
 * }
 */
public class uCLSSPEC extends __MIDL___MIDL_itf_wtypes_0000_0001_0001 {

    uCLSSPEC() {
        // Should not be called directly
    }
}

