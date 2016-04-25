/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.chortitzer.lab.semillas.utils;

import java.awt.Component;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Industria
 */
public class MuestraLoteTableCellRenderer  extends DefaultTableCellRenderer{
        @Override
    public Component getTableCellRendererComponent(JTable jTable, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(jTable, value, isSelected, hasFocus, row, column);
        if (c instanceof JLabel && value instanceof Integer) {
            JLabel label = (JLabel) c;

            if(Integer.valueOf(value.toString())==1){                
                label.setText("Muestra");
            }else{
                label.setText("Lote");
            }
        }
        return c;
    }
}
