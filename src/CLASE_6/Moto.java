package CLASE_6;

import CLASE_5.Vehiculo;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto: " + super.toString() + ", cilindrada: " + cilindrada + "cc";
    }
}
