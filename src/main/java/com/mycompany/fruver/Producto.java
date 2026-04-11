
package com.mycompany.fruver;


public class Producto {
    String nombre;
    int cantidad;
    
    public producto(String nombre, int cantidad){
        this.nombre=nombre;
        this.cantidad=cantidad;      
    }
    public void vender(int cant) {
        cantidad -= cant; 
    }

}
