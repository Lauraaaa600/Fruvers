package com.mycompany.fruver;

public class ListaProductos {
    NodoProducto inicio;
  public void insertar(Producto p) {
    NodoProducto nuevo = new NodoProducto(p);
    inicio = nuevo;
    
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
    
}
