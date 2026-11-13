package Taller16.Ejercicio2;

public class InstanciaDocumento {
    void main(){
        DocumentoExportacion gestor = new DocumentoExportacion();
        Documento documentoPDF = new DocumentoPDF();
        Documento documentoExcel = new DocumentoExcel();
        Documento documentoWord = new DocumentoExcel();

        System.out.println(gestor.procesarExportacion(documentoPDF, "Contenido PDF", "Titulo PDF"));
        System.out.println(gestor.procesarExportacion(documentoExcel, "Contenido Excel", "Titulo Excel"));
        System.out.println(gestor.procesarExportacion(documentoWord, "Contenido Word", "Titulo Word"));

    }
}
