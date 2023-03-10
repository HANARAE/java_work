package oop.obj_arr;

public class Score {
	/*
    - 이름, 국어, 영어, 수학, 총점, 평균(double)을 담을 수 있는 객체를 디자인하세요.
     
    - 학생의 모든 정보를 한 눈에 확인할 수 있게 scoreInfo() 메서드를 선언해 주세요.
      메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
     
    - 캡슐화(은닉)를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */
	
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public Score() {}
	
	public Score(String name, int kor, int eng, int math, int total, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
	}



	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getKor() {
		return kor;
	}




	public void setKor(int kor) {
		this.kor = kor;
	}




	public int getEng() {
		return eng;
	}




	public void setEng(int eng) {
		this.eng = eng;
	}




	public int getMath() {
		return math;
	}




	public void setMath(int math) {
		this.math = math;
	}




	public int getTotal() {
		this.setTotal();
		return total;
	}




	public void setTotal() {
		this.total = kor + eng + math;
	}




	public double getAvg() {
		this.setAvg();
		return avg;
	}




	public void setAvg() {
		this.avg = total/3.0;
	}


	

	void scoreInfo() {
		System.out.println("*** " + name + " 학생의 정보 ***");
		System.out.println("# 국어점수: " + kor);
		System.out.println("# 영어점수: " + eng);
		System.out.println("# 수학점수: " + math);
		System.out.println("# 총 점수: " + total);
		System.out.printf("# 평균점수: %.2f\n", avg);
	}
	
	
	
}
