/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ana Jara
 */
public class Inscripcion {
    //Argumentos
    private int id;
    private int idMascota;
    private Mascota mascota;
    private int idConcurso;
    private double valor;
    private double descuento;
    
    //Constructor

    public Inscripcion(int id, int idMascota, Mascota mascota, int idConcurso, double valor, double descuento) {
        this.id = id;
        this.idMascota = idMascota;
        this.mascota = mascota;
        this.idConcurso = idConcurso;
        this.valor = valor;
        this.descuento = descuento;
    }
    
    
    //Método nextInscripcion
    public Inscripcion nextInscripcion(Scanner sc){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nombre de la mascota: ");
        String nombre = sc.nextLine();
        System.out.println("Nombre de Concurso: ");
        String nombreConcurso = sc.nextLine();
        System.out.println("Valor a pagar por la inscripción: ");
        double pagoInscripcion = sc.nextDouble();
        System.out.println("Fecha de la inscripción: ");
        String fechaInscripcion = sc.nextLine();
        
        return null;
        
    }
    
    //Método saveFile
    public void saveFile(String File){
        
    }
    
    //Método readFile
    public ArrayList readFile(String File){
        
        return null;
        
    }
  
    
}
