package Taller17.Ejercicio2;

public class CuentaAhorros extends CuentaBancaria{
    private double interes;

    public CuentaAhorros(double saldo, double interes){
        super(saldo);
        this.interes = interes;
    }

    public void calcularInteres(){
        double interes = 0;
        interes+= this.saldo * (this.interes/100);
        System.out.println("El interes por el saldo --> "+saldo+" es de: "+interes);
    }

    @Override
    public void nombre(){
        System.out.println("Esta es una cuenta de ahorros");
    }
}
