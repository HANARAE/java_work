package etc.api.lang.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Person park = new Person("박승철", 26);
		Person hong = new Person("홍길동", 40);

		//객체타입의 변수를 출력하거나 값을 얻을 때는 뒤에 자동으로 toString()이 붙어서 진행된다.
		System.out.println(park);
		System.out.println(hong.toString());
		
//		park.personInfo();
//		hong.personInfo();
		
//		System.out.println(park.equals(hong));
//		System.out.println(park==hong); //위랑 같은 말임
		
		if(hong.equals(park)) {
			System.out.println("이름이 같습니다.");
		} else {
			System.out.println("이름이 다릅니다.");
		}
		
		
		//finalize는 gc가 호출되는 순서가 보장되지 않기 때문에 사용이 권장되지 않는다.
		hong = null;
		park = null;
		System.gc(); //카비지 컬렉터 호출. (부른다고 바로 안 올 수 있다.)
		
		
		Person kim = new Person("김클론", 100);
		
		try {
			Person clonePerson = (Person) kim.clone();
			System.out.println("복사된 객체 정보: " + clonePerson);
			System.out.println("kim의 주소: " + kim.hashCode());
			System.out.println("복제된 객체 주소: " + clonePerson.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
