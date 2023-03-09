package oop.inter.good;

public class Login implements IUserService {

	@Override
	public void execute() {
		System.out.println("사용자의 ID, PW를 받고 데이터베이스와 비교 등등...");
	}

}
