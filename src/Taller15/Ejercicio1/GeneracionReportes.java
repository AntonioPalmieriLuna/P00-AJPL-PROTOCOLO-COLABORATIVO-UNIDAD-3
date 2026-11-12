package Taller15.Ejercicio1;

public class GeneracionReportes {

    public void generarReportes(Libro libro) {
        System.out.println("\n"+"Autor: "+libro.getTitulo()+"\n"+
                "Titulo: "+libro.getAutor()+"\n"+
                "Fecha de publicación: "+libro.getFechaPublicacion()+"\n");
    }

}
