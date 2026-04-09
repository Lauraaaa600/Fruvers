//kjdshfkjshdf
package com.mycompany.fruver;
//clon fruver
public class Cliente {
    private String nombre;
    

    public Cliente(String nombre) {
        this.nombre = nombre;
        
    }
     public void comprarProducto(Producto producto, int cantidad) {
        System.out.println(nombre + " quiere comprar " + cantidad + " " + producto);
        producto.venderProducto(cantidad);
    }

   
    public void mostrarCliente() {
        System.out.println("Cliente: " + nombre);
    }
}
