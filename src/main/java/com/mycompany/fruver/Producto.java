
package com.mycompany.fruver;


public class Producto {
    String nombre;
    int cantidad;
    
    public Producto(String nombre, int cantidad){
        this.nombre=nombre;
        this.cantidad=cantidad;      
    }
    public void vender(int cant) {
     if (cant <= cantidad) {
        cantidad -= cant;
    } else {
        System.out.println("No hay suficiente cantidad");
    }

    }

}
