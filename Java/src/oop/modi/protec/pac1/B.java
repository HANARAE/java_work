package oop.modi.protec.pac1;

public class B {

	A a1 = new A(30); //protected
	A a2 = new A(3.14); //default
	
	public B() {
		a1.x = 1; //protected
		a1.y = 2; //default
		
		a1.method1(); //protected
		a2.method2(); //default
	}
	
	
	
	
}
