/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.util;

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
               
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
               
                break;
            case 6:
                
                break;
            case 7:
                
                break;
        }
        }
       
    
}
