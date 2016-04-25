/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.chortitzer.lab.semillas.utils;

import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Industria
 */
public class RadioButtonConverter extends Converter<Integer, Boolean>{
     public Boolean convertForward(Integer arg) {                         
        if(arg == 0){
            return false;
        }else{
            return true;
        }
         
    }
    
    public Integer convertReverse(Boolean arg) {        
        if(arg == false){
            return 0;
        }else{
            return 1;
        }
    }
}
