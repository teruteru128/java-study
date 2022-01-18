package com.twitter.teruteru128.browser;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Locale;

import com.twitter.teruteru128.util.Utils;

/**
 * @author Teruteru
 *
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String url = "http://abehiroshi.la.coocan.jp/";
        new Main().openBrowser(url);
    }

    public void openBrowser(String url) throws Exception {
        try {
            String osName = Utils.getProperty("os.name", "linux").toLowerCase(Locale.ENGLISH);
            Runtime rt = Runtime.getRuntime();
            String browser = null;
            // under Linux, this will point to the default system browser
            try {
                browser = System.getenv("BROWSER");
            } catch (SecurityException se) {
                // ignore
            }
            if (browser != null) {
                if (browser.startsWith("call:")) {
                    browser = browser.substring("call:".length());
                    Utils.callStaticMethod(browser, url);
                } else if (browser.indexOf("%url") >= 0) {
                    String[] args = browser.split(",");
                    for (int i = 0; i < args.length; i++) {
                        args[i] = args[i].replaceAll("%url", url);
                    }
                    rt.exec(args);
                } else if (osName.indexOf("windows") >= 0) {
                    rt.exec(new String[] { "cmd.exe", "/C", browser, url });
                } else {
                    rt.exec(new String[] { browser, url });
                }
                return;
            }
            try {
                Class<?> desktopClazz = Class.forName("java.awt.Desktop");
                Class<?> actionClazz = Class.forName("java.awt.Desktop$Action");
                Class<?> enumClazz = Class.forName("java.lang.Enum");
                System.out.printf("is instance : %s%n", enumClazz.isInstance(actionClazz));
                System.out.printf("is assignable from : %s%n", enumClazz.isAssignableFrom(actionClazz));
                // java.awt.Desktop$Action.values();
                Method valuesMethod = actionClazz.getMethod("values");
                // https://qiita.com/yoshi389111/items/fd079c39d9bae3a5ba97
                // 配列のcloneメソッドは取れません！
                Object values = valuesMethod.invoke(null);
                // Desktop.isDesktopSupported()
                Method isDesktopSupported = desktopClazz.getMethod("isDesktopSupported");
                URI uri = new URI(url);
                int length = Array.getLength(values);
                if ((boolean) isDesktopSupported.invoke(null)) {
                    // Desktop.getDesktop();
                    Method getDesktop = desktopClazz.getMethod("getDesktop");
                    Object desktop = getDesktop.invoke(null);
                    System.out.printf("values is array : %s%n", values.getClass().isArray());
                    // java.awt.Desktop.isSupported(Desktop.Action)
                    Method isSupported = desktopClazz.getMethod("isSupported", actionClazz);
                    for (int i = 0; i < length; i++) {
                        Object actionObject = Array.get(values, i);
                        boolean supportedObject = (boolean) isSupported.invoke(desktop, actionObject);
                        System.out.printf("%s : %s%n", actionObject, supportedObject);
                    }
                    // desktop.browse(uri);
                    Method browse = desktopClazz.getMethod("browse", URI.class);
                    browse.invoke(desktop, uri);
                    return;
                }
            } catch (InvocationTargetException e) {
                // ignore
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (osName.indexOf("windows") >= 0) {
                rt.exec(new String[] { "rundll32", "url.dll,FileProtocolHandler", url });
            } else if (osName.indexOf("mac") >= 0 || osName.indexOf("darwin") >= 0) {
                // Mac OS: to open a page with Safari, use "open -a Safari"
                Runtime.getRuntime().exec(new String[] { "open", url });
            } else {
                String[] browsers = { "chromium", "google-chrome", "firefox", "mozilla-firefox", "mozilla", "konqueror",
                        "netscape", "opera", "midori" };
                boolean ok = false;
                for (String b : browsers) {
                    try {
                        rt.exec(new String[] { b, url });
                        ok = true;
                        break;
                    } catch (Exception e) {
                        // ignore and try the next
                    }
                }
                if (!ok) {
                    // No success in detection.
                    throw new Exception(
                            "Browser detection failed");
                }
            }
        } catch (Exception e) {
            throw new Exception("Failed to start a browser to open the URL " + url, e);
        }
    }
}
