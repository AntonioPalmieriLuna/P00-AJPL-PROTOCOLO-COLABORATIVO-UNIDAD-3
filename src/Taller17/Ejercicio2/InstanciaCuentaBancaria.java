package Taller17.Ejercicio2;

public class InstanciaCuentaBancaria {
    void main(){
        CuentaBancaria cuenta = new CuentaBancaria(2000);
        CuentaBancaria cuentaAhorrosBase = new CuentaAhorros(10000,0.20);
        CuentaAhorros cuentaAhorros = new CuentaAhorros(10000,20);

        cuenta.depositar(500);
        cuenta.retirar(100);


        cuentaAhorrosBase.depositar(3000);
        cuentaAhorrosBase.retirar(50000);
        cuentaAhorrosBase.nombre();

        cuentaAhorros.calcularInteres();


        cuenta.nombre();
        cuentaAhorros.nombre();
        cuentaAhorrosBase.nombre();
    }
}
