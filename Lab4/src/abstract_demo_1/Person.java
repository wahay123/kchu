package abstract_demo_1;

public abstract class Person {

	protected String type;
	protected String name;
	protected String gender;
	protected String id;
	protected String study;

	public void initial(String type, String name, String gender, String id, String study) {
		this.type = type;
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.study = study;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getStudy() {
		return study;
	}

	public void setStudy(String study) {
		this.study = study;
	}

	public void matchId(String inputId) {
		if (inputId.equals(this.getId())) {
			printInfo();
		} else {
			System.out.println("No matching id is found");
		}
	}

	public void printInfo() {
		System.out.println("This is a " + this.getType());
		System.out.println("Name: " + this.getName());
		System.out.println("Gender: " + this.getGender());
		printDetailInfo();
	}
	
	public abstract void printDetailInfo();

}
