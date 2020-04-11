package com.twitter.teruteru128.test.ui;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * @author http://tubolabo.hatenablog.com/entry/20120116/1326738721
 *
 */
public class Form extends JFrame implements DocumentListener {

    private static final long serialVersionUID = 0;

    private javax.swing.JTextField bmiField;
    private javax.swing.JLabel bmiLabel;
    private javax.swing.JPanel bmiPanel;
    private javax.swing.JTextField heightField;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JLabel kgLabel;
    private javax.swing.JLabel mLabel;
    private javax.swing.JTextField weightField;
    private javax.swing.JLabel weightLabel;

    /**
     * @throws HeadlessException
     */
    public Form() throws HeadlessException {
        initComponents();
        initListeners();
    }

    /**
     * @param gc
     */
    public Form(GraphicsConfiguration gc) {
        super(gc);
    }

    /**
     * @param title
     * @throws HeadlessException
     */
    public Form(String title) throws HeadlessException {
        super(title);
    }

    /**
     * @param title
     * @param gc
     */
    public Form(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }

    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        bmiPanel = new javax.swing.JPanel();
        heightLabel = new javax.swing.JLabel();
        heightField = new javax.swing.JTextField();
        mLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        weightField = new javax.swing.JTextField();
        kgLabel = new javax.swing.JLabel();
        bmiLabel = new javax.swing.JLabel();
        bmiField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BMI checker");
        setLocationByPlatform(true);
        setResizable(false);

        bmiPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5,
                5));
        bmiPanel.setLayout(new java.awt.GridBagLayout());

        heightLabel.setText("Height:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 2, 4, 6);
        bmiPanel.add(heightLabel, gridBagConstraints);

        heightField.setName("heightLabel"); // NOI18N
        heightField.setPreferredSize(new java.awt.Dimension(100, 21));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        bmiPanel.add(heightField, gridBagConstraints);

        mLabel.setText("m");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(4, 2, 4, 2);
        bmiPanel.add(mLabel, gridBagConstraints);

        weightLabel.setText("Weight:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 2, 4, 6);
        bmiPanel.add(weightLabel, gridBagConstraints);

        weightField.setName("weightLabel"); // NOI18N
        weightField.setPreferredSize(new java.awt.Dimension(100, 21));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        bmiPanel.add(weightField, gridBagConstraints);

        kgLabel.setText("kg");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(4, 2, 4, 2);
        bmiPanel.add(kgLabel, gridBagConstraints);

        bmiLabel.setText("BMI:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 2, 4, 6);
        bmiPanel.add(bmiLabel, gridBagConstraints);

        bmiField.setBackground(new java.awt.Color(255, 255, 255));
        bmiField.setEditable(false);
        bmiField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        bmiField.setName("bmiLabel"); // NOI18N
        bmiField.setPreferredSize(new java.awt.Dimension(100, 21));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        bmiPanel.add(bmiField, gridBagConstraints);

        getContentPane().add(bmiPanel, java.awt.BorderLayout.CENTER);

        pack();
    }

    private void initListeners() {
        heightField.getDocument().addDocumentListener(this);
        weightField.getDocument().addDocumentListener(this);
    }

    /**
     * (非 Javadoc)
     * 
     * @see javax.swing.event.DocumentListener#insertUpdate(javax.swing.event.DocumentEvent)
     */
    @Override
    public void insertUpdate(DocumentEvent e) {
        textChanged();
    }

    /**
     * (非 Javadoc)
     * 
     * @see javax.swing.event.DocumentListener#removeUpdate(javax.swing.event.DocumentEvent)
     */
    @Override
    public void removeUpdate(DocumentEvent e) {
        textChanged();
    }

    /**
     * (非 Javadoc)
     * 
     * @see javax.swing.event.DocumentListener#changedUpdate(javax.swing.event.DocumentEvent)
     */
    @Override
    public void changedUpdate(DocumentEvent e) {

    }

    public void textChanged() {
        float height;
        float weight;

        try {
            height = Float.valueOf(heightField.getText().trim());
            weight = Float.valueOf(weightField.getText().trim());

        } catch (NumberFormatException ignored) {
            bmiField.setText("");
            bmiField.setBackground(Color.WHITE);
            return;
        }

        if (height == 0f) {
            return;
        }

        float bmi = weight / (height * height);
        bmiField.setText(Float.toString(bmi));

        Color bg;
        if (bmi < 18.5f) {
            bg = Color.WHITE;
        } else if (bmi < 20.0f) {
            bg = Color.YELLOW;
        } else if (bmi < 30.0f) {
            bg = Color.ORANGE;
        } else {
            bg = Color.RED;
        }

        bmiField.setBackground(bg);
    }
}
