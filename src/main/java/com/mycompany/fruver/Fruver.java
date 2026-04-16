
package com.mycompany.fruver;
import com.murcia.utils.*;

public class Fruver{
//clase principal de Fruver
    public static void main(String[] args) {
     ListaProductos lista= new ListaProductos();   
        int opcion;
    
     
     do{
        System.out.println("--- BIENVENIDO A FRUVER ---");
        System.out.println("----MENU----");
        System.out.println("Elija una opcion:");
        System.out.println("1: Insertar producto");
        System.out.println("2: Mostrar productos");
        System.out.println("3: Buscar producto");
        System.out.println("4: Comprar producto");
        System.out.println("5: Atender cliente");
        System.out.println("6: Eliminar producto");
        System.out.println("0: Salir");
    
    
    
    opcion = Input.nextInt("Ingrese su opcion: ");
    Input.nextLine("");
    switch (opcion) {
        //Insetar producto
        case 1:
            String nombre = Input.nextLine("Nombre del producto: ");
            int cantidad = Input.nextInt("Cantidad del producto: ");
            double precio = Input.nextFloat("Precio del producto: ");
            Input.nextLine("");
            lista.insertar(new Producto(nombre, cantidad, precio));
            System.out.println("Producto insertado correctamente");
            break;
        //Mostar productos
        case 2:
            lista.mostrar();
            break;
            //Buscar producto
        case 3:
            String nombreBuscar = Input.nextLine("Producto a buscar: ");
            Producto p = lista.buscar(nombreBuscar);
             if (p == null) {
                System.out.println("Producto no encontrado");
             }
             break;
             // Cliente va a comprar producto
        case 4:
            String nombreCliente = Input.nextLine("Nombre del cliente: ");
            Cliente c = new Cliente(nombreCliente);

            String nombreProd = Input.nextLine("Producto a comprar: ");

            Producto prod = lista.buscar(nombreProd);

            if (prod != null) {

            int cant = Input.nextInt("Cantidad a comprar: ");
            Input.nextLine(""); // limpiar buffer

            Trabajador t = new Trabajador("Pedro");

            System.out.println("El trabajador " + t.nombre + " esta atendiendo a " + nombreCliente);

            boolean compra = prod.vender(cant);

           if (compra) {
              System.out.println("Gracias por su compra " + nombreCliente);
            }

            } else {
              System.out.println("El producto no se encuentra disponible");
            }

           break;
          //trabajador va a atender
        case 5:
            Trabajador t = new Trabajador("Pedro");
            Cliente cliente = new Cliente("");

            t.atender(cliente);
            break; 
            // Eliminar producto
        case 6:
            // Aqui el usuario elimina un producto de la lista
            String nombreEliminar = Input.nextLine("Producto a eliminar: ");

            Producto eliminado = lista.eliminar(nombreEliminar);

            if (eliminado != null) {
            System.out.println("Se elimino el producto: " + eliminado.nombre);
            } else {
                System.out.println("No se pudo eliminar, producto no encontrado");
            }
            break;
        }
     }while (opcion!=0);
        System.out.println("programa finalizado");
                    
     
   
    
}
}
