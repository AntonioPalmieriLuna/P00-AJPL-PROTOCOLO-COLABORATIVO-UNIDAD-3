package Taller17.Ejercicio1;

public class InstanciaFigura {
    void main(){
        Figura circulo= new Circulo(5);
        circulo.calcularArea();

        Figura rectangulo= new Rectangulo(2, 3);
        rectangulo.calcularArea();
    }
}
