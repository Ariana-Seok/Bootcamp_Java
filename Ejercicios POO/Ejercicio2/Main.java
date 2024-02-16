package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.cargarDatos();

        cuenta.ingresar(10000);
        cuenta.retirar(700);
        cuenta.extraccionRapida();

        cuenta.consultarSaldo();
        cuenta.consultarDatos();
    }
}
