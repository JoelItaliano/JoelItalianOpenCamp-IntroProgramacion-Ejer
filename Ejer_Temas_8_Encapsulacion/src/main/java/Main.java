
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.setNombre("Joel");
        persona.setEdad(29);
        persona.setTelefono(123456788);
        
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}
