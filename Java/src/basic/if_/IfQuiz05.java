package basic.if_;

import java.util.Scanner;

/**
 * 2023.02.21-9.
 * IF QUIZ 05
 */
public class IfQuiz05 {

	public static void main(String[] args) {
		
		/*
		 # 국어, 영어, 수학 점수를 각각 입력받아서 평균을 구해 보세요.
		   (평균은 소수점 첫째 자리까지 출력)
		   평균이 90점이 넘는다면, 다시 한 번 조건을 검사해서
		   95 ~ 100 -> A+
		   94 ~ 90 -> A0
		   80점대는 B, 70점대는 C, 60점대는 D, 나머지는 모두 F 처리합니다. (100점 만점)
		   
		   ex)
		   평균점수: 95.5
		   당신의 학점은 A+ 입니다.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요: ");
		int sub1 = sc.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		int sub2 = sc.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		int sub3 = sc.nextInt();
		
		double average = (sub1 + sub2 + sub3) / 3.0;
		String grade;
		
		if(average >= 90.0) {
			if(average >= 95.0) {
				grade = "A+";
			} else {
				grade = "A0";
			}
		} else if(average >= 80) {
			grade = "B";
		} else if(average >= 70) {
			grade = "C";
		} else if(average >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.printf("평균 점수: %.1f\n", average);
		System.out.println("당신의 학점은 " + grade + "입니다.");
		
		
		sc.close();
		
	}

}
