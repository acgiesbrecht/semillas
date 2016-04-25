/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chortitzer.lab.semillas.utils;

import com.chortitzer.lab.semillas.domain.LabSemillasCategorias;
import java.util.List;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Industria
 */
public class CategoriasConverter extends Converter<Integer, LabSemillasCategorias> {

   private List listCategorias;

    public LabSemillasCategorias convertForward(Integer arg) {
       
        LabSemillasCategorias cat;

        for (Object element : this.listCategorias) {
            cat = (LabSemillasCategorias) element;
            if (cat.getId().compareTo(arg) == 0) {
                return cat;
            }
        }
        return null;
    }

    public Integer convertReverse(LabSemillasCategorias arg) {
        return arg.getId();
    }    

    public void setCategoriasList(List lCl) {
        this.listCategorias = lCl;
    }

    public List getCategoriasList() {
        return this.listCategorias;
    }

}
