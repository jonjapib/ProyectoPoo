/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

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
        
        return null;
        
    }
    
    //Método saveFile
    public void saveFile(String File){
        
    }
    
    //Método readFile
    public ArrayList readFile(String File){
        
        return null;
        
    }
  
    
}
