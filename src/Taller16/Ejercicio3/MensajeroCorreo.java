package Taller16.Ejercicio3;

public class MensajeroCorreo extends Mensajero{

    @Override
    public void enviarMensaje(String mensaje){
        System.out.println("Enviendo mensaje por correo electronico --> "+ mensaje);
    }

}
