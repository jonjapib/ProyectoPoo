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
public class Criterio {
    private int idCriterio;
    private String descripcion;
    private ArrayList<Evaluacion> evaluaciones;
    private String idConcurso;
    private Concurso concurso;

    public String getIdConcurso() {
        return idConcurso;
    }

    public void setIdConcurso(String idConcurso) {
        this.idConcurso = idConcurso;
    }

    public Concurso getConcurso() {
        return concurso;
    }

    public void setConcurso(Concurso concurso) {
        this.concurso = concurso;
    }
    

    public Criterio(int idCriterio, String descripcion, int Concurso) {
        this.idCriterio = idCriterio;
        this.descripcion = descripcion;
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


      public static Criterio nextCriterio(Scanner sc){
           System.out.println("Ingrese id");
            int id=sc.nextInt();
            
            System.out.println("Ingrese descripcion:");
            String descripcion=sc.next();
                           
            System.out.println("Ingrese nombre del concurso:");
            int concuso = sc.nextInt();

            
       Criterio criterio = new Criterio(id, descripcion, concuso );
    
        return criterio;
    
    }
      
    public void savefile(String File){
  try(PrintWriter pw= new PrintWriter(new FileOutputStream(new File(File),true))){
      
   
      pw.println(+this.idCriterio+"|"+this.descripcion+"|"+this.idConcurso);
      
  }catch(Exception e){
      System.out.println(e.getMessage());
  }
   

  }
  public static ArrayList<Criterio> readFile(String File){
        ArrayList<Criterio> criterios = new ArrayList<>();
       try(Scanner sc = new Scanner(new File(File))) {
           while(sc.hasNextLine()){
              String linea=sc.nextLine();
              String[] tokens = linea.split("\\|");
               Criterio v =new Criterio(Integer.parseInt(tokens[0]),tokens[1],Integer.parseInt(tokens[0]));
              criterios.add(v);
              
               
           }
       }
          catch(Exception e){
           System.out.println(e.getMessage());
       }
       return criterios;
    }
  
  
}