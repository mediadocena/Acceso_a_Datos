/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_2;

import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;


/**
 *
 * @author aleja
 */
public class Funciones {
    
    
    ArrayList<Departamentos> a = new ArrayList();
   public void insertar(Departamentos dep) throws FileNotFoundException, IOException{
        File fichero = new File("EJ2.dat");
        FileOutputStream fileout = new FileOutputStream(fichero);
        ObjectOutputStream dataOS = new ObjectOutputStream(fileout);
        a.add(dep);
        dataOS.writeObject(a);
        dataOS.close();
        System.out.println("Se ha introducido correctamente el departamento");

    }
    public void Visualizar() throws FileNotFoundException, IOException, ClassNotFoundException{
        File fichero = new File("EJ2.dat");
        FileInputStream filein = new FileInputStream(fichero);
        ObjectInputStream dataIN = new ObjectInputStream(filein);
        a=(ArrayList<Departamentos>) dataIN.readObject();
        for(Departamentos d: a){
            System.out.println(d);
        }
        dataIN.close();
    
    }
    public void Eliminar(int id) throws IOException{
     File fichero = new File("EJ2.dat");
     boolean fin = false;
        FileInputStream filein = new FileInputStream(fichero);
        ObjectInputStream dataIN = new ObjectInputStream(filein);
        for(Departamentos d: a){
            if(d.getNdep()==id){
            a.remove(d);
            FileOutputStream fileout = new FileOutputStream(fichero);
        ObjectOutputStream dataOS = new ObjectOutputStream(fileout);
        dataOS.writeObject(a);
        dataOS.close();
        fin=true;
            break;
            }
            if(fin=false){
                System.out.println("No se Encuentra la id");
            }
            dataIN.close();
    
    }
        
}
    public void Modificar(int id,String localidad,String nombre) throws FileNotFoundException, IOException{
        File fichero = new File("EJ2.dat");
        FileInputStream filein = new FileInputStream(fichero);
        ObjectInputStream dataIN = new ObjectInputStream(filein);
        for(Departamentos d: a){
            if(d.getNdep()==id){
            d.setNdep(id);
            d.setLocalidad(localidad);
            d.setNombre(nombre);
        FileOutputStream fileout = new FileOutputStream(fichero);
        ObjectOutputStream dataOS = new ObjectOutputStream(fileout);
        dataOS.writeObject(a);
        dataOS.close();
            break;
            }
            dataIN.close();
    
    }
        
        }
    
}
