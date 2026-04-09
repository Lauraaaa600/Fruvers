
package com.mycompany.fruver;


public class Producto {
     private String nombre;
    
    private int cantidad;

    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
       
        this.cantidad = cantidad;
    }
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " - Cantidad: " + cantidad);
    }

    
    public void venderProducto(int cantidadVendida) {
        System.out.println("Se venderían " + cantidadVendida + " " + nombre);
    }

    
}
