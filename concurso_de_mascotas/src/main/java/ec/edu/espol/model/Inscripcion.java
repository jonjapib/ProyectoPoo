/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import ec.edu.espol.util.Util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pibaque Ponce
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
        LocalDate fecha_Inscripcion = LocalDate.parse(fechaInscripcion);
        
        return new Inscripcion(Util.nextID("inscripciones.txt"),nombre,nombreConcurso,pagoInscripcion,fecha_Inscripcion);
        
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inscripcion other = (Inscripcion) obj;
        if (this.idMascota != other.idMascota) {
            return false;
        }
        return true;
    }
    
    //Método saveFile
    public void saveFile(String nomfile){
        try(PrintWriter pw = new PrintWriter(new FileOutputStream(new File(nomfile),true))){
           
           pw.println(this.id+"|"+this.idMascota+"|"+this.mascota+"|"+this.idConcurso+"|"+this.valor+"|"+this.descuento);
       }
       
       catch(Exception e){
           System.out.println(e.getMessage());
       }
        
    }
    
    //Método readFile
public ArrayList<Inscripcion> readFile(String File){
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
       try(Scanner sc = new Scanner(new File(File))) {
           while(sc.hasNextLine()){
              String linea=sc.nextLine();
              String[] tokens = linea.split("\\|");
               Evaluacion e =new Evaluacion(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]),tokens[2],Integer.parseInt(tokens[3]),Double.parseDouble(tokens[4]),Double.parseDouble(tokens[5]));
              inscripciones.add(e);
              
               
           }
       }
          catch(Exception e){
           System.out.println(e.getMessage());
       }
       return inscripciones;
    }
  
    
}
