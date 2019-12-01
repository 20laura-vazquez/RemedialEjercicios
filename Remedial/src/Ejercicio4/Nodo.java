
package Ejercicio4;

/**
 *
 * @author Sergio
 */
public class Nodo {

    private Numero num;
    private Nodo Siguiente;

    Nodo(Numero num, Nodo Siguiente) {
        this.num = num;
        this.Siguiente = Siguiente;
    }

    public Numero getNum() {
        return num;
    }

    public void setNum(Numero num) {
        this.num = num;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }

}
