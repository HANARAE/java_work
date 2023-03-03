package oop.constructor;

public class BreadMain {
	

	public static void main(String[] args) {
		
		
		Bread choco = new Bread();
		choco.name = "초코케이크";
		choco.price = 1500;
		choco.ingredient = "초콜렛";
		choco.info();
		
		System.out.println("------------------------------------");
		
		Bread pizza = new Bread("피자빵", "페페로니, 모짜렐라치즈", 2500);
		pizza.info();
		
		

	}

}
