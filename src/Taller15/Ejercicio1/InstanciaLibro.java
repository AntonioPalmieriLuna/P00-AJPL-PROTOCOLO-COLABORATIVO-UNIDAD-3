package Taller15.Ejercicio1;

public class InstanciaLibro {
    void main(){
        Libro libro1=new Libro("El libro de la vida","Antonio Palmieri",2026);

        GeneracionFactura factura=new GeneracionFactura();
        factura.generarFactura(libro1);

        GeneracionReportes reporte=new GeneracionReportes();
        reporte.generarReportes(libro1);

        Persistencia persistencia=new Persistencia();
        persistencia.guardarFactura(libro1);
    }
}
