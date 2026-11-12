package Taller15.Ejercicio2;

public class GeneracionEtiqueta {

    public void generarEtiqueta(Producto producto) {

        System.out.println("\n" + "Nombre: " + producto.getNombre() + "\n" +
                "Precio: " + producto.getPrecio() + "\n" +
                "Cantidad: " + producto.getCantidad() + "\n");

    }
}
