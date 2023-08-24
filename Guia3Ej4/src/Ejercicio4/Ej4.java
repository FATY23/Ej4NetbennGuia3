
package Ejercicio4;

public class Ej4 {

  
    public static void main(String[] args) {
       Robot Tito = new Robot();
       Hombre Hombre1 = new Hombre("Pablo");
        
       
       System.out.println(Hombre1.getNombre());
      
       Hombre1.jugarConRobota(Tito);
        System.out.println("-----------------------------");
       Hombre Hombre2 = new Hombre("Fernando");
       System.out.println(Hombre2.getNombre());
       Tito.despertar();
       Tito.recargar();
       Hombre2.jugarConRobota(Tito);
    }
    
}
