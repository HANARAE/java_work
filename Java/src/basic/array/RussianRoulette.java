package basic.array;

import java.util.Arrays;
import java.util.Scanner;

/**     
 * 2023.02.28-1.
 * 러시안 룰렛 만들기
 */
public class RussianRoulette {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
		 */


		
		//게임 인원 입력
		System.out.println("게임 인원을 입력하세요. (2~4명)");
		System.out.print("> ");
		int playerNum = sc.nextInt();
		
		if(playerNum < 2 || playerNum > 4) {
			System.out.println("게임 인원이 올바르지 않습니다.");
			System.out.println("게임을 종료합니다.");
			return; //main 함수 종료.
		}

		

		//플레이어 이름 등록 -> 배열 생성해서 배치(배열의 크기는 게임 참가자의 명수와 동일)
		String[] players = new String[playerNum];
		
		for(int i=0; i<playerNum; i++) {
			System.out.printf("플레이어 %d 이름: ", i+1);
			players[i] = sc.next();
		}
		System.out.println(Arrays.toString(players) + "가 참가합니다.");
		

		//실탄 개수 입력(1미만X 5초과X)
		System.out.println("\n실탄 개수: (6 미만)");
		System.out.print("> ");
		int bullet = sc.nextInt();
		
		if(bullet < 1 || bullet > 5) {
			System.out.println("실탄 개수가 올바르지 않습니다.");
			System.out.println("게임을 종료합니다.");
			return; //main 함수 종료.
		}

		
		//실탄 탄창에 배치
		boolean[] bulletPos = new boolean[6];
		//난수를 생성해서 실탄을 탄창에 배치.
		//false를 true로 바꾸는 것이 실탄 장전.
		//난수는 중복으로 발생할 가능성이 있기 때문에 중복방지 logic을 세워서 같은 위치에 두개 이상의 실탄이 장전되지 않도록 함.
		
		int checkNum = 0; //실탄을 정확하게 장전한 횟수
		while(checkNum < bullet) {
			int position = (int) (Math.random()*bulletPos.length);
			if(bulletPos[position]) {
				continue;
			} else {
				bulletPos[position] = true;
				checkNum++;
			}
		}


		//실행 순서 정하기 -> 난수 이용
		//시작 인덱스를 난수로 정해 돌아가게 해도 되고, 아예 배치를 섞어도 됨
		int startIdx = (int) (Math.random()*playerNum);
		System.out.printf("\n총을 돌렸습니다. %s부터 시작합니다.\n", players[startIdx]);


		//입력 대기를 해서 흐름을 잠시 끊어줌.
		//이 입력값(enter)은 받아서 활용할게 아니라 변수를 따로 선언하지 않아도 됨.
		sc.nextLine();
		

		//최후의 1인이 남을때까지 혹은 총알을 다 소비할때까지 게임 진행
		//총알을 소모하면 true를 false로 변경해야 함.
		//사람이 죽을때마다 배열의 크기 줄이기.
		int realBulletPos = 0;
		
		while(true) {
						
			System.out.printf("\n\n[%s]의 턴!\t탄창을 장전했습니다.", players[startIdx]);
			System.out.println("엔터를 누르면 격발합니다!");
			sc.nextLine();
			
			if(bulletPos[realBulletPos]) {
				
				System.out.printf("\n빵!!! \n[%s] 사망...\n", players[startIdx]);
				bullet--;
				playerNum--;
				bulletPos[realBulletPos] = false; //총알이 소모되었으니 false로 변경
				
				//지금 죽은 사람 기준으로 뒤에 있는 값을 한칸씩 땡기는 작업
				for(int i=startIdx; i<players.length-1; i++) {
					players[i] = players[i+1];
				}
				
				String[] temp = new String[players.length-1];
				
				for(int j=0; j<temp.length; j++) {
					temp[j] = players[j];
				}
				
				players = temp;   temp = null;
				
				System.out.println("생존인원: " + Arrays.toString(players));
				
				if(players.length == 1) {
					System.out.println("최종 생존자: " + players[0]);
					System.out.println("게임을 종료합니다.");
					break;
				} else if(bullet == 0) {
					System.out.println("총알이 다 떨어졌습니다.");
					System.out.println("최종 생존자: " + Arrays.toString(players));
					System.out.println("게임을 종료합니다.");
					break;
				} else {
					System.out.println("남은 인원이 게임을 재개합니다.");
					
					sc.nextLine();
				}
				
				
				
			} else {
				System.out.println("휴... 살았습니다.");
				startIdx++;
			}
			
			
			
			//플레이어가 생존할때마다 startIdx의 값을 하나씩 올리고 있는데,
			//맨 마지막 사람까지 생존했을 경우에는 다음 차례가 첫번째 사람이기 때문에
			//인덱스를 0으로 바꿔서 배열 맨 앞사람이 순서를 가질 수 있도록 처리.
			if(startIdx == playerNum) {
				startIdx = 0;
			}
			
			realBulletPos++;
			
		}

		
		
		
		
		sc.close();
	}

}
