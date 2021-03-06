
package com.huvert.model;

//conversion de las clases a entity

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoria")


public class Categoria implements Serializable {
    
   //indicamos el campo llave de la tabla

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int codigo;

   @Column(name="nombre")
    private String nombre;
   
    @Column(name="estado")
    private boolean estado = true;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
