/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

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
    private int idMJurado;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String perfil;
    private ArrayList<Evaluacion> evaluacion;

    public MiembroJurado(int idMJurado, String nombre, String apellido, String telefono, String email, String perfil) {
        this.idMJurado = idMJurado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.perfil = perfil;
    }

    public int getIdMJurado() {
        return idMJurado;
    }

    public void setIdMJurado(int idMJurado) {
        this.idMJurado = idMJurado;
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
    
    public Criterio nextCriterio(Scanner sc){
  
        return null;
  
  }
  public void savefile(String File){
  try(PrintWriter pw= new PrintWriter(new FileOutputStream(new File(File),true))){
      System.out.println("");
  }catch(Exception e){
      System.out.println(e.getMessage());
  }
  }
  public ArrayList<Criterio> ArrayFile(String File){
      ArrayList<Criterio> criterios = new ArrayList<>();
      try(Scanner sc =new Scanner(new File(File))){
            while(sc.hasNextLine()){
      String linea =sc.nextLine();
      //
      //
            }
      } catch(Exception e){
          System.out.println(e.getMessage());
      }  
      return null;
      
  }
  
    
    
    
}
