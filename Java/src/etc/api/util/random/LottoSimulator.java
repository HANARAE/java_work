package etc.api.util.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {

	static Random r = new Random();

	static int prize1 = 0; //1등 당첨 횟수를 세어 줄 변수
	static int prize2 = 0; //2등 당첨 횟수를 세어 줄 변수
	static int prize3 = 0; //3등 당첨 횟수를 세어 줄 변수
	static int prize4 = 0; //4등 당첨 횟수를 세어 줄 변수
	static int prize5 = 0; //5등 당첨 횟수를 세어 줄 변수
	static int failcnt = 0; //꽝 당첨 횟수를 세어 줄 변수


	public static Set<Integer> createLotto() {

		/*
		 - 1~45범위의 난수 6개를 생성해서 컬렉션 자료형에 모아서 리턴하라.
		   중복이 발생하면 안됨.
		 */

		Random r = new Random();
		Set<Integer> lotto = new HashSet<>();

		while(lotto.size() < 6) {
			int num = r.nextInt(45) + 1;
			lotto.add(num);
		}

		return lotto;

	}

	//보너스 번호를 생성하는 메서드
	public static int createBonusNum(List<Integer> lottoNums) {

		/*
		 - 매개값으로 전달되는 당첨 번호 집합을 전달받은 후 당첨 번호들을 피해 보너스번호 하나 뽑기
		   범위는 1~45 사이의 난수.
		 */

		while(true) {
			int num = r.nextInt(45) + 1;
			if(!lottoNums.contains(num)) {
				System.out.println("보너스 번호: " + num);
				return num;

			}

		}


	}






	//당첨 등수를 알려주는 메서드
	public static void checkLottoNumber(List<Integer>winNums, List<Integer> myLotto, int bonus) {

		long paper = 0;
		outer: while(true) {
			paper++;
			System.out.println("로또 " + paper + "장 째 구매 중...");
			/*
				 - 1등이 당첨 될 때까지 반복문을 돌린다.
				 - 1등이 당첨된다면 1등이 되기까지 누적 당첨횟수를 출력하고 반복문 종료.
				 - 로또를 구매하기 위한 금액 출력(long타입) 로또한장: 1천원
			 */


			List<Integer> myNum = new ArrayList<>(createLotto());
			Collections.sort(myNum);


			int cnt = 0;

			for(int i=0; i<6; i++) { //나의 로또 6개 다 일치: 1등
				for(int j=0; j<6; j++) {
					if(myNum.get(i) == winNums.get(j)) {
						cnt++;
					}
				}
			}

			switch(cnt) {

			case 6: 
				System.out.println("*** 1등 당첨!! ***");
				prize1++;
				break outer;

			case 5: 
				if(myNum.contains(bonus)) {
					prize2++;
				} else {
					prize3++;
				}

			case 4:
				prize4++;

			case 3:
				prize5++;

			default:
				failcnt++;

			}



		} //while true end

		System.out.println("-------------------------------------------");
		System.out.println("2등 당첨 횟수: " + prize2 + "회");
		System.out.println("3등 당첨 횟수: " + prize3 + "회");
		System.out.println("4등 당첨 횟수: " + prize4 + "회");
		System.out.println("5등 당첨 횟수: " + prize5 + "회");
		System.out.println("꽝 당첨 횟수: " + failcnt + "회");

		long money = (prize1 + prize2 + prize3 + prize4 + prize5 + failcnt) * 1000L;

		System.out.println("1등 한 번 당첨 되려고 당신이 쓴 금액: " + money + "원");





	}










	public static void main(String[] args) {

		//로또번호 생성 메서드를 호출해서 당첨번호를 하나 고정시키기.
		List<Integer> lottoNums = new ArrayList<>(createLotto());

		int[] temp = new int[6];
		List<Integer> winNums = new ArrayList<>();
		
		for(int i=0; i<6; i++) {
			temp[i] = lottoNums.get(i);
			winNums.add(i);
		}
		

		
		



		//보너스번호 하나 고정시키기
		int bonus = createBonusNum(lottoNums);
		Collections.sort(lottoNums);


		List<Integer> myLotto = new ArrayList<>(createLotto());



		checkLottoNumber(lottoNums, myLotto, bonus);





	}

}
