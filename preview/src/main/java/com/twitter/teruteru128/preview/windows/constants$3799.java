// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3799 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3799() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    JAVA_SHORT.withName("vt"),
                    JAVA_SHORT.withName("wReserved1"),
                    JAVA_SHORT.withName("wReserved2"),
                    JAVA_SHORT.withName("wReserved3"),
                    MemoryLayout.unionLayout(
                        JAVA_LONG.withName("llVal"),
                        JAVA_INT.withName("lVal"),
                        JAVA_BYTE.withName("bVal"),
                        JAVA_SHORT.withName("iVal"),
                        JAVA_FLOAT.withName("fltVal"),
                        JAVA_DOUBLE.withName("dblVal"),
                        JAVA_SHORT.withName("boolVal"),
                        JAVA_SHORT.withName("__OBSOLETE__VARIANT_BOOL"),
                        JAVA_INT.withName("scode"),
                        MemoryLayout.unionLayout(
                            MemoryLayout.structLayout(
                                JAVA_INT.withName("Lo"),
                                JAVA_INT.withName("Hi")
                            ).withName("$anon$0"),
                            JAVA_LONG.withName("int64")
                        ).withName("cyVal"),
                        JAVA_DOUBLE.withName("date"),
                        RuntimeHelper.POINTER.withName("bstrVal"),
                        RuntimeHelper.POINTER.withName("punkVal"),
                        RuntimeHelper.POINTER.withName("pdispVal"),
                        RuntimeHelper.POINTER.withName("parray"),
                        RuntimeHelper.POINTER.withName("pbVal"),
                        RuntimeHelper.POINTER.withName("piVal"),
                        RuntimeHelper.POINTER.withName("plVal"),
                        RuntimeHelper.POINTER.withName("pllVal"),
                        RuntimeHelper.POINTER.withName("pfltVal"),
                        RuntimeHelper.POINTER.withName("pdblVal"),
                        RuntimeHelper.POINTER.withName("pboolVal"),
                        RuntimeHelper.POINTER.withName("__OBSOLETE__VARIANT_PBOOL"),
                        RuntimeHelper.POINTER.withName("pscode"),
                        RuntimeHelper.POINTER.withName("pcyVal"),
                        RuntimeHelper.POINTER.withName("pdate"),
                        RuntimeHelper.POINTER.withName("pbstrVal"),
                        RuntimeHelper.POINTER.withName("ppunkVal"),
                        RuntimeHelper.POINTER.withName("ppdispVal"),
                        RuntimeHelper.POINTER.withName("pparray"),
                        RuntimeHelper.POINTER.withName("pvarVal"),
                        RuntimeHelper.POINTER.withName("byref"),
                        JAVA_BYTE.withName("cVal"),
                        JAVA_SHORT.withName("uiVal"),
                        JAVA_INT.withName("ulVal"),
                        JAVA_LONG.withName("ullVal"),
                        JAVA_INT.withName("intVal"),
                        JAVA_INT.withName("uintVal"),
                        RuntimeHelper.POINTER.withName("pdecVal"),
                        RuntimeHelper.POINTER.withName("pcVal"),
                        RuntimeHelper.POINTER.withName("puiVal"),
                        RuntimeHelper.POINTER.withName("pulVal"),
                        RuntimeHelper.POINTER.withName("pullVal"),
                        RuntimeHelper.POINTER.withName("pintVal"),
                        RuntimeHelper.POINTER.withName("puintVal"),
                        MemoryLayout.structLayout(
                            RuntimeHelper.POINTER.withName("pvRecord"),
                            RuntimeHelper.POINTER.withName("pRecInfo")
                        ).withName("$anon$0")
                    ).withName("$anon$0")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    JAVA_SHORT.withName("wReserved"),
                    MemoryLayout.unionLayout(
                        MemoryLayout.structLayout(
                            JAVA_BYTE.withName("scale"),
                            JAVA_BYTE.withName("sign")
                        ).withName("$anon$0"),
                        JAVA_SHORT.withName("signscale")
                    ).withName("$anon$0"),
                    JAVA_INT.withName("Hi32"),
                    MemoryLayout.unionLayout(
                        MemoryLayout.structLayout(
                            JAVA_INT.withName("Lo32"),
                            JAVA_INT.withName("Mid32")
                        ).withName("$anon$0"),
                        JAVA_LONG.withName("Lo64")
                    ).withName("$anon$1")
                ).withName("decVal")
            ).withName("$anon$0")
        ).withName("tagVARIANT"),
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IXMLDOMDocumentVtbl.createNode.class, "apply", constants$3799.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$3799.const$0
    );
    static final VarHandle const$3 = constants$3780.const$1.varHandle(MemoryLayout.PathElement.groupElement("createNode"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(IXMLDOMDocumentVtbl.nodeFromID.class, "apply", constants$37.const$3);
    static final VarHandle const$5 = constants$3780.const$1.varHandle(MemoryLayout.PathElement.groupElement("nodeFromID"));
}


