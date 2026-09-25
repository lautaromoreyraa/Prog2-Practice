package CLASE_5;

public class Persona {
    private String nombre;
    private int dni;
    private int edad;

    Persona(String nombre, int dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre de la persona: '" + nombre + ", dni: " + dni + ", edad: " + edad;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 12345678, 30);
        Persona persona2 = new Persona("Maria", 87654321, 25);
        Persona persona3 = new Persona("Pedro", 11223344, 40);

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }
}
