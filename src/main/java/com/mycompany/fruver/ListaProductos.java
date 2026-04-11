
package com.mycompany.fruver;

public class ListaProductos {
    NodoProducto inicio;
  public void insertar(Producto p) {
    NodoProducto nuevo = new NodoProducto(p);
    inicio = nuevo;
   }  
    
}
