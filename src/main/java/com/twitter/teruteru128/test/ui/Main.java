package com.twitter.teruteru128.test.ui;

import javax.swing.SwingUtilities;

/**
 * @author Teruteru
 *
 */
public class Main {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new Form().setVisible(true);
            }
        });
    }
}
