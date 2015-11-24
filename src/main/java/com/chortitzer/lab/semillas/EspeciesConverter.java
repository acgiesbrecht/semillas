/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chortitzer.lab.semillas;

/**
 *
 * @author Industria
 */

import java.util.List;
import org.jdesktop.beansbinding.Converter;

public class EspeciesConverter extends Converter<Integer, LabSemillasEspecies> {

    private List listEspecies;
    
    public LabSemillasEspecies convertForward(Integer arg) {

        LabSemillasEspecies cat;

        for (Object element : this.listEspecies) {
            cat = (LabSemillasEspecies) element;
            if (cat.getId().compareTo(arg) == 0) {
                return cat;
            }
        }
        return null;
    }

    public Integer convertReverse(LabSemillasEspecies arg) {
        return arg.getId();
    }

    public void setEspeciesList(List lCl) {
        this.listEspecies = lCl;
    }

    public List getEspeciesList() {
        return this.listEspecies;
    }

}
