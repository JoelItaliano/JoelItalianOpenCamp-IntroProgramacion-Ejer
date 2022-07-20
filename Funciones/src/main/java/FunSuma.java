
public class FunSuma {
    public static void main (String[] args){
//        int resultado = suma(10,30);
        System.out.println(suma(10,20));
        
        System.out.println(funInfinita(5));
    }
    
    public static int suma (int a, int b){
        return a+b;
    }
    
    public static int funInfinita (int a) {
        System.out.println(a);
        a--;      
        if (a!=0) {
            return funInfinita(a);
        }else{
         return 0;
        }
    }
}
