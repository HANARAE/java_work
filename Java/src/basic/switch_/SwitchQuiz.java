package basic.switch_;

import java.util.Scanner;

/**
 * 2023.02.22-3.
 * SWITCH QUIZ 
 */

public class SwitchQuiz {

	public static void main(String[] args) {
		
		/*
		 - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
		   다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
		   연산 결과를 출력해 주시면 됩니다. (switch문 사용)
		   연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고 결과를 말해 주세요.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		System.out.print("연산자를 입력해 주세요. [+, -, *, /]: ");
		String oper = sc.next();
		System.out.print("정수2: ");
		int num2 = sc.nextInt();
		
		int result = 0;
		boolean flag = false;
		
		switch(oper) {
		
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if(num2 == 0 ) {
				System.out.println("연산할 수 없는 입력값입니다.");
				flag = true;
				break;
			}
			result = num1 / num2;
			break;
		default:
			System.out.println("사칙연산 기호를 정확하게 입력하세요.");
			System.out.println("[+, -, *, /");	
			flag = true;

		}
		
		if(!flag) {
			System.out.printf("%d %s %d = %d\n", num1, oper, num2, result);
		}
		
		
		/*
		switch(oper) {
		case "+":
			System.out.println(num1 + oper + num2 + "=" + (num1 + num2));
			break;
		case "-":
			System.out.println(num1 + oper + num2 + "=" + (num1 - num2));
			break;
		case "*":
			System.out.println(num1 + oper + num2 + "=" + (num1 * num2));
			break;
		case "/":
			if(num2 == 0 ) {
				System.out.println("연산할 수 없는 입력값입니다.");
				break;
			}
			System.out.println(num1 + oper + num2 + "=" + (num1 / num2));
			break;
		default:
			System.out.println("사칙연산 기호를 정확하게 입력하세요.");
			System.out.println("[+, -, *, /");			
		}
		*/
		
		sc.close();
		
	}

}
