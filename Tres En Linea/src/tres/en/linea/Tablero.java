/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres.en.linea;

/**
 *
 * @author estudiantes
 */
public class Tablero {
    
    String[][] letras=new String[3][3];
    int nClic=0;
    String nombre;
    
    
    
    
     String Ganador(){
        if(letras[0][0].equals(letras[0][1]) && letras[0][0].equals(letras[0][2]) && letras[0][1].equals(letras[0][0]) ){
           
            return "ganó";
            
        }
        
        return ""; 
        
    }
      public String simbolo(){
            if (nClic==0){
                nClic=1;
                return "X";
            }
            else{
                nClic=0;
                return "O";
            } 
               
        }

}
