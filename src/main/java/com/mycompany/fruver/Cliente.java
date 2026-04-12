
package com.mycompany.fruver;

public class Cliente {
    String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public void comprar(Producto p, int cant) {
        p.vender(cant);
    }

}
