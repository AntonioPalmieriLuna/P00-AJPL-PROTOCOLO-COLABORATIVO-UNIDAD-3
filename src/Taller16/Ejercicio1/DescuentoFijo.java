package Taller16.Ejercicio1;

public class DescuentoFijo extends Descuento{
    private double valorFijo;

    public DescuentoFijo(double valorFijo){
        this.valorFijo = valorFijo;
    }

    @Override
    public double calcularDescuento(double precioOriginal){
        if ( valorFijo > precioOriginal){
            return precioOriginal;
        }
        return valorFijo;
    }
}
