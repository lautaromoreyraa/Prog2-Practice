package CLASE_6;

import CLASE_5.Empleado;

public class EmpleadoPorHoras extends Empleado {
    int horasTrabajadas;
    double valorHora;

    public EmpleadoPorHoras(String nombre, int legajo, int horasTrabajadas, double valorHora) {
        super(nombre, legajo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        double total = horasTrabajadas * valorHora;
        return super.calcularSueldo() + total;
    }
}
