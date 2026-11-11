package Taller14.Ejercicio1;

public abstract class Figura {
    public abstract double calcularArea();

    public void mostrarArea(){
        System.out.println("El área de la figura es: "+calcularArea());
    }
}
