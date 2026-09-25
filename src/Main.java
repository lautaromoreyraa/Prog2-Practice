import java.util.Scanner;

class Transporte {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos vehiculos desea ingresar?");
        int cantidadVehiculos = sc.nextInt();

        Vehiculo[] vehiculos = new Vehiculo [cantidadVehiculos];

        for (int i = 0; i < cantidadVehiculos; i++) {
            System.out.println("Ingrese el tipo de vehiculo (1. Auto o 2. Moto):");
            int tipoVehiculo = sc.nextInt();

            System.out.println("Ingrese la marca del vehiculo:");
            String marca = sc.next();

            System.out.println("Ingrese el modelo del vehiculo:");
            String modelo = sc.next();

            System.out.println("Ingrese el año del vehiculo:");
            int anio = sc.nextInt();

            System.out.println("Ingrese el precio del vehiculo:");
            double precio = sc.nextDouble();

            if (tipoVehiculo == 1) {
                System.out.println("Ingrese el impuesto por rueda del auto:");
                double impuestoPorRueda = sc.nextDouble();

                vehiculos[i] = new Auto(marca, modelo, anio, precio, impuestoPorRueda);
            } else if (tipoVehiculo == 2) {
                vehiculos[i] = new Moto(marca, modelo, anio, precio);
            } else {
                System.out.println("Tipo de vehiculo no valido. Intente nuevamente.");
                i--;
            }
        }

        for (int i = 0; i < cantidadVehiculos; i++) {
            if (vehiculos[i] != null) {
            System.out.println(vehiculos[i].toString());
            }
        }
    }
}

class Vehiculo {
    private String marca;
    private String modelo;
    private int puertas;
    private int anio;
    private double precio;
    private int cantidadRuedas;
    private double impuestoPorRueda;

    public Vehiculo(String marca, String modelo, int anio, int puertas, double precio, double impuestoPorRueda) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.puertas = puertas;
        this.precio = precio;
        this.impuestoPorRueda = impuestoPorRueda;

    }

    public Vehiculo(String marca, String modelo, int anio, int puertas, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.puertas = puertas;
        this.precio = precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setImpuestoPorRueda(double impuestoPorRueda) {
        this.impuestoPorRueda = impuestoPorRueda;
    }

    public double getImpuestoCantRuedas() {
        this.impuestoPorRueda = ((impuestoPorRueda * this.cantidadRuedas) * this.precio ) / 100;
        return impuestoPorRueda;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public double getPrecioImpuesto() {
        return this.precio + this.impuestoPorRueda;
    }

    @Override
    public String toString() {
        return  marca + " " + modelo + ", " + anio + ", " + puertas + " Puertas, U$s " + this.getPrecioImpuesto();
    }

    public String getDatosBasicos() {
        return  marca + " " + modelo + ", " + anio ;
    }
}

class Moto extends Vehiculo {

    public Moto(String marca, String modelo, int anio, double precio) {
        super(marca, modelo, anio, 0, precio, 0);
        super.setCantidadRuedas(2);
    }

    @Override
    public String toString() {
        return  super.getDatosBasicos() + ", U$s " + this.getPrecioImpuesto();
    }

}

class Auto extends Vehiculo {

    public Auto(String marca, String modelo, int anio, double precio, double impuestoPorRueda) {
        super(marca, modelo, anio, 4, precio, impuestoPorRueda);
        super.setCantidadRuedas(4);
    }

}