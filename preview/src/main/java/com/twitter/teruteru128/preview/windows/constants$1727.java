// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1727 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1727() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "RpcMgmtIsServerListening",
        constants$18.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "RpcMgmtStopServerListening",
        constants$18.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "RpcMgmtWaitServerListen",
        constants$1.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "RpcMgmtSetServerStackSize",
        constants$11.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "RpcSsDontSerializeContext",
        constants$0.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "RpcMgmtEnableIdleCleanup",
        constants$1.const$5
    );
}


