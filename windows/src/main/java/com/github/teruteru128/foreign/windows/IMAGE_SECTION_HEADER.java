// Generated by jextract

package com.github.teruteru128.foreign.windows;

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
 * typedef struct _IMAGE_SECTION_HEADER {
 *     BYTE Name[8];
 *     union {
 *         DWORD PhysicalAddress;
 *         DWORD VirtualSize;
 *     } Misc;
 *     DWORD VirtualAddress;
 *     DWORD SizeOfRawData;
 *     DWORD PointerToRawData;
 *     DWORD PointerToRelocations;
 *     DWORD PointerToLinenumbers;
 *     WORD NumberOfRelocations;
 *     WORD NumberOfLinenumbers;
 *     DWORD Characteristics;
 * } IMAGE_SECTION_HEADER
 * }
 */
public class IMAGE_SECTION_HEADER extends _IMAGE_SECTION_HEADER {

    IMAGE_SECTION_HEADER() {
        // Should not be called directly
    }
}
