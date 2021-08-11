package com.twitter.teruteru128.imagemanager;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.twitter.teruteru128.imagemanager.dao.ImageFileDAO;
import com.twitter.teruteru128.imagemanager.dao.ImageH2DAO;
import com.twitter.teruteru128.imagemanager.model.ImageModel;
import com.twitter.teruteru128.imagemanager.view.ImageView;
import com.twitter.teruteru128.util.Page;

import static javax.swing.JFrame.MAXIMIZED_BOTH;
import static javax.swing.JFrame.DISPOSE_ON_CLOSE;

/**
 * @author Teruteru
 *
 */
public class Main {

    private static final String PIXIV = "pixiv";

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException,
            NoSuchAlgorithmException, SQLException{
        int debug = 5;
        ImageH2DAO dao = new ImageH2DAO();
        ImageFileDAO fileDao = new ImageFileDAO();
        JLabel l;
        JFrame jf;
        Random r = SecureRandom.getInstance("SHA1PRNG");
        BufferedImage image;
        String id;
        Optional<BufferedImage> opt;
        ImageView view = null;
        switch (debug) {
        case 0:
            long c = dao.getItemCount();
            Optional<BufferedImage> img = dao.getImageByOffset(r.nextInt((int)c));
            jf = new JFrame("jframe");
            jf.setSize(800, 600);
            jf.setLocationRelativeTo(null);
            jf.setExtendedState(MAXIMIZED_BOTH);
            jf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            if (img.isPresent()) {
                image = img.get();
                l = new JLabel(new ImageIcon(image));
                jf.add(l);
            } else {
                System.err.println("image not found");
            }
            jf.setVisible(true);
            break;/* case 0 */
        case 1:
            Page page = new Page(1, 20);
            ArrayList<ImageModel> list = dao.getIdList(page);
            for (ImageModel model : list) {
                System.out.printf("name : %s, id : %s%n", model.getName(),
                        model.getId());
            }
            break;/* case 1 */
        case 2:
            File base = new File(PIXIV);
            File imageF;
            File[] listf = base.listFiles();
            imageF = listf[new Random().nextInt(listf.length)];
            image = ImageIO.read(imageF.toURI().toURL());
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            int windowh = d.height;
            int windoww = d.width;
            image = reduce1(image, windoww - 10, windowh - 40);
            jf = new JFrame("jframe");
            jf.setSize(800, 600);
            jf.setLocationRelativeTo(null);
            jf.setExtendedState(MAXIMIZED_BOTH);
            jf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            l = new JLabel(new ImageIcon(image));
            jf.add(l);
            jf.setVisible(true);
            break;
        case 3:
            base = new File(PIXIV);
            listf = base.listFiles();
            imageF = listf[new Random().nextInt(listf.length)];
            image = ImageIO.read(imageF.toURI().toURL());
            jf = new JFrame();
            jf.setSize(800, 600);
            l = new JLabel();
            jf.setLocationRelativeTo(null);
            jf.setExtendedState(MAXIMIZED_BOTH);
            jf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            ImageIcon icon = new ImageIcon(image);
            l.setIcon(icon);
            l.setHorizontalAlignment(SwingConstants.CENTER);
            l.setVerticalAlignment(SwingConstants.CENTER);
            jf.add(l);
            jf.setVisible(true);
            break;
        case 4:
            base = new File(PIXIV);
            listf = base.listFiles();
            imageF = listf[new Random().nextInt(listf.length)];
            image = ImageIO.read(imageF.toURI().toURL());
            view = new ImageView(image);
            view.setSize(800, 600);
            view.setLocationRelativeTo(null);
            view.setExtendedState(MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            break;
        case 5:
            base = new File(PIXIV);
            view = new ImageView(new ImageFileDAO(base));
            view.setSize(800, 600);
            view.setLocationRelativeTo(null);
            view.setExtendedState(MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            break;
        case 6:
            base = new File(PIXIV);
            listf = base.listFiles();
            for (File file : listf) {
                System.out.print(file);
                System.out.print(" : ");
                id = fileDao.getId(file);
                opt = dao.getImageById(id);
                if (!opt.isPresent()) {
                    dao.uploadImage(id, file);
                    System.out.print("アップロードされました");
                } else {
                    System.out.print("アップロードされませんでした");
                }
                System.out.println();
            }
            break;
        default:
            System.out.println("default");
            break;
        }
    }

    public static BufferedImage reduce1(BufferedImage image, int maxWidth,
            int maxHight) {
        int imageh = image.getHeight();
        int imagew = image.getWidth();
        double h = (((double) maxHight) / imageh);
        double w = (((double) maxWidth) / imagew);
        double proportion = Math.min(h, w);
        int afterh = (int) (imageh * proportion);
        int afterw = (int) (imagew * proportion);
        BufferedImage thumb = new BufferedImage(afterw, afterh, image.getType());
        thumb.getGraphics()
                .drawImage(
                        image.getScaledInstance(afterw, afterh,
                                Image.SCALE_AREA_AVERAGING), 0, 0, afterw,
                        afterh, null);
        image.flush();
        return thumb;
    }

}
