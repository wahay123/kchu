
public class Static {
	public static void main(String args[]) {
		System.out.println("hello world");
		Switch.main(args);
		
		Static static1 = new Static();
		static1.printSomething();
	}
	
	
	public void printSomething(){
		System.out.println("Something");
	}
}
