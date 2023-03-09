package oop.inter.good;

public class Join implements IUserService {

	@Override
	public void execute() {
		System.out.println("회원가입 로직이 실행됨");
		System.out.println("DB접속, 입력값 가져오기, 값 집어넣기 등등...");
	}

}
