import java.util.Scanner;
public class SentenciasDeControl {
   
    public static void main(String[] args) {
       int numeroIF = 5, numeroWhile = 1, numeroFor = 0;
       String estacion = "Invierno";
        
        positivoNegativo(numeroIF);
        bucleWhile(numeroWhile); 
        bucleDoWhile(numeroWhile);
        switchCase(estacion);
    }
    
     /*
       1) Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        */
    public static void positivoNegativo(int numero) {
        if (numero > 0) {
            System.out.println("El numero es positivo");
        }else if(numero < 0){
            System.out.println("Enumero es negativo");
        }else{
            System.out.println("El numero es 0");
        }
    }
    
    /*
     2) Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
    Incrementar el valor de la variable en uno cada vez que se ejecute.
    Mostrarlo por pantalla cada vez que se ejecute.
    */
    public static void bucleWhile(int numero) {
         Scanner leerNumero = new Scanner(System.in);
        if (numero >= 3) {
            System.out.println("El numero es superior a 3,ingrese otro");
            int num = leerNumero.nextInt();
            bucleWhile(num);
        }else{
            while(numero < 3){
                System.out.println("El numero es: "+numero);
                numero++;
            }
        }        
    }
    
    /*
    3) Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez
    */
    public static void bucleDoWhile(int numero){
          Scanner leerNumero = new Scanner(System.in);
        if (numero >= 3) {
            System.out.println("El numero es superior a 3,ingrese otro");
            int num = leerNumero.nextInt();
            bucleDoWhile(num);
        }else{
            do{
                System.out.println("El numero es: "+numero);
                numero= 3;
            }while(numero > 3);
        }        
    }
    
    
    /*
    Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 
    y su condición será que la variable sea igual o menor que 3, 
    se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
    */
    public static void bucleFor(int numero) {
         Scanner leerNumero = new Scanner(System.in);
         if (numero > 3) {
            System.out.println("El numero es superior a 3,ingrese otro");
            int num = leerNumero.nextInt();
            bucleFor(num);
        }else{
             for (int i = 0; i <= 3; i++) {
                 System.out.println("El numero del bucle for es: "+numero);
             }   
         }        
    }
    
    
    /*
    Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
    Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
    También habrá que poner un default para cuando el valor de la variable no sea una estación.
    */
     public static void switchCase(String estacion) {
         switch(estacion.toLowerCase()){
            case "verano":
                 System.out.println("Es la estacion de Verano");
                 break;
            case "inviero":
                System.out.println("Es la estacion de Invieno");
                break;
            case "Primavera":
                System.out.println("Es la estacion de Primavera");
                break;
            case "otoño":
                System.out.println("Es la estacion de Otoño");
                break;
            default:
                System.out.println("No exite tal estacion");
        };
     }
    
}
