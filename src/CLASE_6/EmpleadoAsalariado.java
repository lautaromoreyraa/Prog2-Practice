package CLASE_6;

import CLASE_5.Empleado;

public class EmpleadoAsalariado extends Empleado {
    double sueldoBasico;
    double bono;

    public EmpleadoAsalariado(String nombre, int legajo) {
        super(nombre, legajo);
    }

    public EmpleadoAsalariado(String nombre, int legajo, double sueldoBasico, double bono) {
        super(nombre, legajo);
        this.sueldoBasico = sueldoBasico;
        this.bono = bono;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        double total = sueldoBasico + bono;
        return super.calcularSueldo() + total;
    }
}
