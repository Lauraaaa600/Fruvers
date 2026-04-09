
package com.mycompany.fruver;

public class Fruver {

    public static void main(String[] args) {

       
        System.out.println("--- Bienvenido al Fruver ---");
        System.out.println("Opciones disponibles:");
        System.out.println("1: Mostrar producto");
        System.out.println("2: Cliente compra");
        System.out.println("3: Trabajador atiende cliente");

        
        int opcion = 1; 

        if (opcion == 1) {
            System.out.println("seleccione el producto");
        } else if (opcion == 2) {
            System.out.println("nombre del cliente");
        } else if (opcion == 3) {
            System.out.println("nombre del trabajador");
        } else {
            System.out.println("Opción no válida");
        }
    }
}
