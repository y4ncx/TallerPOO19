package Ejercicio3;


public class Main {
    public static void main(String[] args) {

        GeneradorReporte reportePDF = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(reportePDF);

        System.out.println(gestorPDF.generar());

        GeneradorReporte reporteExcel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(reporteExcel);

        System.out.println(gestorExcel.generar());
    }
}
