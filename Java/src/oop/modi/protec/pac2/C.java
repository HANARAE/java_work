package oop.modi.protec.pac2;

import oop.modi.protec.pac1.*;

public class C extends A {

//	A a1 = new A(30); //protected  (x)
//	A a2 = new A(3.14); //default  (x)
	
	
	public C() {
		/*
		 - protected 제한자는 패키지가 다른경우 두 클래스 사이에 상속관계가 있다면
		   super 키워드를 통해 참조를 허용한다.
		 */
		
		super(30);  //protected
//		super(5.17);  //default  (x)
		
		super.x = 1;  //protected
//		super.y = 2;  /default  (x)
		
		super.method1();  //protected
//		super.method2();  //default  (x)
		
	}
	
	
}
