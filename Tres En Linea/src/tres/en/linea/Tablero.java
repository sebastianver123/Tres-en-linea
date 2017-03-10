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
    
    String[] letras=new String[9];
    int nClic=0;
    String nombre;
    
    
    
    
    void CambiarLetra(){
    
    
    }
      public String simbolo(){
            if (nClic==0){
                nClic=1;
                return "0";
            }
            else{
                nClic=0;
                return "X";
            } 
               
        }

}
