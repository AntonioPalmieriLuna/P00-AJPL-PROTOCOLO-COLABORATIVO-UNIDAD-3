package Taller15.Ejercicio1;

public class Libro {
    private String titulo;
    private String autor;
    private int fechaPublicacion;

    public Libro(String titulo, String autor, int fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }
}
