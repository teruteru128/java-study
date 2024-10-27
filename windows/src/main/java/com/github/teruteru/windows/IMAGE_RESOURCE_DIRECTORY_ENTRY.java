// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _IMAGE_RESOURCE_DIRECTORY_ENTRY {
 *     union {
 *         struct {
 *             DWORD NameOffset : 31;
 *             DWORD NameIsString : 1;
 *         };
 *         DWORD Name;
 *         WORD Id;
 *     };
 *     union {
 *         DWORD OffsetToData;
 *         struct {
 *             DWORD OffsetToDirectory : 31;
 *             DWORD DataIsDirectory : 1;
 *         };
 *     };
 * } IMAGE_RESOURCE_DIRECTORY_ENTRY
 * }
 */
public class IMAGE_RESOURCE_DIRECTORY_ENTRY extends _IMAGE_RESOURCE_DIRECTORY_ENTRY {

    IMAGE_RESOURCE_DIRECTORY_ENTRY() {
        // Should not be called directly
    }
}

