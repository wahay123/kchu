
public class IfThenElse {
	// public static void main(String args[]) {
	// System.out.println("Hello World");
	// }
	public static void main(String args[]) {
		double temp = 10.0;
		boolean temp1 = true;
		int score = 74;
		char grade = 'a';

		if (score >= 90) {
			grade = 'a';
		} else if (score >= 80) {
			grade = 'b';
		} else if (score >= 70) {
			grade = 'c';
		} else if (score >= 60) {
			grade = 'd';
		} else {
			grade = 'f';
		}
		System.out.println(grade);
		System.out.println(grade);
	}
}
