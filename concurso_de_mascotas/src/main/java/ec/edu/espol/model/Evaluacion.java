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
import java.util.Scanner;

/**
 *
 * @author Pibaque Ponce
 */
public class Evaluacion {
    //Atributos
    
    private int id;
    private double nota;
    private int idInscripcion;
    private Inscripcion inscripcion;
    private int idMiembroJurado;
    private MiembroJurado miembroJurado;
    private int idCriterio;
    private Criterio criterio;
    private String emailJurado;

    public String getEmailJurado() {
        return emailJurado;
    }

    public void setEmailJurado(String emailJurado) {
        this.emailJurado = emailJurado;
    }
    
    //Constructor

    public Evaluacion(int id,String emailJurado, int idInscripcion, int idMiembroJurado, int idCriterio,double nota) {
        this.id = id;
        this.emailJurado= emailJurado;
        this.idInscripcion = idInscripcion;
        this.idMiembroJurado = idMiembroJurado;
        this.idCriterio = idCriterio;
        this.nota = nota;
        this.inscripcion = inscripcion;
        this.miembroJurado = miembroJurado;
        this.criterio = criterio;
    }


    
    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Inscripcion getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }

    public int getIdMiembroJurado() {
        return idMiembroJurado;
    }

    public void setIdMiembroJurado(int idMiembroJurado) {
        this.idMiembroJurado = idMiembroJurado;
    }

    public MiembroJurado getMiembroJurado() {
        return miembroJurado;
    }

    public void setMiembroJurado(MiembroJurado miembroJurado) {
        this.miembroJurado = miembroJurado;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getIdCriterio() {
        return idCriterio;
    }

    public void setIdCriterio(int idCriterio) {
        this.idCriterio = idCriterio;
    }

    public Criterio getCriterio() {
        return criterio;
    }

    public void setCriterio(Criterio criterio) {
        this.criterio = criterio;
    }
    
    //Método nextEvaluacion
      public static Evaluacion nextEvaluacion(Scanner sc){
            
         
//          ArrayList<String> d = new ArrayList<>();
//                   for(Concurso c: Concurso.readFile("Concurso.txt")){
//            d.add(String.valueOf(c.getId()));
//                d.add(c.getNombre());     
//        }
//          System.out.println(d);
//          System.out.println("Ingrese nota:");
//            String descripcion=sc.n();
//                           
//            System.out.println("Ingrese id concurso:");
//            int id = sc.nextInt();       
               System.out.println("ingrese nota de evaluacion");
               double nota=sc.nextDouble();
        String correo = MiembroJurado.readFile("MiembroJurado.txt").get(0).getEmail();
        int idJurado = MiembroJurado.readFile("MiembroJurado.txt").get(1).getIdMJCedula();
        int idCriterio=Criterio.readFile("Criterio.txt").get(1).getIdCriterio();
        
        int idInscripcion=1;
        

               

       Evaluacion evaluacion = new Evaluacion(Util.nextID("evaluacion.txt"), correo,idInscripcion ,idJurado,idCriterio, nota);
    
        return evaluacion;
    
    }
   
    
    
    
 
   public void savefile(String File){
  try(PrintWriter pw= new PrintWriter(new FileOutputStream(new File(File),true))){
      
   
      pw.println(+this.id+"|"+this.emailJurado+"|"+this.inscripcion+"|"+this.idMiembroJurado+"|"+this.idCriterio+"|"+this.nota);
      
  }catch(Exception e){
      System.out.println(e.getMessage());
  }
   

  }
  public static ArrayList<Evaluacion> readFile(String File){
        ArrayList<Evaluacion> evaluaciones = new ArrayList<>();
       try(Scanner sc = new Scanner(new File(File))) {
           while(sc.hasNextLine()){
              String linea=sc.nextLine();
              String[] tokens = linea.split("\\|");
               Evaluacion v =new Evaluacion(Integer.parseInt(tokens[0]),tokens[1],Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]),Integer.parseInt(tokens[4]),Double.parseDouble(tokens[5]));
              evaluaciones.add(v);
              
               
           }
       }
          catch(Exception e){
           System.out.println(e.getMessage());
       }
       return evaluaciones;
    }   
}

