/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import java.util.Scanner;

/**
 *
 * @author Pibaque Ponce
 */
public class Evaluacion {
    //Atributos
    private int id;
    private int idescripcion;
    private Inscripcion inscripcion;
    private int idMiembroJurado;
    private MiembroJurado miembroJurado;
    private double nota;
    private int idCriterio;
    private Criterio criterio;
    
    //Constructor

    public Evaluacion(int id, int idescripcion, Inscripcion inscripcion, int idMiembroJurado, MiembroJurado miembroJurado, double nota, int idCriterio, Criterio criterio) {
        this.id = id;
        this.idescripcion = idescripcion;
        this.inscripcion = inscripcion;
        this.idMiembroJurado = idMiembroJurado;
        this.miembroJurado = miembroJurado;
        this.nota = nota;
        this.idCriterio = idCriterio;
        this.criterio = criterio;
    }
    
    
    //Método nextEvaluacion
    public Evaluacion nextEvaluacion(Scanner sc){
        
        return null;
        
    }
    
}
