package Taller15.Ejercicio3;

public class ServicioValidacion {

    public boolean validar(Usuario usuario) {

        if (usuario == null || usuario.getNombre() == null || usuario.getClave() == null){
            return false;
        }
        if (usuario.getNombre().trim().isEmpty()){
            return false;
        }
        if (usuario.getClave().trim().isEmpty()){
            return false;
        }
        if (usuario.getClave().length() < 3){
            return false;
        }

        return true;
    }

}
