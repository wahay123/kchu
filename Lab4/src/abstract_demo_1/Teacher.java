package abstract_demo_1;

public class Teacher extends Person {

	@Override
	public void printDetailInfo() {
		System.out.println("teach: " + this.getStudy());		
	}
}
