// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4107 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4107() {}
    static final MemorySegment const$0 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0004_v0_0_s_ifspec", RuntimeHelper.POINTER);
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("szExtraInfo"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("tymed"),
            MemoryLayout.paddingLayout(4),
            MemoryLayout.unionLayout(
                RuntimeHelper.POINTER.withName("hBitmap"),
                RuntimeHelper.POINTER.withName("hMetaFilePict"),
                RuntimeHelper.POINTER.withName("hEnhMetaFile"),
                RuntimeHelper.POINTER.withName("hGlobal"),
                RuntimeHelper.POINTER.withName("lpszFileName"),
                RuntimeHelper.POINTER.withName("pstm"),
                RuntimeHelper.POINTER.withName("pstg")
            ).withName("$anon$0"),
            RuntimeHelper.POINTER.withName("pUnkForRelease")
        ).withName("stgmedData"),
        JAVA_INT.withName("grfBindInfoF"),
        JAVA_INT.withName("dwBindVerb"),
        RuntimeHelper.POINTER.withName("szCustomVerb"),
        JAVA_INT.withName("cbstgmedData"),
        JAVA_INT.withName("dwOptions"),
        JAVA_INT.withName("dwOptionsFlags"),
        JAVA_INT.withName("dwCodePage"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("nLength"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("lpSecurityDescriptor"),
            JAVA_INT.withName("bInheritHandle"),
            MemoryLayout.paddingLayout(4)
        ).withName("securityAttributes"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("iid"),
        RuntimeHelper.POINTER.withName("pUnk"),
        JAVA_INT.withName("dwReserved"),
        MemoryLayout.paddingLayout(4)
    ).withName("_tagBINDINFO");
    static final VarHandle const$2 = constants$4107.const$1.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$3 = constants$4107.const$1.varHandle(MemoryLayout.PathElement.groupElement("szExtraInfo"));
    static final VarHandle const$4 = constants$4107.const$1.varHandle(MemoryLayout.PathElement.groupElement("grfBindInfoF"));
    static final VarHandle const$5 = constants$4107.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwBindVerb"));
}


