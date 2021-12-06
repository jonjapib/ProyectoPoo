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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Pibaque Ponce..
 */
public class Criterio {
    private int idCriterio;
    private String descripcion;
    private ArrayList<Evaluacion> evaluaciones;
    private int idConcurso;
    private String concurso;

       public Criterio(int idCriterio, String descripcion,String concurso) {
        this.idCriterio = idCriterio;
        this.descripcion = descripcion;
        this.concurso=concurso;
        this.evaluaciones=new ArrayList<>();
    }

    public int getIdConcurso() {
        return idConcurso;
    }

    public void setIdConcurso(int idConcurso) {
        this.idConcurso = idConcurso;
    }
    
    public String getConcurso() {
        return concurso;
    }

    public void setConcurso(String concurso) {
        this.concurso = concurso;
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
        Criterio other = (Criterio) obj;
        if (this.idCriterio != other.idCriterio) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
   
        }
        return true;
    }
    


      public static Criterio nextCriterio(Scanner sc){
            
         
          ArrayList<String> d = new ArrayList<>();
                   for(Concurso c: Concurso.readFile("Concurso.txt")){
            d.add(String.valueOf(c.getId()));
                d.add(c.getNombre());     
        } 
           sc.nextLine();
          System.out.println(d);
          System.out.println("Ingrese descripcion:");
            String descripcion=sc.nextLine();
            sc.useDelimiter("\n");
           
                           
            System.out.println("Ingrese el id de concurso para guardado:");
            int id = sc.nextInt();
            
     
            
      //    System.out.println(Concurso.readFile("Concurso.txt").get(id-1).getNombre());
        
            
       Criterio criterio = new Criterio(Util.nextID("Criterios.txt"), descripcion, Concurso.readFile("Concurso.txt").get(id-1).getNombre() );
    
        return criterio;
    
    }
      
      
    public void savefile(String File){
  try(PrintWriter pw= new PrintWriter(new FileOutputStream(new File(File),true))){
      
   
      pw.println(+this.idCriterio+"|"+this.descripcion+"|"+this.concurso);
      
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
               Criterio vc =new Criterio(Integer.parseInt(tokens[0]),tokens[1],(tokens[0]));
              criterios.add(vc);
    }
       }
          catch(Exception e){
           System.out.println(e.getMessage());
       }
       return criterios;
    }
  
  
}