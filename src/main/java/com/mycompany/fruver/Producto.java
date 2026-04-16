
package com.mycompany.fruver;


public class Producto {
    String nombre;
    int cantidad;
    double precio;
    //constructor
    public Producto(String nombre, int cantidad, double precio){
        this.nombre=nombre;
        this.cantidad=cantidad;  
        this.precio=precio;
    }
    //metodo para vender producto
    public boolean vender(int cant) {

        if (cant <= cantidad) {
            cantidad -= cant;
            double total = cant * precio;

            System.out.println("Cantidad comprada: " + cant);
            System.out.println("Precio unitario: " + precio);
            System.out.println("Total a pagar: " + total);

            return true; // venta exitosa
        } else {
            System.out.println("No hay suficiente cantidad disponible");
            return false;
        }

    }

}
