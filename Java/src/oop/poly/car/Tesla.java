package oop.poly.car;

public class Tesla extends Car {

	@Override
	void run() {
		System.out.println("테슬라 부릉부릉~!");
	}
	
	
	void enterMembership() {
		System.out.println("테슬라 멤버십에 가입");
	}
	

}
