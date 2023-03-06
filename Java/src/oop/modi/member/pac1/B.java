package oop.modi.member.pac1;

public class B {

	public B() {

		A a = new A();
		a.x = 1; //public
		a.y = 2; //default
//		a.z = 3; //private  (x)
		
		a.method1(); //public
		a.method2(); //default
//		a.method3(); //private  (x)
		
	}
	
	
}
