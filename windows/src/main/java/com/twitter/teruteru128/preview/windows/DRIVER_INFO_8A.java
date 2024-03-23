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
 * typedef struct _DRIVER_INFO_8A {
 *     DWORD cVersion;
 *     LPSTR pName;
 *     LPSTR pEnvironment;
 *     LPSTR pDriverPath;
 *     LPSTR pDataFile;
 *     LPSTR pConfigFile;
 *     LPSTR pHelpFile;
 *     LPSTR pDependentFiles;
 *     LPSTR pMonitorName;
 *     LPSTR pDefaultDataType;
 *     LPSTR pszzPreviousNames;
 *     FILETIME ftDriverDate;
 *     DWORDLONG dwlDriverVersion;
 *     LPSTR pszMfgName;
 *     LPSTR pszOEMUrl;
 *     LPSTR pszHardwareID;
 *     LPSTR pszProvider;
 *     LPSTR pszPrintProcessor;
 *     LPSTR pszVendorSetup;
 *     LPSTR pszzColorProfiles;
 *     LPSTR pszInfPath;
 *     DWORD dwPrinterDriverAttributes;
 *     LPSTR pszzCoreDriverDependencies;
 *     FILETIME ftMinInboxDriverVerDate;
 *     DWORDLONG dwlMinInboxDriverVerVersion;
 * } DRIVER_INFO_8A
 * }
 */
public class DRIVER_INFO_8A extends _DRIVER_INFO_8A {

    DRIVER_INFO_8A() {
        // Should not be called directly
    }
}

