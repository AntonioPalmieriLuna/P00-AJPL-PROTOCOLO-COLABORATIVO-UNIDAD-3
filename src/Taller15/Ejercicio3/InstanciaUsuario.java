package Taller15.Ejercicio3;

public class InstanciaUsuario {
    void main(){
        Usuario usuario = new Usuario("usuario","12345");
        Usuario usuario2 = new Usuario("atacante","12345");

        ServicioValidacion validacion = new ServicioValidacion();
        ServicioAutenticacion autenticacion = new ServicioAutenticacion();

        if (validacion.validar(usuario)){
            if (autenticacion.autenticar(usuario)){
                System.out.println("ACCESO EXITOSO PARA EL USUARIO");
            }else{
                System.out.println("ACCESO DENEGADO PARA EL USUARIO");
            }
        }
        else{
            System.out.println("Usuario o clave invalidos");
        }

        // usuario 2

        if (validacion.validar(usuario2)){
            if (autenticacion.autenticar(usuario2)){
                System.out.println("ACCESO EXITOSO PARA EL USUARIO");
            }else{
                System.out.println("ACCESO DENEGADO PARA EL USUARIO");
            }
        }
        else{
            System.out.println("Usuario o clave invalidos");
        }
    }
}
