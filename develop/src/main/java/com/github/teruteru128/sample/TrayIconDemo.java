package com.github.teruteru128.sample;

import java.awt.*;

public class TrayIconDemo implements Sample {
    @Override
    public void sample() throws AWTException {
        var toolkit = Toolkit.getDefaultToolkit();
        System.err.println(toolkit);
        if(SystemTray.isSupported()) {
            //Obtain only one instance of the SystemTray object
            var tray = SystemTray.getSystemTray();
            System.err.println(tray);
            //If the icon is a file
            var image = Toolkit.getDefaultToolkit().createImage("icon.png");

            var trayIcon = new TrayIcon(image, "Tray Demo");
            //Let the system resize the image if needed
            trayIcon.setImageAutoSize(true);
            //Set tooltip text for the tray icon
            trayIcon.setToolTip("System tray icon demo");
            trayIcon.addActionListener(e -> {
                System.out.println(e);
                System.out.println(Thread.currentThread());
            });
            tray.add(trayIcon);

            trayIcon.displayMessage("Hello, World", "notification demo", TrayIcon.MessageType.NONE);
        }
    }
}
