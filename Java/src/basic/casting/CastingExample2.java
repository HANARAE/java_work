package basic.casting;
/**
 * 2023.02.20-6.
 * 형변환(type casting) 예시2 DownCasting(큰쪽 -> 작은쪽)
 */

public class CastingExample2 {

	public static void main(String[] args) {

		/*
		 - 크기가 큰 데이터 타입의 값을 작은 데이터 타입으로 변환하려면
		   반드시 형 변환(캐스팅) 연산자: (type)를 사용하여 명시적으로 형 변환을 진행해 주셔야 합니다.
		   (DownCasting이라고 한다.)
		   
		 - 명시적으로 형 변환을 해야 하는 이유는, DownCasting의 경우 저장 공간이 줄어들어 
		   데이터 손실의 가능성이 항상 존재하기 때문입니다. (overflow, underflow의 가능성)
		 */
			
		int i = 72;
		char c = (char) i; //(int -> char) : 인수 앞에 (char)를 써서 강제로 downcasting
		System.out.println("72의 문자값: " + c);
		
		double d = 4.98765;
		int j = (int) d; //(double -> int)
		System.out.println(j); //0.98765 손실
		
		int k = 1000;
		byte b = (byte) k;
		System.out.println(b); //값이 박살남
			
		
		

	}

}
