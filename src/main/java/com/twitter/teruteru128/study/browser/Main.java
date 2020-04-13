package com.twitter.teruteru128.study.browser;

import java.lang.reflect.Method;
import java.net.URI;

import com.twitter.teruteru128.util.Utils;

import org.h2.engine.SysProperties;
import org.h2.util.StringUtils;

/**
 * @author Teruteru
 *
 */
public class Main {
    public static void main(String[] args) {
        String url = "http://abehiroshi.la.coocan.jp/";
        try {
            Main.openBrowser(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void openBrowser(String url) throws Exception {
        try {
            String osName = StringUtils.toLowerEnglish(Utils.getProperty("os.name", "linux"));
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
                    String[] args = StringUtils.arraySplit(browser, ',', false);
                    for (int i = 0; i < args.length; i++) {
                        args[i] = StringUtils.replaceAll(args[i], "%url", url);
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
                Class<?> desktopClass = Class.forName("java.awt.Desktop");
                // Desktop.isDesktopSupported()
                Method isDesktopSupported = desktopClass.getMethod("isDesktopSupported");
                boolean supported = (boolean) isDesktopSupported.invoke(null);
                URI uri = new URI(url);
                if (supported) {
                    // Desktop.getDesktop();
                    Method getDesktop = desktopClass.getMethod("getDesktop");
                    Object desktop = getDesktop.invoke(null);
                    // desktop.browse(uri);
                    Method browse = desktopClass.getMethod("browse", URI.class);
                    browse.invoke(desktop, uri);
                    return;
                }
            } catch (Exception e) {
                // ignore
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
                            "Browser detection failed and system property " + SysProperties.H2_BROWSER + " not set");
                }
            }
        } catch (Exception e) {
            throw new Exception("Failed to start a browser to open the URL " + url + ": " + e.getMessage());
        }
    }
}
