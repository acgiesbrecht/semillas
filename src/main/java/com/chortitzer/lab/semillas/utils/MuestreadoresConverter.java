/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.chortitzer.lab.semillas.utils;

import com.chortitzer.lab.semillas.domain.LabSemillasMuestreadores;
import java.util.List;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Industria
 */
public class MuestreadoresConverter extends Converter<Integer, LabSemillasMuestreadores> {   

    private List listMuestreadores;
    
    public LabSemillasMuestreadores convertForward(Integer arg) {

        LabSemillasMuestreadores m;

        for (Object element : this.listMuestreadores) {
            m = (LabSemillasMuestreadores) element;
            if (m.getId().compareTo(arg) == 0) {
                return m;
            }
        }
        return null;
        
    }

    public Integer convertReverse(LabSemillasMuestreadores arg) {
        return arg.getId();
    }

    public void setMuestreadoresList(List lM) {
        this.listMuestreadores = lM;
    }

    public List getMuestreadoresList() {
        return this.listMuestreadores;
    }

}


