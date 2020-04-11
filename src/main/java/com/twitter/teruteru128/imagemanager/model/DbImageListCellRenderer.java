package com.twitter.teruteru128.imagemanager.model;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 * @author Teruteru
 *
 */
public class DbImageListCellRenderer extends DefaultListCellRenderer {

    /**
     * 
     */
    private static final long serialVersionUID = -8248943029557079620L;

    /**
     * 
     */
    public DbImageListCellRenderer() {
        // TODO 自動生成されたコンストラクター・スタブ
    }

    /** (非 Javadoc)
     * @see javax.swing.ListCellRenderer#getListCellRendererComponent(javax.swing.JList, java.lang.Object, int, boolean, boolean)
     */
    @Override
    public Component getListCellRendererComponent(JList<? extends Object> list,
            Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if(value instanceof ImageModel){
            
        }
        return this;
    }

}
