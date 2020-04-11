package com.twitter.teruteru128.plugin;

import javax.swing.JPanel;

/**
 * @author Teruteru
 *
 */
public interface SamplePluginAppPlugin {
    /***/
    String getResult(); // 計算結果の取得

    /***/
    void setInputData(String input); // データのSetter

    /***/
    String getInputData(); // データのGetter

    /***/
    JPanel getPanel(); // GUIとなるJPanelを返す
}
