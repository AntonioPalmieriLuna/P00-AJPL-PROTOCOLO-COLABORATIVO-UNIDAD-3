package Taller16.Ejercicio2;

public class DocumentoExcel extends Documento{

    @Override

    public String exportar(String contenido, String titulo){
        return "EXPORTANDO EXCEL --> " + titulo+
                "\n CONTENIDO --> "+contenido+"\n";
    }
}
