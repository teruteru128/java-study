// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1212 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1212() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "GetDlgItemTextA",
        constants$590.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "GetDlgItemTextW",
        constants$590.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "CheckDlgButton",
        constants$67.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "CheckRadioButton",
        constants$775.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "IsDlgButtonChecked",
        constants$65.const$2
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "SendDlgItemMessageA",
        constants$1212.const$5
    );
}

