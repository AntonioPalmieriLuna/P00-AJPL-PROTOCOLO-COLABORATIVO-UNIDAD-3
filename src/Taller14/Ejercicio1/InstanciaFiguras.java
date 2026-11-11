package Taller14.Ejercicio1;

public class InstanciaFiguras {

    void main(){
        Circulo circulo = new Circulo(5);
        circulo.mostrarArea();

        // no se modifica el metodo mostrarArea(), pero si el calcularArea()
        // se llama a calcularArea() desde mostrarArea()
        // pero con diferentes implementaciones de calcularArea()

        Rectangulo rectangulo = new Rectangulo(4, 6);
        rectangulo.mostrarArea();
    }
}
