package Ejemplo1;

public class ProcesadorPago {
    private MetodoPago metodoPago;
    public ProcesadorPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
    public void realizarPago(double monto) {
        metodoPago.procesarPago(monto);
    }
}
