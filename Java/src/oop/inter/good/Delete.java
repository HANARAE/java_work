package oop.inter.good;

public class Delete implements IUserService {

	@Override
	public void execute() {
		System.out.println("사용자 ID 받아서 데이터베이스에서 찾아서 삭제 조치");
	}

}
