package Taller17.Ejercicio3;

public class InstanciaTransporte {
    void main(){
        Transporte transporte = new Transporte();
        Transporte bicicleta = new Bicicleta();
        Transporte coche = new Coche();

        transporte.moverse();
        bicicleta.moverse();
        coche.moverse();

    }
}
