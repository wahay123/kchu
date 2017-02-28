import java.io.*;

public class InfixReader {

	public static void main(String[] args) {
		InfixReader myAnswer = new InfixReader();
		String[] c = myAnswer.readInfix();
		for(int i=0; i< c.length; i++){
		System.out.print(c[i]);
		}
		//myAnswer.doConversion();
	}
	
	public void doConversion() {
		// TODO: read infix from input using readInfix(), then convert it to postfix and print it out
	}
	
	private String [] readInfix() {
		
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
		return new String[] { };
	}

}

class Stack {
    // TODO: implement Stack in this class
}
