package Ejercicio4;

public class Bateria {

    private int carga;

    public Bateria() {
        this.carga = 1000;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
public void gastar(int pasos){

    carga-=pasos/10;
}
    
}
