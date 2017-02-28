/**
 * @author cheungwilson this is the main function
 */

public class JavaDocExample {

	public static void main(String[] args) {
		JavaDocExample app = new JavaDocExample("Hello, World!");
		System.out.print("Hello world length = " + app.getLength());
	}

	/**
	 * @author cheungwilson
	 * what is message
	 */
	public String message;

	public JavaDocExample(String message) {
		this.message = message;
	}

	public int getLength() {
		return message.length();
	}

}
