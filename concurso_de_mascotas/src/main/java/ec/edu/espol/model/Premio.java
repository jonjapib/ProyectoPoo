/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

/**
 *
 * @author Pibaque Ponce
 */
public class Premio {
    //Atributos
    private int id;
    private int lugar;
    private String descripcion;
    private Concurso idConcurso;
    
    //Constructor

    public Premio(int id, int lugar, String descripcion, Concurso idConcurso) {
        this.id = id;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.idConcurso = idConcurso;
    }
    
    
}
