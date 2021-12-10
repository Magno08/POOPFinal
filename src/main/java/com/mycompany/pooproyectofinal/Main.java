package com.mycompany.pooproyectofinal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Magno
 */
public class Main {
    public static void main(String[] args) throws IOException {
        
        Archivos ar = new Archivos();
        ar.GenerarArchivos();
        
        System.out.println("---------------------------------BASE DE DATOS DE LA FI UNAM---------------------------------");
        System.out.println("Opciones:\n 1.Generar Numero de Inscripcion\n 2.Agregar Alumno");
        Scanner scan = new Scanner(System.in);
        String optionS = scan.next();
        int option = Integer.parseInt(optionS);
        switch (option){
            case 1:
                NumeroInscripcion Num = new NumeroInscripcion();
                Num.Generar();
                break;
            case 2:
                Alumno al = new Alumno();
            {
                try {
                    al.AgregarAlumno();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

        }
        
    }
}