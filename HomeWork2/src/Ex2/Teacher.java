package Ex2;

public class Teacher extends Person {

	public void printInfo() {
		super.printInfo();
		System.out.println("teach: " + this.getStudy());
	}
	
	// match id from super class

}
