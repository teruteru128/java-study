// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1868 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1868() {}
    static final VarHandle const$0 = constants$1865.const$2.varHandle(MemoryLayout.PathElement.groupElement("hProcess"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "ShellExecuteExA",
        constants$18.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "ShellExecuteExW",
        constants$18.const$5
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("fMask"),
        RuntimeHelper.POINTER.withName("hwnd"),
        RuntimeHelper.POINTER.withName("pszFile"),
        RuntimeHelper.POINTER.withName("pszParameters"),
        RuntimeHelper.POINTER.withName("pszCurrentDirectory"),
        RuntimeHelper.POINTER.withName("hUserToken"),
        RuntimeHelper.POINTER.withName("lpProcessAttributes"),
        RuntimeHelper.POINTER.withName("lpThreadAttributes"),
        JAVA_INT.withName("bInheritHandles"),
        JAVA_INT.withName("dwCreationFlags"),
        RuntimeHelper.POINTER.withName("lpStartupInfo"),
        RuntimeHelper.POINTER.withName("lpProcessInformation")
    ).withName("_SHCREATEPROCESSINFOW");
    static final VarHandle const$4 = constants$1868.const$3.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$5 = constants$1868.const$3.varHandle(MemoryLayout.PathElement.groupElement("fMask"));
}


