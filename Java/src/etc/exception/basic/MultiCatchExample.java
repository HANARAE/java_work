package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		try {
			System.out.print("정수: ");
			int n = sc.nextInt();
			
			int result = 100 / n;
			
			System.out.println(arr[result]);
			
			String s = null;
			s.equals("메롱");
			
			
			/*
			 - 다중catch문은 실제로 에러가 발생하면 위에서부터 순서대로 catch문을 검색하면서 내려오기 때문에 부모타입의 예외는 항상 맨 아래로.
			 
			 - 하나의 catch 옆 괄호에 예외 타입을 여러개 작성 가능. -> | 기호를 사용해 타입 나열 (java7버전부터 가능한 문법)
			 */			
			
		} catch(InputMismatchException | ArithmeticException e) {
			System.out.println("똑바로 입력하세요");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 벗어남");
		} catch (NullPointerException e) {
			System.out.println("null을 참조할 수 없다");
		} catch (Exception e) {
			System.out.println("알 수 없는 에러 발생");
			System.out.println("에러 원인: " + e.getMessage());
		}
		
		
		System.out.println("프로그램 정상종료");
		
		sc.close();
		
		
		
	}

}
