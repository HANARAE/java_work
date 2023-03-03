package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {

		/*
		 1. 주민등록번호 13자리를 입력받음
		 2. 주민번호는 -을 포함해서 받을 예정
		 3. 13자리가 아니라면 다시 입력받기
		 4. 남자인지 여자인지 구분해서 출력 
		 */


		Scanner sc = new Scanner(System.in);

		System.out.println("주민번호를 - 포함해서 입력해주세요.");
		System.out.print("> ");

/*
		while(true) {
			String num = sc.next();


			if(num.length()<14) {
				System.out.println("주민번호 13자리를 - 포함해 정확히 입력해주세요.");
				System.out.print("> ");
			} else {
				String[] numbers = num.split("-");
				char i = numbers[1].charAt(0);

				if(i == '1' || i == '3') {
					System.out.println("남자입니다.");
				} else if(i == '2' || i == '4') {
					System.out.println("여자입니다.");
				} else {
					System.out.println("누구세요");
				}
			}


		}
*/



		outer: while(true) {
			System.out.println("주민번호 13자리를 입력하세요");
			System.out.println("-을 포함해서 입력하세요");
			System.out.print("> ");
			String ssn = sc.next();

			ssn = ssn.replace("-", "");

			if(ssn.length() != 13) {
				System.out.println("주민번호는 13자리입니다.");
			} else {
				switch(ssn.charAt(6)) {
				case '1': case '3':
					System.out.println("남자입니다.");
					break outer;
				case '2': case '4':
					System.out.println("남자입니다.");
					break outer;
				default:
					System.out.println("누구세요");
					break outer;
				}
			}
			
		}

		sc.close();
		
	}
}

