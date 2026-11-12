package Taller15.Ejercicio2;

public class GeneracionPrecios {

    public void calcularPrecio(Producto producto) {

        double precioFinal = producto.getPrecio() * producto.getCantidad();
        System.out.println("Precio final: " + precioFinal);

    }
}
