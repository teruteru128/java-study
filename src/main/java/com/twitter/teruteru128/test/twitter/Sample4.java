package com.twitter.teruteru128.test.twitter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

/**
 * @author
 *
 */
public class Sample4 extends JFrame implements Runnable {
    private static final long serialVersionUID = 0;
    public static final Color TWITTER_COLOR = new Color(0x55ACEE);
    JMenuBar menuBar = null;
    JTextArea _tweetf = null;
    JButton _tweetbutton = null;

    JMenu menu, submenu;
    JMenuItem menuItem;
    JRadioButtonMenuItem rbMenuItem;
    JCheckBoxMenuItem cbMenuItem;

    /**
     * @param args
     * */
    public Sample4(String[] args) {
        super();
        setLayout(new BorderLayout());
        this.init();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Sample4 s = new Sample4(args);
        s.setBounds(0, 0, 200, 200);
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        SwingUtilities.invokeLater(s);
    }

    public void run() {
    }

    public void init() {
        initMenuBar();

        this._tweetf = new JTextArea();
        this.add(_tweetf,BorderLayout.CENTER);
        _tweetf.setVisible(true);
        this._tweetbutton=new JButton("送信");
        JPanel p = new JPanel(new BorderLayout());
        p.add(_tweetbutton, BorderLayout.EAST);
        this.add(p,BorderLayout.SOUTH);
    }

    /**
     * メニューバーの初期設定を行います。<br>
     * . オーバーライドの際は<code>super.initMenuBar()</code>を実行してください。
     * */
    protected void initMenuBar() {

        this.menuBar = new JMenuBar();
        // Build the first menu.
        menu = new JMenu("メニュー");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);

        // a group of JMenuItems
        menuItem = new JMenuItem("A text-only menu item", KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,
                ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menu.add(menuItem);

        menuItem = new JMenuItem("Both text and icon");
        menuItem.setMnemonic(KeyEvent.VK_B);
        menu.add(menuItem);

        // a group of radio button menu items
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();
        rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem("Another one");
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        // a group of check box menu items
        menu.addSeparator();
        cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
        cbMenuItem.setMnemonic(KeyEvent.VK_C);
        menu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("Another one");
        cbMenuItem.setMnemonic(KeyEvent.VK_H);
        menu.add(cbMenuItem);

        // a submenu
        menu.addSeparator();
        submenu = new JMenu("A submenu");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem = new JMenuItem("An item in the submenu");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,
                ActionEvent.ALT_MASK));
        submenu.add(menuItem);

        menuItem = new JMenuItem("Another item");
        submenu.add(menuItem);
        menu.add(submenu);

        // Build second menu in the menu bar.
        menu = new JMenu("Another Menu");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription(
                "This menu does nothing");
        menuBar.add(menu);

        this.setJMenuBar(menuBar);
    }
}
