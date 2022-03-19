package com.twitter.teruteru128.plugin;

import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JTextField;

/** サンプルプラグインのクラス */
public class DefaultPlugin implements AppPlugin {
    private JTextField input;
    private JPanel currentPanel;

    public String toString() {
        return "Default(tax)";
    }

    public String getResult() {
        String inputData = input.getText();
        if (inputData == null || !inputData.matches("^\\d+$"))
            inputData = "0";
        int n;
        try {
            n = Integer.parseInt(inputData);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            n = 0;
        }
        double res = ((int) (n * 1.05 * 100)) / 100;
        return Double.toString(res);
    }

    public void setInputData(String str) {
        input.setText(str);
    }

    public String getInputData() {
        return input.getText();
    }

    public JPanel getPanel() {
        currentPanel = new JPanel();
        currentPanel.setLayout(null);
        input = new JTextField();
        input.setBounds(new Rectangle(25, 25, 50, 20));
        currentPanel.add(input);
        return currentPanel;
    }

}
