package com.twitter.teruteru128.test.desktop;

import java.net.URI;
import java.util.ArrayList;
import java.util.Locale;

import com.twitter.teruteru128.util.New;
import com.twitter.teruteru128.util.Utils;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    }

    public static void openBrowser(URI uri) throws Exception {
        try {
            String osName = toLowerEnglish(
                            getProperty("os.name", "linux"));
                    Runtime rt = Runtime.getRuntime();
                    String browser = getProperty(H2_BROWSER, null);
                    if (browser == null) {
                        // under Linux, this will point to the default system browser
                        try {
                            browser = System.getenv("BROWSER");
                        } catch (SecurityException se) {
                            // ignore
                        }
                    }
                    if (browser != null) {
                        if (browser.startsWith("call:")) {
                            browser = browser.substring("call:".length());
                            Utils.callStaticMethod(browser, uri.toString());
                        } else if (browser.indexOf("%url") >= 0) {
                            String[] args = arraySplit(browser, ',', false);
                            for (int i = 0; i < args.length; i++) {
                                args[i] = replaceAll(args[i], "%url", uri.toString());
                            }
                            rt.exec(args);
                        } else if (osName.indexOf("windows") >= 0) {
                            rt.exec(new String[] { "cmd.exe", "/C",  browser, uri.toString() });
                        } else {
                            rt.exec(new String[] { browser, uri.toString() });
                        }
                        return;
                    }
                    try {
                        Class<?> desktopClass = Class.forName("java.awt.Desktop");
                        // Desktop.isDesktopSupported()
                        Boolean supported = (Boolean) desktopClass.
                            getMethod("isDesktopSupported").
                            invoke(null, new Object[0]);
                        if (supported) {
                            // Desktop.getDesktop();
                            Object desktop = desktopClass.getMethod("getDesktop").
                                invoke(null, new Object[0]);
                            // desktop.browse(uri);
                            desktopClass.getMethod("browse", URI.class).
                                invoke(desktop, uri);
                            return;
                        }
                    } catch (Exception e) {
                        // ignore
                    }
                    if (osName.indexOf("windows") >= 0) {
                        rt.exec(new String[] { "rundll32", "url.dll,FileProtocolHandler", uri.toString() });
                    } else if (osName.indexOf("mac") >= 0 || osName.indexOf("darwin") >= 0) {
                        // Mac OS: to open a page with Safari, use "open -a Safari"
                        Runtime.getRuntime().exec(new String[] { "open", uri.toString() });
                    } else {
                        String[] browsers = { "chromium", "google-chrome", "firefox",
                                "mozilla-firefox", "mozilla", "konqueror", "netscape",
                                "opera", "midori" };
                        boolean ok = false;
                        for (String b : browsers) {
                            try {
                                rt.exec(new String[] { b, uri.toString() });
                                ok = true;
                                break;
                            } catch (Exception e) {
                                // ignore and try the next
                            }
                        }
                        if (!ok) {
                            // No success in detection.
                            throw new Exception(
                                    "Browser detection failed and system property " +
                                    H2_BROWSER + " not set");
                        }
                    }
        } catch (Exception e) {
            throw new Exception("Failed to start a browser to open the URL "
                    + uri + ": " + e.getMessage());
        }
    }

    /**
     * Replace all occurrences of the before string with the after string.
     *
     * @param s the string
     * @param before the old text
     * @param after the new text
     * @return the string with the before string replaced
     */
    public static String replaceAll(String s, String before, String after) {
        int next = s.indexOf(before);
        if (next < 0) {
            return s;
        }
        StringBuilder buff = new StringBuilder(
                s.length() - before.length() + after.length());
        int index = 0;
        while (true) {
            buff.append(s.substring(index, next)).append(after);
            index = next + before.length();
            next = s.indexOf(before, index);
            if (next < 0) {
                buff.append(s.substring(index));
                break;
            }
        }
        return buff.toString();
    }
    public static void openBrowser(String uri) throws Exception {

    }

    public static String toLowerEnglish(String s) {
        return s.toLowerCase(Locale.ENGLISH);
    }
    /**
     * Get the system property. If the system property is not set, or if a
     * security exception occurs, the default value is returned.
     *
     * @param key the key
     * @param defaultValue the default value
     * @return the value
     */
    public static String getProperty(String key, String defaultValue) {
        try {
            return System.getProperty(key, defaultValue);
        } catch (SecurityException se) {
            return defaultValue;
        }
    }
    /**
     * Split a string into an array of strings using the given separator. A null
     * string will result in a null array, and an empty string in a zero element
     * array.
     *
     * @param s the string to split
     * @param separatorChar the separator character
     * @param trim whether each element should be trimmed
     * @return the array list
     */
    public static String[] arraySplit(String s, char separatorChar, boolean trim) {
        if (s == null) {
            return null;
        }
        int length = s.length();
        if (length == 0) {
            return new String[0];
        }
        ArrayList<String> list = New.arrayList();
        StringBuilder buff = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == separatorChar) {
                String e = buff.toString();
                list.add(trim ? e.trim() : e);
                buff.setLength(0);
            } else if (c == '\\' && i < length - 1) {
                buff.append(s.charAt(++i));
            } else {
                buff.append(c);
            }
        }
        String e = buff.toString();
        list.add(trim ? e.trim() : e);
        String[] array = new String[list.size()];
        list.toArray(array);
        return array;
    }
    /**
     * INTERNAL
     */
    public static final String H2_BROWSER = "h2.browser";
}
