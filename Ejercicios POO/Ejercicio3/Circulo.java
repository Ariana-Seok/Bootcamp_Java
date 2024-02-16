package Ejercicio3;

class Circulo implements calculosFormas{
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public Circulo(){

    }

    @Override
    public double calcularArea(){
        return PI * radio * radio;
    }


    @Override
    public double calcularPerimetro(){
        return 2 * PI * radio;
    }
}
