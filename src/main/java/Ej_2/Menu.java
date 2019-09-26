/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Menu {
    
    public void menu() throws IOException, FileNotFoundException, ClassNotFoundException{
        Funciones funcion = new Funciones();
        Salieri es = new Salieri();
        
        int opcion;
        do{
        System.out.println("Seleccione una opcion:");
        System.out.println("1-Introducir departamentos.");
        System.out.println("2-Modificar departamentos.");
        System.out.println("3-Eliminar departamentos.");
        System.out.println("4-Visualizar departamentos.");
        System.out.println("5-Salir.");
        opcion=es.controlaentero();
        switch(opcion){
            case 1:
                System.out.println("Introduzca el numero de departamento:");
                int ndep=es.controlaentero();
                System.out.println("Introduzca el nombre del departamento:");
                String nombre=es.controlaString();
                System.out.println("Introduzca la localidad:");
                String localidad=es.controlaString();
                Departamentos dep = new Departamentos(ndep,nombre,localidad);
               funcion.insertar(dep);
                
                break;
            case 2:
                System.out.println("Inserte la id del departamento a modificar:");
                ndep= es.controlaentero();
                System.out.println("Inserte el nuevo nombre del departamento a modificar:");
                nombre= es.controlaString();
                System.out.println("Inserte la nueva localidad del departamento a modificar:");
                localidad= es.controlaString();
                funcion.Modificar(ndep, localidad, nombre);
                break;
            case 3:
                System.out.println("Inserte el numero de departamento a eliminar:");
                ndep=es.controlaentero();
                funcion.Eliminar(ndep);
                break;
            case 4:
                funcion.Visualizar();
                break;
        
        }
        }while(opcion!=5);
        
    
    }
    
}
