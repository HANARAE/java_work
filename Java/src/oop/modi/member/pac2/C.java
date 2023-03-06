package oop.modi.member.pac2;

import oop.modi.member.pac1.*;

public class C {

	public C() {
		
		A a = new A();
		a.x = 1;  //public
//		a.y = 2;  //default: 다른 패키지 (x)
//		a.z = 3;  //private  (x)
		
		a.method1();  //public
//		a.method2();  //default  (x)
//		a.method3();  //private  (x)
		
		
	}
	
	
	
}
