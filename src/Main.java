public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        int edad = cliente1.edad = 12;
        int telefono = cliente1.telefono = 123456789;
        String nombre = cliente1.nombre = "Juan";
        int credito = cliente1.credito = 1000;
        System.out.println("edad:" + edad + "\n" + "telefono: " + telefono + "\n" + "nombre: " + nombre +
                 "\n" +"credito: " + credito );
    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}