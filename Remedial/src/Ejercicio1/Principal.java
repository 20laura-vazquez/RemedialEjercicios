
package Ejercicio1;

import java.util.Scanner;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Lista coleccion = new Lista();
        int opcion;
       // System.out.println("EJERCICIO 3 - LISTAS SIMPLES ENLAZADAS\n");
        do {
            System.out.println("MENU PRINCIPAL:");
            System.out.println("1.- Ingresar datos a la lista");
            System.out.println("2.- Imprimir Lista");
            System.out.println("3.- Eliminar datos que se pasan de un limite.");
            System.out.println("4.- Salir");
            opcion = leerEntero("Seleccione una opción:");

            switch (opcion) {
                case 1: {
                    int nuevo = leerEntero("Ingrese el elemento que desee ingresar a la lista:");
                    coleccion.agregarFin(nuevo);
                    break;
                }
                case 2: {
                    System.out.println("La lista ingresada es:");
                    coleccion.imprimir();
                    break;
                }
                case 3: {
                    int valor = leerEntero("Ingrese el valor que sirva de limite:");
                    coleccion.eliminar(valor);
                    break;
                }
                case 4: {
                    System.out.println("FIN DEL PROGRAMA");
                    break;
                }
            }
        } while (opcion != 4);
    }

    public static int leerEntero(String linea) {
        Scanner leer = new Scanner(System.in);
        System.out.println(linea);
        int dato = leer.nextInt();
        return dato;
    }
}
