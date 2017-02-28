
public class Animal {

	protected String name;
	protected int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName() {
		this.name = name;
	}

	public String getName(String name) {
		return name;
	}

	public void setAge() {
		this.age = age;
	}

	public int getAge(int age) {
		return age;
	}
	
	public void sleep(){
		System.out.println((this.getName(name)+ " is zzz"));
	}
	
	public void eat(){
		
	}
}
