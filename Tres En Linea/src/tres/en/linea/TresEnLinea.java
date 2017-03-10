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
public class TresEnLinea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tablero miTablero= new Tablero();
        Tablero jug1= new Tablero();
        Tablero jug2= new Tablero();           
        
        Grafica miGrafica=new Grafica();
        miGrafica.setVisible(true);
  
        miGrafica.Clic=miTablero;

    }
    
}
