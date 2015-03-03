package edu.upc.eetac.dsa.igonzalez.Ejercicio2;

public abstract class AbstractShape implements Shape {
    private String type;

    public AbstractShape(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "I'm a " + type;
    }

	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
}
