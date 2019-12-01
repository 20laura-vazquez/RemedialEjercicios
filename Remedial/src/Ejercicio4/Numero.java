
package Ejercicio4;

public class Numero {

    String signo;
    int num;
    int grado;

    public Numero(String signo, int num, int grado) {
        this.signo = signo;
        this.num = num;
        this.grado = grado;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
}
