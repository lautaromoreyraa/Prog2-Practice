package CLASE_6;

import CLASE_5.Vehiculo;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, double precio, int cantidadPuertas) {
        super(marca, modelo, precio);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Auto: " + super.toString() + ", cantidad de puertas: " + cantidadPuertas;
    }
}
