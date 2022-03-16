package com.twitter.teruteru128.ui;

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
