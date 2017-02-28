package abstract_demo_2;

public class AbstractMain {
	public static void main (String args[]){
		PageA pageA = new PageA();
		
		pageA.printTemplate();
	
		String data = pageA.toString();
		
		System.out.println(data);
		
	}
}
