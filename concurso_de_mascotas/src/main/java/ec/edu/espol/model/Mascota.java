/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.modell;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author megag
 */
public class Mascota {
    private int id; 
    private String nombre;
    private String raza;
    private Date fechaNacimiento;
    private String tipo;          //perro o gato
    private int idDueño;
    private Dueño dueño;
    //private ArrayList<Inscripcion> inscripciones;
    
    public Mascota(int id, String nombre, String raza, Date fechaNacimiento, String tipo, int idDueño, Dueño dueño){ //ArrayList<Inscripcion> inscripciones) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.tipo = tipo;
        this.idDueño = idDueño;
        this.dueño = dueño;
        //this.inscripciones = inscripciones;
    }

    public Mascota(int id, String nombre, String raza, Date fechaNacimiento, String tipo, int idDueño) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.tipo = tipo;
        this.idDueño = idDueño;
    }
    

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIdDueño() {
        return idDueño;
    }

    public Dueño getDueño() {
        return dueño;
    }

    //public ArrayList<Inscripcion> getInscripciones() {
    //      return inscripciones;
    //}

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIdDueño(int idDueño) {
        this.idDueño = idDueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    //public void setInscripciones(ArrayList<Inscripcion> inscripciones) {
    //    this.inscripciones = inscripciones;
    //}

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", fechaNacimiento=" + fechaNacimiento + ", tipo=" + tipo + ", idDueño=" + idDueño + ", due\u00f1o=" + dueño + '}';
    }
    
    public static Mascota nextMascota(Scanner sc) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ingrese id: ");
        int idM = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese Nombre: ");
        String nameM = sc.nextLine();
        System.out.println("Ingrese Raza: ");
        String razaM = sc.nextLine();
        System.out.println("Ingrese Fecha de Nacimiento: ");
        String fechaM = sc.nextLine();
        System.out.println("Ingrese Tipo de Mascota(Perro/Gato): ");
        String tipoM = sc.nextLine();
        System.out.println("Ingrese Id de Dueño: ");
        int idDM = sc.nextInt();
        
        return new Mascota(idM, nameM, razaM, sdf.parse(fechaM), tipoM, idDM);
    }
    
    public void saveFile(String nomfile){
        try(PrintWriter pw = new PrintWriter(new FileOutputStream(new File(nomfile),true))){
           
           pw.println(this.id+","+this.nombre+","+this.raza+","+this.fechaNacimiento+","+this.tipo+","+this.idDueño);
       }
       
       catch(Exception e){
           System.out.println(e.getMessage());
       }
   }
   public static ArrayList<Mascota> readFile(String nomfile){
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

       ArrayList<Mascota> mascotas = new ArrayList<>();
       try(Scanner sc = new Scanner(new File(nomfile))){
           while(sc.hasNextLine()){
               String linea = sc.nextLine();
               String[] tokens = linea.split(",");
               Mascota m = new Mascota(Integer.parseInt(tokens[0]),tokens[1],tokens[2],sdf.parse(tokens[3]),tokens[4],Integer.parseInt(tokens[5]));
               mascotas.add(m);
           }
           
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
       return mascotas;
    } 
    
    
}
