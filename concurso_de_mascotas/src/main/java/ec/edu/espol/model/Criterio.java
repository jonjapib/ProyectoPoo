/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pibaque Ponce..
 */
public class Criterio {
    private int idCriterio;
    private String descripcion;
    private ArrayList<Evaluacion> evaluaciones;
    private int Concurso;

    public Criterio(int idCriterio, String descripcion, int Concurso) {
        this.idCriterio = idCriterio;
        this.descripcion = descripcion;
        this.Concurso = Concurso;
        this.evaluaciones=new ArrayList<>();
    }

    public int getIdCriterio() {
        return idCriterio;
    }

    public void setIdCriterio(int idCriterio) {
        this.idCriterio = idCriterio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(ArrayList<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public int getConcurso() {
        return Concurso;
    }

    public void setConcurso(int Concurso) {
        this.Concurso = Concurso;
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
