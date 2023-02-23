package basic.loop;

import java.util.Scanner;

/**
 * 2023.02.23-5.
 * For 반복문
 */
public class ForExample {

	public static void main(String[] args) {
		
		/*
		int i = 1;
		int total = 0;
		while(i <= 10) {
			total += i;
			i++;
		}
		*/
		
		int total = 0;
		
		for(int i=1; i<=10; i++) { //범위가 지정된 반복문에는 for문을 많이 쓴다.
			total += i;
		}
		
		
		//1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를 가로로 출력하기
		
		for(int i=1; i<=200; i++) {
			if(i % 6 == 0 && i % 12 != 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		//1~60000까지 정수 중 177의 배수의 개수
		int sum = 0;
		for(int i=1; i<=60000; i++) {
			if(i % 177 == 0) {
				sum++;
			}
		}

		System.out.print("177의 배수의 개수: " + sum + "개");
		System.out.println();
		
		//입력받은 정수까지의 팩토리얼 값을 구하세요.
		//팩토리얼) 5! = 5 * 4 * 3 * 2 * 1
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		int total2 = 1;
		
		System.out.print(num + "! -> ");
		
		for(int i = num; i >= 1; i--) {
			total2 *= i;
			if(i>1) {
			System.out.print(i + " X ");
			} else {
				System.out.print(i);
			}
		}
		
//		for(int i = 1; i <= num; i++) {
//			total2 *= i;
//		}
		
		System.out.print(" = " + total2);
		
		
		
		sc.close();
		
	}

}
