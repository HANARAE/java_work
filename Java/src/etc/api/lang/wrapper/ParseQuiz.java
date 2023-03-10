package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char c;
		int year;
		int month;
		int day;
		int age;
		String gender;


		while(true) {
			System.out.print("주민번호를 입력하세요: ");
			String idNum = sc.nextLine();
			int h = idNum.indexOf("-");

			if(idNum.length() != 14){
				if(h == -1) {
					System.out.println("주민번호는 '-'을 포함시켜 주세요.");
				} else {
					System.out.println("주민번호는 정수로 정확히 입력해 주세요.");
				}
			} else {
				String[] numbers = idNum.split("-");
				c = idNum.charAt(7);
				year = Integer.parseInt(numbers[0].substring(0,2));
				month = Integer.parseInt(numbers[0].substring(2,4));
				day = Integer.parseInt(numbers[0].substring(4,6));
				age = 0;

				if(c == '1') {
					year = 1900 + year;
					age = 2024 - (1900+year);
					gender = "남자";
					break;
				} else if(c == '2') {
					year = 1900 + year;
					age = 2024 - (1900+year);
					gender = "여자";
					break;
				} else if(c == '3') {
					year = 2000 + year;
					age = 2024 - (2000+year);
					gender = "남자";
					break;
				} else if(c == '4') {
					year = 2000 + year;
					age = 2024 - (2000+year);
					gender = "여자";
					break;
				} else {
					System.out.println("뒷자리 첫번째 숫자는 1, 2, 3, 4 중 하나여야 합니다.");
				}
			}


		}
		
		System.out.printf("%d년 %d월 %d일 %d세 %s\n", year, month, day, age, gender);
		
		
		
		
		//밑에는 선생님꺼 *ssn의 length를 구하는 조건문 추가하기
		System.out.println("------------선생님-------------");

		String ssn;
		char c2;
		int birthYear = 0;

		while(true) {

			System.out.println("주민번호를 입력하세요: ");
			ssn = sc.next();
			c2 = ssn.charAt(7);

			if(ssn.indexOf("-") == -1) {
				System.out.println("주민번호는 -을 포함시켜 주세요.");
				continue;
			}
			c = ssn.charAt(7);
			if(!(c2 == '1' || c2 == '2' || c2 == '3' || c2 == '4')) {
				System.out.println("주민번호 뒷자리 첫번째 숫자는 1, 2, 3, 4 중 하나여야 합니다.");
				continue;
			}

			try {
				String test = ssn.substring(0,6);
				String test2 = ssn.substring(7);
				Integer.parseInt(test);
				Integer.parseInt(test2);
				break;
			} catch (Exception e) {
				System.out.println("숫자로 정확히 입력하세요.");
			}

		}

		int year2 = Integer.parseInt(ssn.substring(0,2));
		int month2 = Integer.parseInt(ssn.substring(2,4));
		int day2 = Integer.parseInt(ssn.substring(4,6));
		
		String gender2;
		if(c2 == '1' || c2 == '3') {
			gender2 = "남자";
		} else {
			gender2 = "여자";
		}
		
		if(c2 == '1' || c2 == '2') {
			birthYear = 1900 + year2;
		} else {
			birthYear = 2000 + year2;
		}

		int age2 = 2024 - birthYear;
		
		System.out.printf("%d년 %d월 %d일 %d세 %s\n", birthYear, month2, day2, age2, gender2);







		sc.close();


	}

}
