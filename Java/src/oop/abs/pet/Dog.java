package oop.abs.pet;

public class Dog extends Pet {
	
	public Dog(String name, String species, int age) {
		super(name, species, age);
	}

	@Override
	public void feed() {
		System.out.println("강아지는 사료를 와구와구");

	}

	@Override
	public void takeNap() {
		System.out.println("강아지는 마당에서 잠");

	}

}
