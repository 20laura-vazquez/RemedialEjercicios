
package Ejercicio1;


class nodo {
    private int dato;
    private nodo siguiente;

    //Constructores de la clase Nodo
    public nodo(int dato, nodo siguiente) {
        this.dato = dato;

        this.siguiente = siguiente;
    }

    public nodo(int datos) {
        this.dato = datos;
        this.siguiente = null;
    }

    //Metodos getter and setter
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
}
