/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.util;

import ec.edu.espol.model.Concurso;
import ec.edu.espol.model.Criterio;
import ec.edu.espol.model.Dueño;
import ec.edu.espol.model.MiembroJurado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pibaque Ponce
 */
public class Menu {
    public static void imprimirMenu() {
        System.out.println("MENU DE OPCIONES");
        System.out.println("1.- Dueño");
        System.out.println("2.- Mascota");
        System.out.println("3.- Concurso");
        System.out.println("4.- Premio");
        System.out.println("5.- Criterio");
        System.out.println("6.- Inscripción");
        System.out.println("7.- MiembroJurado");
        System.out.println("8.- Evaluacion");
    }
    @SuppressWarnings("empty-statement")
        public static void menu(){
           
           Scanner sc = new Scanner(System.in);
           System.out.println("Ingrese opcion:");
          int opcion= sc.nextInt();
          while (opcion<=0 || opcion>=9){
              System.out.println("Ingrese opcion:");
              opcion =sc.nextInt();
          }
          
          
        switch(opcion){
            case 1:
                System.out.println("Ingrese los datos del Dueño");
                Dueño nxDueño = Dueño.nextDueño(sc);
                
               
                break;
            case 2:
                
                break;
            case 3:
                System.out.println("Ingrese los datos del concurso");
                Concurso nxConcurso = Concurso.nextConcurso(sc);
                nxConcurso.saveFile("concurso.txt"); 
                ArrayList<Concurso> listaConcurso = Concurso.readFile("concurso.txt");
                System.out.println(listaConcurso);
                break;
            case 4:
                
                break;
            case 5:
                Scanner scNumero = new Scanner(System.in);
                System.out.println("ingrese numero de criterios: ");
                int numero=scNumero.nextInt();                
               int i=0;
               do{++i;
               System.out.println("ingrese criterio");
               Criterio c= Criterio.nextCriterio(sc);
               c.savefile("Criterios.txt");
               
               } while(numero>0 && numero>i);  
                  ArrayList<Criterio> vcc = Criterio.readFile("Criterios.txt");
               System.out.println(vcc);           ;

                break;

            case 6:
                
                break;
            case 7:
                System.out.println("Ingrese Datos del jurado");
                MiembroJurado p = MiembroJurado.nextMiembroJurado(sc);
                p.savefile("jurado.txt"); 
                ArrayList<MiembroJurado> v = MiembroJurado.readFile("jurado.txt");
                System.out.println(v);
                break;
            case 8:
//                                System.out.println("Ingrese Datos del jurado");
//                MiembroJurado p = MiembroJurado.nextMiembroJurado(sc);
//                p.savefile("jurado.txt"); 
//                ArrayList<MiembroJurado> v = MiembroJurado.readFile("jurado.txt");
//                System.out.println(v);
                break;
        }
        }
//                public static int idJurado(){
//            int id=Util.nextID("jurado.txt");
//            return id;
//        }
       
    
}
