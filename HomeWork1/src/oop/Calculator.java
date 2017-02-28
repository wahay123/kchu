package oop;

public class Calculator {
	public static void main(String args[]) {

		int finalResult;
		Btn1 button1 = new Btn1(5);
		Btn2 button2 = new Btn2(6);
		finalResult = button1.getValue() + button2.getValue();
		System.out.println(finalResult);

	}
}
