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
    private String idConcurso;
    private Concurso concurso;

       public Criterio(int idCriterio, String descripcion, String Concurso) {
        this.idCriterio = idCriterio;
        this.descripcion = descripcion;
        this.evaluaciones=new ArrayList<>();
    }
    
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
        if (!Objects.equals(this.idConcurso, other.idConcurso)) {
            return false;
        }
        if (!Objects.equals(this.evaluaciones, other.evaluaciones)) {
            return false;
        }
        if (!Objects.equals(this.concurso, other.concurso)) {
            return false;
        }
        return true;
    }
    


      public static Criterio nextCriterio(Scanner sc){
           System.out.println("Ingrese id");
            int id=sc.nextInt();
            
            System.out.println("Ingrese descripcion:");
            String descripcion=sc.next();
                           
            System.out.println("Ingrese nombre del concurso:");
            String concuso = sc.next();

            
       Criterio criterio = new Criterio(Util.nextID("Criterios.txt"), descripcion, concuso );
    
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