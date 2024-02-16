package Ejercicio1;
import java.util.Scanner;

public class Operacion{

    // Atributos
    private Double numero1;
    private Double numero2;

    // Constructor
    public Operacion(Double numero1, Double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion(){
    };


    // Getters

    public Double getNumero1(){
        return this.numero1;
    }

    public Double getNumero2(){
        return this.numero2;
    }

    // Setters

    public void setNumero1(double numero1){
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2){
        this.numero2 = numero2;
    }

    // Metodos

    public void crearOperacion(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor para el primer numero:");
        this.numero1 = scanner.nextDouble();

        System.out.println("Ingrese un valor para elsegundo numero:");
        this.numero2 = scanner.nextDouble();

        scanner.close();
    }

    public double sumar(){
        return numero1 + numero2;
    }

    public double restar(){
        return numero1 - numero2;
    }

    public double multiplicar(){
        if(numero1 == 0 || numero2 == 0){
            System.out.println("Error, se ha multiplicado por 0");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }

    public double dividir(){
        if(numero2 == 0){
            System.out.println("Error, se ha divido por 0");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }

    
}