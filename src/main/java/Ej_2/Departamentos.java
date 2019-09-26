/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_2;

import java.io.Serializable;

/**
 *
 * @author aleja
 */
public class Departamentos implements Serializable{
    int ndep;
    String nombre;
    String localidad;

    public Departamentos(int ndep, String nombre, String localidad) {
        this.ndep = ndep;
        this.nombre = nombre;
        this.localidad = localidad;
    }
    
    public Departamentos(){
    
    }
    public String toString(){
 
        return  "Numero:"+getNdep()+" ,Nombre:"+getNombre()+" ,Localidad:"+getLocalidad();
    }

    public int getNdep() {
        return ndep;
    }

    public void setNdep(int ndep) {
        this.ndep = ndep;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    
}
