
package com.mycompany.fruver;
import com.murcia.utils.*;

public class Fruver{

    public static void main(String[] args) {
        
        System.out.println("--- Bienvenido a Fruver ---");
        System.out.println("Elija una opcion:");
        System.out.println("1: Mostrar producto");
        System.out.println("2: Cliente compra");
        System.out.println("3: Trabajador atiende cliente");
    
    ListaProductos lista= new ListaProductos();
    
        lista.insertar(new Producto("Manzana",4000));
        lista.insertar(new Producto("Pera",3000));
    
    
    int opcion = Input.nextInt("Ingrese su opcion: ");
    
    switch (opcion) {
        case 1:
            lista.mostrar();
            break;
    
        case 2:
            Cliente c= new Cliente(Input.nextLine("nombre del cliente: "));
            Input.nextLine("");
            Producto p = lista.buscar(Input.nextLine("nombre del producto: "));
            
            if(p !=null) {
                c.comprar(p,2);
                System.out.println("Compra realizada");
            }else {
                System.out.println("Producto no encontrado");
            }
            break;
            
             case 3:
                 Trabajador t=new Trabajador("Pedro");
                 Cliente c2 = new Cliente("Ana");
                 
                 t.atender(c2);
                 System.out.println("Atencion completada");
                 break;
    
    }  
   
    
}
}
