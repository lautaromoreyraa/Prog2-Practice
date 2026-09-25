package CLASE_5;

public class Concesionaria {
    private String nombre;
    private Vehiculo[] vehiculos;

    public Concesionaria(String nombre, Vehiculo[] vehiculos) {
        this.nombre = nombre;
        this.vehiculos = vehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    Vehiculo agregarVehiculo(Vehiculo vehiculo) {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] == null) {
                vehiculos[i] = vehiculo;
                return vehiculo;
            }
        }
        return null;
    }

    String buscarPorMarca (String marca) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo != null && vehiculo.getMarca().equalsIgnoreCase(marca)) {
                return "Vehículo encontrado: " + vehiculo.getMarca() + " " + vehiculo.getModelo() + ", Precio: $" + vehiculo.getPrecio();
            }
        }
        return "No se encontró ningún vehículo con la marca: " + marca;
    }

    double valorTotalStock() {
        double total = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo != null) {
                total += vehiculo.getPrecio();
            }
        }
        return total;
    }
}
