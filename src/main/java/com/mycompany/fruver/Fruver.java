
package com.mycompany.fruver;

public class Fruver {

    public static void main(String[] args) {
    System.out.println("--- Bienvenido a Fruver ---");
    System.out.println("Elija una opcion:");
    System.out.println("1: Mostrar producto");
    System.out.println("2: Cliente compra");
    System.out.println("3: Trabajador atiende cliente");
    
    ListaProductos lista= new ListaProductos();
    
    lista.insertar(new Producto("Manzana",10));
    lista.insertar(new Producto("Pera",5));
    
    
    int opcion = 2;
    
    switch (opcion) {
        case 1:
    lista.mostrar();
    break;
    
        case 2:
            Cliente c= new Cliente("Juan");
            Producto p = lista.buscar("Banano");
            
            if(p !=null) {
                c.comprar(p,2);
                
            }else {
                System.out.println("Producto no encontrado");
            }
            break;
            
    
    
    }    
}
}
