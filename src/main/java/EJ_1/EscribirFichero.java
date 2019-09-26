/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.*;
import EJ_1.Menu;

/**
 *
 * @author usuario
 */
public class EscribirFichero {
    
   public static void main(String[]args) throws FileNotFoundException, IOException{
    File fichero=new File("Ej1.txt");
    RandomAccessFile ra = new RandomAccessFile(fichero, "rw");
    String apellido[] ={"Garcia","Pardo","Duran","Leiva"};
    int dep[]={1,5,2,3};
    Double Salario[]={1000.20,1500.25,2000.6,1200.2};
    StringBuffer buffer=null;
    int n = apellido.length;
    
    for(int i=0;i<n;i++){
        ra.writeInt(i+1);
        buffer = new StringBuffer(apellido[i]);
        buffer.setLength(10);
        ra.writeChars(buffer.toString());
        ra.writeInt(dep[i]);
        ra.writeDouble(Salario[i]);
    }
    
   ra.close();
   Menu me = new Menu();
   me.Menu();

   }
  
}