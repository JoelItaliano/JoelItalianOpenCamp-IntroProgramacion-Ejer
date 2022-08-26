
public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.nombre = "Pedro Gonzalez";
        cliente.edad = 75;
        cliente.telefono = 777555888;
        cliente.credito = 20000;
        
        System.out.println("Nombre:" + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Teléfono: " + cliente.telefono);
        System.out.println("Crédito disponible: " + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Pedro Gonzalez";
        trabajador.edad = 75;
        trabajador.telefono = 777555888;
        trabajador.salario = 75000;
        
        System.out.println("Nombre:" + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Teléfono: " + trabajador.telefono);
        System.out.println("Crédito disponible: " + trabajador.salario);
        
        
    }
}
