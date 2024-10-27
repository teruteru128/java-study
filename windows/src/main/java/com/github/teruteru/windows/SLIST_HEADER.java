// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef union _SLIST_HEADER {
 *     struct {
 *         ULONGLONG Alignment;
 *         ULONGLONG Region;
 *     };
 *     struct {
 *         ULONGLONG Depth : 16;
 *         ULONGLONG Sequence : 48;
 *         ULONGLONG Reserved : 4;
 *         ULONGLONG NextEntry : 60;
 *     } HeaderX64;
 * } SLIST_HEADER
 * }
 */
public class SLIST_HEADER extends _SLIST_HEADER {

    SLIST_HEADER() {
        // Should not be called directly
    }
}

