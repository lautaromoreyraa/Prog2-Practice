package CLASE_6;

public abstract class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public Figura(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    double calcularArea (){
        return 0.0;
    }

    public static double calcularAreaTotal (Figura[] figuras) {
        double areaTotal = 0.0;

        for (Figura figura : figuras) {
            if (figura == null) {
                break;
            }
            areaTotal = figura.calcularArea();
            System.out.println("Área del: " + figura.nombre + areaTotal);
        }
        return areaTotal;
    }
}


