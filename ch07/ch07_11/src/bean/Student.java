package bean;

public class Student {
	int id;
	String name;
	String sex;
	int age;
	float weight;
	float hight;
	
	public Student() {
		
	}
	
	
	public Student(int id, String name, String sex, int age, float weight,
			float hight) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.weight = weight;
		this.hight = hight;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHight() {
		return hight;
	}
	public void setHight(float hight) {
		this.hight = hight;
	}
	
	
}
