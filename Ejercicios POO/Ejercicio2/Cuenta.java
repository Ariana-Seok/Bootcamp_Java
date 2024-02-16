package Ejercicio2;
import java.util.Scanner;

public class Cuenta {
    // Atributos
    private int numeroCuenta;
    private long DNI;
    private double saldo;

    // Constructores
    public Cuenta(){

    };

    public Cuenta(long DNI, double saldo, int numeroCuenta){
        this.DNI = DNI;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    // Getters y Setters

    public int getNumeroCuenta(){
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public long getDNI(){
        return this.DNI;
    }

    public void setDNI(long DNI){
        this.DNI = DNI;
    }

    
    // Metodos

    public void cargarDatos(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de cuenta:");
        this.numeroCuenta = scanner.nextInt();
        
        System.out.println("Ingrese el numero de DNI:");
        this.DNI = scanner.nextLong();

        System.out.println("Ingrese el saldo actual:");
        this.saldo = scanner.nextDouble();

        scanner.close();
    }

    public void ingresar(double ingreso){
        this.saldo += ingreso;
    }

    public void retirar(double retiro){
        if(retiro > this.saldo){
            this.saldo = 0;
        } else {
            this.saldo = saldo - retiro;
        }
    }

    public void extraccionRapida(){
        double extraccion = this.saldo * 0.20;
        this.saldo -= extraccion;
    }

    public void consultarSaldo(){
        System.out.println("El saldo disponible es de:" + this.saldo);
    }

    public void consultarDatos(){
        System.out.println("Numero de cuenta: " + this.numeroCuenta + "\nDNI: " +  this.DNI + "\nSaldo: " + this.saldo);
    }

}
