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
public class estadoCerrado implements estado {

    @Override
    public void funcion(Persona at) {
        System.out.println("Esta cerrado para "+at.getName());
    }
    
}
