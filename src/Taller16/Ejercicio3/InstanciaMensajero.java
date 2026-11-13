package Taller16.Ejercicio3;

public class InstanciaMensajero {
    void main(){
        ManejoMensajero gestorMensaje = new ManejoMensajero();
        Mensajero mensajeSMS = new MensajeroSMS();
        Mensajero mensajeCorreo = new MensajeroCorreo();

        gestorMensaje.gestionarMensaje(mensajeSMS,"Mensaje de prueba SMS");
        gestorMensaje.gestionarMensaje(mensajeCorreo,"Mensaje de prueba CORREO");
    }
}
