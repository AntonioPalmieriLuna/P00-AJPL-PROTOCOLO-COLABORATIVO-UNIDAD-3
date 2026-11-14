package Taller17.Ejercicio2;

public class InstanciaCuentaBancaria {
    void main(){
        CuentaBancaria cuenta = new CuentaBancaria(2000);
        CuentaBancaria cuentaAhorrosBase = new CuentaAhorros(10000,0.20);
        CuentaAhorros cuentaAhorros = new CuentaAhorros(10000,20);

        //Cuenta
        cuenta.depositar(500);
        cuenta.retirar(100);

        System.out.println("\nCuenta ahorros base");
        cuentaAhorrosBase.depositar(3000);
        cuentaAhorrosBase.retirar(50000);


        System.out.println("\nCuenta ahorros");
        cuentaAhorros.calcularInteres();

        System.out.println("\nNombres de CUENTAS");
        cuenta.nombre();
        cuentaAhorros.nombre();
        cuentaAhorrosBase.nombre();
    }
}
