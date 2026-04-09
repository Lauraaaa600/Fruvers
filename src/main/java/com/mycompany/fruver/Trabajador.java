
package com.mycompany.fruver;


public class Trabajador {
    private String nombre;
   

    public Trabajador(String nombre, String cargo) {
        this.nombre = nombre;
        
    }
     public void atenderCliente(Cliente cliente) {
        System.out.println(nombre + " está atendiendo a " + cliente);
    }

   
    public void agregarProducto(Producto producto, int cantidad) {
        System.out.println(nombre + " agregaría " + cantidad + " " + producto + " al stock");
    }

    
    public void mostrarTrabajador() {
        System.out.println("Trabajador: " + nombre);
    }
}
