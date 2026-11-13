package Taller16.Ejercicio2;

public class DocumentoPDF extends Documento{

    @Override
    public String exportar(String contenido, String titulo){
        return "EXPORTANDO PDF --> " + titulo+
                "\n CONTENIDO --> "+contenido+"\n";
    }

}
