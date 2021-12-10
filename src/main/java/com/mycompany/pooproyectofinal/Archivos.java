/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pooproyectofinal;


/**
 *
 * @author Magno
 */
public class Archivos {
    int j=0;
    
    void GenerarArchivos(){
        System.out.println("Generando Archivos");
        for (int i = 0; i < 100000000; i++) {
            j=j*i+68/9;
            
        }
        System.out.println("Archivos generados");
        
    }
}
