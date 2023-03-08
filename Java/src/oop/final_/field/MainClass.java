package oop.final_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Person kim = new Person("김철수");
//		kim.nation = "미국"; (x)
//		kim.name = "김마이클"; (x)
		kim.age = 30;

		Person park = new Person("박순자");
//		park.nation = "영국"; (x)
//		park.name = "박런던"; (x)
		
		
		System.out.println(kim.name); //값의 변경을 막는거지 사용을 막는 것은 아니다
		
		
		
	}

}
