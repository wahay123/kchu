package abstract_demo_1;

public class Student extends Person {

	@Override
	public void printDetailInfo() {
		System.out.println("study " + this.getStudy());		
	}
}
