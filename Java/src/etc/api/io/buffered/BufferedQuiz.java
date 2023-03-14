package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BufferedQuiz {

	public static void main(String[] args) {

		/*
        1. Date클래스를 이용해서 file폴더 내에 하위 경로로 오늘 날짜 20211111file 이라는 이름으로 폴더를 생성하세요.
        2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
        3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로 파일을 작성합니다. 
         (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 연결해 주시면 됩니다.)
        4. '그만'으로 파일이 작성되었다면, 아무방법으로나 파일을 읽어서 콘솔에 출력해 보세요.
		 */

		Scanner sc = new Scanner(System.in);


		
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		String today = ldt.format(dtf);
				
		File file = new File("C:\\Work\\file\\" + today + "file");
		if(!file.exists()) {
			file.mkdir(); 
			System.out.println("폴더 생성 완료");
		} else {
			System.out.println("이미 존재하는 폴더");
		}


		
		BufferedWriter bw = null;
		
		
		System.out.print("파일명: ");
		String name = sc.next();
		sc.nextLine();
		

		try {
			bw = new BufferedWriter(new FileWriter("C:\\Work\\file\\" + today + "file\\" + name + ".txt"));
			String str = null;
			
			System.out.println("문장을 입력하세요.");
			System.out.println("'그만'을 입력하면 중지됩니다.\n");
			
			while(true) {
				System.out.print("> ");
				str = sc.nextLine();
				if(str.equals("그만")) {
					System.out.println("종료합니다.");
					break;
				} else {
					bw.write(str + "\r\n");					
				}			
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		
		/////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		System.out.println("\n*** 내가 쓴 문장 ***\n");
		
		
		BufferedReader br = null;	
		
		
		try {
			br = new BufferedReader(new FileReader("C:\\Work\\file\\" + today + "file\\" + name + ".txt"));
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}




}
