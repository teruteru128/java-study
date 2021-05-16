package com.twitter.teruteru128.study.ui;

import javax.swing.SwingUtilities;

/**
 * @author Teruteru
 *
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Form().setVisible(true));
    }
}
