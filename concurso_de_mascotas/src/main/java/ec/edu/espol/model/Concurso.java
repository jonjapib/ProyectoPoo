
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author megag
 */
public class Concurso {
    private int id;
    private String nombre;
    private LocalDate fecha;
    private LocalDate fechaInscripcion;
    private LocalDate fechaCierreInscripcion;
    private String tematica;
    private double costo;
    private ArrayList<Inscripcion> inscripciones;

    public Concurso(int id, String nombre, LocalDate fecha, LocalDate fechaInscripcion, LocalDate fechaCierreInscripcion, String tematica, double costo, ArrayList<Inscripcion> inscripciones) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.fechaInscripcion = fechaInscripcion;
        this.fechaCierreInscripcion = fechaCierreInscripcion;
        this.tematica = tematica;
        this.costo = costo;
        this.inscripciones = inscripciones;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public LocalDate getFechaCierreInscripcion() {
        return fechaCierreInscripcion;
    }

    public String getTematica() {
        return tematica;
    }

    public double getCosto() {
        return costo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public void setFechaCierreInscripcion(LocalDate fechaCierreInscripcion) {
        this.fechaCierreInscripcion = fechaCierreInscripcion;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(ArrayList<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }

    @Override
    public String toString() {
        return "Concurso{" + "id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", fechaInscripcion=" + fechaInscripcion + ", fechaCierreInscripcion=" + fechaCierreInscripcion + ", tematica=" + tematica + ", costo=" + costo + ", inscripciones=" + inscripciones + '}';
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
        final Concurso other = (Concurso) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    public static Concurso nextConcurso(Scanner sc){
        System.out.println("Ingrese Nombre: ");
        String nameM = sc.nextLine();
        System.out.println("Ingrese Fecha(yyyy-mm-dd): ");
        String fecha = sc.nextLine();
        LocalDate fecha0 = LocalDate.parse(fecha);
        System.out.println("Ingrese fecha de Inicio de Inscripcion(yyyy-mm-dd): ");
        String fechaI = sc.nextLine();
        LocalDate fechaI0 = LocalDate.parse(fechaI);
        System.out.println("Ingrese fecha de Fin de Inscripcion(yyyy-mm-dd): ");
        String fechaF = sc.nextLine();
        LocalDate fechaF0 = LocalDate.parse(fechaF);
        System.out.println("Ingrese Tematica: ");
        String tematica = sc.nextLine();
        System.out.println("Ingrese Costo: ");
        double costo = sc.nextDouble();
        
        return new Concurso(Util.nextID("Concurso.txt"),nameM,fecha0,fechaI0,fechaF0,tematica,costo);
        
    }
    
    public void saveFile(String nomfile){
        try(PrintWriter pw = new PrintWriter(new FileOutputStream(new File(nomfile),true))){
           
           pw.println(this.id+"|"+this.nombre+"|"+this.fecha+"|"+this.fechaInscripcion+"|"+this.fechaCierreInscripcion+"|"+this.tematica+"|"+this.costo+"|"+this.inscripciones);
       }
       
       catch(Exception e){
           System.out.println(e.getMessage());
       }
   }
   public static ArrayList<Concurso> readFile(String nomfile){
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

       ArrayList<Mascota> concursos = new ArrayList<>();
       try(Scanner sc = new Scanner(new File(nomfile))){
           while(sc.hasNextLine()){
               String linea = sc.nextLine();
               String[] tokens = linea.split("|");
               Concurso c = new Concurso(Integer.parseInt(tokens[0]),tokens[1],LocalDate.parse(tokens[2]),LocalDate.parse(tokens[3]),LocalDate.parse(tokens[4]),tokens[5],tokens[6]);
               
               concursos.add(c);
           }
           
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
       return concursos; 
    } 
}