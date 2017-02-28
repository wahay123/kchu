package Ex2;

import java.util.Scanner;

public class Inheritance {
	public static void main(String args[]) {
		Student S1 = new Student();
		S1.initial("student", "Paul", "male", "S1", "Medicine");
		Teacher T1 = new Teacher();
		T1.initial("teacher", "Tom", "male", "T1", "Chemistry");

		Scanner scan = new Scanner(System.in);

		String inputId = scan.next();
		System.out.println(inputId);

		S1.matchId(inputId);
		T1.matchId(inputId);

	}
}
