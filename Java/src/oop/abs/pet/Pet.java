package oop.abs.pet;

//애완동물들의 공통 클래스 (실체가 없는 추상적 개념으로 선언할 것)
public abstract class Pet {

	private String name; //이름
	private String species; //종
	private int age; //나이
	
	public Pet(String name, String species, int age) {
		super();
		this.name = name;
		this.species = species;
		this.age = age;
	}
	
	
	//먹이를 먹는 기능
	public abstract void feed();
	//낮잠을 자는 기능
	public abstract void takeNap();
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}
