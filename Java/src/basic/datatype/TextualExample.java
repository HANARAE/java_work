package basic.datatype;
/**
 * 2023.02.20-4.
 * 문자형 예시
 */

public class TextualExample {

	public static void main(String[] args) {
		
		//char는 단일문자(한글자)만 가능. -> char는 2byte까지만 허용
		//""가 아니라 ''로 찍어야 함. ""는 String에서만!
		
//		char c1 = "A";  (x)
		char c1 = 'A';
		System.out.println(c1);
		
		char c2 = 65; //아스키코드상 65 = A
		char c3 = 44032; //유니코드상 44032 = 가
		System.out.println(c2);
		System.out.println(c3);
		
		
		/*
		 # 문자열을 저장할 수 있는 데이터 타입 String
		 - 저장하고 싶은 문자열을 쌍따옴표("")에 담아 대입합니다.
		 - String은 기본 데이터 타입은 아니지만 자주 쓰이기 때문에 기본 데이터 타입처럼 사용합니다.
		   (사실 String은 객체 타입)
		 */
		
		String s1 = "my dream ";
		String s2 = "is a programmer";
		System.out.println(s1);
		System.out.println(s2);
		
		//JAVA에서는 문자열의 덧셈 연산을 지원합니다.(ONLY 덧셈)
		//연산 결과로는 문자열을 연결해서 결합한 결과가 도출됩니다.
		System.out.println(s1 + s2);

		//문자열과 다른 데이터 타입 간의 연산
		//결과는 무조건 문자열의 덧셈 연산과 같습니다. -> String + int = String
		System.out.println("---------------------------------------");
		
		System.out.println(100 + 100);
		System.out.println("100" + "100");
		System.out.println("100" + 100);
		System.out.println(3.14 + "hi");
		
		int month = 10;
		int day = 13;
		
		//내 생일은 10월 13일 입니다.
		System.out.println("내 생일은 " + month + "월 " + day + "일 입니다.");
		
				
		
	}

}
