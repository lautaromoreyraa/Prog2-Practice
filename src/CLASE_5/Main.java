package CLASE_5;

public class Main {
    public static void main(String[] args) {

        //Tema 1: Clases, objetos y constructores

        Persona persona1 = new Persona("Juan", 12345678, 30);
        Persona persona2 = new Persona("Maria", 87654321, 25);
        Persona persona3 = new Persona("Pedro", 11223344, 40);
        persona1.toString();
        persona2.toString();
        persona3.toString();

        Empleado empleado1 = new Empleado("Juan", 1001);
        Empleado empleado2 = new Empleado("Maria", 1002);
        Empleado empleado3 = new Empleado("Pedro", 1003);
        Empleado empleado4 = new Empleado("Ana", 1004);

        empleado1.empleados[0] = empleado1;
        empleado1.empleados[1] = empleado2;
        empleado1.empleados[2] = empleado3;
        empleado1.empleados[3] = empleado4;

        System.out.println("Legajo menor: " + empleado1.calcularLegajoMenor());
        System.out.println("Legajo mayor: " + empleado1.calcularLegajoMayor());


        //Tema 2: Encapsulamiento y validación en setters

        CuentaBancaria cuenta1 = new CuentaBancaria("Juan", 123456, 1000.0);
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        cuenta1.depositar(500.0);
        System.out.println("Saldo después del depósito: " + cuenta1.getSaldo());
        cuenta1.extraer(200.0);
        System.out.println("Saldo después de la extracción: " + cuenta1.getSaldo());
        /*/ dispara exception
        cuenta1.extraer(10000);
        dispara exception
        cuenta1.depositar(-1); /*/

        // Tema 3: Sobrecarga de constructores y composición de objetos

        CuentaBancaria cuenta2 = new CuentaBancaria("Maria", 654321);
        System.out.println("Titular: " + cuenta2.getTitular());
        System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
        System.out.println("Saldo: " + cuenta2.getSaldo()); //saldo en $0

        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", 20000.0);
        Vehiculo vehiculo2 = new Vehiculo("Honda", "Civic", 220);
        Vehiculo vehiculo3 = new Vehiculo("Ford", "Focus", 18000.0);


        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = vehiculo1;
        vehiculos[1] = vehiculo2;
        vehiculos[2] = vehiculo3;

        Concesionaria concesionaria = new Concesionaria("Allen Motors", vehiculos);
        concesionaria.agregarVehiculo(vehiculo1);
        concesionaria.agregarVehiculo(vehiculo2);
        concesionaria.agregarVehiculo(vehiculo3);
        System.out.println(concesionaria.buscarPorMarca("Toyota"));
        System.out.println("Valor total del stock: $" + concesionaria.valorTotalStock());





    }
}
