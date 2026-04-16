package com.mycompany.fruver;

import com.murcia.utils.*;

public class ListaProductos extends ListaEnlazada<Producto> {

    public void insertar(Producto p) {
        add(p); // ya inserta al final automáticamente
    }

    public void mostrar() {

        if (head == null) {
            System.out.println("Lista vacia");
            return;
        }

        Nodo<Producto> aux = head;

        while (aux != null) {
            System.out.println(aux.getData().nombre);
            aux = aux.getNext();
        }
    }

    public Producto buscar(String nombre) {

        Nodo<Producto> aux = head;

        while (aux != null) {
            if (aux.getData().nombre.equals(nombre)) {

                System.out.println(
                    "Producto: " + aux.getData().nombre +
                    " Cantidad: " + aux.getData().cantidad
                );

                return aux.getData();
            }

            aux = aux.getNext();
        }

        return null;
    }
}    

