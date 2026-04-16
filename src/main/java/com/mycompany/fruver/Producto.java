
package com.mycompany.fruver;


public class Producto {
    String nombre;
    int cantidad;
    //constructor
    public Producto(String nombre, int cantidad){
        this.nombre=nombre;
        this.cantidad=cantidad;      
    }
    //metodo para vender producto
    public void vender(int cant) {
     if (cant <= cantidad) {
        cantidad -= cant;
        System.out.println("Venta realizada. Cantidad restante: " + cantidad);
    } else {
        System.out.println("No hay suficiente cantidad");
    }

  }

}
