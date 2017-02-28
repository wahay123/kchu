import java.util.ArrayList;

public class Trial {
	
	public String name;
	public double age;
	
	public Trial(String name, double age){
		this.name = name;
		this.age = age;
	}
	public static void main(String args[]){
	
	ArrayList<Trial> test = new ArrayList<Trial>();
	Trial tom = new Trial("tom", 4);
	test.add(tom);
	Trial j = test.get(0);
	System.out.print(j);
	}
}
