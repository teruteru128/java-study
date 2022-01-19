package com.twitter.teruteru128.browser;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Locale;

import com.twitter.teruteru128.util.Utils;

/**
 * @author Teruteru
 *
 */
public class Main2 {

    /**
     * @param args
     */
    public static void main(String[] args) throws URISyntaxException {
        openBrowser("https://www.nicovideo.jp/");
    }

    private static String getBrowserEnv() {
        try {
            return System.getenv("BROWSER");
        } catch (SecurityException se) {
            return null;
        }
    }

    private static boolean browseWithDesktop(URI uri) {
        try {
            var moduleLayer = ModuleLayer.boot();
            var module = moduleLayer.findModule("java.desktop");
            Class<?> desktopClass = Class.forName(module.isPresent() ? module.get() : null, "java.awt.Desktop");
            // Desktop.isDesktopSupported()
            var supported = ((Boolean) desktopClass.getMethod("isDesktopSupported").invoke(null, (Object[]) null))
                    .booleanValue();
            if (supported) {
                // Desktop.getDesktop()
                Object desktop = desktopClass.getMethod("getDesktop").invoke(null, (Object[]) null);
                // desktop.browse(uri)
                desktopClass.getMethod("browse", URI.class).invoke(desktop, uri);
            }
        } catch (NullPointerException | NoSuchMethodException | SecurityException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException e) {
            return false;
        }
        return true;
    }

    public static void openBrowser(URI uri) throws URISyntaxException {
        try {
            String osName = Utils.getProperty("os.name", "linux").toLowerCase(Locale.ENGLISH);
            var rt = Runtime.getRuntime();
            String browser = null;
            if (browser == null) {
                // under Linux, this will point to the default system browser
                browser = getBrowserEnv();
            }
            if (browser != null) {
                if (browser.startsWith("call:")) {
                    browser = browser.substring("call:".length());
                    Utils.callStaticMethod(browser, uri.toString());
                } else if (browser.indexOf("%url") >= 0) {
                    String[] args = browser.split(",");
                    for (var i = 0; i < args.length; i++) {
                        args[i] = replaceAll(args[i], "%url", uri.toString());
                    }
                    rt.exec(args);
                } else if (osName.indexOf("windows") >= 0) {
                    rt.exec(new String[] { "cmd.exe", "/C", browser, uri.toString() });
                } else {
                    rt.exec(new String[] { browser, uri.toString() });
                }
                return;
            }
            if(browseWithDesktop(uri))
            {
                return;
            }
            if (osName.indexOf("windows") >= 0) {
                rt.exec(new String[] { "rundll32", "url.dll,FileProtocolHandler", uri.toString() });
            } else if (osName.indexOf("mac") >= 0 || osName.indexOf("darwin") >= 0) {
                // Mac OS: to open a page with Safari, use "open -a Safari"
                Runtime.getRuntime().exec(new String[] { "open", uri.toString() });
            } else {
                String[] browsers = { "firefox", "chromium", "google-chrome", "konqueror",
                        "netscape", "opera", "midori", "vivaldi" };
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
                    throw new RuntimeException(
                            "Browser detection failed");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to start a browser to open the URL " + uri + ": " + e.getMessage());
        }
    }

    /**
     * Replace all occurrences of the before string with the after string.
     *
     * @param s      the string
     * @param before the old text
     * @param after  the new text
     * @return the string with the before string replaced
     */
    public static String replaceAll(String s, String before, String after) {
        int next = s.indexOf(before);
        if (next < 0) {
            return s;
        }
        StringBuilder buff = new StringBuilder(s.length() - before.length() + after.length());
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

    public static void openBrowser(String uri) throws URISyntaxException {
        openBrowser(new URI(uri));
    }

    /**
     * Split a string into an array of strings using the given separator. A null
     * string will result in a null array, and an empty string in a zero element
     * array.
     *
     * @param s             the string to split
     * @param separatorChar the separator character
     * @param trim          whether each element should be trimmed
     * @return the array list
     */
    public static String[] splitAsArray(String s, char separatorChar, boolean trim) {
        if (s == null) {
            return new String[0];
        }
        final var length = s.length();
        if (length == 0) {
            return new String[0];
        }
        var list = new ArrayList<String>();
        var buff = new StringBuilder(length);
        char c;
        var escape = 0;
        for (var i = 0; i < length; i++) {
            c = s.charAt(i);
            if (escape != 0) {
                buff.append(s.charAt(c));
                escape = 0;
            } else if (c == separatorChar) {
                var e = buff.toString();
                list.add(trim ? e.trim() : e);
                buff.setLength(0);
            } else if (c == '\\' && i < length - 1 && s.charAt(i + 1) == separatorChar) {
                escape = 1;
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
}
