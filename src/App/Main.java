package App;

public class Main {
    public static void main(String[] args) {
        CentroLogistico centroLogistico = new CentroLogistico();

        // Crear paquetes
        Modelo.PaqueteEstandar paquete1 = new Modelo.PaqueteEstandar("TRACK001", 10, "Ciudad A", 5);
        Modelo.PaqueteEstandar paquete2 = new Modelo.PaqueteEstandar("TRACK002", 20, "Ciudad B", 7);
        Modelo.PaqueteFragil paquete3 = new Modelo.PaqueteFragil("TRACK003", 5, "Ciudad C", "Alto");
        Modelo.PaqueteFragil paquete4 = new Modelo.PaqueteFragil("TRACK004", 8, "Ciudad D", "Medio");

        // Registrar paquetes en el centro logístico
        centroLogistico.registrarPaquete(paquete1);
        centroLogistico.registrarPaquete(paquete2);
        centroLogistico.registrarPaquete(paquete3);
        centroLogistico.registrarPaquete(paquete4);

      // Sobrecarga de actualizarDestino
        paquete1.actualizarDestino("Ciudad E");
        paquete3.actualizarDestino("Ciudad F");

        // Mostrar reporte de envíos
        centroLogistico.mostrarReporteEnvios();

        // Calcular recaudación total
        double recaudacionTotal = centroLogistico.calcularRecaudacionTotal();
        System.out.println("Recaudación total: " + recaudacionTotal);
    }
}
