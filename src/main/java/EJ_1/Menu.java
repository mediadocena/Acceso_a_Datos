/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ_1;

import Ej_2.Salieri;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Menu {
    
    void Menu() throws IOException{
        Salieri es = new Salieri();
        int opcion,id=0;
        double salario=0;
        int depart;
        Funciones funcion = new Funciones();
        do{
        System.out.println("Seleccione una opcion:");
        System.out.println("1-Visualizar Datos");
        System.out.println("2-Insertar Datos");
        System.out.println("3-Modificar Datos");
        System.out.println("4-Eliminar Datos");
        System.out.println("5-Salir");
        opcion = es.controlaentero();
        switch(opcion){
            case 1: 
                System.out.println("Inserte el id del empleado:");
                
                funcion.Visualizar(es.controlaentero());
                break;
            case 2:
                System.out.println("Introduzca los datos requeridos:");
                System.out.println("ID del empleado");
                id= es.controlaentero();
                System.out.println("Apellido del empleado");
                String apellido = es.controlaString();
                System.out.println("Nº departamento");
                depart = es.controlaentero();
                System.out.println("Salario");
                 salario =es.controladouble();
                funcion.Insertar(id, apellido, depart, salario);
                break;
            case 3:
                 System.out.println("Introduzca los datos requeridos:");
                  System.out.println("ID del empleado");
                  id= es.controlaentero();
                   System.out.println("Salario");
                  salario = es.controladouble();
                  funcion.Modificar(id, salario);
                break;
            case 4:
                System.out.println("Inserte la id del Empleado a borrar:");
                id= es.controlaentero();
                funcion.Eliminar(id);
                break;
                
        }
        }while(opcion!=5);
            
        
        
        
    
    
    }
}
