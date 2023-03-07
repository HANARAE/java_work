package oop.poly.casting;

public class Child extends Parent {

	public int n2; //부모가 준게 아닌 자식 고유의 멤버 변수
	
	@Override
	public void method1() {
		System.out.println("재정의(override)한 1번 메서드 호출");
	}
	
	
	public void method3() {
		System.out.println("자식 고유의 3번 메서드 호출");
	}
	
	
	
}
