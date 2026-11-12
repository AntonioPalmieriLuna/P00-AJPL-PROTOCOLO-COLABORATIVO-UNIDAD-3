package Taller15.Ejercicio2;

public class InstanciaProducto {
    void main() {

        Producto producto = new Producto("Jabón Oro", 5000, 5);
        GeneracionEtiqueta generacionEtiqueta = new GeneracionEtiqueta();
        GeneracionPrecios generacionPrecios = new GeneracionPrecios();

        generacionEtiqueta.generarEtiqueta(producto);
        generacionPrecios.calcularPrecio(producto);

    }
}
