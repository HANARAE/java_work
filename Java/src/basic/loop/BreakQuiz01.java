package basic.loop;

import java.util.Scanner;

/**
 * 2023.02.24-3.
 * 탈출문 QUIZ 01
 */
public class BreakQuiz01 {

	public static void main(String[] args) {

		/*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		    지속적으로 문제를 출제한 후 정답을 입력받으세요.
		    사용자가 0을 입력하면 반복문을 탈출시키세요.
		    
		  2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 연산 퀴즈 ***");
		System.out.println("# 종료하시려면 0을 입력해 주세요.\n");
		
		int count = 0;
		int wcount = 0;
		
		while(true) {
			int num1 = (int) ((Math.random()*100)+1);
			int num2 = (int) ((Math.random()*100)+1);
			int i = (int) (Math.random()*2);
			int correct;
			String oper;
			
//			if(i==1) {
//				correct = num1 + num2;
//				oper = "+";
//			} else {
//				correct = num1 - num2;
//				oper = "-";
//			}
//			
//			System.out.println(num1 + " "+ oper + " "+ num2 + " = ???");
//			System.out.print("> ");
//			int answer = sc.nextInt();
//			if(answer == correct) {
//				System.out.println("정답입니다!");
//				count++;
//			} else if(answer==0) {
//				System.out.println("종료합니다.");
//				break;
//			} else {
//				System.out.println("오답입니다.");
//				wcount++;
//			}
			
			if(i==0) {
				System.out.printf("%d + %d = ???\n", num1, num2);
				correct = num1 + num2;
			} else {
				System.out.printf("%d - %d = ???\n", num1, num2);
				correct = num1 - num2;
			}
			
			System.out.print("> ");
			int answer = sc.nextInt();
			
			if(answer == correct) {
				System.out.println("정답입니다!\n");
				count++;
			} else if(answer == 0) {
				System.out.println("\n종료합니다.");
				break;
			} else {
				System.out.println("틀렸습니다~\n");
				wcount++;
			}
			
		}
		
		System.out.println("---------------------------");
		System.out.printf("정답 횟수: %d회\n", count);
		System.out.printf("오답 횟수: %d회", wcount);
		
		
		

		sc.close();
		
	}

}
