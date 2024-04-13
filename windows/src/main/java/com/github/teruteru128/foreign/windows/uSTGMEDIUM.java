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
 * typedef struct tagSTGMEDIUM {
 *     DWORD tymed;
 *     union {
 *         HBITMAP hBitmap;
 *         HMETAFILEPICT hMetaFilePict;
 *         HENHMETAFILE hEnhMetaFile;
 *         HGLOBAL hGlobal;
 *         LPOLESTR lpszFileName;
 *         IStream *pstm;
 *         IStorage *pstg;
 *     };
 *     IUnknown *pUnkForRelease;
 * } uSTGMEDIUM
 * }
 */
public class uSTGMEDIUM extends tagSTGMEDIUM {

    uSTGMEDIUM() {
        // Should not be called directly
    }
}
