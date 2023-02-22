package basic.begin;

import java.util.Scanner;
/**
 * 2023.02.21-1.
 * 섭씨 -> 화씨 변환
 */
public class CeltoFahr {

	public static void main(String[] args) {
		

		/*
		 사용자에게 섭씨온도를 입력받아서
		 화씨온도로 변환하여 출력하는 로직을 작성하세요.
		 변환공식은 저도 몰라요. 여러분들이 찾아서 적용해 주셔야 합니다.
		 화씨 온도를 소수점 첫째 자리까지 표현해 주시기 바랍니다.
		 # ㄹ 한자 7 -> (℃),   ㄹ 한자 다음장 4 -> (℉)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 섭씨온도를 입력하세요: ");
		
//		int cel = sc.nextInt()
//		double fahr = cel * 9.0 / 5 + 32;   -> int * 9.0 = doule
//		double fahr = (double)cel * 9 / 5 + 32;
		
		double cel = sc.nextDouble();
		
		double fahr = (cel * 9/5) + 32;
		
		System.out.println("------------------------------------------");
		System.out.printf("화씨온도: %.1f℉\n", ((cel * 9/5) + 32));
		System.out.println("------------------------------------------");
		System.out.printf("입력한 섭씨: %.1f℃\n", cel);
		System.out.printf("변환한 화씨: %.1f℉\n", fahr);
		System.out.println("------------------------------------------");
				
		sc.close();
		
	}

}
