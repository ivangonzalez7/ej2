package edu.upc.eetac.dsa.igonzalez.Ejercicio2;

public class Rectangle extends AbstractShape {
    private int altura;
    private int anchura;

    public Rectangle(int altura, int anchura) {
        super("rectangle");
        this.altura = altura;
        this.anchura = anchura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    @Override
    public double area() {
        return altura * anchura;
    }
}