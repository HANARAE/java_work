package basic.casting;
/**
 * 2023.02.20-5.
 * 형변환(type casting) 예시1 UpCasting(작은쪽 -> 큰쪽)
 */


public class CastingExample1 {

	public static void main(String[] args) {
		
		/*
		 - 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
		   자바 가상머신(JVM)이 자동으로 타입을 올려서 변환해 줍니다.
		   (promotion, UpCasting이라고 한다.)
		 */
		byte b = 10;
		int i = b;
		System.out.println(i); //(byte -> int)
		
		char c = 'A';
		int j = c;
		System.out.println("A의 문자 번호: " + j); //(char -> int)
		
		int k = 500;
		double d = k;
		System.out.println(d); //(int -> double)
		
			
		
		
		
		
		
		

	}

}
