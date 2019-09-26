/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author usuario
 */
public class Funciones {
    
    
    boolean Visualizar(int id) throws FileNotFoundException, IOException, IOException{
        File fichero = new File("Ej1.txt");
        RandomAccessFile file= new RandomAccessFile(fichero,"r");
        int dep,posicion = 0;
        double salario;
        char apellido[]=new char[10],aux;
        
        posicion=(id-1)*36;
        //Comprobamos si existe
        if(posicion>=file.length()){
            System.out.println("ID: "+ id +", NO EXISTE EMPLEADO...");
            file.close();
            return false;
        }
            else{
                file.seek(posicion);
                id=file.readInt();
                if(id<0){
                    System.out.println("No se ha encontrado el Empleado");
                    
                }else{
                //Guardamos el apellido en el array de caracteres.
                for(int i =0;i<apellido.length;i++){
                    aux=file.readChar();
                    apellido[i]=aux;
                }
                String apellidos= new String(apellido);
                dep = file.readInt();
                salario = file.readDouble();
                System.out.println("ID: "+id+", apellido: "+apellidos+",departamento: "+dep+ ",Salario:"+ salario);
                }
        }
                file.close();
                return true;
    }
    boolean Comprobar(int id) throws FileNotFoundException, IOException, IOException{
        File fichero = new File("Ej1.txt");
        RandomAccessFile file= new RandomAccessFile(fichero,"r");
        int dep,posicion = 0;
        double salario;
        char apellido[]=new char[10],aux;
        
        posicion=(id-1)*36;
        //Comprobamos si existe
        if(posicion>=file.length()){
            System.out.println("ID Correcta");
            file.close();
            return false;
        }
            else{
                System.err.println("Esta id ya existe");
                file.close();
                return true;
        }
    }
    void Insertar(int id,String apellido,int departamento,double salario) throws IOException{
     File fichero = new File("Ej1.txt");
     RandomAccessFile file= new RandomAccessFile(fichero,"rw");
     long posicion = file.length();
     file.seek(posicion);
    if(Comprobar(id)==false){
        StringBuffer buffer=null;
        String ape=apellido;
        double sal=salario;
        int ident =id;
        int dep = departamento;
        posicion=(ident-1)*36;
        file.seek(posicion);
        file.writeInt(ident);
        buffer= new StringBuffer(apellido);
        buffer.setLength(10);
        file.writeChars(buffer.toString());
        file.writeInt(dep);
        file.writeDouble(sal);
        System.out.println("Se ha introducido el empleado correctamente.");
        
    
    }else{
    
        System.out.println("Err: El id especificado ya existe.");
    }
        
     file.close();
    
    }
     boolean Modificar(int id,double importe) throws FileNotFoundException, IOException, IOException{
        File fichero = new File("Ej1.txt");
        RandomAccessFile file= new RandomAccessFile(fichero,"rw");
        int posicion = 0;
        
        posicion=(id-1)*36;
        //Comprobamos si existe
        if(posicion>=file.length()){
            System.out.println("ID: "+ id +", NO EXISTE EMPLEADO...");
            file.close();
            return false;
        }
            else{
                id=file.readInt();
                posicion=posicion+28;
                file.seek(posicion);
                double salario = file.readDouble();
                importe+=salario;
                file.seek(posicion);
                file.writeDouble(importe);
                }
                file.close();
                return true;
    }
     public void Eliminar(int id) throws FileNotFoundException, IOException{
        File fichero = new File("Ej1.txt");
        RandomAccessFile file= new RandomAccessFile(fichero,"rw");
        int posicion = 0;
        posicion=(id-1)*36;

        if(posicion >= file.length()){
            System.out.println("ID: "+ id +", NO EXISTE EMPLEADO...");
            file.close();
        }else{
            file.seek(posicion);
            file.writeInt(-1);
            }
            file.close();
    }
     
}
