package Ejercicio3;

class GestorReportes {

    private GeneradorReporte generadorReporte;


    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }


    public String generar() {
        return generadorReporte.generarReporte();
    }
}
