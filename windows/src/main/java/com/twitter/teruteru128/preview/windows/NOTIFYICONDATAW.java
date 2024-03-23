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
 * typedef struct _NOTIFYICONDATAW {
 *     DWORD cbSize;
 *     HWND hWnd;
 *     UINT uID;
 *     UINT uFlags;
 *     UINT uCallbackMessage;
 *     HICON hIcon;
 *     WCHAR szTip[128];
 *     DWORD dwState;
 *     DWORD dwStateMask;
 *     WCHAR szInfo[256];
 *     union {
 *         UINT uTimeout;
 *         UINT uVersion;
 *     };
 *     WCHAR szInfoTitle[64];
 *     DWORD dwInfoFlags;
 *     GUID guidItem;
 *     HICON hBalloonIcon;
 * } NOTIFYICONDATAW
 * }
 */
public class NOTIFYICONDATAW extends _NOTIFYICONDATAW {

    NOTIFYICONDATAW() {
        // Should not be called directly
    }
}

