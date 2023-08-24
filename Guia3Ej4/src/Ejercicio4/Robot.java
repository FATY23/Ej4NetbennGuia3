package Ejercicio4;

public class Robot {
    
    private Bateria Bateria;
    private boolean estado = true;

    public Robot() {
        this.Bateria = new Bateria();
    }

    public Bateria getBateria() {
        return Bateria;
    }

    public void setBateria(Bateria Bateria) {
        this.Bateria = Bateria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void avanzar(int pasos) {
         if (estado) {
            if (this.energiaActual() >= pasos / 10) {
                System.out.println("Avazamos " + pasos + " Pasos");

                int restoBateria = this.energiaActual() - pasos / 10;
//                                     1000        -         20 = 980
                this.Bateria.setCarga(restoBateria);
            }else{
                System.out.println("No hay suficiente energia para avanzar");
            }
        }else{
            System.out.println("El robot esta dormido");
        }

    }

    public void retroceder(int pasos) {
         if (estado) {
            if (this.energiaActual() >= pasos / 10) {
                System.out.println("Retrocedemos " + pasos + " Pasos");

                Bateria.gastar(pasos);
//                int restoBateria = this.energiaActual() - pasos / 10;
//
//                this.Bateria.setCarga(restoBateria);
            }else{
                System.out.println("No hay suficiente energia para retroceder");
            }
        }else{
            System.out.println("El robot esta dormido");
        }
    }

    public void dormir() {
        this.estado = false;
    }

    public void despertar() {
        this.estado = true;
    }

    public void recargar() {
        this.Bateria.setCarga(1000);
    }

    public boolean bateriaLlena() {
        return this.Bateria.getCarga() == 1000;
    }

    public boolean bateriaVacia() {
        return this.Bateria.getCarga() == 0;
    }

    public int energiaActual() {
        return this.Bateria.getCarga();
    }
}
