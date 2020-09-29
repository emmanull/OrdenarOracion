/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasestringtokenizer;

/**
 *
 * @author sause
 */


import static clasestringtokenizer.ClaseStringTokenizer.des;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Txt {
     
   
    
	public   String LeerTxt() throws FileNotFoundException, IOException {
        File LeerArch = new File("Oracion.txt");
        FileReader leer = new FileReader(LeerArch);
        Scanner s = new Scanner(LeerArch);
        String leebfread;
        int cont = 0;
        
    
        while (s.hasNext()) { 
            des[cont] = s.nextLine(); 
            cont++; 
            
        }
        
       
        System.out.println("Frase desordenada:");
        for (int i = 0; i <= des.length - 1; i++) {
             System.out.println(des[i]);

        }
        String ruta=leer.toString();
        return ruta;
    }
}

