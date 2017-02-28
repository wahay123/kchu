package Random;
import java.util.Random;

public class Tutorial1Random {

	public static void main(String[] args) {
		Random rand = new Random();
		int randomInt = rand.nextInt(1); 
		System.out.println("Random integer from 0 to 99: " + randomInt);
		
	}
	
}