public class Main {
    public static void main(String[] args) {
    Cliente cliente1 = new Cliente();
    cliente1.nombre = "Jonathan Rodriguez";
    cliente1.edad = 39;
    cliente1.numeroTelefono = 325985584;
    cliente1.credito = 2500;
    System.out.println("Nombre del cliente: " + cliente1.nombre);
    System.out.println("Edad del Cliente: " + cliente1.edad);
    System.out.println("Telefono del cliente: " + cliente1.numeroTelefono);
    System.out.println("Crédito disponible del cliente: $" + cliente1.credito + "\n");

    Trabajador trabajador1 = new Trabajador();
    trabajador1.nombre = "Pedro Pérez";
    trabajador1.edad = 50;
    trabajador1.numeroTelefono = 811431264;
    trabajador1.salario = 1800;
    System.out.println("Nombre del trabajador: " + trabajador1.nombre);
    System.out.println("Edad del trabajador: " + trabajador1.edad);
    System.out.println("Telefono del trabajador: " + trabajador1.numeroTelefono);
    System.out.println("Salario mensual del trabajador: $" + trabajador1.salario);

    }
}
class Persona {
    String nombre;
    int numeroTelefono;
    int edad;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}