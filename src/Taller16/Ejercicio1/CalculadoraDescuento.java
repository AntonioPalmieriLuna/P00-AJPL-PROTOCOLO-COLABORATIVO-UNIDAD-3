package Taller16.Ejercicio1;

public class CalculadoraDescuento {

    public double obtenerDescuento(Descuento tipoDescuento, double precioOriginal){
        return tipoDescuento.calcularDescuento(precioOriginal);
    }
    public double calcularPrecioFinal(Descuento tipoDescuento, double precioOriginal){
        return precioOriginal - obtenerDescuento(tipoDescuento, precioOriginal);
    }
}
