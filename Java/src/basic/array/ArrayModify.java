package basic.array;

import java.util.Arrays;
import java.util.Scanner;

/**     
 * 2023.02.24-10.
 * 배열의 수정
 */
public class ArrayModify {

	public static void main(String[] args) {

		String[] foods = {"삼겹살", "족발", "피자", "햄버거"};
		System.out.println(Arrays.toString(foods));

		foods[0] = "치킨";
		foods[2] = "탕수육";
		System.out.println(Arrays.toString(foods));

		
		//배열의 인덱스 탐색
		System.out.println("-------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 음식: ");
		String name = sc.next();
		
		
		int count = 0;
		
		for(int i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("탐색완료!");
				System.out.println("인덱스: " + i + "번");
				count++;
				break;
			} 
		}
		
		if(count == 0)
			System.out.println("없는 음식입니다.");
		
		
		
		
//		-------------------------------------------------------------	
		
		
//		int i;
//		for(int i=0; i<foods.length; i++) {
//			if(name.equals(foods[i])) {
//				System.out.println("탐색완료!");
//				System.out.println("인덱스: " + i + "번");
//				break;
//			}
//		}
//		if(i == foods.length) {
//			System.out.println("없는 음식입니다.");
//		}
		
		
		
		
//	-------------------------------------------------------------
		
		
//		boolean flag = false;
//		for(int i=0; i<foods.length; i++) {
//			if(name.equals(foods[i])) {
//				System.out.println("탐색완료!");
//				System.out.println("인덱스: " + i + "번");
//				flag = true;
//				break;
//			} 
//		}
//		
//		if(!flag) {
//			System.out.println("없는 음식입니다.");
//		}
		
		

		sc.close();

	}

}
