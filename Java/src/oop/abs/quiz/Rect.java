package oop.abs.quiz;

public class Rect extends Shape {

	public Rect(String name, double r) {
		super(name, r);
	}

	
	
	@Override
	public void getArea() {
		System.out.printf("넓이: %.0f", r*r);
	}
	
	
}
