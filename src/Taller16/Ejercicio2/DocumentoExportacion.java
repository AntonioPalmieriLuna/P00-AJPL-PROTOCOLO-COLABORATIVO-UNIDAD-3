package Taller16.Ejercicio2;

public class DocumentoExportacion {
    public String procesarExportacion(Documento documento, String contenido, String titulo){
        return documento.exportar(contenido, titulo);
    }
}
