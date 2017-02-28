import java.util.Scanner;

public class CalculatorTrial {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double num1, num2, ans;
		System.out.println("Input your first number:");
		num1 = input.nextDouble();
		System.out.println("input your second number:");
		num2 = input.nextDouble();
		ans = num1 + num2;
		System.out.println(ans);

	}
}
