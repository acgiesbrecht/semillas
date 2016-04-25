/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chortitzer.lab.semillas.utils;

import com.chortitzer.lab.semillas.domain.LabSemillasCategorias;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author Industria
 */
public class CategoriasListCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
            JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof LabSemillasCategorias) {
            LabSemillasCategorias c = (LabSemillasCategorias) value;
            setText(c.getDescripcion());
        }
        return this;
    }
}
