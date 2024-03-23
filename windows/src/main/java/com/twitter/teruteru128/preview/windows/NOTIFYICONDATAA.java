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
 * typedef struct _NOTIFYICONDATAA {
 *     DWORD cbSize;
 *     HWND hWnd;
 *     UINT uID;
 *     UINT uFlags;
 *     UINT uCallbackMessage;
 *     HICON hIcon;
 *     CHAR szTip[128];
 *     DWORD dwState;
 *     DWORD dwStateMask;
 *     CHAR szInfo[256];
 *     union {
 *         UINT uTimeout;
 *         UINT uVersion;
 *     };
 *     CHAR szInfoTitle[64];
 *     DWORD dwInfoFlags;
 *     GUID guidItem;
 *     HICON hBalloonIcon;
 * } NOTIFYICONDATAA
 * }
 */
public class NOTIFYICONDATAA extends _NOTIFYICONDATAA {

    NOTIFYICONDATAA() {
        // Should not be called directly
    }
}

