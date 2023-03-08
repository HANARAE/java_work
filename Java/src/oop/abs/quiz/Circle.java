package oop.abs.quiz;

public class Circle extends Shape {

	public Circle(String name, double r) {
		super(name, r);
	}

	
	
	@Override
	public void getArea() {
		System.out.printf("넓이: %.2f", r*r*Math.PI);
	}

}
