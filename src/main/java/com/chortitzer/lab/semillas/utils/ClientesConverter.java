/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chortitzer.lab.semillas.utils;

/**
 *
 * @author Industria
 */
import com.chortitzer.lab.semillas.domain.LabClientes;
import java.util.List;
import org.jdesktop.beansbinding.Converter;

public class ClientesConverter extends Converter<Integer, LabClientes> {

    private List listClientes;
    
    public LabClientes convertForward(Integer arg) {
    
        LabClientes cli;

        for (Object element : this.listClientes) {
            cli = (LabClientes) element;
            if (cli.getId().compareTo(arg) == 0) {
                return cli;
            }
        }
        return null;        
    }

    public Integer convertReverse(LabClientes arg) {
        return arg.getId();
    }    

    public void setClienteList(List lCl) {
        this.listClientes = lCl;
    }

    public List getClienteList() {
        return this.listClientes;
    }

}
