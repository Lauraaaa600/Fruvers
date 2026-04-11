package com.mycompany.fruver;

public class ListaProductos {
    NodoProducto inicio;
    
  public void insertar(Producto p) {
    NodoProducto nuevo = new NodoProducto(p);
    
    if (inicio == null) {
        inicio = nuevo;
       } else {
        NodoProducto aux = inicio;
        while (aux.siguiente != null) {
            aux = aux.siguiente;
        }
        aux.siguiente = nuevo;
       }
  }
     public void mostrar() {

        if (inicio == null) {
            System.out.println("Lista vacia");
            return;
        }

        NodoProducto aux = inicio;

        while (aux != null) {
            System.out.println(aux.dato.nombre);
            aux = aux.siguiente;
        }
    }  
    
}
