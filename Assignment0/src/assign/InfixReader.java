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

	/**
	 * doConvsersion() - to read infix from input and convert it along with the
	 * read Infix() and class stack
	 * 
	 * i++ to read each String[] readInfix element if (the element is "(" )
	 * Stack.push() if(it is ")" ) pop the stack until popping"(" else if (it is
	 * an operator) if( stack is empty) push into the stack else //stack is not
	 * empty if(the next operator is precede to Stack.top) stack.push the new
	 * operator else pop Stack.top operator into postfix[] and push the new
	 * operator into stack else if(pointing to null) pop the remaining operators
	 * in the stack into postfix[] else //numeric or algebra it will be stored
	 * into postfix[]
	 * 
	 * else if (it is an operator) if( stack is empty) Stack.push() else //stack
	 * is not empty if(the next operator is precede to Stack.top) Stack.push()
	 * else pop the original operator into postfix[] and push the new operator
	 * into stack else if(pointing to null) pop the remaining operators in the
	 * stack into postfix[]
	 * 
	 * else it will be stored into postfix array
	 * 
	 * 
	 * print out postfix
	 * 
	 */
	public void doConversion() {
		// TODO: read infix from input using readInfix(), then convert it to
		// postfix and print it out
		String[] infix = readInfix();

		String[] postfix = new String[infix.length];
		Stack stack = new Stack(infix.length);
		
		for (int i = 0; i < infix.length; i++) {
			System.out.println(infix[i]);

			if (infix[i].equals("(")) {
				String operator = infix[i];
				stack.push(operator);
			} else if (infix[i].equals(")")) {
				for (int j = Stack.getTop(); Stack.list[j].equals("("); j--)
					postfix[postfix.length + 1] = stack.list[Stack.getTop()];
				stack.pop();
			} else if (infix[i].equals("+") || infix[i].equals("-") || infix[i].equals("*") || infix[i].equals("/")
					|| infix[i].equals("^")) {
				String operator = infix[i];

				if (stack.isEmpty()) {
					stack.push(operator);
				} else if (i == infix.length - 1) {
					postfix[postfix.length + 1] = stack.list[Stack.getTop()];
					stack.pop();
				} else {
					if (precedence(operator) > precedence(stack.list[Stack.getTop()])) {
						stack.push(operator);
					} else {
						postfix[postfix.length + 1] = stack.list[Stack.getTop()];
						stack.pop();
					}
				}
			} else {
				postfix[i] = infix[i];
			}

		}
		for (int j = 0; j < postfix.length; j++) {
			System.out.println(postfix[j]);
		}
	}

	/*
	 * if(Stack.isEmpty()){ char operator = infix[i].charAt(0);
	 * Stack.push(operator); } else{
	 */

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

		// return empty array if error occurs
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

/**
 * class Stack to store data in a last in first out manner isEmpty() to check if
 * there is any element in the stack push() to push element into the bottom of
 * the stack top() to return the last element pushed into the stack pop() to
 * return the top element and erase it
 *
 */
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
		if (!isEmpty()){
			String tmp =  list[top];
			top--;
			return tmp;
		}else{
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
