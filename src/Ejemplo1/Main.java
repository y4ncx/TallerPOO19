package Ejemplo1;

public class Main {
    public static void main(String[] args) {
        MetodoPago tarjeta = new TarjetaCredito();
        ProcesadorPago procesador = new ProcesadorPago(tarjeta);
        procesador.realizarPago(100.00);
        MetodoPago paypal = new PayPal();
        procesador = new ProcesadorPago(paypal);
        procesador.realizarPago(200.00);
    }
}
