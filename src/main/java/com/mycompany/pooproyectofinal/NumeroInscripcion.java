/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pooproyectofinal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Magno
 */
public class NumeroInscripcion extends Main{
        String Alumno=null,Apellidos=null,A=null,B=null,C=null,D=null,E=null, F=null,G=null;
        int edad;
        float promedio,semestre,CActuales,AAprobadas,AInscritas,Esc,Vel, Indicador,CIngreso;

    public NumeroInscripcion() {
        
    }

    public NumeroInscripcion(int edad, float promedio, float semestre, float CActuales, float AAprobadas, float AInscritas, float Esc, float Vel, float Indicador, float CIngreso) {
        this.edad = edad;
        this.promedio = promedio;
        this.semestre = semestre;
        this.CActuales = CActuales;
        this.AAprobadas = AAprobadas;
        this.AInscritas = AInscritas;
        this.Esc = Esc;
        this.Vel = Vel;
        this.Indicador = Indicador;
        this.CIngreso = CIngreso;
    }
    
    void Generar() {

                try{
            BufferedReader br;
            String CEncontrada = null;
            FileReader indice = new FileReader("DatosFI.csv");
            System.out.println("Escribe el numero de cuenta:");
            Scanner scan = new Scanner(System.in);
            String Cuenta = scan.next();
            System.out.println("Buscando "+Cuenta);
            br = new BufferedReader(indice);
            String linea = br.readLine();
            while (linea != null){
            StringTokenizer tokenizer = new StringTokenizer(linea,",");
            while (tokenizer.hasMoreTokens()){
                String comp = null;
                comp = tokenizer.nextToken();
                if (comp.equals(Cuenta))
                {
                    CEncontrada = comp;
                    Alumno = tokenizer.nextToken();
                    Apellidos = tokenizer.nextToken();
                    A = tokenizer.nextToken(); //edad
                    B = tokenizer.nextToken(); //promedio
                    C = tokenizer.nextToken(); //semestre
                    D = tokenizer.nextToken(); // creditos actuales
                    E = tokenizer.nextToken(); // creditos ingreso
                    F = tokenizer.nextToken(); //asignaturas aporbadas
                    G = tokenizer.nextToken(); //Asiganturas inscritas
                }    
            }
                linea = br.readLine();
            }
            System.out.println("Archivo encontrado "+CEncontrada+" "+Alumno+" "+Apellidos+ " "+ A);
            br.close();
        }catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
    } catch (IOException ex) {
            System.out.println(ex.getMessage());
    }
        promedio = Float.valueOf(B);
        CActuales = Float.valueOf(D);
        CIngreso = Float.valueOf(E);
        AAprobadas = Float.valueOf(F);
        AInscritas = Float.valueOf(G);
        
        Esc = (AAprobadas/AInscritas)*100;
        Vel = (CActuales/CIngreso)*100;
        Indicador = promedio*Esc*Vel;
        
        System.out.println("Numero de Inscripcion: "+ Indicador);
    }

     
}
