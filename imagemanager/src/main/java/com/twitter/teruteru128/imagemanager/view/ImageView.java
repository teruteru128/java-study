package com.twitter.teruteru128.imagemanager.view;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.twitter.teruteru128.imagemanager.dao.ImageDAO;

/**
 * @author Teruteru
 *
 */
public class ImageView extends JFrame implements WindowListener,
        ComponentListener {
    ImageDAO dao = null;

    /**
     * 
     */
    private static final long serialVersionUID = -4611478924564601503L;
    ScheduledExecutorService ses = Executors.newScheduledThreadPool(16);
    private BufferedImage image;
    private JLabel label;
    private ImageIcon icon;
    private boolean autoUpdate = true;
    private AutoUpdater<BufferedImage> updater = null;

    /**
     * @throws HeadlessException
     */
    public ImageView(BufferedImage image) throws HeadlessException {
        super();
        this.image = image;
        init();
    }

    /**
     * @throws HeadlessException
     */
    public ImageView(ImageDAO dao) throws HeadlessException {
        super();
        this.dao = dao;
        init();
    }

    public void setImage(BufferedImage image) {
        this.image = image;
        updateImage();
    }

    protected void init() {
        label = new JLabel();
        icon = new ImageIcon();
        label.setIcon(icon);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        this.add(label);
        // 定期サイズ変更
        /*
        long fps = 120;
        ses.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
            }
        }, 0, 1000 / fps, TimeUnit.MILLISECONDS);
        */
        // 画像変更
        ses.scheduleAtFixedRate(new Runnable() {

            @Override
            public void run() {
                System.out.println("画像交換");
                if (autoUpdate == true && updater != null) {
                    setImage(ImageView.this.updater.update());
                }
                changeImage();
            }
        }, 15, 15, TimeUnit.SECONDS);
        this.addWindowListener(this);
        this.addComponentListener(this);
        updateImage();
    }

    BufferedImage reduce1(BufferedImage image, int maxWidth, int maxHight) {
        int imageh = image.getHeight();
        int imagew = image.getWidth();
        double h = 0;
        double w = 0;
        if (imageh > 1 && imagew > 1 && maxHight > 0 && maxHight > 0) {
            h = (((double) maxHight) / imageh);
            w = (((double) maxWidth) / imagew);
        }
        double proportion = Math.min(h, w);
        int afterh = (int) (imageh * proportion);
        int afterw = (int) (imagew * proportion);
        if (afterh <= 0 || afterw <= 0) {
            afterh = 1;
            afterw = 1;
        }
        BufferedImage thumb = new BufferedImage(afterw, afterh, image.getType());
        thumb.getGraphics()
                .drawImage(
                        image.getScaledInstance(afterw, afterh,
                                Image.SCALE_AREA_AVERAGING), 0, 0, afterw,
                        afterh, null);
        image.flush();
        return thumb;
    }

    Dimension lastSize = null;
    BufferedImage lastimg = null;

    private void changeImage() {
        Optional<BufferedImage> opt = dao.getRandomImage();
        if (opt.isPresent()) {
            setImage(opt.get());
        }
    }

    private void updateImage() {
        Dimension d = label.getSize();
        if (!isVisible()) {
            d = Toolkit.getDefaultToolkit().getScreenSize();
        }
        // System.out.println("定期サイズ変更1");
        if (lastSize == null || !d.equals(lastSize) || !image.equals(lastimg)) {
            System.out.println("サイズ変更");
            int w = d.width;
            int h = d.height;
            BufferedImage resizedImage = reduce1(image, w, h);
            icon.setImage(resizedImage);
            lastSize = d;
            lastimg = image;
        }
        repaint();
    }

    /**
     * (非 Javadoc)
     * 
     * @see java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent)
     */
    @Override
    public void windowClosing(WindowEvent e) {
        ses.shutdown();
    }

    /**
     * (非 Javadoc)
     * 
     * @see java.awt.event.WindowListener#windowOpened(java.awt.event.WindowEvent)
     */
    @Override
    public void windowOpened(WindowEvent e) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see java.awt.event.WindowListener#windowClosed(java.awt.event.WindowEvent)
     */
    @Override
    public void windowClosed(WindowEvent e) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see java.awt.event.WindowListener#windowIconified(java.awt.event.WindowEvent)
     */
    @Override
    public void windowIconified(WindowEvent e) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see java.awt.event.WindowListener#windowDeiconified(java.awt.event.WindowEvent)
     */
    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see java.awt.event.WindowListener#windowActivated(java.awt.event.WindowEvent)
     */
    @Override
    public void windowActivated(WindowEvent e) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see java.awt.event.WindowListener#windowDeactivated(java.awt.event.WindowEvent)
     */
    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see java.awt.event.ComponentListener#componentResized(java.awt.event.ComponentEvent)
     */
    @Override
    public void componentResized(ComponentEvent e) {
        ImageView.this.updateImage();
    }

    /**
     * (非 Javadoc)
     * 
     * @see java.awt.event.ComponentListener#componentMoved(java.awt.event.ComponentEvent)
     */
    @Override
    public void componentMoved(ComponentEvent e) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see java.awt.event.ComponentListener#componentShown(java.awt.event.ComponentEvent)
     */
    @Override
    public void componentShown(ComponentEvent e) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see java.awt.event.ComponentListener#componentHidden(java.awt.event.ComponentEvent)
     */
    @Override
    public void componentHidden(ComponentEvent e) {

    }
}

@FunctionalInterface
interface AutoUpdater<T> {
    T update();
}