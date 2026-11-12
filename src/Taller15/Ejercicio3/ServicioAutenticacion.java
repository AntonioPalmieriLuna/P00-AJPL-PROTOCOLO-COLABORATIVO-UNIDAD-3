package Taller15.Ejercicio3;

public class ServicioAutenticacion {

    public boolean autenticar(Usuario usuario) {
        return usuario.getNombre().equals("usuario") && usuario.getClave().equals("12345");
    }

}
