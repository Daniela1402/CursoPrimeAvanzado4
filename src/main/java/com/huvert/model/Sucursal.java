
package com.huvert.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sucursal")
public class Sucursal implements Serializable{
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int Id_sucursal;
   
    @Column(name="Ubicacion")
    private String Ubicacion;
    
       @Column(name="NombreTienda")
    private String NombreTienda;
       
       @Column(name="Direccion")   
    private String Direccion;
       
          @Column(name="Telefono")
    private int Telefono;
          
          @Column(name="ciudad")   
    private String ciudad;

    public int getId_sucursal() {
        return Id_sucursal;
    }

    public void setId_sucursal(int Id_sucursal) {
        this.Id_sucursal = Id_sucursal;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getNombreTienda() {
        return NombreTienda;
    }

    public void setNombreTienda(String NombreTienda) {
        this.NombreTienda = NombreTienda;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getCiiudad() {
        return ciudad;
    }

    public void setCiiudad(String ciiudad) {
        this.ciudad = ciiudad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.Id_sucursal;
        return hash;
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
        final Sucursal other = (Sucursal) obj;
        if (this.Id_sucursal != other.Id_sucursal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "Id_sucursal=" + Id_sucursal + '}';
    }
    
}
