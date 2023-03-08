package oop.abs.good;

//3.
public abstract class HeadStore {

	/*
	 # 추상 클래스, 추상 메서드
	 
	 1. 추상 클래스의 메서드에 abstract를 붙이면 해당 메서드는 실체가 없는 추상 메서드가 되며,
	    이 메서드는 상속을 통해 자식클래스에서 무조건 오버라이딩을 하도록 강요된다.
	    
	 2. 추상메서드는 실체가 존재하지 않는 틀 역할을 하기 때문에 메서드의 {}(바디)부분이 없고 ;으로 메서드 선언을 마감한다.
	 
	 3. 일반클래스에서는 추상메서드를 선언할 수 없다. 추상메서드가 하나라도 존재하는 경우에 해당 클래스를 추상클래스로 선언해야 한다.
	 
	 4. 추상클래스에 추상메서드만 선언하는게 아니라 일반 멤버변수나 메서드도 선언이 가능하다.
	 */
	
	
	
	public HeadStore() {
		System.out.println("HeadStore의 생성자");
	}
	
	
	public abstract void orderApple(); //2.
	public abstract void orderBanana();
	public abstract void orderGrape();
	
	public void orderPapaya() {
		System.out.println("파파야쥬스는 6000원 입니다.");
	}
	
	
	
	
	
}
