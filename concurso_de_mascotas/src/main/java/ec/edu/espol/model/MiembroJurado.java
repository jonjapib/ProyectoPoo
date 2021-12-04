/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import ec.edu.espol.util.Menu;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pibaque Ponce..
 */
public class MiembroJurado {
    private int idMJCedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String perfil;
    private ArrayList<Evaluacion> evaluacion;

    public MiembroJurado(int idMJCedula,String nombre, String apellido, String telefono, String email, String perfil) {
        this.idMJCedula =idMJCedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.perfil = perfil;
        this.evaluacion = new ArrayList<>();
    }

    public int getIdMJCedula() {
        return idMJCedula;
    }

    public void setIdMJCedula(int idMJCedula) {
        this.idMJCedula = idMJCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public ArrayList<Evaluacion> getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(ArrayList<Evaluacion> evaluacion) {
        this.evaluacion = evaluacion;
    }

    @Override
    public String toString() {
       return   "["+idMJCedula+","+nombre + "," + apellido + "," + telefono + "," + email + "," + perfil + "]";
    }
    
    
        public static MiembroJurado nextMiembroJurado(Scanner sc){
           System.out.println("Ingrese numero de Cedula:");
           int cedula=sc.nextInt();
            
           System.out.println("Ingrese Nombre:");
           String nombre=sc.next();
            
            System.out.println("Ingrese apellido:");
            String apellido=sc.next();
                           
            System.out.println("Ingrese telefono:");
            String telefono= sc.next();
                                  
            System.out.println("Ingrese email:");
            String email=sc.next();
                                             
            System.out.println("perfil:");
            String perfil =sc.next();
            
       MiembroJurado persona = new MiembroJurado(cedula ,nombre, apellido, telefono, email, perfil);
    
        return persona;
    
    }
  public void savefile(String File){
  try(PrintWriter pw= new PrintWriter(new FileOutputStream(new File(File),true))){
      
   
      pw.println(+this.idMJCedula+"|"+this.nombre+"|"+this.apellido+"|"+this.telefono+"|"+this.email+"|"+perfil);
      
  }catch(Exception e){
      System.out.println(e.getMessage());
  }
   

  }
  public static ArrayList<MiembroJurado> readFile(String File){
        ArrayList<MiembroJurado> jurado = new ArrayList<>();
       try(Scanner sc = new Scanner(new File(File))) {
           while(sc.hasNextLine()){
              String linea=sc.nextLine();
              String[] tokens = linea.split("\\|");
               MiembroJurado v =new MiembroJurado(Integer.parseInt(tokens[0]),tokens[1],tokens[2],tokens[3],tokens[4],tokens[5]);
              jurado.add(v);
              
               
           }
       }
          catch(Exception e){
           System.out.println(e.getMessage());
       }
       return jurado;
    }
  
    
    
    
}
