// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4242 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4242() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "CoInternetCreateSecurityManager",
        constants$570.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "CoInternetCreateZoneManager",
        constants$570.const$5
    );
    static final MemorySegment const$2 = RuntimeHelper.lookupGlobalVariable("CLSID_InternetSecurityManager", constants$27.const$0);
    static final MemorySegment const$3 = RuntimeHelper.lookupGlobalVariable("CLSID_InternetZoneManager", constants$27.const$0);
    static final MemorySegment const$4 = RuntimeHelper.lookupGlobalVariable("CLSID_PersistentZoneIdentifier", constants$27.const$0);
    static final MemorySegment const$5 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0037_v0_0_c_ifspec", RuntimeHelper.POINTER);
}


