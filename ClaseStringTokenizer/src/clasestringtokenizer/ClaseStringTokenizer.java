
package clasestringtokenizer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


 
 //* @author erixq
 
public class ClaseStringTokenizer {
     static String cadena[] = {"El", "perro", "esta", "comiendo", "pan"};  
     static String[] des= new String[5];
     static String[] caden = new String[5];
    
        
    public static void main(String[] args) {
         Txt t=new Txt();
       String oracionorenda = " ";

		
            try {
                if (t.LeerTxt()!="") 
            {
                   Comparar();
              }else{ 
                    System.out.println("No a ingreado nada");
                }
            } catch (IOException ex) {
               		 	
            }  
            for (int i = 0; i <= cadena.length - 1; i++) {
                oracionorenda = oracionorenda + cadena[i] + " ";
                }
            
            System.out.println("Frase ordenada!\n" +oracionorenda);
    
           
            
            
        
    
	
}

        
        
        
        /*StringTokenizer st=new StringTokenizer(s," ");
       
        
        String tok;
        int x=0;
        while(st.hasMoreElements()){
            
            
            tok=st.nextToken();
            System.out.println(tok);*/
 
       

    
    
    

    public static void Comparar() {

        for (int x = 0; x <= cadena.length - 1; x++) {
            for (int i = 0; i <= des.length - 1; i++) {
                if (cadena[x].equals(des[i])) {
                }
            }
        }
        System.out.println("_____________________________");
        for (int x = 0; x <= caden.length - 1; x++) {

           // System.out.println(cadenacorrecta [x]);
        }
    }
}
        
            
            
               
            
        
    
       
    
    

