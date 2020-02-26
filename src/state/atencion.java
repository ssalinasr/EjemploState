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
public class atencion {
    
    private estado est;
    
    public void cerrar(){
        est = new estadoCerrado();
    }
    
    public void abrir(){
        est = new estadoAbierto();
    }
    
    public void atender(Persona at){
        est.funcion(at);
    }
    
    
}
