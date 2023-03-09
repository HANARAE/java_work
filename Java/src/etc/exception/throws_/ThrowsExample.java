package etc.exception.throws_;

public class ThrowsExample {


		static String[] greetings = {"안녕", "헬로", "니하오"};
		
		
		/*
		 # throws
		 
		 - throws는 예외 원인의 메서드 선언부가 아닌 호출부에 있을 경우 예외처리를 메서드의 호출부로 떠넘기는 방식.
		 
		 - throws는 생성자에서도 선언이 가능하며 메서드나 생성자를 호출했을 때 예외처리를 강요하고싶을때 사용한다.
		 
		 - 원하는 영역으로 예외를 모아서 한번에 처리하는 것도 가능하다.
		 */
		static void greet(int idx) throws Exception {
			System.out.println(greetings[idx]);
		}
		
		
		
		public static void main(String[] args) {
				
			try {
				greet(3);
			} catch (Exception e) {
				//printStackTrace()메서드는 예외 발생 원인을 역추적하여 예외가 어디서, 왜 발생했는지 메세지를 통해 개발자에게 전달.(자주사용)
				e.printStackTrace();
			}
			
			System.out.println("프로그램 자동 종료");
			
		}
		
		


}
