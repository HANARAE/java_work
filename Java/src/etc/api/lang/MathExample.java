package etc.api.lang;

public class MathExample {

	public static void main(String[] args) {
		
		//올림
		int i = (int) Math.ceil(1.1);
		System.out.println(i);
		
		//내림
		int d = (int) Math.floor(1.5);
		System.out.println(d);
		
		//반올림: 무조건 소수점 첫째자리에서 반올림
		double d2 = Math.round(3.14);
		System.out.println(d2);
		
		//반올림 소수점 편법
		double d3 = Math.round(3.141592*1000) * 0.001;
		System.out.println(d3);
		
		//제곱
		double d4 = Math.pow(3.0, 4.0); //(3의 4제곱)
		System.out.println(d4);
		
		//최대값
		int max = Math.max(2, 10);
		System.out.println(max);
		
		//최소값
		int min = Math.min(26, 48);
		System.out.println(min);
		
		
		
		
		
	}
	
	
	
}
