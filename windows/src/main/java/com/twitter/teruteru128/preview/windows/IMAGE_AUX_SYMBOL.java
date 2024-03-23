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
 * typedef union _IMAGE_AUX_SYMBOL {
 *     struct {
 *         DWORD TagIndex;
 *         union {
 *             struct {
 *                 WORD Linenumber;
 *                 WORD Size;
 *             } LnSz;
 *             DWORD TotalSize;
 *         } Misc;
 *         union {
 *             struct {
 *                 DWORD PointerToLinenumber;
 *                 DWORD PointerToNextFunction;
 *             } Function;
 *             struct {
 *                 WORD Dimension[4];
 *             } Array;
 *         } FcnAry;
 *         WORD TvIndex;
 *     } Sym;
 *     struct {
 *         BYTE Name[18];
 *     } File;
 *     struct {
 *         DWORD Length;
 *         WORD NumberOfRelocations;
 *         WORD NumberOfLinenumbers;
 *         DWORD CheckSum;
 *         SHORT Number;
 *         BYTE Selection;
 *         BYTE bReserved;
 *         SHORT HighNumber;
 *     } Section;
 *     IMAGE_AUX_SYMBOL_TOKEN_DEF TokenDef;
 *     struct {
 *         DWORD crc;
 *         BYTE rgbReserved[14];
 *     } CRC;
 * } IMAGE_AUX_SYMBOL
 * }
 */
public class IMAGE_AUX_SYMBOL extends _IMAGE_AUX_SYMBOL {

    IMAGE_AUX_SYMBOL() {
        // Should not be called directly
    }
}

