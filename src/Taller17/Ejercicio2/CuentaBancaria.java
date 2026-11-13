package Taller17.Ejercicio2;

public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double monto){
        if(monto > 0){
            this.saldo += monto;
        }
    }

    public void retirar(double monto){
        if(monto > 0 && monto <= this.saldo){
            this.saldo -= monto;
        }else{
            System.out.println("No se puede retirar esa cantidad");
        }
    }

    public void nombre(){
        System.out.println("Esta es una cuenta bancaria");
    }
}
