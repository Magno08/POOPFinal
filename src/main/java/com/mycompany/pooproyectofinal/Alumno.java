/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pooproyectofinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Magno
 */
public class Alumno {
    void AgregarAlumno() throws FileNotFoundException, IOException{
                try {
            BufferedReader br;
            FileReader fr = new FileReader("DatosFI1.csv");
            br = new BufferedReader(fr);
            System.out.println("Texto del archivo es: ");
            String linea = br.readLine();
            while (linea != null){
                linea = br.readLine();
                if (linea == null){
                    BufferedReader br1 =new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Escriba NumCuenta,Nombre,Apellidos,Edad,Promedio,Semestre,CreditosActuales,CreditosTotales,AsiganturasAprobadas,AsignaturasInscritas");
                    String texto2 = br1.readLine();
                    StringBuilder sb = new StringBuilder();
                    sb.append(br1);
                }
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
            

