/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author estudiantes
 */
public class State {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       atencion a = new atencion();
       int np = 0;
       a.abrir();
       while(np < 20){
           np++;
           Persona p = new Persona("Persona "+np);
           a.atender(p);
           if(np % 2 != 0){
               a.cerrar();
           }
           else{
               a.abrir();
           }
           Thread.sleep(1000);
       }

    }
    
}
