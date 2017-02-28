import java.io.*;

/**
 * @author cheungwilson
 *
 */

public class InfixReader {

	public static void main(String[] args) {
		InfixReader myAnswer = new InfixReader();
		myAnswer.doConversion();
	}

	public void doConversion() {

		String[] infixs = readInfix();

		String[] postfixs = new String[infixs.length];
		Stack stack = new Stack(infixs.length);

		for (int j = 0; j < postfixs.length; j++) {
			if (postfixs[j] != null) {
				System.out.println(postfixs[j]);
			}
		}
	}

	private String[] readInfix() {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String inputLine;
		try {
			System.out.print("Please input infix: ");
			inputLine = input.readLine();
			return inputLine.split(" ");
		} catch (IOException e) {
			System.err.println("Input ERROR.");
		}

		return new String[] {};
	}



	/**
	 * To state the precedence level of operators
	 *
	 */
	public static int precedence(String operator) {
		switch (operator) {
		case "(":
		case ")":
			return 0;
		case "+":
		case "-":
			return 1;
		case "*":
		case "/":
			return 2;
		case "^":
			return 3;
		}
		return 0;
		// this + is compare to to find greater
	}
}

class Stack {
	int top;
	String[] list;

	public Stack(int size) {
		list = new String[size];
		top = -1;
	}

	public void push(String operator) {
		top++;
		list[top] = operator;
	}

	public String pop() {
		if (!isEmpty()) {
			String tmp = list[top];
			top--;
			return tmp;
		} else {
			return "";
		}
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}

	}
}
