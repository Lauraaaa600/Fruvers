package com.mycompany.fruver;

import com.murcia.utils.*;
// Clase que representa una lista enlazada de productos
// Hereda de la libreria del profesor
public class ListaProductos extends ListaEnlazada<Producto> {
    // Metodo para insertar productos (simula cola: entra al final)
    public void insertar(Producto p) {
        add(p); // ya inserta al final automáticamente
        System.out.println("Se encolo el producto: " + p.nombre);
    }
    //Metodo para mostrar todos los productos
    public void mostrar() {

        if (head == null) {
            System.out.println("Lista vacia");
            return;
        }

        Nodo<Producto> aux = head;
        //Se recorre nodo por nodo
        while (aux != null) {
            System.out.println("Producto: " + aux.getData().nombre +
                               " | Cantidad: " + aux.getData().cantidad);
            aux = aux.getNext();
        }
    }
    //Metodo para buscar un producto
    public Producto buscar(String nombre) {

        Nodo<Producto> aux = head;

        while (aux != null) {
            if (aux.getData().nombre.equals(nombre)) {

                System.out.println("Producto: " + aux.getData().nombre);
                System.out.println("Cantidad: " + aux.getData().cantidad);

                return aux.getData();
            }

            aux = aux.getNext();
        }

        return null;
    }
    // Metodo para eliminar un producto de la lista enlazada
    public Producto eliminar(String nombre) {

        // Si la lista esta vacia
        if (head == null) {
            System.out.println("Lista vacia, no se puede eliminar");
            return null;
        }

        Nodo<Producto> actual = head;
        Nodo<Producto> anterior = null;

        // Se recorre la lista
        while (actual != null) {

            if (actual.getData().nombre.equalsIgnoreCase(nombre)) {

                System.out.println("Eliminando producto: " + actual.getData().nombre);

                // Si es el primero
                if (anterior == null) {
                    head = actual.getNext();
                } 
                // Si esta en medio o final
                else {
                    anterior.setNext(actual.getNext());
                }

                return actual.getData();
            }

            anterior = actual;
            actual = actual.getNext();
        }

        return null;
    }
}    

