package etc.api.lang.stringbuilder;

public class StrBuilderExample {

	public static void main(String[] args) {

		/*
		 String 클래스의 단점
		 - String클래스는 아주 많이 쓰이고 좋은 기능도 많이 가지고 있지만 메모리를 과소비하는 단점이 있다.
		 - String객체는 처음 초기화된 데이터에 변화를 줘야 하는 상황에서 기존객체를 버리고 새로운 객체를 계속해서 생성한다. ->시간,메모리 잡아먹음

		 # StringBuilder, StringBuffer (자바5부터 사용가능)
		 - String클래스 단점으로 인한 메모리 과부하 및 속도 느려지는 현상을 개선하기 위해 추가된 기능
		 - StringBuilder는 기존 객체를 계속 재활용하면서 실제 객체 내부의 값을 변경한다.
		 - StringBuilder, StringBuffer는 메서드가 동일하지만 사용환경이 다르다.
		   StringBuilder: 단일스레드에서 문자열을 공유해야 할 때 사용
		   StringBuffer: 다중스레드에서 문자열을 공유해야 할 때 사용
		 */

		String str = "hello";
		System.out.println("str의 주소값: " + str.hashCode());

		str = "hell";
		System.out.println("str의 주소값: " + str.hashCode());

		str = "hellow";
		System.out.println("str의 주소값: " + str.hashCode());

		System.out.println("------------------------------------");

		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);
		System.out.println("sb의 주소값: " + sb.hashCode());


		//문자열을 맨 긑에 추가하는 메서드: append(문자열)
		sb.append(" world");
		System.out.println(sb);
		System.out.println("sb의 주소값: " + sb.hashCode());

		//문자열을 특정 인덱스에 삽입하는 메서드: insert(인덱스, 삽입할 문자열)
		sb.insert(6, "new ");
		System.out.println(sb);
		System.out.println("sb의 주소값: " + sb.hashCode());

		//특정 인덱스 범위의 문자열을 교체하는 메서드: replace(begin, end, 문자열)
		//끝범위는 미만으로 인식됨.
		sb.replace(6, 9, "my"); //(6번부터 9번 미만까지 교체)
		System.out.println(sb);
		System.out.println("sb의 주소값: " + sb.hashCode());

		//문자열 내의 특정 단어를 삭제하는 메서드: delete(begin, end)
		sb.delete(6, 9); //(6번부터 9번 미만까지)
		System.out.println(sb);
		System.out.println("sb의 주소값: " + sb.hashCode());

		//문자열을 역순으로 배치
		sb.reverse();
		System.out.println(sb);
		System.out.println("sb의 주소값: " + sb.hashCode());




	}

}
