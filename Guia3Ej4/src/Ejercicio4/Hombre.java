package Ejercicio4;

import java.util.Scanner;

public class Hombre {

    private String nombre;

    public Hombre(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void jugarConRobota(Robot Tito) {
        Tito.avanzar(10000);
        Tito.retroceder(20);
        System.out.println("Energia actual: " + Tito.energiaActual());
        Tito.dormir();

    }

    public void jugarConRobot(Robot Tito) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("hola que quieres hacer?");
            System.out.println("1. para avanzar");
            System.out.println("2. para retroceder");
            System.out.println("3. para dormir");
            System.out.println("4. para despertar");
            System.out.println("5. para cargar bateria");
            System.out.println("6. estado");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    if (Tito.isEstado()) {
                        System.out.println("¿cuanto quieres avanzar?");
                        op = sc.nextInt();
                        Tito.avanzar(op);
                        System.out.println("Energia Actual: " + Tito.energiaActual());

                    } else {
                        System.out.println("Zzzzzzzz....Zzzzzzz....");
                    }
                    break;
                case 2:
                    if (Tito.isEstado()) {
                        System.out.println("¿cuanto quieres avanzar?");
                        op = sc.nextInt();

                        Tito.avanzar(op);
                        System.out.println("Energia Actual: " + Tito.energiaActual());

                    } else {
                        System.out.println("Zzzzzzzz....Zzzzzzz....");
                    }
                    break;
                case 3:
                    System.out.println("Hasta mañana!!!");
                    Tito.dormir();
                    break;
                case 4:
                    System.out.println("Hola listo para Jugar!");
                    Tito.despertar();
                    break;
                case 5:
                    System.out.println("Ya estoy al 100% vamos a jugar!");
                    Tito.recargar();
                    break;
                case 6:
                    if (Tito.isEstado()) {
                        System.out.println("el robot esta encendido");
                    } else {
                        System.out.println("el robot esta apagado");
                    }
                    break;
                default:
                    System.out.println("Ingrese una opcion valida!");
                    break;
            }
        } while (Tito.isEstado());
    }
}
