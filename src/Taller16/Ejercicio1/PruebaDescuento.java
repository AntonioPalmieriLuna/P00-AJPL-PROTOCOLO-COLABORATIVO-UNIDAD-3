package Taller16.Ejercicio1;

public class PruebaDescuento {
    void main(){
        CalculadoraDescuento calculadora = new CalculadoraDescuento();
        double precio=10000;

        Descuento porcentaje= new DescuentoPorcentaje(20);

        Descuento fijo= new DescuentoFijo(3000);

        System.out.println("Con 20% de descuento: "+calculadora.calcularPrecioFinal(porcentaje, precio));
        System.out.println("Con descuento fijo de 3000: "+calculadora.calcularPrecioFinal(fijo, precio));
    }
}
