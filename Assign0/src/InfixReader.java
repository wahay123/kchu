import java.io.*;

/**
 * @author Wilson Cheung 3035119135 The infixReader class, used to convert infix into
 *         postfix
 */

public class InfixReader {
	/**
	 * Create a main method to run the program
	 * @param String array args
	 */
	public static void main(String[] args) {
		InfixReader myAnswer = new InfixReader();
	
		
		myAnswer.doConversion();
	}

	/**
	 * a method doConversion() to handle the conversion of infix to postfix
	 * through the help of class stack (infix element will be stored or pop from the stack if it 
	 * is an operator) as well as the method readInfix.
	 *
	 */
	public void doConversion() {
		/**
		 * an array to store readInfix()
		 */
		String[] infixs = readInfix();
		/**
		 * to create a String array object
		 */
		String[] postfixs = new String[infixs.length];
		/**
		 *to create a stack object
		 */
		Stack stack = new Stack(infixs.length);

		int postfixCount = 0;
		for (int i = 0; i < infixs.length; i++) {
			String operator = infixs[i];

			if (infixs[i].equals("(")) {
				stack.push(operator);
			}

			else if (infixs[i].equals(")")) {

				while (!stack.isEmpty()) {

					if (stack.list[stack.top].equals("(")) {
						stack.pop();

						break;

					} else {
						postfixs[postfixCount] = stack.list[stack.top];
						postfixCount++;
						stack.pop();

					}
				}
			}

			else if (infixs[i].equals("+") || infixs[i].equals("-") || infixs[i].equals("*") || infixs[i].equals("/")
					|| infixs[i].equals("^")) {

				if (stack.isEmpty()) {
					stack.push(operator);

				} else if (!stack.isEmpty()) {
					int priorIn = priority(infixs[i]);
					int priorStack = priority(stack.list[stack.top]);

					if (priorIn <= priorStack) {

						while (!stack.isEmpty() && !stack.list[stack.top].equals("(")) {
							postfixs[postfixCount] = stack.list[stack.top];
							postfixCount++;
							stack.pop();
						}
						stack.push(operator);

					} else {

						stack.push(operator);
					}
				}
			}

			else {
				postfixs[postfixCount] = infixs[i];
				postfixCount++;
			}

		}

		while (!stack.isEmpty()) {
			String s = stack.list[stack.top];
			postfixs[postfixCount] = s;
			postfixCount++;
			stack.pop();

		}
		System.out.print("Postfix: ");
		for (int j = 0; j < postfixCount; j++) {
			if (postfixs[j] != null) {
				System.out.print(postfixs[j] + " ");
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
	 * a method to state the precedence level of operators
	 * 
	 * @param a string variable operator for this object
	 * @return integer 0,1,2,3 to indicate the precedence level of operator 0 is
	 *         the lowest and 3 is the highest
	 */
	public int priority(String operator) {
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
		// for comparison of operator
	}
}

/**
 * create a stack class 
 * integer variable top 
 * String array list to be used
 *
 */
class Stack {
	int top;
	String[] list;

	/**
	 * constructor of the object stack
	 * 
	 * @param integer variable size to keep track of the size of class Stack
	 */
	public Stack(int size) {
		list = new String[size];
		top = -1;
	}

	/**
	 * a method push. to store the operator into the stack
	 * 
	 * @param a String variable operator
	 */
	public void push(String operator) {
		top++;
		list[top] = operator;
	}

	/**
	 *a method pop. to pop out the top element in the stack
	 *@return a String variable tmp which catch the top element in the stack
	 *or @return an empty String ""
	 */
	public String pop() {
		if (!isEmpty()) {
			String tmp = list[top];
			top--;
			return tmp;
		} else {
			return "";
		}
	}
	
	/**
	 * a method isEmpty, to show if the stack is empty or not
	 * @return true for this object if it is empty
	 * or @return false for this object if it is not empty
	 */
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}

	}
}