package etc.api.lang.wrapper;

public class WrapperExample {

	public static void main(String[] args) {
		
		int a = 100;
		boolean b = false;
		char c = 'A';
		double d = 3.14;
		
		//boxing: 기본 데이터타입을 객체타입으로 변환하는 과정 (권장 x)
		Integer v1 = new Integer(100);
		Boolean v2 = new Boolean(b);
		Character v3 = new Character(c);
		Double v4 = new Double(d);
		
		
	
		//autoboxing: 기본 타입을 자동으로 객체형으로 변환
		Integer x1 = a;
		Boolean x2 = b;
		Character x3 = c;
		Double x4 = d;
		
		//autounboxing: 객체 포장을 기본형으로 해제
		int i = x1;
		boolean j = x2;
		char k = x3;
		double l = x4;
		
		//AutoBoxing 이후 wrapper클래스는 문자열을 기본형으로 변환하는데 많이 쓰인다. ex) 문자열 내 정수를 int로 뽑아낼 때
		//해당 타입으로 변환할 수 없는 문자열을 시도했을 경우 NumberFormatException 예외가 발생한다. ex)String "3.14" -> int 변환
		String s2 = "3";
		System.out.println(Integer.parseInt(s2));
		
		
		
	}
	
}
