
package com.mycompany.fruver;


public class Trabajador {
    String nombre;
    
    public Trabajador(String nombre){
        this.nombre=nombre;
    }
    
    public void atender(Cliente c){
        System.out.println(nombre + "atiende a" + c.nombre);
    }
}
