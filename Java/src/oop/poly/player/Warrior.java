package oop.poly.player;


public class Warrior extends Player {

	int rage;

	Warrior(String name) {
		super(name);
		this.rage = 60;
	}
	
	
	public void rush(Player target) {
		
		/*
		 - 전사의 고유 기능인 rush 메서드를 작성한다.
		 - rush의 대상은 모든 직업이다. //매개변수 선정
		 - rush를 맞은 전사는 10의 피해, 마법사는 20의 피해, 사냥꾼은 15의 피해를 받는다.
		 - 서로 다른 데미지를 instanceof를 사용해 구분해서 적용하라.
		 - 남은 체력도 출력하기
		 - main에 객체 생성한 후 호출해서 확인하기
		 */

		System.out.printf("%s(이)가 %s에게 돌진을 시전했다\n", this.name, target.name);

		if(target instanceof Warrior) {
			target.hp -= 10;
			System.out.printf("%s(전사)가 10의 피해를 입었다.\n", target.name);
		} else if(target instanceof Mage) {
			target.hp -= 20;
			System.out.printf("%s(마법사)가 20의 피해를 입었다.\n", target.name);
		} else if(target instanceof Hunter) {
			target.hp -= 15;
			System.out.printf("%s(사냥꾼)가 15의 피해를 입었다.\n", target.name);
		}
		
		
		System.out.printf("%s의 남은 체력: %d\n", target.name, target.hp);
		System.out.println("----------------------------------------------------------");

		
		
		
	}
	
	
	
	
	
	@Override //alt + shift + s -> override/implement methods
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}
	
	
	
		
	
}
