package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        double resultadoSuma = operacion.sumar();
        double resultadoResta = operacion.restar();
        double resultadoMultiplicacion = operacion.multiplicar();
        double resultadoDivision = operacion.dividir();

        System.out.println("El resultado de la suma de " + operacion.getNumero1() + " y " + operacion.getNumero2() + " es: " + resultadoSuma);
        System.out.println("El resultado de la resta de " + operacion.getNumero1() + " y " + operacion.getNumero2() + " es: " + resultadoResta);
        System.out.println("El resultado de la multiplicacion de " + operacion.getNumero1() + " y " + operacion.getNumero2() + " es: " + resultadoMultiplicacion);
        System.out.println("El resultado de la division de " + operacion.getNumero1() + " y " + operacion.getNumero2() + " es: " + resultadoDivision);
    }
}
