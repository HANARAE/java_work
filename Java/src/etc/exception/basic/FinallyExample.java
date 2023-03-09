package etc.exception.basic;

public class FinallyExample {
	
	public static void main(String[] args) {
		
		String[] pets = {"강아지", "고양이", "짹짹이"};
		
		
		for(int i=0; i<4; i++) {
			try {
				System.out.println(pets[i] + " 키우고 싶다...");
			} catch (Exception e) {
				System.out.println("애완동물의 정보가 없습니다.");
			} finally {
				//예외가 발생하던 말던 항상 실행하고싶은 문장을 작성.
				//객체를 반납하거나 메모리에서 해제할 때 주로 사용한다. ex)sc.close();
				System.out.println("아무튼 실행되는 문장");
				System.out.println("---------------------");
			}
		}
		
		
		
		
	}
	
	

}
