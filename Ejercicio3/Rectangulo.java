package Ejercicio3;

class Rectangulo implements calculosFormas{
    private double base;
    private double altura;


    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(){

    }

    @Override
    public double calcularArea(){
        return base * altura;
    }


    @Override
    public double calcularPerimetro(){
        return 2 * (base + altura);
    }
}