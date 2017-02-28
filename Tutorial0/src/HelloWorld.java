public class HelloWorld {
	public static void main(String args[]) {
		Stack stack1 = new Stack(9);
		String[] array1 = { "+", "-", "*", "/", "^" };
		for (int i = 0; i < array1.length; i++) {
			stack1.push(array1[i]);
			System.out.println(stack1.peek());
		}
		
	}
}