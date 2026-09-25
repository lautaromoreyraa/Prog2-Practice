package CLASE_5;

public class Empleado {
    private String nombre;
    private int legajo;

    Empleado[] empleados = new Empleado[4];

    Empleado (String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    double calcularSueldo() {
        return 0.0;
    }

    int calcularLegajoMenor() {
        for (Empleado empleado : empleados) {
            if (empleado != null) {
                int legajoMenor = empleado.getLegajo();
                for (int i = 1; i < empleados.length; i++) {
                    if (empleados[i] != null && empleados[i].getLegajo() < legajoMenor) {
                        legajoMenor = empleados[i].getLegajo();
                    }
                }
                return legajoMenor;
            }
        }
        return 0;
    }

    int calcularLegajoMayor() {
        for (Empleado empleado : empleados) {
            if (empleado != null) {
                int legajoMayor = empleado.getLegajo();
                for (int i = 1; i < empleados.length; i++) {
                    if (empleados[i] != null && empleados[i].getLegajo() > legajoMayor) {
                        legajoMayor = empleados[i].getLegajo();
                    }
                }
                return legajoMayor;
            }
        }
        return 0;
    }
}


