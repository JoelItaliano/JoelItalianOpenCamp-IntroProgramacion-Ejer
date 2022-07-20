
package Ejer_2;

public class Coche {
    int numeroPuertas = 0;
    
    public static void main(String[] args) {
        Coche myChoche = new Coche();
        myChoche.incrementaPuertas();
        myChoche.incrementaPuertas();
        
        System.out.println("El numnero de puertas de mi coche es: "+myChoche.numeroPuertas);
    }
    
    public void incrementaPuertas (){
      this.numeroPuertas++;
    }
}
