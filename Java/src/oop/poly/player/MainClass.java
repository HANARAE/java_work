package oop.poly.player;

public class MainClass {

	public static void main(String[] args) {
				
		
		Warrior p1 = new Warrior("전사1");
		Mage p2 = new Mage("마법사1");
		Hunter p3 = new Hunter("사냥꾼1");
		Warrior p4 = new Warrior("전사2");
		
		
		p1.rush(p2);
		p1.rush(p3);
		p1.rush(p4);
		
		
		
		

	}

}
