package basic.loop;

import java.util.Scanner;

/**
 * 2023.02.23-2.
 * while 퀴즈 02
 */
public class WhileQuiz02 {

	public static void main(String[] args) {
		
		//입력받은 수의 약수의 총합을 구하세요.
		//입력받은 값: 12 -> 1 2 3 4 6 12 -> 28
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i <= num) {
			if(num % i ==0) {
				sum += i;
			}
			i++;
		}
		System.out.printf("합계: %d\n", sum);
		
		
		
		sc.close();
	}

}
