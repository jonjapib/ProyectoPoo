/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import java.util.Objects;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Concurso getIdConcurso() {
        return idConcurso;
    }

    public void setIdConcurso(Concurso idConcurso) {
        this.idConcurso = idConcurso;
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
        final Premio other = (Premio) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.idConcurso, other.idConcurso)) {
            return false;
        }
        return true;
        
        
    }

    @Override
    public String toString() {
        return "Premio{" + "id=" + id + ", lugar=" + lugar + ", descripcion=" + descripcion + ", idConcurso=" + idConcurso + '}';
    }
    
    
    
    
}
