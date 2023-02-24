package basic.loop;
/**
 * 2023.02.24-5.
 * 특정조건(회차) 건너뛰기
 */
public class ContinueExample {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) continue;
			
			System.out.print(i + " ");
		}
		System.out.println("\n반복문 종료!");
		
		
		
		
		
		
		

	}

}
