package basic.if_;

import java.util.Scanner;

/**
 * 2023.02.21-3.
 * IF 조건문 QUIZ 01 
 */
public class IfQuiz01 {

	public static void main(String[] args) {
		
		/*
		 키와 나이를 입력받아서 사용자가 놀이기구에 탑승할 수 있는지의 여부를 판단하라.
		 키 140cm 이상, 나이가 8세 이상인 사용자만 탑승이 가능하다고 가정하고,
		 판단할 수 있는 로직을 작성해 보세요.
		 하나의 조건이라도 만족하지 못한다면 탑승이 불가능합니다.
		 
		 놀이기구 탑승 여부와 관계없이 "오늘 하루 즐거운 시간 되세요!"
		 를 출력하세요.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요: ");
		int height = sc.nextInt();
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.printf("키: %d, 나이: %d\n", height, age);
		System.out.println("--------------------------------------");
		
		
		if (height >= 140 && age >= 8) {
			System.out.println("키: 140cm 이상, 나이 8세 이상입니다.");
			System.out.println("탑승 가능합니다.");
		} else {
			System.out.println("탑승 조건이 맞지 않습니다.");
			System.out.println("탑승이 불가합니다.");
		}
		
		System.out.println("오늘 하루 즐거운 시간 되세요!");
		
		
		
		
		sc.close();
		
	
		
	}

}
