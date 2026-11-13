package Taller16.Ejercicio2;

public class DocumentoWord extends Documento{

    @Override
    public String exportar(String contenido, String titulo){
        return "EXPORTANDO WORD --> " + titulo+
                "\n CONTENIDO --> "+contenido+"\n";
    }
}
