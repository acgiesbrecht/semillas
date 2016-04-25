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
import javax.persistence.Query;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Industria
 */
public class MuestreadoresTableCellRenderer extends DefaultTableCellRenderer {

    private Query muestreadoresList;
    EntityManager em;
    EntityManagerFactory emf;

    public void setMuestreadoresList(Query m) {
        this.muestreadoresList = m;
    }

    public Query getMuestreadoresList() {
        return this.muestreadoresList;
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(jTable, value, isSelected, hasFocus, row, column);
        if (c instanceof JLabel && value instanceof Integer) {
            JLabel label = (JLabel) c;
            label.setText(value.toString());
            /*emf = Persistence.createEntityManagerFactory("industria_lab?zeroDateTimeBehavior=convertToNullPU");
            em = emf.createEntityManager();
            LabSemillasMuestreadores lc = em.find(LabSemillasMuestreadores.class, value);
            em.close();
            emf.close();
            if (lc != null) {
                label.setText(lc.getNombre());
            }
            */
        }
        return c;
    }
}
