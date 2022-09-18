package java_classes_objects_hw;

public class MyKids {

	private String name;
	private int age;
	private String gender;
	
	public MyKids() {};
	
	public MyKids(String name, int age) {
		this.name = name;
		this.age = age;
	};
	
	public MyKids(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	};
	
	public boolean isBallOfEnergy() {
		return true;
	}
	
	public String myKidsAre() {
		return "My son is a crazy ball of energy";
	}
	
}
