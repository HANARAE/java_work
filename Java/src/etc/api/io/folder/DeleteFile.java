package etc.api.io.folder;

import java.io.File;
import java.util.Arrays;

public class DeleteFile {

	public static void main(String[] args) {
		
		
		File file = new File("C:\\Work\\folder_test\\hoho");
		
		/*
		if(file.exists()) {
			file.delete(); //delete 성공시 true, 실패시 false 리턴 (폴더 안에 다른 폴더나 파일이 존재하면 delete가 안됨)
			System.out.println("삭제 완료!");
		} else {
			System.out.println("파일삭제 실패 or 존재하지 않음");
		}
		*/
		
		if(file.exists()) {
			if(file.isDirectory()) { //파일이 디렉토리인지 확인
				File[] files = file.listFiles();
				for(int i=0; i<files.length; i++) {
					if(files[i].delete()) {
						System.out.println(files[i].getName()+" 삭제 성공");
					} else {
						System.out.println(files[i].getName()+" 삭제 실패");
					}
				}
				
			}
			if(file.delete()) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
