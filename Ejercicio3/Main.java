package Ejercicio3;

public class Main{
    public static void main(String[] args) {
        Circulo circulo = new Circulo(4);
        System.out.println("Área del circulo: " + circulo.calcularArea());
        System.out.println("Perimetro del circulo: " + circulo.calcularPerimetro());

        Rectangulo rectangulo = new Rectangulo(4, 3);
        System.out.println("Área del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro());
    }
}

