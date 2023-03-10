package etc.api.lang.math;

public class MathQuiz {

	//페이지에서 1~10번글은 1페이지, 11~20번글은 2페이지 ... 이런식으로 만들 때 쓰임
	public static int page(int num) {
		return (int) Math.ceil(num * 0.1);
	}
	
	public static void main(String[] args) {
		
		/*
		 1~10 전달: 1이 반환
		 11~20: 2가 반환
		 21~30: 3이 반환 ....
		 이러한 로직을 수행하는 static 메서드 page를 선언하기
		 */

		System.out.println(page(68));		
		
		
	}
	
	
	
	
	
}
