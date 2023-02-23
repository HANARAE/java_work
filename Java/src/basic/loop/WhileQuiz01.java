package basic.loop;

import java.util.Scanner;

/**
 * 2023.02.23-1.
 * while 퀴즈
 */
public class WhileQuiz01 {

	public static void main(String[] args) {

		/*
		 # 사용자에게 구구단 단수를 입력받아서
		 해당 단수의 구구단을 출력해 보세요.
		 ex)
		 
		 구구단을 입력하세요: 4
		 *** 구구단 4 단 ***
		 4 X 1 = 4
		 4 X 2 = 8
		 .
		 .
		 .
		 4 X 9 = 36
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단을 입력하세요:  ");
		
		int num = sc.nextInt();
		int i = 1;
		
		if(num <= 9 && num > 0) {
			System.out.printf("*** 구구단 %d단 ***\n", num);			
		}
		
		
		while(i <= 9) {
			if(num > 9 || num <= 0) {
				System.out.println("1~9까지만 입력하세요.");
				break;
			} else {
				System.out.printf("%d X %d = %d\n", num, i, (i*num));
			}
			i++;
		}
		
		
		
		
		
		sc.close();
	}

}
