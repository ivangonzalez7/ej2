package edu.upc.eetac.dsa.igonzalez.Ejercicio2;

public class Circle extends AbstractShape {
    private double radio;

    public Circle(double radio) {
        super("circle");
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
        
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio,2);
    }
}

